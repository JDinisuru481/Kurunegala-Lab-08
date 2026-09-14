public class it26100481LAB08C {
    public static void main(String[] args) {

        int A[] = {10,20,30,40,50};
        int B[] = {34,67,12,89,12};
        int C[] = new int[5];
		
		
            System.out.println("A array Contents:");
                for(int i = 0; i < 5; i++){
                      System.out.print(A[i] + " ");
                       }
					   
		    System.out.println("B array Contents:");
                for(int i = 0; i < 5; i++){
                     System.out.print(B[i] + " ");
						  }

                 for(int i=0; i<5; i++) {
                      C[i] = A[i] + B[i];
                    }

        System.out.println("C array contents (A+B):");
        for(int i=0; i<5; i++) {
            System.out.print(C[i] + " ");
        }
    }
}