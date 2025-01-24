package com.generation.gamelottobackend.controllers.helper;

import com.generation.gamelottobackend.model.dto.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ControllerHelper
{
	VideogameDTORespCompl getOneDtoCompl(long id);

	VideogameDTORespCover getOneDtoCover(long id);

	VideogameDTORespSound getOneDtoSound(long id);

	VideogameDTORespSpec getOneDtoSpec(long id);

	PGDTOResp getOneDtoPG(long id);

	ResponseEntity<?> getRandom(String type, List<Long> ids);

	ResponseEntity<?> getRandom2(List<Long> ids);
}
