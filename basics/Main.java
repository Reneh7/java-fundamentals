import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);

        clock();
    }

    public static String pluralize(String word, int count) {
        if (count == 0 || count > 1) {
            return word + "s";
        } else
            return word;
    }

    public static void flipNHeads(int n) {
        int counter = 0;
        int headsFlip = 0;

        while (headsFlip < n) {
            double numFlips = Math.random();
            counter++;

            if (numFlips < 0.5) {
                System.out.println("tails");
                headsFlip = 0;
            } else {
                System.out.println("heads");
                headsFlip++;
            }
        }
        System.out.println("It took " + counter + " flips to flip " + n + " heads in a row");
    }

    public static void clock() {
        LocalDateTime previousTime = LocalDateTime.MIN;
        DateTimeFormatter formatter = (DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            if (!now.equals(previousTime)) {
                String time = now.format(formatter);
                System.out.println(time);
                previousTime = now;
            }
        }
    }
}
