package ups.edu.ec.DAO;

import java.util.List;

import ups.edu.ec.Modelo.Libro;

public interface LibroDAO extends GenericDAO <Libro, Integer>{

	List<Libro> findbyUserId(String dato);
}
