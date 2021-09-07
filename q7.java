class Q7 {

    public static void doIt(int a, int prv, int nxt) 
    {
        prv = a - 1;
        nxt = a + 1;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c = 100;
        doIt(a, b, c);
        System.out.println("b = " + b + ", c = " + c);
    }
}

// b = 100, c = 100