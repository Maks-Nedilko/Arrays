package examples;

class A {

    @Override
    public String toString() {
        return "A{" + "i=" + i + '}';
    }

    int i;
}

public class VarArgs {

    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
            new Integer(47), new Float(3.14), new Double(11.1)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}
