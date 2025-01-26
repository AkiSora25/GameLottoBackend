package com.generation.gamelottobackend.controllers;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/audio")
public class FileAudioController
{
	private String cartella="C:\\Users\\iperd\\OneDrive\\Documenti\\Draco\\Canzoni Gamelotto";

	@GetMapping("/{fileName}")
	public ResponseEntity<Resource> getAudioFile(@PathVariable String fileName)
	{
		try
		{
			Path filePath = Paths.get(cartella).resolve(fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri());

			if (!resource.exists())
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}


			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
					.header(HttpHeaders.CONTENT_TYPE, "audio/mpeg")
					.body(resource);
		}
		catch (Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
