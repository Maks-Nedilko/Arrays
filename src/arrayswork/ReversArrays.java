package arrayswork;

public class ReversArrays {

    public static void main(String[] args) {

        StringBuilder[] array = {new StringBuilder("123"), new StringBuilder("456"), new StringBuilder("789")};
        StringBuilder[] result = invert(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static StringBuilder[] invert(StringBuilder[] array) {

        StringBuilder[] result = new StringBuilder[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].reverse();
        }

        return result;
    }

}
