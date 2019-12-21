package com.prai.spring.anki.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.prai.spring.anki.entities.Card;

public interface CardRepo extends CrudRepository<Card, Integer> {
	
	@Query("Select c from Card c")
	List<Card> find();
	
	@Query("Select c from Card c where c.deckId = :deckId")
	List<Card> findByDeckId(@Param("deckId") Integer deckId);
}
