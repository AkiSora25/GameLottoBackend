package com.generation.gamelottobackend.model.dto;

import com.generation.gamelottobackend.model.entities.Videogame;

public class PGDTOReq
{
	private String name;
	private String img;
	private String game;
	private String description;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getImg()
	{
		return img;
	}

	public void setImg(String img)
	{
		this.img = img;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getGame() {return game;}

	public void setGame(String game) {this.game = game;}
}
