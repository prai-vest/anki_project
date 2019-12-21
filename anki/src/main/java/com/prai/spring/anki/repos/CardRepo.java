package com.prai.spring.anki.repos;

import org.springframework.data.repository.CrudRepository;

import com.prai.spring.anki.entities.Card;

public interface CardRepo extends CrudRepository<Card, Integer> {

}
