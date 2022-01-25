package lab11linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kolekcja {
    List kolekcja=new LinkedList<>();
    Scanner scanner= new Scanner(System.in);

    public void utworz(){
        Random random=new Random();
        System.out.println("Podaj wielkość tablicy: ");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            kolekcja.add(random.nextInt(11));
        }
    }
    public void wyswietl(){
        for(int i=0;i<kolekcja.size();i++){
            System.out.print(kolekcja.get(i)+" ");
        }
        System.out.println();
    }
    public void sprawdz(){
        System.out.println("Podaj szukaną liczbę: ");
        int s=scanner.nextInt();
        if(kolekcja.contains(s)==true) System.out.println("Kolekcja zawiera szukaną liczbę");
        else System.out.println("Kolekcja nie zawiera szukanej liczby");
        
    }
    public void usun(){
        System.out.println("Podaj, który element usunąć ");
        int r=scanner.nextInt();
        kolekcja.remove(r);
    }
    public void drukuj(){
        for(Object x:kolekcja){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
    public void max(){
        System.out.println("Maksimum w kolekcji: "+Collections.max(kolekcja));
    }
    
    public void min(){
        System.out.println("Minimum w kolekcji: "+Collections.min(kolekcja));
    }
    
    public void sortowanie(){
        Collections.sort(kolekcja);
    }
}
