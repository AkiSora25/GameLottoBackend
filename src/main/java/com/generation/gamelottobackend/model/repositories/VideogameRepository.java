package com.generation.gamelottobackend.model.repositories;

import com.generation.gamelottobackend.model.entities.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogameRepository extends JpaRepository<Videogame, Long>
{
}
