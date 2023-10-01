package recursiveMethods;

public class productOfArray {
    public productOfArray(int A[],int N){
        System.out.println(pro_of_array(A,N));
    }
    public int pro_of_array(int A[],int N){
        
        if(N==0){
            return A[N];
        }
        if(N<0){
            return 1;
        }
        return A[N-1]*pro_of_array(A, N-1);
    }
}
