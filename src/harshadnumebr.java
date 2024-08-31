public class harshadnumebr {
    public static void main(String[] args) {
        int n=28;
        int result =0;
        while (n!=0){
            int last =n%10;
            result =result +last;
            n= n/10;
        }
        if(n%result==0)
            System.out.println("harshad numebr");
        else
        System.out.println("not harshad number");
    }
}
