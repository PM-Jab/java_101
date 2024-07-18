package condition;

public class Condition {
    public static void main(String[] args) {
        int a = 3;

        // if else
        System.out.println(more_or_less_than_20(a));

        // ternary
        System.out.println(equal_to_20(a));

        // switch case
        weekly_day(a);
    }

    public static String more_or_less_than_20(int num) {
        if (num >= 30)
            return "More than 30";
        else if (num >= 20)
            return "More than 20";
        else
            return "Less than 20";
    }

    public static String equal_to_20(int num) {
        return num == 20 ? "yes" : "No";
    }

    public static void weekly_day(int num) {
        // without break all code below that case will be executed
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number!");
        }
    }
}
