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
	
	public void showGames()
	{
		if(games.size()==0)
		{
			System.out.println("non ci sono giochi");
		}
		else
		{
			for( int i = 0; i < games.size(); i++)
			{
				System.out.println(games.get(i).toString());
			}
		}	
	}
	public void searchGame(String n)
	{
		boolean check = false;
		for(int i = 0; i < games.size(); i++)
		{
			if(games.get(i).getName().contains(n))
			{
				check = true;
				System.out.println(games.get(i));
			}
			
		}
		if(check == false)
		{
			System.out.println("non è stato trovato nessun gioco");
		}
	}
	public void hardDifficult(int minLevel)
	{
		boolean check = false;
		for(int i = 0; i < games.size(); i++)
		{
			if(games.get(i).getLevel()>=minLevel)
			{
				check = true;
				System.out.println(games.get(i).toString());
			}
		}
		if(check == false)
		{
			System.out.println("non è stato trovato nessun gioco con difficoltà maggiore o uguale a 4");
		}
	}
}
