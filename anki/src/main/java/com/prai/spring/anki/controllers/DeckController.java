package com.prai.spring.anki.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prai.spring.anki.entities.Card;
import com.prai.spring.anki.entities.Deck;
import com.prai.spring.anki.services.CardService;
import com.prai.spring.anki.services.DeckService;

@RestController
@RequestMapping("decks")
public class DeckController {

	@Autowired
	DeckService ds;
	
	@Autowired
	CardService cs;
	
	@GetMapping("")
	public List<Deck> decks() {
		return ds.getDecks();
	}
	
	@GetMapping("/{deckId}/cards")
	public List<Card> cards(@PathVariable("deckId") Integer deckId) {
		return cs.getCardsByDeckId(deckId);
	}
}
