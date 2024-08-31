public class armstrongnum {
    public static void main(String[] args) {
        int num=1634;
        int originamlnum=num;
        int n=String.valueOf(num).length();
        int sum=0;


        while(num!=0){
            int digit=num%10;
            sum +=Math.pow(digit, n);
            num=num/10;

        }
        if(originamlnum==sum){
            System.out.println("armstrong");
        }
        else {
            System.out.println(("not armstrong"));
        }


    }
}
//1^3 + 3^3 + 5^3=153