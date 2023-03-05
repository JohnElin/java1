import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Calculator {

    public static void main(String[] args) throws IOException {
        int operandes = 0;

        // System.out.println("Ihi = "+iHi);
//    Scanner s = new Scanner();
//    s.close();
        Map<Integer, String> s = new TreeMap<>();
        s.put(0, "null");
        s.put(1, "I");
        s.put(2, "II");
        s.put(3, "III");
        s.put(4, "IV");
        s.put(5, "V");
        s.put(6, "VI");
        s.put(7, "VII");
        s.put(8, "VIII");
        s.put(9, "IX");
        s.put(10, "X");
        s.put(20, "XX");
        s.put(30, "XXX");
        s.put(40, "XL");
        s.put(50, "L");
        s.put(60, "LX");
        s.put(70, "LXX");
        s.put(80, "LXXX");
        s.put(90, "XC");
        s.put(100, "C");
        String st = consoleGet();
        //Подсчет количества операторов
        char[] a = st.toCharArray();
        for (char ilt : a) {
            if (ilt == '*' || ilt == '/' || ilt == '+' || ilt == '-') ++operandes;
        }
        // Выброс Exception если кол-во операторов != 1
        if (operandes > 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        } else if (operandes == 0) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
            }

        }
    }

    public static String consoleGet(){
        System.out.println("Enter something:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You are enter:"+s);
        return s;

    }

    public static String romeOut(Integer i, Map s){
        int iHi = 0, iLo = 0;
        String out = "";
        iLo = (i%10);
        iHi = i - iLo;
            if( iHi>0 & iLo>0) {
                return s.get(iHi).toString()+s.get(iLo).toString();
            }
            else if ( iHi>0 & iLo==0) {
                return s.get(iHi).toString();
            }
            else if (iLo>=0) {
                return s.get(iLo).toString();
            }
            else System.out.println("Exeption!!");
            return out;
    }


}


