package iterationLoops;
import java.util.*;

public class ICSE2016{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("1. Floyd's Triangle \n2. ICSE");
        int sel=sc.nextInt();

        switch(sel){
            case 1: int num=1;
                    for(int i=0;i<5;i++){
                        for (int j=0;j<(i+1);j++){
                            System.out.print(num+"  ");
                            num++;
                        }
                        System.out.println();
                    }
                    break;
            case 2: String str ="ICSE";
                    for (int i=0;i<4;i++){
                        for (int j=0;j<(i+1);j++)
                            System.out.print(str.charAt(j));
                        System.out.println();
                    }
                    break;
            default: System.out.println("Program error");
                        break;
        }
    }
}
                        