public class strongnumber {
    public static void main(String[] args) {
        int num=145;

        if(detectStrong (num))
            System.out.println(num +"strong numbrt");
        else
            System.out.println(num +"not strong number");

    }

    static int facto (int n){
        int fact=1;
        for (int i=1; i<=n;i++)
            fact =fact*i;
        return fact;
    }

    static boolean detectStrong(int num){
        int digit, sum=0;
        int temp =num;
        boolean flag =false;

        while (temp!=0){
            digit=temp%10;

            sum=sum+facto(digit);
            temp/=10;
        }
        // returns 1 if both equal else 0
        if (sum == num)
            flag = true;
        else
            flag = false;

        return flag;
    }
}
//1! + 5! + 3! =153