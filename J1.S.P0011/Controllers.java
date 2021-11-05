
import java.math.BigInteger;

public class Controllers {
    public String AToDec(String num, int b) {
        if(num.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BigInteger m = BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(0);
        BigInteger power = BigInteger.valueOf(1);
        for (int i=num.length()-1; i>=0; i--){
            if(b == 16){
                if(num.codePointAt(i) >= 65){
                    m = BigInteger.valueOf(num.codePointAt(i)-55);
                }else{
                    m = BigInteger.valueOf(num.codePointAt(i)-48);
                }   
            }else{
                m = BigInteger.valueOf(num.codePointAt(i)-48);
            }
            m = m.multiply(power);
            result = result.add(m);
            power = power.multiply(BigInteger.valueOf(b));
        }
        sb.append(result);
        return sb.toString();
        //FFFFFFFFFFFFFFFF
        //18446744073709551615
    }
    public String BinToHex(String binary, int a) {
        String decimal = AToDec(binary, a);    
        return DecToA(decimal, 16);
    //1111000011110000111100001111000011110000111100001111000011110000
    }

    public String DecToA(String decimal, int a) {
        if(decimal.isEmpty()){
            return "";
        }
        BigInteger remainder = new BigInteger(decimal);
        StringBuilder sb = new StringBuilder();
        if(remainder.compareTo(BigInteger.valueOf(0))== 0){
            sb.append(remainder);
        }
        while(remainder.compareTo(BigInteger.valueOf(0))>0){
            if (a > 10) {
            BigInteger m = remainder.remainder(BigInteger.valueOf(a));
                if (m.compareTo(BigInteger.valueOf(10))>=0) {
                    sb.append((char) (55 + m.intValueExact()));
                } else {
                    sb.append(m);
                }
            }else{
                sb.append(remainder.remainder(BigInteger.valueOf(a)));
            }
            remainder = remainder.divide(BigInteger.valueOf(a));
        }
        return sb.reverse().toString();
    }
  
    public String HexToBin(String hexadecimal, int a){
        String binary = AToDec(hexadecimal, 16);
        return DecToA(binary, a);
    }
}
    
//    public String DecToA(String decimal, int a) {
//        if(decimal.isEmpty()){
//            return "";
//        }
//        BigInteger remainder = new BigInteger(decimal);
//        StringBuilder sb = new StringBuilder();
//        String HEX = "0123456789ABCDEF";
//        if(remainder.compareTo(BigInteger.valueOf(0))== 0){
//            sb.append(remainder);
//        }
//        while(remainder.compareTo(BigInteger.valueOf(0))>0){
//            BigInteger m = remainder.remainder(BigInteger.valueOf(a));
//            sb.append(HEX.charAt(m.intValueExact()));
//            remainder = remainder.divide(BigInteger.valueOf(a));
//        }
//        return sb.reverse().toString();
//    }