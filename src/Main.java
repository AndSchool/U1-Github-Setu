import java.util.Scanner;  // must import this class b/c it isn't "built in" like String and System




public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"




        System.out.print("Please enter an amount in dollars and cents: ");
        double money =100*scan.nextDouble(); // call nextLine() method on scanner object to get text


        System.out.println("The minimum number of coins is:");
        int quarters = (int)money/25;
        int quarterchange= quarters%1;
        System.out.println(quarters-quarterchange+" quarters");
        int remains = money-((quarters-quarterchange)*25);
        double dimes = remains/.1;
        double dimechange=dimes%1;
        System.out.println(dimes-dimechange+" dimes");
        remains = remains-((dimes-dimechange)*.10);
        double nickles = remains/.05;
        double nicklechange=nickles%1;
        System.out.println(nickles-nicklechange+" nickels");
        remains = remains-((nickles-nicklechange)*.05);
        double pennies = (remains+.000000001)/.01;
        double pennychange=pennies%1;
        System.out.println(pennies-pennychange+" pennies");
        System.out.println("The minimum number of coins is " +((quarters-quarterchange)+(dimes-dimechange)+(nickles-nicklechange)+(pennies-pennychange)));


        scan.close();  // do this when you are done with the scanner
    }
}
