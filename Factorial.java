public class Factorial {
    public long calcFactorial(int n){
        long sum=1;
        for(int a=1; a<=n; a++){
            sum*=a;
        }
        return sum;
    }
    public static void main(String [] args){
        Factorial a= new Factorial();
        for(int b=1; b<=20; b++){
        System.out.println(a.calcFactorial(b));
        }
    }
}
