package com.javacourse.pokemon2.main;

public class Application {

	public static void main(String[] args) {
		
		Player player1 = new Player("Atakan");
        Player player2 = new Player("Kerem");
        
        Pokemon[] player1Pokemon = new Pokemon[2];
        Pokemon[] player2Pokemon = new Pokemon[2];
        
        player1Pokemon[0] = new Misty("Misty",13);
        player1Pokemon[1] = new Pikachu("Pikachu",10);
        
        player2Pokemon[0] = new Pikachu("Pikachu",10);
        player2Pokemon[1] = new Charizard("Charizard",13);
        
        player1.setPokemons(player1Pokemon);
        player2.setPokemons(player2Pokemon);
        
        Game game = new Game(player1,player2);
        
        game.start();
        
	}

}
