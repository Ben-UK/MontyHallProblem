import java.util.concurrent.ThreadLocalRandom;

public class ChangeAnswer {

	public void monty() {

		int j = 0;
		int k = 0;
		
		for (int i = 1; i < 100; i++) {

			// Numbering system
			System.out.print("guess #" + i + ": ");

			// guest picks a door

			int guess = ThreadLocalRandom.current().nextInt(1, 4);

			System.out.print("| Contestent picks: " + guess + "| ");

			// correct answer is

			int correct = ThreadLocalRandom.current().nextInt(1, 4);

			System.out.print("| winning door is: " + correct + "| ");
			
			int guess2 = ThreadLocalRandom.current().nextInt(1, 3);

			if (guess == correct) {
				k++;
				System.out.print("||Wrong! " + "||");
			} else if (guess2 == 1) {
				j++;
				System.out.print("Correct! " + "||");
			} else if (guess2 == 2) {
				k++;
				System.out.print("Wrong!" + "||");
			}

		}
		System.out.println("\nNumber of Correct CHANGED Answers = " + j);
		System.out.println("\nNumber of Wrong CHANGED Answers = " + k);

	}
}
