package com.javacourse.pokemon2.main;

public class Pokemon {
	
	private String name;
	private int power;
	
	public Pokemon(String name, int power) {
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	//player[] olarak mý yazýlacak dýkkat et.
	public void hit(Player enemy) {
		
	enemy.setHealth(enemy.getHealth() - this.power);
		
	}
	
	public void printAttackDetail() {
		
		System.out.println("Pokemon's Name: " + this.name + "Pokemon's Power: " + this.getPower());
	}
	

	
}
