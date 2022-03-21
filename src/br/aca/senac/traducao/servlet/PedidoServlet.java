package br.aca.senac.traducao.servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.jboss.logging.Logger;

import br.aca.senac.traducao.domain.exception.PedidoException;
import br.aca.senac.traducao.domain.model.FileEntity;
import br.aca.senac.traducao.domain.model.Idioma;
import br.aca.senac.traducao.domain.model.Pedido;
import br.aca.senac.traducao.domain.model.Status;
import br.aca.senac.traducao.service.FileService;
import br.aca.senac.traducao.service.PedidoService;
import br.aca.senac.traducao.service.SimpleEntityManager;

@WebServlet({ "/PedidoServlet", "/pedido" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024, // 1MB
maxFileSize = 1024 * 1024 * 4, // 4MB
maxRequestSize = 1024 * 1024 * 4 // 4MB
)
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(FileUploadServlet.class);

	private static final String BASE_DIR = "C:\\uploads";

	public PedidoServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String persistenceUnitName = "tradutor";

		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
				persistenceUnitName);

		Pedido pedido = new Pedido();

		PedidoService pedidoService = new PedidoService(simpleEntityManager);

		pedido.setIdioma_origem(Idioma.valueOf(request
				.getParameter("cboIDIOMAORIGEM")));
		pedido.setIdioma_destino(Idioma.valueOf(request
				.getParameter("cboIDIOMADESTINO")));
		pedido.setDescricao(request.getParameter("txtDESCPROJETO"));
		pedido.setStatus(Status.PendenteOrcamento);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			pedido.setData(formatter.parse(request
					.getParameter("txtDTDESEJADA")));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		FileService service = new FileService();

		Path destination = service.createFolder(BASE_DIR);

		for (Part part : request.getParts()) {
			if (Files.exists(destination)) {
				service.saveFile(destination, part);
			}
		}

		request.setAttribute("message", "Upload feito com sucesso!");
		// request.setAttribute("fileEntities", service.findAll());

		FileEntity arquivo = new FileEntity();

		try {
			pedido.setArquivo(arquivo);
			pedidoService.save(pedido);
		} catch (PedidoException e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher("PedidoConsultar.jsp").forward(request,
				response);
	}
}
