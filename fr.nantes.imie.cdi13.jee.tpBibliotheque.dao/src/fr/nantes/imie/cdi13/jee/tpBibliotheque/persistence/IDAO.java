/**
 * 
 */
package fr.nantes.imie.cdi13.jee.tpBibliotheque.persistence;

import java.util.List;

/**
 * @author imiedev
 *
 */
public interface IDAO<T> {

	public List<T> findAll();
	public T findOneById(Integer id);
	public void create(T dto);
	public void delete(T dto);
	public void update(T dto);

}
