package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2017 - Q9

import java.util.Scanner;
public class WordSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=40;
        String arr[]=new String[num];
        for (int i=0;i<num;i++){
            System.out.println("Enter the "+(i+1)+"string: ");
            String s=sc.nextLine();
            arr[i]=s;
        }
      
        for (int i=0;i<num-1;i++){
            String s1 = arr[i];
            String s2 = arr[i+1];
            String tmp;
            int n;
            n = s1.compareTo(s2);
            if(n<0){
                tmp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }
        }
        
        for (int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
            
    }

}

