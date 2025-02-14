package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/ProduitServlet")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupiration les information
		String nameProduit=request.getParameter("nameProduit");
		String descriptionProduit=request.getParameter("descriptionProduit");
		String prix=request.getParameter("prix");
		String quantite=request.getParameter("quantite");
		String categorie=request.getParameter("categorie");
		
		// Aficher les information
		PrintWriter out = response.getWriter();
		out.println(nameProduit + descriptionProduit + prix + quantite + categorie );
		
	}
	

}
