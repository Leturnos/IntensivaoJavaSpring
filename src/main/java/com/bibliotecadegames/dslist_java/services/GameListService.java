package com.bibliotecadegames.dslist_java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bibliotecadegames.dslist_java.dto.GameListDTO;
import com.bibliotecadegames.dslist_java.entities.GameList;
import com.bibliotecadegames.dslist_java.repositories.GameListRepository;

@Component // pode ser @Service também
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll(); 
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList(); 
		return dto;
	}
}
