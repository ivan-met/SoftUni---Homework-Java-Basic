import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class _03FullHouse {

	public static void main(String[] args) {

		String[] cards = {"A","2","3","4","5","6","7","8","9","10","J","D","K"};
		String[] shapes = {"♣","♦","♥","♠"};
		int count = 0;
		ArrayList<String> deck = new ArrayList<>();
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < shapes.length; j++) {
				String temp = cards[i] + shapes[j];
				deck.add(temp);
			}
		}
		for (String firstCard : deck) {
			for (String secondCard : deck) {
				for (String thirdCard : deck) {
					for (String fourthCard : deck) {
						for (String fifthCard : deck) {
							if (firstCard.charAt(0) == secondCard.charAt(0) && firstCard.charAt(0) == thirdCard.charAt(0) ) {
								if (firstCard.charAt(0) != fourthCard.charAt(0) && fourthCard.charAt(0) == fifthCard.charAt(0)) {
									count++;
									System.out.println(firstCard+secondCard+thirdCard+fourthCard+fifthCard);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);

		
	
	}
}

