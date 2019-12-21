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
	
}
