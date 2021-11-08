
// https://docs.google.com/document/d/1LIsONbd24sCOzKsCoLq8kzjZoNx34Inj/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class J1SH202 {
    static void printReverse(String s){
        String ss[] = s.split(""); 
        StringBuilder result = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--) {
            result.append(ss[i]);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        printReverse("hello there!"); 
    }  
}
