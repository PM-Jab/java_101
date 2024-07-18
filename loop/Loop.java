package loop;

public class Loop {
    public static void main(String[] args) {
        int i = 5;

        while_loop(i);
    }

    public static void while_loop(int i) {
        while (i > 0) {
            System.out.println("Count down: " + i);
            --i;
        }
    }
}
