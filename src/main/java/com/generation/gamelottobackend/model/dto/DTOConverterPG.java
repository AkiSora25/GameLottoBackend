package com.generation.gamelottobackend.model.dto;

import org.springframework.stereotype.Service;
import com.generation.gamelottobackend.model.entities.PG;

@Service
public class DTOConverterPG
{
	public PG toEntity(PGDTOReq dto)
	{
		PG PG = new PG();
		PG.setName(dto.getName());
		PG.setImg(dto.getImg());
		PG.setDescription(dto.getDescription());

		return PG;
	}

	public PGDTOResp toDTOPG(PG c)
	{
		PGDTOResp dto= new PGDTOResp();
		dto.setName(c.getName());
		dto.setImg(c.getImg());
		dto.setDescription(c.getDescription());

		return dto;
	}
}
