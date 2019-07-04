
package eqution;


public class Eqution {

    public static void main(String[] args) {

        double a = 1;
        double b = -11;
        double c = 30;
        double x1 = 0;
        double x2 = 0;
        
        double diskriminant = b * b - 4 * a * c;
        if(diskriminant < 0){
            System.out.println("The roots of the equation are absent");
        }else {
            if(diskriminant==0){
                x1 = -b / (2*a);
                System.out.println("The equation has one root :" + x1);
            }
            else {
                x1 = (-b - Math.sqrt(diskriminant)) / (2 * a);
                x2 = (-b + Math.sqrt(diskriminant)) / (2 * a);
                System.out.println("First root :" + x1);
                System.out.println("Second root :" + x2);
            }
        }

    }

}
