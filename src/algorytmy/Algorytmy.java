/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorytmy;

import java.util.Scanner;
import java.util.function.*;

/**
 *
 * @author Kamil
 */
public class Algorytmy{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Szybkie szybkie = new Szybkie();
        Babelkowe babelkowe = new Babelkowe();
        PrzezWybieranie wybieranie = new PrzezWybieranie();
        
        String koniec = "";
        Scanner skaner = new Scanner(System.in);
        int choice = 9999;
        String metoda = "";
        
        System.out.println("Witam w programie pokazującym efekty działania algorytmów sortujących");
        System.out.println("---------------------------------------------------------------------\n");

        System.out.print("Wybierz metodę sortowania: \n"
                + "1. Przez wybór\n"
                + "2. Bąbelkowe\n"
                + "3. Szybkie sortowanie\n"
                + "\n0. Wyjście\n");
        
        choice = skaner.nextInt();
        
        switch(choice){
            case 1:
                metoda = "wybieranie";
                break;

            case 2:
                metoda = "babelkowe";
                break;
                
            case 3:
                metoda = "szybkie";
                break;
        }
        
        
        
        System.out.println("\nDbrze! Teraz wybierz sposób podania liczb do sorotowania: \n");
        System.out.print(""
                + "1. Liczby losowe \n"
                + "2. Liczby podane przez użytkownika\n");
        
        choice = skaner.nextInt();
        
        switch(choice){
            case 1:

            switch (metoda) {
                case "babelkowe":
                    babelkowe.setGranica();
                    babelkowe.randDraw();
                    babelkowe.sortuj();
                    break;
                case "wybieranie":
                    wybieranie.setGranica();
                    wybieranie.randDraw();
                    wybieranie.sortuj2();
                    
                    break;
                case "szybkie":
                    szybkie.setGranica();
                    szybkie.randDraw();
                    szybkie.podziel(Basics.liczby, 0, szybkie.getLiczbySize()-1);
                    szybkie.wyswietlLiczby();
                    break;
            }
            break;
                
            case 2:
                
            switch (metoda) {
                case "babelkowe":
                    babelkowe.podajLiczby();
                    babelkowe.sortuj();
                    break;
                case "wybieranie":
                    wybieranie.podajLiczby();
                    wybieranie.sortuj2();
                    break;
                case "szybkie":
                    szybkie.podajLiczby();
                    szybkie.podziel(Basics.liczby, 0, szybkie.getLiczbySize()-1);
                    szybkie.wyswietlLiczby();
                    break;
            }
            break;
                
        }
        
         
    }
    
}
