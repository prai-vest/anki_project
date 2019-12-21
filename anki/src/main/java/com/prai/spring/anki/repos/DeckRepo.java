package com.prai.spring.anki.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.prai.spring.anki.entities.Deck;

public interface DeckRepo extends CrudRepository<Deck, Integer> {
	
	@Query("Select d from Deck d")
	List<Deck> find();
	
	@Query("Select d from Deck d where d.name = :name")
	Optional<Deck> findByName(@Param("name") String name);
}
