package service;

import java.util.ArrayList;

import models.Game;

public class ServiceArcadeRetro {
	ArrayList<Game> games = new ArrayList<Game>();
	
	public void  addGame(String n, int d, int l)
	{
		Game game = new Game(n,d,l);
		this.games.add(game);
	}
}
