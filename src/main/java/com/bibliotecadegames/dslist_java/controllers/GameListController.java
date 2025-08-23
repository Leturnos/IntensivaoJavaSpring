package com.bibliotecadegames.dslist_java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotecadegames.dslist_java.dto.GameListDTO;
import com.bibliotecadegames.dslist_java.dto.GameMinDTO;
import com.bibliotecadegames.dslist_java.services.GameListService;
import com.bibliotecadegames.dslist_java.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gamelistservice;
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gamelistservice.findAll(); 
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId); 
		return result;
	}
}
