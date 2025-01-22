package com.generation.gamelottobackend.controllers.exceptions;

public class SpecNotFoundException extends RuntimeException
{
	public SpecNotFoundException(long id)
	{
		super("Specific with id " + id + " not found");
	}
}
