public abstract class NumericValueProcessing{
    public static int factorial(int n){
        int fac = 1, sum=0;
        for(int i = 1; i<=n; i++){
            fac=fac*i;
            sum = sum + fac;
        }
        return fac;
    }

    public abstract void display(int v);

}