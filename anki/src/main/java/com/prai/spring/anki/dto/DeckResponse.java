package com.prai.spring.anki.dto;

import java.util.ArrayList;
import java.util.List;

import com.prai.spring.anki.entities.Card;
import com.prai.spring.anki.entities.Deck;

public class DeckResponse {
	
	private Deck dk;
	private List<Card> cards = new ArrayList<>();
	
	public DeckResponse(Deck dk, List<Card> cards) {
		this.dk = dk;
		this.cards = cards;
	}

	public Deck getDk() {
		return dk;
	}

	public void setDk(Deck dk) {
		this.dk = dk;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}


}
