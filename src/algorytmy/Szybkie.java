/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorytmy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class Szybkie extends Basics {
    
    public int getLiczbySize(){
        
        return liczby.size();
    }
    
    public void podziel(List lista, int x, int y){
        start = System.currentTimeMillis();
        int sr, i, j, temp;
        i = x;
        j = y;
        sr = liczby.get((x+y) / 2);
        
        do{
            while(liczby.get(i) < sr){
                i++;
            }
            while(liczby.get(j) > sr){
                j--;
            }
            
            if(i <= j){
                temp = liczby.get(j);
                liczby.set(j, liczby.get(i));
                liczby.set(i, temp);
                i++;
                j--;
            }
        }
        while(i<=j);
        
        if(x<j){
            podziel(Basics.liczby, x, j);
        }
        if(i<y){
            podziel(Basics.liczby, i, y);
        }

    }
    
    
    
    private class Lewa implements Runnable{
        int srodek = liczby.size()/2;
        
        

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    


    @Override
    public void randDraw() {
        super.randDraw();
    }

    @Override
    public void setGranica() {
        super.setGranica();
    }

    @Override
    public void wyswietlLiczby() {
        stop = System.currentTimeMillis();
        System.out.println(liczby);
        System.out.printf("Czas wykonania operacji: " + "%5.2f", ((stop-start))*0.001);
    }

    @Override
    public void podajLiczby() {
        super.podajLiczby(); 
    }
    
}
