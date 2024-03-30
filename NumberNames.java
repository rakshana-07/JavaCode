class NumberNames {
    private int number;

    public numberPuzzle(int number) {
        this.number = number;
    }

    public int solve() {
        if (number > 50) {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            return firstDigit - secondDigit;
        } else {
            int reversedNumber = (number % 10) * 10 + (number / 10);
            int firstDigit = reversedNumber / 10;
            int secondDigit = reversedNumber % 10;
            return firstDigit - secondDigit;
        }
    }
}
