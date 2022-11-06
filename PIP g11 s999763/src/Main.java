import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //Zadanie 1
        //sprawdzić czy są równe, (są)

        boolean x = false;
        boolean y = false;
        boolean a = false;
        boolean b = false;

        boolean czySaRowne = !((x && y) || (a && b)) == ((!x || !y) && (!a || !b));
        System.out.println(czySaRowne);

        //Zadanie 2
        //dwa int, jeden z konsoli, drugi wygenerować losowo

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 6");
        int zKonsoli = scan.nextInt();
        Random rand = new Random();
        int losowaLiczba = rand.nextInt(5);
        losowaLiczba += 1;
        boolean czySaTakieSame = zKonsoli == losowaLiczba;
        System.out.println("Losowa liczba to: " + losowaLiczba);
        System.out.println("Czy liczby sa rowne: " + czySaTakieSame);


        //Zadanie 3
        //trzeci kubek, jak zamienic kawe z herbata

        //int c = scan.nextInt();
        //int d = scan.nextInt();

        //Zadanie 4
        // mozliwe tylko dla typow numerycznych

        //int e = scan.nextInt();
        //int f = scan.nextInt();

        //Zadanie 5
        //



    }
}
