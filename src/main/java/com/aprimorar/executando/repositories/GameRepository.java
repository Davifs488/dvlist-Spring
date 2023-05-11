package com.aprimorar.executando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprimorar.executando.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
