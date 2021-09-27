// https://docs.google.com/document/d/1QwNblix1Ol68pMJYObGyZGMQ2wrUz-nI/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Sort {
    void BubbleSort(ArrayList<Integer> a){
        int i, j, temp;
	for(i = 0; i<a.size()-1; i++){
            for (j = i+1; j<a.size(); j++){
		if (a.get(i) > a.get(j)){
                    temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
		}
            }
	}
    }
}
public class J1SP0001 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        Random rd = new Random();
        ArrayList<Integer> ar = new ArrayList<>();
        
        System.out.print("Enter number of array: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter range: ");
        int r = Integer.parseInt(sc.nextLine());
        
        for (int i=0; i<n ;i++){
            ar.add(rd.nextInt(r));
        }
        Sort st = new Sort();
        System.out.println("Unsort array: " +ar);
        st.BubbleSort(ar);
        System.out.println("Sorted array: " +ar);
    }
}
