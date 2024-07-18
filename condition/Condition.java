package condition;

public class Condition {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(more_or_less_than_20(a));
    }

    public static String more_or_less_than_20(int num) {
        if (num >= 30)
            return "More than 30";
        else if (num >= 20)
            return "More than 20";
        else
            return "Less than 20";
    }
}
