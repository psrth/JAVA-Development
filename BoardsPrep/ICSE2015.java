package iterationLoops;

public class ICSE2015{
    public static void main(){
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                if (j%2==0)System.out.print("# ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}