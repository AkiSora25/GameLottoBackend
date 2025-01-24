package com.generation.gamelottobackend.controllers;

import com.generation.gamelottobackend.controllers.helper.ControllerHelper;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCompl;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCover;
import com.generation.gamelottobackend.model.dto.VideogameDTORespSound;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/{type}")
    public ResponseEntity<?> getRandom(@PathVariable String type, @RequestBody List<Long> ids)
    {
        return ch.getRandom(type, ids);
    }

}
