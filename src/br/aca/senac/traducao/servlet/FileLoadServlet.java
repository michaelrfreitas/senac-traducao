package br.aca.senac.traducao.servlet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.aca.senac.traducao.service.FileService;

/**
 * Servlet implementation class FileLoadServlet
 */
@WebServlet({ "/FileLoadServlet", "/load" })
public class FileLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(FileUploadServlet.class);

	private static final String BASE_DIR = "C:\\uploads";

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("year") != null) {
			showFiles(request, response);
		} else {
			request.setAttribute("fileEntities", new FileService().findAll());

			getServletContext().getRequestDispatcher("/file-list.jsp").forward(
					request, response);
		}
	}

	private void showFiles(HttpServletRequest request,
			HttpServletResponse response) {

		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String name = request.getParameter("name");

		@SuppressWarnings("unused")
		InputStream in = null;

		try {
			DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get(
					BASE_DIR, year, month));

			for (Path path : paths) {

				String filePathName = path.getFileName().toString();

				if (name.equals(filePathName)) {

					response.setContentLength((int) Files.size(path));
					response.setContentType(Files.probeContentType(path));

					ServletOutputStream ouputStream = response
							.getOutputStream();
					ouputStream.write(Files.readAllBytes(path), 0,
							(int) Files.size(path));
					ouputStream.flush();
					ouputStream.close();
				}
			}
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
}
