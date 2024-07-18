class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        type_and_variable();

        conversion_and_casting();

        promotion();
    }

    public static void type_and_variable() {
        int num = 12;
        System.out.println(num + 10); // 22

        float numf = 5.6f;
        System.out.println(numf + 10.0f); // 15.6

        byte numb = 6;
        System.out.println(numb + 3.0); // 9.0
    }

    public static void conversion_and_casting() {
        // conversion
        byte conb = 127;
        int coni = conb;
        System.out.println(coni); // 127 but type int

        // casting
        int num = 257;
        byte numb = (byte) num; // 257 % 256
        System.out.println(numb); // 1

        float f = 5.6f;
        int i = (int) f; // drop .6
        System.out.println(i); // 5
    }

    public static void promotion() {
        byte a = 10;
        byte b = 30;
        int result = a * b; // type promote from byte to int

        System.out.println(result); // 300
    }
}