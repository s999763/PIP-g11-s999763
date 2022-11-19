import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
    porownajLiczby(); //zadanie 2
    zamienLiczby(); //zadanie 3
    zamienBezTymczasowejZmiennej(); //zadanie 4
    sumujCyfry(); //zadanie 5

    }

  //zadanie 2
        public static void porownajLiczby(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe od 1 do 6");
            int zKonsoli = scan.nextInt();
            Random rand = new Random();
            int losowaLiczba = rand.nextInt(6);
            losowaLiczba += 1;
            boolean czySaTakieSame = zKonsoli == losowaLiczba;
            System.out.println("Losowa liczba to: " + losowaLiczba);
            System.out.println("Czy liczby sa rowne: " + czySaTakieSame);
        }
    //zadanie 3
        public static void zamienLiczby() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        int x = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int y = scan.nextInt();
        int dodatkowaZmienna = x;
        x = y;
        y = dodatkowaZmienna;
        System.out.println("x: " + x + ", y: " + y);
    }
    //zadanie 4
    public static void zamienBezTymczasowejZmiennej ()

    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        int X = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int Y = scan.nextInt();
        X = X + Y;
        Y = X - Y;
        X = X - Y;
        System.out.println("X: " + X + ", Y:" + Y);
    }

    //Zadanie 5
    public static void sumujCyfry ()

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę trzycyfrową całkowitą i naciśnij ENTER:");
        int liczbaCalkowita = scan.nextInt();
        if (liczbaCalkowita <= 999 && liczbaCalkowita > 99) {
            int trzeciaCyfra = liczbaCalkowita % 10;
            int dwiePierwszeCyfry = liczbaCalkowita / 10;
            int drugaCyfra = dwiePierwszeCyfry % 10;
            int pierwszaCyfra = dwiePierwszeCyfry / 10;
            int sumaCyfr = pierwszaCyfra + drugaCyfra + trzeciaCyfra;
            System.out.println(pierwszaCyfra + " + " + drugaCyfra + " + " + trzeciaCyfra + " = " + sumaCyfr);
        } else {
            System.out.println("Podano nieodpowiednią liczbę");
        }
    }
}
