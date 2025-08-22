package com.bibliotecadegames.dslist_java.dto;

import com.bibliotecadegames.dslist_java.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {
	}

	public GameListDTO(GameList entity) {
		id = entity.getId(); // como não usei BeanUtils, posso só chamar os getters
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
