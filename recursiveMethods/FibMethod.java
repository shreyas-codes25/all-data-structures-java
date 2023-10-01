package recursiveMethods;

public class FibMethod {
    public FibMethod(int n){
        System.out.println(fib(n));
    }
    public int fib(int n){
        if(n<0){
            return 0;
        }else if(n==1 || n==0){
            return 1;
        }
        else{
        return fib(n-1)+fib(n-2);
        }
    }
}
