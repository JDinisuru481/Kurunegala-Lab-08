import java.util.Scanner;

public class it26100481LAB08301 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr[] = new int[6];
        int count = 0;

        while(count < 6) {
            System.out.print("Enter Positive Number: ");
            int num = input.nextInt();

            if(num > 0) {
                arr[count] = num;
                count++;
            } else {
                System.out.println("Error! Enter Positive Number.");
            }
        }

        int max = arr[0];

        for(int i=1; i<6; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Number = " + max);
    }
}