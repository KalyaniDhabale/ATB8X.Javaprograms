package sept.ex_13092024;

public class Lab0024 {
    public static void main(String[] args) {
        // ✅ Literals
        // Boolean
        // Integral

        // Char
        //  Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("kalyani" + "\n" + "karde");
        System.out.println("kalyani" + new_line + "karde");
//        both we can write either symble or char
//        System.out.println("Pramod"+ tab_line +  "Dutta");
        System.out.println("Pramod"+ back_space +  "Dutta");
        System.out.println("Pramod"+ car_r +  "Dutta");

        char c11  = '\u1F60'; //65 - ASCII
        // chinese - india, japense -> unicode
//        in keyword every char has a unicode value
        // /u09878

        System.out.println(c11); // ὠ - :)
    }
}
