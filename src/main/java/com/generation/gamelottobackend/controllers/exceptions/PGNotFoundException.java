package com.generation.gamelottobackend.controllers.exceptions;

public class PGNotFoundException extends RuntimeException
{
	public PGNotFoundException(long id)
	{
		super("Character with id " + id + " not found");
	}
}
