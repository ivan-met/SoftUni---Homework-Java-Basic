import java.util.Random;


public class _06RandomHandsOfFiveCards {

	public static void main(String[] args) {
		String[] cards = {"A","2","3","4","5","6","7","8","9","10","J","D","K"};
		String[] shapes = {"♣","♦","♥","♠"};
		printRandomHand(cards, shapes);
		
		

	}
	public static void printRandomHand(String[] cards,String[] shapes) {
		Random rnd = new Random();
		
		for (int i = 0; i < 5; i++) {
			int cardValue = rnd.nextInt(13);
			int shape = rnd.nextInt(4);
			
			System.out.printf("%s%s",cards[cardValue],shapes[shape]);
		}
		
	}

}
