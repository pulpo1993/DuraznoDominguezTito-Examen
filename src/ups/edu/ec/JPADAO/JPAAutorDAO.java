package ups.edu.ec.JPADAO;

import java.util.List;

import ups.edu.ec.DAO.AutorDAO;
import ups.edu.ec.Modelo.Autor;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer>  implements AutorDAO {

	public JPAAutorDAO(Class<Autor> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Autor> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
