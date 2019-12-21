package com.prai.spring.anki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prai.spring.anki.entities.Card;
import com.prai.spring.anki.services.CardService;

@RestController
@RequestMapping("cards")
public class CardController {

	@Autowired
	CardService cs;
	
	@PostMapping
	public ResponseEntity<Card> saveCard(@RequestBody Card card) {
		Card savedCard = cs.saveCard(card);
		if (savedCard == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(savedCard);
		}
	}
	
	@PutMapping
	public ResponseEntity<Card> updateCard(@RequestBody Card card) {
		Card updatedCard = cs.updateCard(card);
		if (updatedCard == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(updatedCard);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteCard(@PathVariable Integer id) {
		cs.deleteCard(id);
		return ResponseEntity.noContent().build();
	}
}
