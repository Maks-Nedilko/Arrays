package doublearraywork;

public class ArraySteps {

    public static void main(String[] args) {

        int[][] array = createArray(5);
        for (int i = 0; i < array.length; i++) {
            String s = "";
            for (int j = 0; j < array[i].length; j++) {
                s = s + array[i][j] + " ";
            }
            System.out.println(s);
        }
//        for(int i =array.length-1;i>=0;i--){
//            String s = "";
//            for(int j=0;j<array[i].length;j++){
//                s=s+array[i][j]+" ";
//            }
//            System.out.println(s);
//        }
//        }
//        
    }

    public static int[][] createArray(int n) {

        int[][] result = new int[n][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];

        }

        int counter = 1;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = counter;
                counter++;
            }
        }

        return result;
    }

}
