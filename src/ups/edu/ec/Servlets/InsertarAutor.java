package ups.edu.ec.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.DAO.AutorDAO;
import ups.edu.ec.DAO.DaoFactory;
import ups.edu.ec.Modelo.Autor;




/**
 * Servlet implementation class InsertarAutor
 */
@WebServlet("/InsertarAutor")
public class InsertarAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AutorDAO dao = DaoFactory.getFactory().getAutorDao();
	
	Autor autor = new Autor();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarAutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int codigo1;
		String codigo = request.getParameter("codigo");
		String nombre =request.getParameter("nombre");
		String nacionalidad =request.getParameter("nacionalidad");
		
		codigo1=Integer.parseInt(codigo);
		
		autor.setCodigo(1);
		autor.setNombre("marcelo durazno");
		autor.setNacionalidad("ecuatoriano");
		
		dao.create(autor);
		request.setAttribute("autor","");
		
		doGet(request,response);
		
		
	
	

	}

}
