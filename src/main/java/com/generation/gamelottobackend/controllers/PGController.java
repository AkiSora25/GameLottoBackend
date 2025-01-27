package com.generation.gamelottobackend.controllers;

import com.generation.gamelottobackend.controllers.helper.ControllerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pgs")
public class PGController
{
	@Autowired
	ControllerHelper ch;

	@GetMapping("/{id}")
	public ResponseEntity<?> getPGById(@PathVariable long id)
	{
		return ResponseEntity.ok(ch.getOneDtoPG(id));
	}

	@PostMapping()
	public ResponseEntity<?> getRandom2(@RequestBody List<Long> ids)
	{
		return ch.getRandom2(ids);
	}

	@GetMapping("/games")
	public List <String> getAllGames(){return ch.getAllGames();}
}
