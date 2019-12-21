package com.prai.spring.anki.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prai.spring.anki.entities.Deck;
import com.prai.spring.anki.repos.DeckRepo;

@Service
public class DeckService {
	
	@Autowired
	DeckRepo dr;
	
	public List<Deck> getDecks() {
		return dr.find();
	}
	
	public Deck getDeck(Integer id) {
		return dr.findById(id).orElse(null);
	}
	
	public Deck getDeckByName(String name) {
		return dr.findByName(name).orElse(null);
	}
	
	public Deck saveDeck(Deck deck) {
		return dr.save(deck);
	}
	
	public Deck updateDeck(Deck deck) {
		return dr.save(deck);
	}
	
	public void deleteDeck(Integer id) {
		dr.deleteById(id);
	}
}
