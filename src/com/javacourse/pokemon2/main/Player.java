package com.javacourse.pokemon2.main;

public class Player {
	
	private String name;
	private int health;
	private Pokemon[] pokemons;
	private int currentPokemonInside;
	
	public Player(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}

	public int getCurrentPokemonInside() {
		return currentPokemonInside;
	}

	public void setCurrentPokemonInside(int currentPokemonInside) {
		this.currentPokemonInside = currentPokemonInside;
	}
	
	public void printInfo() {
		
		System.out.println("Player Name: " + this.name + "Player's Health: " + this.getHealth());
		

	}

	public  Pokemon getNextPokemon() {
		
		Pokemon p = this.pokemons[this.getCurrentPokemonInside()];
		
		if(this.currentPokemonInside == 0) {
			
			this.currentPokemonInside = 1;
		}else {
			
			this.currentPokemonInside = 0;
		}
	
		return p;	
	}
	
	public boolean isAlive() {
		
		if(this.getHealth() <= 0) {
			
			return false;
		}else
		
		return true;
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
