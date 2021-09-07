class Q8 {

    public static boolean isIdeal(int year) 
    {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args)
    {
        boolean one = isIdeal(1600);
        boolean two = isIdeal(1700);
        boolean three = isIdeal(2000);
        boolean four = isIdeal(2008);

        System.out.printf("1: %b, 2: %b, 3: %b, 4: %b", one, two, three, four);
    }
}

// I, III, and IV