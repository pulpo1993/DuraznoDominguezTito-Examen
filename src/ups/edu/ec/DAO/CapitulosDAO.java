package ups.edu.ec.DAO;

import java.util.List;

import ups.edu.ec.Modelo.Capitulos;

public interface CapitulosDAO extends GenericDAO <Capitulos, Integer> {

	List<Capitulos> findbyUserId(String dato);
}
