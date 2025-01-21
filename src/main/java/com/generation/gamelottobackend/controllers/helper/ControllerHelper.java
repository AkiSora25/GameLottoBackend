package com.generation.gamelottobackend.controllers.helper;

import com.generation.gamelottobackend.model.dto.VideogameDTORespCompl;
import com.generation.gamelottobackend.model.dto.VideogameDTORespCover;
import com.generation.gamelottobackend.model.dto.VideogameDTORespSound;

public interface ControllerHelper
{
	VideogameDTORespCompl getOneDtoCompl(long id);

	VideogameDTORespCover getOneDtoCover(long id);

	VideogameDTORespSound getOneDtoSound(long id);
}
