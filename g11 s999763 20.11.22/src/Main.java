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

        // ======= ZADANIE 4 =======
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj typ działania:");
        String dzialanie = scan.nextLine();

        switch(dzialanie) {
            case "ADD":
                System.out.println("Wynik: " + (pierwszaLiczba + drugaLiczba));
                break;
            case  "SUB":
                System.out.println("Wynik: " + (pierwszaLiczba - drugaLiczba));
                break;
            case "DIV":
                System.out.println("Wynik: " + (pierwszaLiczba / drugaLiczba));
                break;
            case "MUL":
                System.out.println("Wynik: " + (pierwszaLiczba * drugaLiczba));
                break;
            default:
                System.out.println("Brak takiej operacji");
                            }

        //======KONIEC ZADANIA 4========

        //======ZADANIE 5=======


        //======KONIEC ZADANIA 5========
        //======ZADANIE 6=======
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a>b){
            int temp = a;
            a = b;
            b = temp;)}
        System.out.println("Wybrany przedział: ["+ a + ", " + b + "]");
        int d1;
        int d2;
        int d3;
        
        System.out.println("wartości generowane losowo:" + d1 + " " + "d2" + "d3");
        
        //jak ustawić liczby w kolejności
        
        System.out.println("Gdzie: ");



        //======KONIEC ZADANIA 6========
        //======ZADANIE 8=======


        //======KONIEC ZADANIA 8========
    }

    //public static int absoluteValue(()){
            //if
        }
}
