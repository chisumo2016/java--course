package enums;
/*
  STORE DATA INSIDE ENUM
  HAVE CONSRTUCTOR TO HAVE A VALE
 */

enum Color{
    //Object color
    RED("#FFOOOO"),
    GREEN("#OOFFOO"),
    BLUE("#OOOOFF");

    String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}

class Colo1{
    String code;

    Colo1(String code){
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}

public class EnumEx3 {

    static void printCode(Color color){
        System.out.println("Printing the color -" +color);
        System.out.println("Using the color -"  + color.getCode());
    }

    public static void main(String[] args) {

        printCode(Color.RED);

        Color color = Color.valueOf("RED");
        printCode(color);
    }
}

