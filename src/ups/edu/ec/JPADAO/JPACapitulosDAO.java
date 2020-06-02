package ups.edu.ec.JPADAO;

import java.util.List;

import ups.edu.ec.DAO.CapitulosDAO;
import ups.edu.ec.Modelo.Capitulos;

public class JPACapitulosDAO extends JPAGenericDAO<Capitulos, Integer>  implements CapitulosDAO {

	public JPACapitulosDAO(Class<Capitulos> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Capitulos> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
