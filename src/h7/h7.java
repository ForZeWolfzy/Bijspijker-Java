package h7;

import java.util.Scanner;

public class h7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter;

        //7.1
        System.out.println("Op 1");
        System.out.println("Hier komen 100 worpen met een dobbelseen: \n");

        int [] dobbelsteenWorpen = new int[100];

        for (int i = 0; i < 100 ; i++) {
            int random = (int) (Math.random() * 6 + 1);
            dobbelsteenWorpen [i] = random;
        }
        counter = 1;
        for (int worp : dobbelsteenWorpen) {
            System.out.print(worp + " ");
            if (counter % 10 == 0) {
                System.out.println();
            }
            counter++;
        }

        //7.2
        System.out.println("\n\nOp 2");
        System.out.print("Geef me 9 getalen: ");
        int [] getallen = new int[9];
        for (int i = 0; i < 9 ; i++) {
            getallen[i] = scanner.nextInt();
        }
        System.out.println("Daar komen ze in omgekeerde volgorde: ");
        for (int i = 8; i >= 0 ; i--) {
            System.out.print(getallen[i] + " ");
        }

        //7.3
        System.out.println("\n\nOp 3");
        System.out.println("geef me nu 10 dubbels dan bereken ik het gemiddelde en dan tel ik hoeveel getallen hoger zijn dan het gemiddelde: ");
        double[] userinput = new double[10];
        for (int i = 0; i <10 ; i++) {
            userinput[i] = scanner.nextDouble();
        }
        double optelsom = 0;
        for (double waarde : userinput) {
            optelsom += waarde;
        }
        double gemiddelde = optelsom / 10;
        System.out.println("het gemiddelde is " + gemiddelde);
        counter = 0;
        for (double waarde : userinput) {
            if (waarde > gemiddelde) {
                counter++;
            }
        }
        System.out.println("het aantal doubels boven het gemiddelde is " + counter);
    }
}
