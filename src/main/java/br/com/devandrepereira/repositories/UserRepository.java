package br.com.devandrepereira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devandrepereira.entities.User;

/**
 * @author Andre Pereira
 * 
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);


	User findByEmailAndPassword(String email, String password);

}
