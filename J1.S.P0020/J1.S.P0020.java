package New;

// https://docs.google.com/document/d/1U8ZU_w6Oo5YHya4npUttsOvTbtfjjafu/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true 

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Sort{
    void SelectionSort(ArrayList<Integer> a){
        
        for (int i = 0; i < a.size(); i++){
            
            // Find minimum element
            int min = a.get(i);
            for (int j = i + 1; j < a.size(); j++){
                if (a.get(min) > a.get(j)) {
                    min = a.get(j);
                }
            }
            
            // Move minimum element at current i
            int key = min;
            a.set(min, a.get(i));
            a.set(a.get(i), key);
        }
    }
}

public class J1SP0020 {   
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        Random rd = new Random();
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        while(n<=0){
            System.out.println("Invalid!!!");
            System.out.print("Enter number of array: ");
            n = sc.nextInt();
        }
//        System.err.println("\nEnter a positive decimal number:");
//        for (int i=0; i<n ;i++){
//            System.out.print("Input element a["+i+"]: ");
//            ar.add(sc.nextInt());
//        }
        for (int i=0; i<n ;i++){
            ar.add(rd.nextInt(n));
        }
        Sort sr = new Sort();
        System.out.println("Unsort array: "+ar);
        sr.SelectionSort(ar);               
        System.out.println("Sorted array: "+ar);
    }
}
//            while (min > i){
//                a.set(a.get(min),a.get(min-1));
//                min--;
//            }