package recursiveMethods;
public class addNumbers{
    public addNumbers(int n){
        System.out.println(add_num(n));
    }
    public int add_num(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            return 0;
        }
        return n+add_num(n-1);
    }
}