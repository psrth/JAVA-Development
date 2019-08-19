package numberManipulation;

public class perfect {
    public void perfecto(int num){
        int sum=0;
        for(int i=1;i<num-1;i++){
            if(num%i==0)
                sum=sum+i;
        }
        if (sum==num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}