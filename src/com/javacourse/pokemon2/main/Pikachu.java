package com.javacourse.pokemon2.main;

public class Pikachu extends Pokemon implements Boostable{
	
	public static final String NAME = "Pikachu";
	public static final int POWER = 10;

	public Pikachu(String name, int power ) {
		
		super(Pikachu.NAME,Pikachu.POWER);
		
	}

	@Override
	public void boost() {
		
		this.setPower(this.getPower() * 2);
		
	}
	
	

}
