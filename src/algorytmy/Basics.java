/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public abstract class Basics {
    
    
    protected final static List<Integer> liczby = new ArrayList <>();
    
    protected double start;
    protected double stop;
    protected int ilosc;
    protected int granicaOpen;
    protected int granicaClose;
    protected int biezaca;
    private String koniec = "";
    private final Scanner skaner = new Scanner(System.in);
    
    public void podajLiczby(){
        
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
    
    public void wyswietlLiczby(){
        for(int i=0; i <= liczby.size()-1; i++){
            System.out.println("\n");
            System.out.println("\n" + liczby.get(i));
        }
    }
    

    
    public void setGranica(){
        System.out.println("Podaj z jakiego zakresu mają być liczby:");
        granicaOpen = skaner.nextInt();
        granicaClose = skaner.nextInt();
        System.out.println("Podaj ile liczb chcesz wylosować:");
        ilosc = skaner.nextInt();
        
//        this.granicaOpen = granicaOpen;
//        this.granicaClose = granicaClose;
    }
    
    public void randDraw(){
        Random rand = new Random();

        for(int i = 0; i < ilosc; i++){
            liczby.add(i, (granicaOpen + rand.nextInt(granicaClose - granicaOpen)));
        }
        
        System.out.println("Liczby wylosowane:");
        for (Integer obj : liczby) {
            System.out.println(obj);
        }
        
    }
    
}
