import java.util.Scanner;

public class IT26100481LAB08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myArray[] = new int[5];

        for(int i=0; i<5; i++) {
            System.out.print("Enter Number: ");
            myArray[i] = input.nextInt();
        }

        System.out.println("Araay in Reverse Order:");
        for(int i=4; i>=0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}