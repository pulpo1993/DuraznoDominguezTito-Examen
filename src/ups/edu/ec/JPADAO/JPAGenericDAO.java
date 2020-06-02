package ups.edu.ec.JPADAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ups.edu.ec.DAO.GenericDAO;

public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {
	 private Class<T> persistentClass;
	    protected EntityManager em;

	    public JPAGenericDAO(Class<T> persistentClass) {
	    	this.persistentClass = persistentClass;
			this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		   
		}
	

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public T read(ID id) {		
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}	
		}
		
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public void deleteById(ID id) {
		T entity=this.read(id);
		if (entity !=null) {
			this.delete(entity);
		}
		
	}

	 @SuppressWarnings({ "rawtypes", "unchecked" })
	    @Override
	    public List<T> find() {
		em.getTransaction().begin();
		List<T> lista = null;
		try {
		    javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		    cq.select(cq.from(persistentClass));
		    lista = em.createQuery(cq).getResultList();
		    em.getTransaction().commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return lista;
	    }


	@Override
	public List<T> find(String[] attributes, String[] values) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<T> find(String[] attributes, String[] values, String order, int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	

}
