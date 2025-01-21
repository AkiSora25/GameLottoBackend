package com.generation.gamelottobackend.controllers.helper;

import com.generation.gamelottobackend.controllers.VideogameController;
import com.generation.gamelottobackend.controllers.exceptions.CoverNotFoundException;
import com.generation.gamelottobackend.controllers.exceptions.SoundtrackNotFoundException;
import com.generation.gamelottobackend.controllers.exceptions.VideogameNotFoundException;
import com.generation.gamelottobackend.model.dto.DTOConverterVideogame;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCompl;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCover;
import com.generation.gamelottobackend.model.dto.VideogameDTORespSound;
import com.generation.gamelottobackend.model.entities.Videogame;
import com.generation.gamelottobackend.model.repositories.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	VideogameRepository vRepo;

	@Autowired
	DTOConverterVideogame dtoConverter;


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
}
