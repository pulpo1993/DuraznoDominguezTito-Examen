package ups.edu.ec.JPADAO;

import java.util.List;

import ups.edu.ec.DAO.LibroDAO;
import ups.edu.ec.Modelo.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer>  implements LibroDAO {

	public JPALibroDAO(Class<Libro> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Libro> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
