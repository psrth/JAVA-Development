package Strings;
public class FloydTriangle {
 
    public static void main(String[] args) {
        int i, j =0;
        int k=1;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print(k++ + " ");
            }
 
            System.out.println();
        }
    }
 
}
