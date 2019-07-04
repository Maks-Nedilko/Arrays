package examples;

public class If {

    public static int Iff(int i) {
        return i < 10 ? i * 100 : i * 10;//тернарний оператор
    }

    public static int sIff(int i) {
        if (i < 10) {
            return i * 100;
        } else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(Iff(9));
        System.out.println(Iff(10));
        System.out.println(sIff(9));
        System.out.println(sIff(10));
    }

}
