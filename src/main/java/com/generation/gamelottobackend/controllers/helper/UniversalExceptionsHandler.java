package com.generation.gamelottobackend.controllers.helper;


import com.generation.gamelottobackend.controllers.exceptions.CoverNotFoundException;
import com.generation.gamelottobackend.controllers.exceptions.SoundtrackNotFoundException;
import com.generation.gamelottobackend.controllers.exceptions.VideogameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UniversalExceptionsHandler
{
    @ExceptionHandler(VideogameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleVideogameNotFound(VideogameNotFoundException e)
    {
        return e.getMessage();
    }

    @ExceptionHandler(CoverNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleCoverNotFound(CoverNotFoundException e)
    {
        return e.getMessage();
    }

    @ExceptionHandler(SoundtrackNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleSoundNotFound(SoundtrackNotFoundException e)
    {
        return e.getMessage();
    }
}
