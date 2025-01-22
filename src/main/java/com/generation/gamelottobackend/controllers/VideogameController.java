package com.generation.gamelottobackend.controllers;

import com.generation.gamelottobackend.controllers.helper.ControllerHelper;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCompl;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCover;
import com.generation.gamelottobackend.model.dto.VideogameDTORespSound;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}/{type}")
    public ResponseEntity<?> getVideogameById(@PathVariable long id, @PathVariable(required = false) String type)
    {
        switch (type)
        {
            case "cover"-> {return ResponseEntity.ok(ch.getOneDtoCover(id));}
            case "soundtrack"-> {return ResponseEntity.ok(ch.getOneDtoSound(id));}
            case "spec"->{return ResponseEntity.ok(ch.getOneDtoSpec(id));}
            default -> {return ResponseEntity.ok(ch.getOneDtoCompl(id));}
        }

    }
}
