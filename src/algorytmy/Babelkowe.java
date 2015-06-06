/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorytmy;


import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Kamil
 */

@Controller
public class Babelkowe extends Basics{

    private String koniec = "";
    private final Scanner skaner = new Scanner(System.in);
    

    
    @Override
    public void podajLiczby(){
        
        System.out.println("Podaj liczby do sortowania: ");
        while(!"r".equals(koniec)){
            try{
            biezaca = skaner.nextInt();
            liczby.add(biezaca);
            }catch(Exception e){
                koniec = "r";
            }

        }    
    }

    public void dajMiCos(){

    }
    
    @Override
    public void wyswietlLiczby(){
        for(int i=0; i <= liczby.size()-1; i++){
            System.out.println(liczby.get(i));
        }
    }
    
    public void sortuj(){
        start = System.currentTimeMillis();
        int temp = 0;
        double skok = liczby.size()/50.0;
        for(int i = 0; i< liczby.size()-1; i++){
            if(i%skok == 0){
                System.out.print("...");
                    try {
                        Thread.sleep(300);
                    }catch (InterruptedException e) {
                         e.printStackTrace();
                    }
                    
            }
            for(int j = 0; j<liczby.size()-1; j++){

                if(liczby.get(j) > liczby.get(j+1)){
                    
                    temp = liczby.get(j);
                    liczby.set((j), liczby.get(j+1));
                    liczby.set((j+1), temp);
                }
                        
            }

        }
        stop = System.currentTimeMillis();
        System.out.println("\n" + liczby);
        System.out.printf("Czas wykonania operacji: " + "%5.2f", ((stop-start))*0.001);
    }
    

}
