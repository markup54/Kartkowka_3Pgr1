import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //wpisać z klawatuty liczbę
        Scanner klawiatura = new Scanner(System.in);
        ArrayList<Integer> wczytaneLiczby = new ArrayList<>();
        for(int i=0; i<7;i++) {
            System.out.println("podaj liczbę");
            int liczba = klawiatura.nextInt();
            while(liczba>100) {
                System.out.println("wpisz liczbę mniejszą od 100");
                liczba = klawiatura.nextInt();
            }
            wczytaneLiczby.add(liczba);
        }
        System.out.println(wczytaneLiczby);
        //utworzyć nowa zmienną na liczby parzyste bez powtorzen
        HashSet<Integer> liczbyParzyste = new HashSet<>();
        for (Integer element: wczytaneLiczby) {
            if(element%2==0){
                liczbyParzyste.add(element);
            }
        }
        System.out.println(liczbyParzyste);

        int liczbaDoDzielnikow = wczytaneLiczby.get(0);
        for(int i=1;i<=liczbaDoDzielnikow;i++){
            if(liczbaDoDzielnikow % i == 0)
            {
                System.out.print(i+", ");
            }
        }

    }
}