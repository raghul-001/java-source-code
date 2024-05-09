
import java.util.*;
import java.time.*;
class FindDayOfWeek{
    public static void main(String[] args) {
    int date,month,year;

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a Date : ");
        date = scanner.nextInt();
        System.out.println("enter a Month : ");
        month = scanner.nextInt();
        System.out.println("enter a Year : ");
        year = scanner.nextInt();

       LocalDate dd = LocalDate.of(year, month, date);
        System.out.println(dd.getDayOfWeek());

    }
}
