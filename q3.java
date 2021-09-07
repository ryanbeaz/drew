class Q3 {

    //this is called second
    private static int foo(int a) {
        return a * 2;
    }

    // this is called first
    private static int bar(int b) {
        return b + 7;
    }

    public static void main(String[] args) {
        int a = 4;
        int x = foo(bar(a));
        System.out.println(x);
    }
}

// Answer is 22