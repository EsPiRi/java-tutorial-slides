import java.util.Scanner;

public class solveMeMain {
    public static int solveMeFirst(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println();
        int num1=input.nextInt();
        int num2=input.nextInt();
        int res=solveMeFirst(num1,num2);
    }
}
