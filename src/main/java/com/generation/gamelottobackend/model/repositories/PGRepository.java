package com.generation.gamelottobackend.model.repositories;

import com.generation.gamelottobackend.model.entities.PG;
import com.generation.gamelottobackend.model.entities.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PGRepository extends JpaRepository<PG, Long>
{
    @Query("SELECT p FROM PG p WHERE p.id NOT IN :ids")
    List<PG> findAllByIdNotIn(List<Long> ids);
}
