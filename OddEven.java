import java.util.Scanner;
class OddEven {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        String res=(num%2==0)?"Even":"Odd";
        System.out.println(res);
    }
}
