package com.aprimorar.executando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprimorar.executando.dto.GameMinDTO;
import com.aprimorar.executando.entites.Game;
import com.aprimorar.executando.repositories.GameRepository;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findALL(){
		List<Game>result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}

}