package com.prai.spring.anki.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prai.spring.anki.entities.Card;
import com.prai.spring.anki.repos.CardRepo;

@Service
public class CardService {

	@Autowired
	CardRepo cr;
	
	public List<Card> getCardsByDeckId(Integer deckId) {
		return cr.findByDeckId(deckId);
	}
	
	public Card saveCard(Card card) {
		return cr.save(card);
	}
	
	public void deleteCard(Integer id) {
		cr.deleteById(id);
	}
}
