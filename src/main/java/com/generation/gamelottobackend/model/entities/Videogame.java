package com.generation.gamelottobackend.model.entities;

import jakarta.persistence.Entity;

@Entity
public class Videogame extends BaseEntity
{
	private String name;
	private String platform;
	private String genres;
	private int releaseYear;
	private String developer;
	private String soundtrack;

}
