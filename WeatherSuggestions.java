import java.util.Scanner;

public class WeatherSuggestions {

    public static void main(String[] args) {
        int heat;

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the current heat: ");
        heat=scan.nextInt();

        if (heat<5)
            System.out.println("You can ski.");

        else if (heat<15)
            System.out.println("You can go to the cinema.");

        else if (heat<25)
            System.out.println("You can go on a picnic.");

        else
            System.out.println("You can swim.");
    }
}
