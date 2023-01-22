
// https://docs.google.com/document/d/1s4Snq53V6zwDwR02dW5mlAVzPi4jECNm/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class J1SH207 {
    static void secondHalfLetters(String s){
        int count = 0;
        for (int i=0; i<s.length(); i++){
            if((s.codePointAt(i) >= 78 && s.codePointAt(i)<=90) ||
               (s.codePointAt(i) >= 110 && s.codePointAt(i)<=122)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        secondHalfLetters("ruminates");
    }
}
