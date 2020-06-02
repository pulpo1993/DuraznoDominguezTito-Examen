package ups.edu.ec.DAO;

import java.util.List;

import ups.edu.ec.Modelo.Autor;


public interface AutorDAO extends GenericDAO <Autor, Integer>{
	List<Autor> findbyUserId(String dato);
}
