package fr.imie.cours;

import java.util.List;

import fr.imie.cours.model.User;

public interface UserLocal {

	void delete(Integer id);

	void delete(User data);

	void update(User data);

	void create(User data);

	User findOne(int id);

	User findOne(User data);

	List<User> findAll();

}
