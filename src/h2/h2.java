package h2;

import java.util.Scanner;

public class h2 {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         //2.1
         System.out.println("Op 1\n");
         System.out.print("Typ het aantal mijlen: ");
         double mijlen = scanner.nextDouble();
         double kilometers = mijlen * 1.6;
         int afronden = (int) (kilometers * 10);
         kilometers = afronden / 10.0;
         System.out.println(mijlen + " mijlen is " + kilometers + "kilometers\n\n");

         //2.2
         System.out.println("Op 2\n");
         System.out.print("Hoeveel jaar oud ben je?");
         int jaren = scanner.nextInt();
         System.out.println("Hoeveel maanden komen daar nog bij?");
         int maanden = scanner.nextInt();
         int minuten = jaren * 365 * 24 * 60 + maanden * 30 * 24 * 60;
         System.out.println("Dan ben je nu ongeveer  " + minuten + " minuten oud");

         //2.3

         System.out.println("Op 3\n");
         System.out.println("Startbedrag: ");
         double startbedrag = scanner.nextDouble();
         System.out.println("rentepercentage: ");
         double rentepercentage = scanner.nextDouble();
         double rentebedrag =rentepercentage / 100 * startbedrag;
         double totaalbedrag = startbedrag + rentebedrag;
         System.out.println("De rente is " + rentebedrag +" en het totaalbedrag is " + totaalbedrag + "\n\n");

         //2.4
         System.out.println("Op 4\n");
         System.out.println("Typ een getal tussen 0 en 100: ");
         int userInput = scanner.nextInt();
         int getal1 = userInput - 2;
         int getal2 = userInput - 1;
         int getal3 = userInput + 1;
         int getal4 = userInput + 2;
         System.out.println("De vijf getallen zijn: " + getal1 + " - " + getal2 + " - " + userInput + " - " + getal3 + "  - " + getal4 +  "\n\n");

         //2.5
         System.out.println("Op 5\n");
         System.out.println("Typ een getal tussen 0 en 1000: ");
         userInput = scanner.nextInt();
         if (userInput >= 100 && userInput <1000){
             int lastdigit = userInput % 10;
             userInput = userInput / 10;

             int middledigit = userInput % 10;
             userInput = userInput / 10;

             int firstdigit = userInput;

             int product = firstdigit * middledigit * lastdigit;
             System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstdigit + " x " + middledigit + " x " + lastdigit + " = " + product);
         }  else if (userInput >= 10 && userInput < 100){
             int lastdigit = userInput % 10;
             userInput = userInput / 10;

             int firstdigit = userInput;

             int product = firstdigit * lastdigit;
             System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstdigit + " x " + lastdigit + " = " + product);

         } else if ( userInput >=0 && userInput < 10){
             System.out.println("De vermenigvuldiging van de cijfers luidt: " + userInput +" = " + userInput + "\n\n");

         } else {
             System.out.println("Sorry het getal moest tussen de 0 en 1000");
         }

     }
}
