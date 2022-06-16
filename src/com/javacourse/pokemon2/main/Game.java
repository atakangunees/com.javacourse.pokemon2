package com.javacourse.pokemon2.main;

public class Game {
	
	Player player1;
	Player player2;
	
	public Game(Player player1, Player player2) {
		
		this.player1 = player1;
		this.player2 = player2;
		
	}
	
	public void start() {
		
		while(player1.getHealth() > 0 && player2.getHealth() > 0) {
			
			Pokemon player1Pokemon = this.player1.getNextPokemon();
			Pokemon player2Pokemon = this.player2.getNextPokemon();
			
			player1Pokemon.hit(player2);
			
			if(player2.getHealth() < 10 && player2Pokemon instanceof Boostable) {
				Boostable b = (Boostable)player2Pokemon;
				b.boost();
			}
			
			if(!player2.isAlive()) {
				
				anonsWinner(player1);
				
				break;
			}
               player2Pokemon.hit(player1);
			
			if(player1.getHealth() < 10 && player1Pokemon instanceof Boostable) {
				Boostable b = (Boostable)player1Pokemon;
				b.boost();
			}
			
			if(!player1.isAlive()) {
				
				anonsWinner(player2);
				
				break;
			}
			
			printTurnResult();
			
		}

	}

	private void printTurnResult() {
		
		System.out.println(player1);
		System.out.println(player2);
	}

	public void anonsWinner(Player player) {
	
		
		System.out.println(player.getName().toUpperCase() + "HAS WON !!!"); 
		
	}
	

}
