import java.util.Scanner;
public class no_of_days_in_months{
    public static void main (String[]args)
    {
        int year, month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number of days in a given month");
        System.out.println("Please enter the month: ");
        month = sc.nextInt();
        System.out.println("Please enter the year: ");
        year = sc.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.print("Total days in the month is 31");
        else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
        {
            System.out.print("Total days in the month is 29");
        }
        else if(month == 2)
        {
            System.out.print("Total days in the month is 28");
        }
        else{
            System.out.println("Total days in the month is 30");
        }
    }
}
