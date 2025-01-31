import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String question1 = "What god is Moon Knight the Avatar of?";
        String question2 = "What Infinity Stone does Dr. Strange commonly Possess?";
        String question3 = "where did Tony Stark Build the FIRST Iron Man Suit (MK 1)?";
        String question4 = "Armed and Dangerous?";

        int answer1 = 2;
        int answer2 = 1;
        int answer3 = 4;

        int points = 0;

//Q1 Logic
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question1:" + question1);
        System.out.println("1) Zues?");
        System.out.println("2) Konshu?");
        System.out.println("3) King Juilan?");
        System.out.println("4) Yoda?");

        int userInput1 = scanner.nextInt();
        if (userInput1 == answer1) {
            points++;
            System.out.println("Correct Answer, Way to Go!");
        } else {
            System.out.println("Wrong Answer Bozo xD!");
        }
//Q2 Logic
        System.out.println("Question2:" + question2);
        System.out.println("1) Time?");
        System.out.println("2) Space?");
        System.out.println("3) Reality?");
        System.out.println("4) Power?");

        int userInput2 = scanner.nextInt();
        if (userInput2 == answer2) {
            points++;
            System.out.println("Correct Answer, Way to Go!");
        } else {
            System.out.println("Wrong Answer Bozo xD!");
        }
//Q3 Logic
        System.out.println("Question3:" + question3);
        System.out.println("1) A Forest?");
        System.out.println("2) A Mountain?");
        System.out.println("3) A Lake?");
        System.out.println("4) A Cave?");

        int userInput3 = scanner.nextInt();
        if (userInput3 == answer3) {
            points++;
            System.out.println("Correct Answer, Way to Go!");
        } else {
            System.out.println("Wrong Answer Bozo xD!");
        }
//Q4 Logic
        System.out.println("Question4:" + question4);
        System.out.println("1) AGAIN!");
        System.out.println("2) AGAIN!");
        System.out.println("3) AGAIN!");
        System.out.println("4) AGAIN!");

        int userInput4 = scanner.nextInt();
        if (userInput4 >= 1 && userInput4 <= 4) {
            points++;
            System.out.println("Correct Answer, Way to Go!");
        } else
            System.out.println("Wrong Answer Bozo xD!");

        System.out.println("Your Test Results Are:");
        switch (points) {
            case 0:
                System.out.println("YOU FAILED, YOU DIE NOW");
                break;
            case 1:
                System.out.println("YOU FAILED, This Quiz will self destruct in, 3... 2... 1...");
                break;
            case 2:
                System.out.println("You Passed... Barely... hmph!");
                break;
            case 3:
                System.out.println("YOU PASSED, yay :o!");
                break;
            case 4:
                System.out.println("YOU PASSED, FLYING COLOURS, GOOD JOB!");
                break;

        }
    }
}
