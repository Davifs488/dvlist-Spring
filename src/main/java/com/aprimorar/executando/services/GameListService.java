package com.aprimorar.executando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aprimorar.executando.dto.GameListDTO;
import com.aprimorar.executando.entites.GameList;
import com.aprimorar.executando.repositories.GameListRepository;


@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findALL(){
		List<GameList>result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}

}