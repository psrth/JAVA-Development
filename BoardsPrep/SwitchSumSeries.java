package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2016 - Q7

public class SwitchSumSeries{
    public void SumSeries(int n, double x){
        double s=0;
        for (int i=1;i<=n;i+=2){
            s=s+(x/n)-(x/n+1);
        }
        System.out.println(s);
    }
    
    public void SumSeries(){
        int r=1;
        int s=0;
        for(int i=1;i<=20;i++){
            for(int j=1;j<i+1;j++){
             r=r*j;
            }
            s=s+r;
        }
        System.out.println(s);
    }
}

            