package loop;

public class Loop {
    public static void main(String[] args) {
        int i = 5;

        while_loop(i);

        nest_loop(i);
    }

    public static void while_loop(int i) {
        while (i > 0) {
            System.out.println("Count down: " + i);
            --i;
        }
    }

    public static void nest_loop(int i) {
        int j = 3;
        while (i > 0) {
            System.out.println("Loop i: " + i);
            while (j > 0) {
                System.out.println("Loop j: " + j);
                --j;
            }
            --i;
        }
    }
}
