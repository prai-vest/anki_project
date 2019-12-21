package com.prai.spring.anki.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping
	public List<Deck> decks() {
		return ds.getDecks();
	}
	
	@GetMapping("/{deckId}/cards")
	public List<Card> cards(@PathVariable("deckId") Integer deckId) {
		return cs.getCardsByDeckId(deckId);
	}
	
	@PostMapping
	public ResponseEntity<Deck> saveDeck(@RequestBody Deck deck) {
		if (ds.getDeckByName(deck.getName()) != null) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		} else {
			Deck savedDeck = ds.saveDeck(deck);
			if (savedDeck == null) {
				return ResponseEntity.notFound().build();
			} else {
				return ResponseEntity.ok(savedDeck);
			}
		}
	}
	
	@PutMapping
	public ResponseEntity<Deck> updateDeck(@RequestBody Deck deck) {
		Deck updatedDeck = ds.updateDeck(deck);
		if (updatedDeck == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(updatedDeck);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteDeck(@PathVariable Integer id) {
		ds.deleteDeck(id);
		return ResponseEntity.noContent().build();
	}
}
