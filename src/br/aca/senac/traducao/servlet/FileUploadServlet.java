package br.aca.senac.traducao.servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import br.aca.senac.traducao.service.FileService;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet({ "/FileUploadServlet", "/upload" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024, // 1MB
maxFileSize = 1024 * 1024 * 4, // 4MB
maxRequestSize = 1024 * 1024 * 4 // 4MB
)
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//@SuppressWarnings("unused")
	//private static Logger logger = Logger.getLogger(FileUploadServlet.class);

	private static final String BASE_DIR = "C:\\uploads";

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		FileService service = new FileService();

		Path destination = service.createFolder(BASE_DIR);

		for (Part part : request.getParts()) {
			if (Files.exists(destination)) {
				service.saveFile(destination, part);
			}
		}

		request.setAttribute("message", "Upload has been done successfully!");
		request.setAttribute("fileEntities", service.findAll());

		getServletContext().getRequestDispatcher("/file-list.jsp").forward(
				request, response);
	}
}
