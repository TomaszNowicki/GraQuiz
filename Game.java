import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        new Game().start();

    }


    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int points = 0;


    public void start() {

        long startTime = System.currentTimeMillis();

        while (true) {

            char randomChar = (char) (random.nextInt(123 - 97) + 97); // rzutowanie // offset 97 do 122

                System.out.println("Twój znak to: " + randomChar);

                System.out.println("Podaj swoja odpowiedź: ");

                char userAnswer = scanner.nextLine().charAt(0);
                if (randomChar == userAnswer) {
                points = points + 1;
                }
                    else
                     {
                        break;
                     }
                         if(points == 10)
                         {
                             break;
                         }
            }// some change to project
            long stopTime = System.currentTimeMillis();
            System.out.println("twój wynik to " + points + " a czas gry:" + (stopTime - startTime) / 1000);
        }
    }

