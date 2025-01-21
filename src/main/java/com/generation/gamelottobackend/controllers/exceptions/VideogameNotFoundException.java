package com.generation.gamelottobackend.controllers.exceptions;

public class VideogameNotFoundException extends RuntimeException
{
    public VideogameNotFoundException(long id)
    {
        super("Videogame with id " + id + " not found");
    }
}
