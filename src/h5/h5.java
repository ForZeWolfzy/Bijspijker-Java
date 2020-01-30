package h5;

import java.util.Scanner;

public class h5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean proceed;

        //5.1
        System.out.println("Op 1\n");
        System.out.println("(beeindig door -1 te typen)");
        proceed = true;
        while (proceed) {
            System.out.print("Wat is je toetscijfer? ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                System.out.println("Tot ziens!\n\n");
                proceed = false;
                continue;
            } else if (grade >= 5.5) {
                System.out.println("Je hebt een voldoende!\n\n");
            } else {
                System.out.println("Helaas, je hebt een onvoldoende.\n\n");
            }
        }

        //5.2
        System.out.println("Op 2\n");
        int score = 0;
        for (int i = 0; i < 10 ; i++) {
            int getal1 = (int) (Math.random() * 10 + 1);
            int getal2 = (int) (Math.random() * 10 + 1);
            int uitkomst = getal1 + getal2;
            System.out.print("Hoeveel is " + getal1 + " + " + getal2 + "? ");
            int userInput = scanner.nextInt();
            if (userInput == uitkomst) {
                System.out.println("Klopt!\n\n");
                score++;
            } else {
                System.out.println("Fout! Het juiste antwoord was: " + uitkomst + "\n\n");
            }
        }
        System.out.println("Je score is " + score + ".\n\n");

        //5.3
        System.out.println("Op 3\n");
        for (int i = 1; i <= 10 ; i++) {
            int product = i * 7;
            System.out.println(i + " * 7 = " + product);
        }

        //5.4
        System.out.println("Op 4");
        int lowestNumber = 0;
        for (int i = 0; i < 5 ; i++) {
            System.out.print("Type een getal: ");
            int number = scanner.nextInt();
            if (i == 0) {
                lowestNumber = number;
            } else {
                if (number < lowestNumber) {
                    lowestNumber = number;
                }
            }
        }
        System.out.println("Het laagste getal is: "+ lowestNumber + ".\n\n");

        //5.5
        System.out.println("Op 5");
        String student = "unknown";
        double highestGrade = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Naam van student " + i + ":");
            String name = scanner.nextLine();
            System.out.print("wat was zijn/haar cijfer? ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            if (i == 0) {
                highestGrade = grade;
                student = name;
            } else {
                if (grade > highestGrade) {
                    highestGrade = grade;
                    student = name;
                }
            }

        }
        System.out.println("\nDe student: " + student + " heeft het hoogste cijfer.");
        System.out.println("\nhij/zij had een: " + highestGrade + ".\n\n");


        //5.6
        System.out.println("Op 6");
        for (int i = 0; i < 100 ; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " is deelbaar door 5");
            }
        }

        //5.7
        System.out.println("Op 7");
        proceed = true;
        int counter = 0;
        while (proceed) {
            int square = counter * counter;
            if (square < 1000) {
                System.out.println("het getal is " + counter);
                System.out.println("het kwadraat daarvan is " + square);
                counter++;
            } else {
                proceed = false;
            }
        }
    }
}