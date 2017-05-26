import java.util.concurrent.ThreadLocalRandom;

public class StickWithAnswer {

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

			// Check if they are right

			{
				if (guess == correct) {
					j++;
					System.out.print("||Correct! " + "||");
				} else {
					k++;
					System.out.print("|| Wrong!  " + "||");
				}

			}

		}
		System.out.println("\nNumber of Correct Answers = " + j);
		System.out.println("Number of Wrong Answers = " + k);

	}
}
