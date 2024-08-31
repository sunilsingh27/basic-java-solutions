public class abundancenumber {
    public static void main(String[] args) {
         int n=18;
         int sum=0;
         for (int i=1;i<=n;i++){
             if (n%i==0){
                 sum=sum+i;
             }

         }
        if (sum>n){
            System.out.println(n+"is abundant number ");
            System.out.println("the abdunt is"+ (sum-n));
        }
        else
            System.out.println("not abundant number");

    }
}

//The divisors of 18 are 1, 2, 3, 6, 9, and 18.
//The sum of proper divisors of 18 is: 1 + 2 + 3 + 6 + 9 = 21.