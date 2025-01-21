package com.generation.gamelottobackend.model.dto;

import com.generation.gamelottobackend.model.entities.Videogame;
import org.springframework.stereotype.Service;

@Service
public class DTOConverterVideogame
{
    public Videogame toEntity(VideogameDTOReq dto)
    {
        Videogame videogame= new Videogame();
        videogame.setName(dto.getName());
        videogame.setPlatform(dto.getPlatform());
        videogame.setGenre(dto.getGenre());
        videogame.setReleaseDate(dto.getReleaseDate());
        videogame.setDeveloper(dto.getDeveloper());
        videogame.setPerspective(dto.getPerspective());
        videogame.setCover(dto.getCover());
        videogame.setSoundtrack(dto.getSoundtrack());

        return videogame;
    }



    public VideogameDTORespCompl toDTOCompl(Videogame v)
    {
        VideogameDTORespCompl dto= new VideogameDTORespCompl();
        dto.setName(v.getName());
        dto.setPlatform(v.getPlatform());
        dto.setGenre(v.getGenre());
        dto.setReleaseDate(v.getReleaseDate());
        dto.setDeveloper(v.getDeveloper());
        dto.setPerspective(v.getPerspective());
        dto.setCover(v.getCover());
        dto.setSoundtrack(v.getSoundtrack());

        return dto;
    }

    public VideogameDTORespCover toDTOCover(Videogame v)
    {
        VideogameDTORespCover dto = new VideogameDTORespCover();
        dto.setName(v.getName());
        dto.setCover(v.getCover());

        return dto;
    }



    public VideogameDTORespSound toDTOSound(Videogame v)
    {
       VideogameDTORespSound dto= new VideogameDTORespSound();
       dto.setName(v.getName());
       dto.setSoundtrack(v.getSoundtrack());
       
       return dto;
    }
}
