package com.generation.gamelottobackend.controllers.exceptions;

public class SoundtrackNotFoundException extends RuntimeException
{
    public SoundtrackNotFoundException(long id)
    {
        super("Soundtrack with id " + id + " not found");
    }
}
