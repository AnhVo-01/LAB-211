public class Manage {
    Controllers ctr = new Controllers();
    public int menu(){
        System.out.println("========== MENU ==========");
        System.out.print(" 1. Base system Binary(2)\n"+
                         " 2. Base system Decimal(10)\n"+
                         " 3. Base system Hexadecimal(16)\n"+
                         " 4. Exit\n");
        System.out.println("--------------------------");
        System.out.print("> Enter your choice: ");
        int out = Validation.checkInputIntLimit(1, 4);
        return out;
    }
    public int input(){
        System.out.print("The base system number output: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        System.out.println();
        return choice;
    }
    public void BINtoDEC(){
        do{
            System.out.println("------ Convert Binary to Decimal------");
            String bin = Validation.checkBin();
            System.out.println(bin+"(BIN) = "+ctr.AToDec(bin, 2)+"(DEC)");
            System.out.println();
            System.out.print("Do you want to continue? (Y/N): ");
        }while(Validation.checkInputYN());
        System.out.println();
    }
    public void BINtoHEX(){
        do{
            System.out.println("------ Convert Binary to Hexadecimal------");
            String bin = Validation.checkBin();
            System.out.println(bin+"(BIN) = "+ctr.BinToHex(bin, 2)+"(HEX)");
            System.out.println();
            System.out.print("Do you want to continue? (Y/N): ");
        }while(Validation.checkInputYN());
        System.out.println();
    }
    public void DECtoBIN(){
        do{
            System.out.println("------ Convert Decimal to Binary ------");
            String dec = Validation.checkDecimal();
            System.out.println(dec+"(DEC) = "+ctr.DecToA(dec, 2)+"(BIN)");
            System.out.println();
            System.out.print("Do you want to continue? (Y/N): ");
        }while(Validation.checkInputYN());
        System.out.println();
    }
    public void DECtoHEX(){
        do{
            System.out.println("------ Convert Decimal to Hexadecimal ------");
            String dec = Validation.checkDecimal();
            System.out.println(dec+"(DEC) = "+ctr.DecToA(dec, 16)+"(HEX)");
            System.out.println();
            System.out.print("Do you want to continue? (Y/N): ");
        }while(Validation.checkInputYN());
        System.out.println();
    }
    public void HEXtoBIN(){
        do{
            System.out.println("------ Convert Hexadecimal to Binary ------");
            String hex = Validation.checkHexaDecimal();
            System.out.println(hex+"(HEX) = "+ctr.HexToBin(hex, 2)+"(BIN)");
            System.out.println();
            System.out.print("Do you want to continue? (Y/N): ");
        }while(Validation.checkInputYN());
        System.out.println();
    }
    public void HEXtoDEC(){
        do{
            System.out.println("------ Convert Hexadecimal to Decimal ------");
            String hex = Validation.checkHexaDecimal();
            System.out.println(hex+"(HEX) = "+ctr.AToDec(hex, 16)+"(DEC)");
            System.out.println();
            System.out.print("Do you want to continue? (Y/N): ");
        }while(Validation.checkInputYN());
        System.out.println();
    }
}
