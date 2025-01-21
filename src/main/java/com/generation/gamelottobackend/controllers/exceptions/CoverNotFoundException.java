package com.generation.gamelottobackend.controllers.exceptions;

public class CoverNotFoundException extends RuntimeException
{
    public CoverNotFoundException(long id)
    {
        super("Cover with id " + id + " not found");
    }
}
