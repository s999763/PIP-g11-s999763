import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        //Zadanie 1
        //sprawdzić czy są równe, (są)

        //boolean x = false;
        //boolean y = false;
        //boolean a = false;
        //boolean b = false;

        //boolean czySaRowne = !((x && y) || (a && b)) == ((!x || !y) && (!a || !b));
        //System.out.println(czySaRowne);

        //Zadanie 2
        //dwa int, jeden z konsoli, drugi wygenerować losowo

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 6");
        int zKonsoli = scan.nextInt();
        Random rand = new Random();
        int losowaLiczba = rand.nextInt(6);
        losowaLiczba += 1;
        boolean czySaTakieSame = zKonsoli == losowaLiczba;
        System.out.println("Losowa liczba to: " + losowaLiczba);
        System.out.println("Czy liczby sa rowne: " + czySaTakieSame);


        //Zadanie 3
        //trzeci kubek, jak zamienic kawe z herbata
        System.out.println("Podaj liczbę całkowitą:");
        int x = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int y = scan.nextInt();
        int dodatkowaZmienna=x;
        x=y;
        y=dodatkowaZmienna;
        System.out.println("x: "+x+", y: "+y);

        //Zadanie 4
        // mozliwe tylko dla typow numerycznych

        System.out.println("Podaj liczbę całkowitą:");
        int X = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int Y = scan.nextInt();
        X = X+Y;
        Y = X-Y;
        X = X-Y;
        System.out.println("X: "+X+", Y:"+Y);

        //Zadanie 5
        System.out.println("Podaj liczbę trzycyfrową całkowitą i naciśnij ENTER:");
        int liczbaCalkowita = scan.nextInt();
        if (liczbaCalkowita <=999 && liczbaCalkowita>99){
        int trzeciaCyfra = liczbaCalkowita % 10;
        int dwiePierwszeCyfry = liczbaCalkowita/10;
        int drugaCyfra = dwiePierwszeCyfry % 10;
        int pierwszaCyfra = dwiePierwszeCyfry/10;
        int sumaCyfr = pierwszaCyfra + drugaCyfra + trzeciaCyfra;
        System.out.println(pierwszaCyfra+ " + " + drugaCyfra+ " + "+trzeciaCyfra + " = "+sumaCyfr);}
        else {
            System.out.println("Podano nieodpowiednią liczbę");}

    }
}
