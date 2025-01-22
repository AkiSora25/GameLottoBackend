package com.generation.gamelottobackend.model.dto;

public class VideogameDTORespSpec
{
	private Long id;
	private String name;
	private String platform;
	private String genre;
	private int releaseDate;
	private String developer;
	private String perspective;

	public Long getId() {return id;}

	public void setId(Long id) {this.id = id;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getPlatform() {return platform;}

	public void setPlatform(String platform) {this.platform = platform;}

	public String getGenre() {return genre;}

	public void setGenre(String genre) {this.genre = genre;}

	public int getReleaseDate() {return releaseDate;}

	public void setReleaseDate(int releaseDate) {this.releaseDate = releaseDate;}

	public String getDeveloper() {return developer;}

	public void setDeveloper(String developer) {this.developer = developer;}

	public String getPerspective() {return perspective;}

	public void setPerspective(String perspective) {this.perspective = perspective;}
}
