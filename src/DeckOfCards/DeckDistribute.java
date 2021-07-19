package DeckOfCards;

import java.util.ArrayList;
import java.util.Random;

public class DeckDistribute {
	public ArrayList<String> player1 = new ArrayList<String>();
	public ArrayList<String> player2 = new ArrayList<String>();
	public ArrayList<String> player3 = new ArrayList<String>();
	public ArrayList<String> player4 = new ArrayList<String>();

	public String face[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	public String suit[] = { "Clubs", "Diamond", "Hearts", "Spades" };

	public void getRandonFaceAndSuit() {

		while (player1.size() != 9 || player2.size() != 9 || player3.size() != 9 || player4.size() != 9) {

			if (player1.size() < 10) {
				Random r = new Random();
				int randomNumber = r.nextInt(face.length);
				int count1 = 0;

				Random re = new Random();
				int randomNumber2 = re.nextInt(suit.length);
				player1.add((face[randomNumber]) + " : " + (suit[randomNumber2]));

			}
			if (player2.size() < 10) {
				Random r = new Random();
				int randomNumber = r.nextInt(face.length);
				int count1 = 0;

				Random re = new Random();
				int randomNumber2 = re.nextInt(suit.length);
				player2.add((face[randomNumber]) + " : " + (suit[randomNumber2]));
			}
			if (player3.size() < 10) {
				Random r = new Random();
				int randomNumber = r.nextInt(face.length);
				int count1 = 0;

				Random re = new Random();
				int randomNumber2 = re.nextInt(suit.length);
				player3.add((face[randomNumber]) + " : " + (suit[randomNumber2]));
			}
			if (player4.size() < 10) {
				Random r = new Random();
				int randomNumber = r.nextInt(face.length);
				int count1 = 0;

				Random re = new Random();
				int randomNumber2 = re.nextInt(suit.length);
				player4.add((face[randomNumber]) + " : " + (suit[randomNumber2]));
			}

		}

		System.out.println("player 1");
		for (String k : player1) {
			System.out.print(k + " ");
		}
		System.out.println("");
		System.out.println("player 2");
		for (String k : player2) {
			System.out.print(k + " ");
		}
		System.out.println("");
		System.out.println("player 3");
		for (String k : player3) {
			System.out.print(k + " ");
		}
		System.out.println("");
		System.out.println("player 4");
		for (String k : player4) {
			System.out.print(k + " ");
		}

	}

}
