public class WhileLoops {
    public int addOdds(int n){
        int sum=0;
        int a=1;
        while(a<=n);{
            a+=2;
            sum+=a;
        }
        return sum;
    }

public static void main(String [] args){
    WhileLoops a= new WhileLoops();
    System.out.println(a.addOdds(1));
}
}