package Strings;


class exceptionHandling {
    public static void main(String args[]){
        try {
            String str=null;
            System.out.println(str.length());
            }
        catch (NullPointerException e) {System.out.println("Please change the value fromm null.");}
    }
   }

/*
class tryCatch {
    public static void main(String args[]){
        try {
            int num=54;
            int x=54/0;
            System.out.println(x);
        }
        catch (ArithmeticException e) {
                System.out.println("Pls do not divide by zero.");
        }
   }
}   

class tryCatch {
    public static void main(String args[]){
        try {
            String str="exception handling in java";
            System.out.println(str.length());;
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds...");
        }
   }
}   

class tryCatch {
    public static void main(String args[]){
        try {
            int arr[]= new int [10];
            arr[11] = 9;        
        }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out of Bounds.");                
        }
   }
} 

class tryCatch {
    public static void main(String args[]){
        try {
            int num=Integer.parseInt("XYZ"); 
            System.out.println(num);
        }
            catch (NumberFormatException e) {
                System.out.println("Number format is lossy");
        }
   }
}  

class tryCatch {
    public static void main(String args[]){
        try {
            String str="exception handling in java";
            System.out.println(str.length());;
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds...");
        }
   }
} 
*/           
