import java.util.Scanner;

public class IT26100481LAB0302 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentsArray[] = new int[8];

        for(int i=0; i<8; i++) {
            do {
                System.out.print("Enter Student ID: ");
                studentsArray[i] = input.nextInt();

                if(studentsArray[i] <= 0) {
                    System.out.println("Invalid ID!");
                }

            } while(studentsArray[i] <= 0);
        }

        System.out.print("Enter Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for(int i=0; i<8; i++) {
            if(studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Student is Available");
        else
            System.out.println("Student is Not Available");
    }
}