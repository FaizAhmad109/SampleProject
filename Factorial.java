public class Factorial {
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 1;
        }
        else
        {
            return factorial(n-1) * n;
        }
    }
    public static void main(String[] args) {
        int ans=factorial(3);
        System.out.println(ans);
    }
    
}
