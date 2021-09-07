class Q10 {

    public static void swap(int a, int b) 
    {
        int t = a; // t = 10
        a = b; // a = 11
        b = t; // b = 10;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        swap(x, y);
        
        System.out.println("x = " + x + " and y = " + y);
    }
}

// x = 10 and y = 11