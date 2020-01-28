package com.ibraim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibraim.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	//JpaRepository ja tem uma interface padrao, por isso nao precisa implementar

}
