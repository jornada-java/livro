import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelecionarVinhos")
public class SelecionarVinhosServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		String tipo = request.getParameter("tipo");
		request.setAttribute("tipo", tipo);

		VinhoManager vm = new VinhoManager();
		List<?> resultado = vm.selecionarVinhosPorTipo(tipo);
		request.setAttribute("vinhos", resultado);
				
		RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
		view.forward(request, response);
	}
	
}