package com.bibliotecadegames.dslist_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bibliotecadegames.dslist_java.dto.GameMinDTO;
import com.bibliotecadegames.dslist_java.entities.Game;
import com.bibliotecadegames.dslist_java.repositories.GameRepository;

@Component // pode ser @Service também
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll(); 
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
