package com.bibliotecadegames.dslist_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotecadegames.dslist_java.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
