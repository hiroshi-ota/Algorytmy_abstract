/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorytmy;

import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public class PrzezWybieranie extends Basics{
    
    private final Scanner skaner = new Scanner(System.in);
    
    private String koniec = "";
    
    
    @Override
    public void podajLiczby() {
        System.out.println("Podaj liczby do sortowania: ");
        
        while(!"q".equals(koniec)){
            
            try{
            biezaca = skaner.nextInt();
            liczby.add(biezaca);
            }catch(Exception e){
                koniec = "q";
            }

        }    
    }


    @Override
    public void wyswietlLiczby() {
            System.out.println(liczby);

    }
    

//    public void sortuj() {
//        int temp = 0;
//        
//        for(int i = (liczby.size()-1); i >= 0; i--){
//            System.out.println("1");
//            for(int j = 0; j<liczby.size(); j++){
//                System.out.println("2");
//                if (liczby.get(j) > temp){
//                    System.out.println("3");
//                    temp = liczby.get(i);
//                    System.out.println("4");
//                    liczby.set(liczby.size()-j-1, liczby.get(i));
//                    liczby.set(liczby.get(i), temp);
//                    System.out.println("5");
//            }
//            }
//        }
//        
//        System.out.println(liczby);
//        
//    }
    
    public void sortuj2() {  
        start = System.currentTimeMillis();
        int max_id = 0;
        double skok = liczby.size()/50.0;
        for(int i = 0; i<liczby.size();i++){
            if(i%skok == 0){
                System.out.print("...");
                    try {
                        Thread.sleep(300);
                    }catch (InterruptedException e) {
                         e.printStackTrace();
                    }
            }
            max_id = i;
            for(int j=0+i+1; j<liczby.size();j++){
                if(liczby.get(j)<liczby.get(max_id)){
                    max_id = j;
                }
            }
        int temp = liczby.get(i);
        liczby.set(i, liczby.get(max_id));
        liczby.set(max_id,temp);
        
        }
        stop = System.currentTimeMillis();
        System.out.println("\n" + liczby);
        System.out.printf("Czas wykonania operacji: " + "%5.2f", ((stop-start))*0.001);
    }
    
}
