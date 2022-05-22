import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double l1, l2;
        Scanner input = new Scanner(System.in);
        System.out.print("First provide the radius of circle and then degree of the partitioned area : \n");
        l1 = input.nextDouble();
        l2 = input.nextDouble();
        System.out.print("Partitioned area = " + (l2 / 360 * 3.14 * l1 * l1));

    }
}