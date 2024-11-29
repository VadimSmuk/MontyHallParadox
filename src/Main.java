import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Boolean> results = new HashMap<>();
        Random random = new Random();

        int wins = 0;
        int losses = 0;

        for (int i = 1; i <= 1000; i++) {
            int carDoor = random.nextInt(3) + 1;
            int choice = random.nextInt(3) + 1;

            int revealedDoor;
            do {
                revealedDoor = random.nextInt(3) + 1;
            } while (revealedDoor == choice || revealedDoor == carDoor);

            int finalChoice;
            do {
                finalChoice = random.nextInt(3) + 1;
            } while (finalChoice == choice || finalChoice == revealedDoor);

            if (finalChoice == carDoor) {
                results.put(i, true);
                int i1 = wins++;
            } else {
                results.put(i, false);
                losses++;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Results: " + results);
    }
}