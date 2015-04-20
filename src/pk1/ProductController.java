package pk1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// gestione della RICHIESTA
		String nomeProdotto = request.getParameter("nomeProdotto");
		String prezzoProdotto = request.getParameter("prezzoProdotto");
		String descProdotto = request.getParameter("descProdotto");
		Boolean ciSonoErrori= false;
		if (nomeProdotto.equals("") || descProdotto.equals("") || prezzoProdotto.equals("")){
			ciSonoErrori=true;
			request.setAttribute("error", "ATTENZIONE! Controllare che tutti i campi siano compilati correttamente!");
		}else{
			try{
				Double d = Double.parseDouble(prezzoProdotto);
			}catch(Exception e){
				request.setAttribute("error", "ATTENZIONE! Il campo PREZZO deve essere numerico.");
				ciSonoErrori=true;
			}
		}

		ServletContext application  = getServletContext();

		if(ciSonoErrori==false){

			Product product = new Product(nomeProdotto, prezzoProdotto, descProdotto);
			request.setAttribute("product", product);

			// inoltro

			RequestDispatcher rd = application.getRequestDispatcher("/Product.jsp");
			rd.forward(request, response);
			return;

		}else{
			
			RequestDispatcher rd = application.getRequestDispatcher("/NewProduct.jsp");
			rd.forward(request, response);
			return;
		}

	}
}
