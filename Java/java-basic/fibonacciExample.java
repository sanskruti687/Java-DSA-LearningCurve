class FibonacciExample {
    public static void main(String arg[]) {
        int n1 = 0, n2 = 1, n3, count = 15;
        
        System.out.print(n1 + " " + n2); // Print first two numbers in the same line
        
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3); // Print next numbers with space
            n1 = n2;
            n2 = n3;
        }
    }
}
