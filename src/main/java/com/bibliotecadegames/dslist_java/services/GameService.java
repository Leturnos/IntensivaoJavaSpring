package com.bibliotecadegames.dslist_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bibliotecadegames.dslist_java.dto.GameDTO;
import com.bibliotecadegames.dslist_java.dto.GameMinDTO;
import com.bibliotecadegames.dslist_java.entities.Game;
import com.bibliotecadegames.dslist_java.repositories.GameRepository;

@Component // pode ser @Service também
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll(); 
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
