package com.generation.gamelottobackend.controllers.helper;

import com.generation.gamelottobackend.controllers.exceptions.*;
import com.generation.gamelottobackend.model.dto.*;
import com.generation.gamelottobackend.model.entities.Videogame;
import com.generation.gamelottobackend.model.repositories.PGRepository;
import com.generation.gamelottobackend.model.repositories.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generation.gamelottobackend.model.entities.PG;

import java.util.Optional;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	VideogameRepository vRepo;

	@Autowired
	PGRepository pRepo;

	@Autowired
	DTOConverterVideogame dtoConverter;

	@Autowired
	DTOConverterPG dtoConverterPG;


	@Override
	public VideogameDTORespCompl getOneDtoCompl(long id)
	{
		Optional<Videogame> game = vRepo.findById(id);
		//scatola che può contenere o no l'elemento
		if(game.isPresent())//isPresent() da true se l'optional è pieno
			//.get() tira fuori l'oggetto dall'optional
			return dtoConverter.toDTOCompl(game.get());

		throw new VideogameNotFoundException(id);
	}

	@Override
	public VideogameDTORespCover getOneDtoCover(long id)
	{
		Optional<Videogame> game = vRepo.findById(id);
		//scatola che può contenere o no l'elemento
		if(game.isPresent())//isPresent() da true se l'optional è pieno
			//.get() tira fuori l'oggetto dall'optional
			return dtoConverter.toDTOCover(game.get());

		throw new CoverNotFoundException(id);
	}

	@Override
	public VideogameDTORespSound getOneDtoSound(long id)
	{
		Optional<Videogame> game = vRepo.findById(id);
		//scatola che può contenere o no l'elemento
		if(game.isPresent())//isPresent() da true se l'optional è pieno
			//.get() tira fuori l'oggetto dall'optional
			return dtoConverter.toDTOSound(game.get());

		throw new SoundtrackNotFoundException(id);
	}

	@Override
	public VideogameDTORespSpec getOneDtoSpec(long id)
	{
		Optional<Videogame> game = vRepo.findById(id);
		//scatola che può contenere o no l'elemento
		if (game.isPresent())//isPresent() da true se l'optional è pieno
			//.get() tira fuori l'oggetto dall'optional
			return dtoConverter.toDTOSpec(game.get());

		throw new SpecNotFoundException(id);
	}

	@Override
	public PGDTOResp getOneDtoPG(long id)
	{
		Optional<PG> pg = pRepo.findById(id);
		//scatola che può contenere o no l'elemento
		if (pg.isPresent())//isPresent() da true se l'optional è pieno
			//.get() tira fuori l'oggetto dall'optional
			return dtoConverterPG.toDTOPG(pg.get());

		throw new PGNotFoundException(id);
	}
}
