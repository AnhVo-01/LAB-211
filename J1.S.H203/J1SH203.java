
// https://docs.google.com/document/d/1BBj0tB_fLFXqPk7zw7Ubf1wiUQq8nV-S/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

import java.util.Scanner;

public class J1SH203 {
    static Scanner sc = new Scanner (System.in);
    
    static void printReverse(String s){
        System.out.println(Reverse(s));
    }
    
    static StringBuilder Reverse(String s){
        do{
            if(!s.isEmpty()){
                String ss[] = s.split("\\s+"); 
                StringBuilder result = new StringBuilder();
                
                result.append(UpperCase(ss[ss.length-1]));
                for (int i = ss.length - 2; i >= 0; i--) {
                    result.append(" ").append(ss[i]);
                }
                return result;
            }
            s = sc.nextLine();
        }while(true);   
    }
    
    static StringBuilder UpperCase(String s){
        StringBuilder result = new StringBuilder();
        String ss[] = s.split("");   
        //Viết hoa chữ cái đầu
        for (int i=0; i<ss.length; i++) {
            if(i == 0){
               ss[i] = ss[i].toUpperCase();
            }
            result.append(ss[i]);
        }
        //Viết hoa chữ cái đầu sau dấu cách
//        for (String ss1 : ss) {
//            result.append(Character.toUpperCase(ss1.charAt(0)))
//                    .append(ss1.substring(1)).append(" ");
//        } 
        return result;
    }
    
    public static void main(String[] args) {
        printReverse("hello there");
    }
}
