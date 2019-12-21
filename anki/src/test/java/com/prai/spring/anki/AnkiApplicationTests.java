package com.prai.spring.anki;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.prai.spring.anki.entities.Deck;
import com.prai.spring.anki.repos.CardRepo;
import com.prai.spring.anki.repos.DeckRepo;
import com.prai.spring.anki.services.DeckService;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class AnkiApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	DeckRepo dp;
	
	@Autowired
	DeckService ds;
	
	@Autowired
	CardRepo cr;

	@Test
	void contextLoads() {
		// Inserting a deck
//		Deck nd = new Deck();
//		nd.setName("hello");
//		nd.setCreatedAt(new Date());
//		dp.save(nd);
		
		// Inserting a card
//		Card cd = new Card();
//		cd.setDeckid(1);
//		cd.setFront("hello");
//		cd.setBack("Brother");
//		cd.setLastAcessed(new Date());
//		cd.setCreatedAt(new Date());
//		String[] tgs = new String[] {"tech", "webdev"};
//		cd.setTags(tgs);
//		cr.save(cd);
		
//		List<Card> cards = cr.findByDeckId(1);
//		for (Card c: cards) {
//			System.out.println(c);
//		}
		
		Deck d = ds.getDeckByName("Java");
		
		if (d != null) {
			System.out.println(d);
		}
	}

}
