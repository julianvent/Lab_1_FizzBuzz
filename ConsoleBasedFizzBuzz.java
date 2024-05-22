class ConsoleBasedFizzBuzz implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (isDividedByFive(i) || isDividedByThree(i)) {
                if (isDividedByThree(i)) {
                    System.out.print("Fizz");
                } 
                if (isDividedByFive(i)) {
                    System.out.print("Buzz");
                }
                System.out.println();
            } else {
                System.out.println(i);
            }
        }
    }
    public static boolean isDividedByThree(int num) {
        if (num % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isDividedByFive(int num) {
        if (num % 5 == 0) {
            return true;
        }
        return false;
    }
}