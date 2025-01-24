package com.generation.gamelottobackend.model.repositories;

import com.generation.gamelottobackend.model.entities.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideogameRepository extends JpaRepository<Videogame, Long>
{
	@Query("SELECT v FROM Videogame v WHERE v.id NOT IN :ids")
	List<Videogame> findAllByIdNotIn(List<Long> ids);
}
