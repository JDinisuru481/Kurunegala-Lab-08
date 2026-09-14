import java.util.Scanner;

public class it26100481LAB08B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myArray[] = new int[5];
        int evenArray[] = new int[5];
        int j = 0;

        for(int i=0; i<5; i++) {
            System.out.print("Enter Number: ");
            myArray[i] = input.nextInt();
        }
        System.out.println("myArray contents:");
        for(int i=0; i<5; i++) {
            if(myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }
       
        System.out.println("evenArray contents:");
        for(int i=0; i<j; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}