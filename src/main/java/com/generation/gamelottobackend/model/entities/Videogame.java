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
	private String publisher;
	private String soundtrack;
	private String perspective;

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getPlatform() {return platform;}

	public void setPlatform(String platform) {this.platform = platform;}

	public String getGenres() {return genres;}

	public void setGenres(String genres) {this.genres = genres;}

	public int getReleaseYear() {return releaseYear;}

	public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}

	public String getDeveloper() {return developer;}

	public void setDeveloper(String developer) {this.developer = developer;}

	public String getPublisher() {return publisher;}

	public void setPublisher(String publisher) {this.publisher = publisher;}

	public String getSoundtrack() {return soundtrack;}

	public void setSoundtrack(String soundtrack) {this.soundtrack = soundtrack;}

	public String getPerspective() {return perspective;}

	public void setPerspective(String perspective) {this.perspective = perspective;}
}
