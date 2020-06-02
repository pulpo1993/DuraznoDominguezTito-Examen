package ups.edu.ec.DAO;

import ups.edu.ec.JPADAO.JPADaoFactory;

public abstract class DaoFactory {
	
	protected static DaoFactory factory= new JPADaoFactory();
	
	public static DaoFactory getFactory() {
		return factory;
	}

	public abstract LibroDAO getLibroDao();
	public abstract AutorDAO getAutorDao();
	public abstract CapitulosDAO getCapitulosDao();
	
	
	
}