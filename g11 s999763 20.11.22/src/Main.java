import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //=========ZADANIE 1========

        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if (czyPada == true && czySwieciSlonce == false) {
            System.out.println("Plucha");
        }
        else if (czyPada == true && czySwieciSlonce == true) {
            System.out.println("Tęcza");
        }
        else if (czyPada == false && czySwieciSlonce == true) {
            System.out.println("Słonecznie");
        }
        else if (czyPada == false && czySwieciSlonce == false) {
            System.out.println("Pochmurno");
        }
        //======KONIEC ZADANIA 1======

        // ======= ZADANIE 4, 5 =======
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj typ działania:");
        String dzialanie = scan.nextLine();

        switch(dzialanie) {
            case "ADD":
                int addResult = pierwszaLiczba+drugaLiczba;
                System.out.println("Wynik: " + absoluteValue(addResult));
                break;
            case  "SUB":
                int subResult = pierwszaLiczba-drugaLiczba;
                System.out.println("Wynik: " + absoluteValue(subResult));
                break;
            case "DIV":
                int divResult =  pierwszaLiczba / drugaLiczba;
                System.out.println("Wynik: " + absoluteValue(divResult));
                break;
            case "MUL":
                int mulResult = pierwszaLiczba * drugaLiczba;
                System.out.println("Wynik: " + (pierwszaLiczba * drugaLiczba));
                break;
            default:
                System.out.println("Brak takiej operacji");
        }

        //======KONIEC ZADANIA 4,5========



        //======ZADANIE 6=======
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        if (a>b){
            float temp = a;
            a = b;
            b = temp;}
        System.out.println("Wybrany przedział: ["+ a + ", " + b + "]");
        Random r = new Random();
        float d1 = r.nextFloat(b-a+1)+a;
        float d2 = r.nextFloat(b-a+1)+a;
        float d3 = r.nextFloat(b-a+1)+a;

        System.out.println("wartości generowane losowo:" + d1 + "; " + d2 + "; " + d3);

        //jak ustawić liczby w kolejności
        if (d1<d2 && d1<d3 && d2<d3){

        System.out.println("Gdzie: "+d1+"<"+d2+"<"+d3);}
        else if (d1<d2 && d1<d3 && d3<d2) {
            System.out.println("Gdzie: "+d1+"<"+d3+"<"+d2);}
        else if (d1>d2 && d1<d3 && d2<d3) {
            System.out.println("Gdzie: "+d2+"<"+d1+"<"+d3);}
        else if (d3<d1 && d3<d2 && d1<d2){
            System.out.println("Gdzie: "+d3+"<"+d1+"<"+d2);}
        else if (d2<d3 && d2<d1 && d3<d1){
            System.out.println("Gdzie: "+d2+"<"+d3+"<"+d1);}
        else if (d3<d2 && d3<d1 && d2<d1){
            System.out.println("Gdzie: "+d3+"<"+d2+"<"+d1);}
        //======KONIEC ZADANIA 6========
        //======ZADANIE 8=======
        System.out.println("Witamy, wybierz walutę: 1 - PLN; 2 - JPY");
        int waluta= scan.nextInt();
        System.out.println("Wprowadź kwotę:");
        int kwota = scan.nextInt();
        if (waluta==1){
            System.out.println(kwota + "zł => "+ kwota*30.29 + "¥");
        }
        else if (waluta==2){
            System.out.println(kwota + "¥ => " + kwota*0.03 + "zł");
        }
        else {
            System.out.println("Nieprawidłowa wartość, rozpocznij ponownie");
        }

        //======KONIEC ZADANIA 8========
        }


    //metoda licząca wartość bezwzględną
    public static int absoluteValue(int k) {
        if (k>=0){
        return k;}
        else {return (-k);}
    }
}
