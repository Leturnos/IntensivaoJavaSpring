package com.bibliotecadegames.dslist_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotecadegames.dslist_java.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
