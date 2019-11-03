import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        int seconds;
        int minutes;
        int hours;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter seconds to convert to hours and minutes: ");
        seconds=input.nextInt();
        minutes=seconds/60;
        hours=minutes/60;
        minutes%=60;
        seconds%=60;
        System.out.println(hours+" Hours,"+minutes+" minutes,"+seconds+" seconds.");
    }
}
