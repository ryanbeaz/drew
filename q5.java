class Q5 {

    private static int foo(int a) {
        return bar(a) + 5;
    }

    private static int bar(int b) {
        return baz(b) * 3;
    }

    private static int baz(int b) {
        return b - 6;
    }

    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int x = foo(a) + bar(b);
        System.out.println(x);
    }
}

// Answer is 59