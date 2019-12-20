package com.prai.spring.anki.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("decks")
public class DeckController {

	@GetMapping("")
	public String decks() {
		return "hello world";
	}
}
