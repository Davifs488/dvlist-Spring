package com.aprimorar.executando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprimorar.executando.entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
