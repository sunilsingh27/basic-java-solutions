public class reversenumber {
    public static void main(String[] args) {
        int n=232;
        int originalnum=n;
        int r=0;

        while(n!=0){
            int digit= n%10;
            r=r*10+digit;
            n=n/10;

        }
        System.out.println(r);
        if(originalnum==r){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
