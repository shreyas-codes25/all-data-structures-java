package recursiveMethods;

public class Factorial{
    public Factorial(int n){
        System.out.println(fact(n));
    }
    public  int fact(int n){
        if(n<1){return 1;}
        if(n==1){
            return 1;

        }
       return n * fact(n-1);
    }
}