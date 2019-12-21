package com.prai.spring.anki.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prai.spring.anki.entities.Deck;

public interface DeckRepo extends CrudRepository<Deck, Integer> {
	
	@Query("Select d from Deck d")
	List<Deck> find();
}
