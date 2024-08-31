public class leapyear {
    public static void main(String[] args) {
        int a=2024;
        if(a%4==0 && a%100!=0){
            System.out.println(a+"is leapyear");

        } else if (a%400==0) {
            System.out.println("leap year");

        }
        else {
            System.out.println("not leap year");
        }
    }
}
