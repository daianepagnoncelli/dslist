package com.daipagnoncelli.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daipagnoncelli.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
