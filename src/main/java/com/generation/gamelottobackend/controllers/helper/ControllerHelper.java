package com.generation.gamelottobackend.controllers.helper;

import com.generation.gamelottobackend.model.dto.*;

public interface ControllerHelper
{
	VideogameDTORespCompl getOneDtoCompl(long id);

	VideogameDTORespCover getOneDtoCover(long id);

	VideogameDTORespSound getOneDtoSound(long id);

	VideogameDTORespSpec getOneDtoSpec(long id);

	PGDTOResp getOneDtoPG(long id);
}
