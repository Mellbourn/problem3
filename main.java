class Random {

    private static final int randomDigit() {
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        for (var row = 0; row < 5; row++) {
            for (var digit = 0; digit < 6; digit++) {
                System.out.print(randomDigit());
            }
            System.out.println();
        }
    }
}
