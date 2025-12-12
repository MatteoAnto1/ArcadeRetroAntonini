import java.util.Scanner;

import service.ServiceArcadeRetro;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int level = 0;
		boolean isRunning = true;
		ServiceArcadeRetro service = new ServiceArcadeRetro();
		
		do
		{			
			System.out.println("MENU");
			System.out.println("1) aggiungere gioco arcade");
			System.out.println("2) visualizzare lista");
			System.out.println("3) cercare giochi");
			System.out.println("4) giochi difficili");
			System.out.println("5) termina");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
			{
				System.out.println("inserire nome");
				String name = scanner.nextLine();
				System.out.println("inserire l'anno di uscita");
				int releaseDate = scanner.nextInt();
				scanner.nextLine();
				do
				{
					System.out.println("inserire in livello di difficolta");
					level = scanner.nextInt();
					scanner.nextLine();
				}
				while(level<0 || level>5);
				service.addGame(name,releaseDate,level);
				break;
			}
			case 2:
			{
				service.showGames();
				break;
			}
			case 3:
			{
				System.out.println("inserire parola chiave");
				String word = scanner.nextLine();
				service.searchGame(word);
				break;
			}
			case 4:
			{
				service.hardDifficult();
				break;
			}
			case 5:
			{
				System.out.println("fine");
				isRunning = false;
				break;
			}
			default:
				System.out.println("inserire un valore corretto");
				break;
			}
		}while(isRunning);
		
		
	}
}
