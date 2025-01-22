package com.generation.gamelottobackend.model.entities;

public class PG extends BaseEntity
{
	private String name;
	private String img;
	private Videogame videogame;
	private String description;

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getImg() {return img;}

	public void setImg(String img) {this.img = img;}

	public Videogame getVideogame() {return videogame;}

	public void setVideogame(Videogame videogame) {this.videogame = videogame;}

	public String getDescription() {return description;}

	public void setDescription(String description) {this.description = description;}
}
