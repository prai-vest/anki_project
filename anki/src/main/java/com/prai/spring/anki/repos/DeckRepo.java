package com.prai.spring.anki.repos;

import org.springframework.data.repository.CrudRepository;

import com.prai.spring.anki.entities.Deck;

public interface DeckRepo extends CrudRepository<Deck, Integer> {

}
