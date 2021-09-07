class Q9 {

    public static int doIt(int a, int prv1, int nxt1) 
    {
        int prv = a - prv1;
        int nxt = a + nxt1;
        return prv;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c = 100;
        b = doIt(a, b, c);
        System.out.println("b = " + b + ", c = " + c);
    }
}

// b = 0, c = 100