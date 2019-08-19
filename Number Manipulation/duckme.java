package numberManipulation;
public class duckme {
    public void ohDuck(int num){
        int tmp=0;
        int flag=-1;
        while(num>0){
            tmp=num%10; 
            if(tmp==0)flag++;
            num/=10;
        }
        
        if (flag!=-1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
        
