package com.example.tarjetas.entity;

import javax.persistence.*;

import lombok.Data;


//@Data
@Entity
@Table(name="tarjetas")
public class Tarjetas {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

	private String passion;
	
	private Long minsalary;
	
	private Long maxsalary;
	
	private Long minage;
	
	private Long maxage;
	
	private String cards;
	
	
	public Tarjetas(Long id, String passion, Long minsalary, Long maxsalary, Long minage, Long maxage, String cards) {
		this.id = id;
		this.passion = passion;
		this.minsalary = minsalary;
		this.maxsalary = maxsalary;
		this.minage = minage;
		this.maxage = maxage;
		this.cards = cards;
	}
	
	public Tarjetas() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassion() {
		return passion;
	}

	public void setPassion(String passion) {
		this.passion = passion;
	}

	public Long getMinsalary() {
		return minsalary;
	}

	public void setMinsalary(Long minsalary) {
		this.minsalary = minsalary;
	}

	public Long getMaxsalary() {
		return maxsalary;
	}

	public void setMaxsalary(Long maxsalary) {
		this.maxsalary = maxsalary;
	}

	public Long getMinage() {
		return minage;
	}

	public void setMinage(Long minage) {
		this.minage = minage;
	}

	public Long getMaxage() {
		return maxage;
	}

	public void setMaxage(Long maxage) {
		this.maxage = maxage;
	}

	public String getCards() {
		return cards;
	}

	public void setCards(String cards) {
		this.cards = cards;
	}


	
}
