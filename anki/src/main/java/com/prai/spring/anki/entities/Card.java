package com.prai.spring.anki.entities;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.array.StringArrayType;

@TypeDef(name = "string-array", typeClass = StringArrayType.class)
@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "deckid")
	private Integer deckId;
	
	private String front;
	
	private String back;
	
	@Column(name = "card_type")
	private String cardType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_acessed")
	private Date lastAcessed;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	
	@Type(type = "string-array")
	private String[] tags;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "due_date")
	private Date dueDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeckId() {
		return deckId;
	}

	public void setDeckid(Integer deckid) {
		this.deckId = deckid;
	}

	public String getFront() {
		return front;
	}

	public void setFront(String front) {
		this.front = front;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getLastAcessed() {
		return lastAcessed;
	}

	public void setLastAcessed(Date lastAcessed) {
		this.lastAcessed = lastAcessed;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", deckid=" + deckId + ", front=" + front + ", back=" + back + ", cardType=" + cardType
				+ ", lastAcessed=" + lastAcessed + ", createdAt=" + createdAt + ", tags=" + Arrays.toString(tags) + ", dueDate="
				+ dueDate + "]";
	}
	
}
