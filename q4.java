class Q4 {

    private static int foo() {
        return 8;
    }

    private static int bar() {
        return 12;
    }

    public static void main(String[] args) {
        int x = foo() + bar();
        System.out.println(x);
    }
}

// Answer is 20