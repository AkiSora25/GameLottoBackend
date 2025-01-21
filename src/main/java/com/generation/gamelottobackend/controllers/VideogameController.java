package com.generation.gamelottobackend.controllers;

import com.generation.gamelottobackend.controllers.helper.ControllerHelper;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCompl;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCover;
import com.generation.gamelottobackend.model.dto.VideogameDTORespSound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videogames")
public class VideogameController
{
    @Autowired
    ControllerHelper ch;

    @GetMapping("/{id}")
    public VideogameDTORespCompl getVideogameById(@PathVariable long id)
    {
        return ch.getOneDtoCompl(id);
    }

    @GetMapping("/{id}")
    public VideogameDTORespCover getVideogameByCover(@PathVariable long id)
    {
        return ch.getOneDtoCover(id);
    }

    @GetMapping("/{id}")
    public VideogameDTORespSound getVideogameBySound(@PathVariable long id)
    {
        return ch.getOneDtoSound(id);
    }

}
