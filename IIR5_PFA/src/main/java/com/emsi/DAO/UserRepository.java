package com.emsi.DAO;





import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emsi.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "SELECT u FROM User u"
			+ " where u.Login=?1 AND u.Passwored=?2 ")
	Optional<User> recherche(String login,String Passwored );

}
