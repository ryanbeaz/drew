class Q2 {
    private static int foo(int x) {
        return x + 3;
    }

    private static int x = 9; // <-- not actually used...ignore this

    public static void main(String[] args) {
        int c = 5;
        int x = 9;
        x = x + foo(c);
        x = x + foo(c);
        System.out.println(x);
    }
}

// Answer is 25