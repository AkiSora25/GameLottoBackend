package com.generation.gamelottobackend.model.entities;

import jakarta.persistence.Entity;

@Entity
public class Videogame extends BaseEntity
{
	private String name;
	private String platform;
	private String genre;
	private int releaseDate;
	private String developer;
	private String perspective;
	private String cover;
	private String soundtrack;


	public String getGenre() {return genre;}

	public void setGenre(String genre) {this.genre = genre;}

	public String getCover() {return cover;}

	public void setCover(String cover) {this.cover = cover;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getPlatform() {return platform;}

	public void setPlatform(String platform) {this.platform = platform;}

	public int getReleaseDate() {return releaseDate;}

	public void setReleaseDate(int releaseDate) {this.releaseDate = releaseDate;}

	public String getDeveloper() {return developer;}

	public void setDeveloper(String developer) {this.developer = developer;}

	public String getSoundtrack() {return soundtrack;}

	public void setSoundtrack(String soundtrack) {this.soundtrack = soundtrack;}

	public String getPerspective() {return perspective;}

	public void setPerspective(String perspective) {this.perspective = perspective;}
}
