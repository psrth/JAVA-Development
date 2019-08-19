package Arrays;
import java.util.Scanner;

public class MatrixManipulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MATRIX MANIPULATION");
        
        System.out.print("Enter the length of matrices: ");
        int ln = sc.nextInt();
        System.out.print("Enter the breadth of matrices: ");
        int bd = sc.nextInt();
        System.out.println();
        
        int arr1[][] = new int[ln][bd];
        for (int i = 0; i<ln; i++){
            for (int j = 0; j<bd; j++){
                System.out.print("Enter element "+(i+1)+":"+(j+1)+" - ");
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i<ln; i++){
            for (int j = 0; j<bd; j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        int arr2[][] = new int[ln][bd];
        for (int i = 0; i<ln; i++){
            for (int j = 0; j<bd; j++){
                System.out.print("Enter element "+(i+1)+":"+(j+1)+" - ");
                arr2[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i<ln; i++){
            for (int j = 0; j<bd; j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Select an operation.");
        System.out.print("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
        int menu = sc.nextInt();
    
        int arr3[][] = new int[ln][bd];
        
        switch (menu) {
            case 1: for (int i = 0; i<ln; i++){
                        for (int j = 0; j<bd; j++){
                            arr3[i][j] = arr1[i][j] + arr2[i][j];
                        }
                   }
                   break;
                   
            case 2: for (int i = 0; i<ln; i++){
                        for (int j = 0; j<bd; j++){
                            arr3[i][j] = arr1[i][j] - arr2[i][j];
                        }
                   }
                   break;
            
            case 3: for (int i = 0; i<ln; i++){
                        for (int j = 0; j<bd; j++){
                            arr3[i][j] = arr1[i][j] * arr2[i][j];
                        }
                   }
                   break;
                   
            case 4: for (int i = 0; i<ln; i++){
                        for (int j = 0; j<bd; j++){
                            arr3[i][j] = arr1[i][j] / arr2[i][j];
                        }
                   }
                   break;
            
            default: System.out.println();
                     break;
        }
         
        for (int i = 0; i<ln; i++){
            for (int j = 0; j<bd; j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("I hope you enjoyed ma-trix.");
    }
}
