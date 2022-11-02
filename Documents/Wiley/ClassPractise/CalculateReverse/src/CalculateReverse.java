public class CalculateReverse {
    int[] number = new int[3];
    int[] reverseNumber;

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int[] getReverseNumber() {
        calculateReverse();
        return reverseNumber;
    }

    private int[] calculateReverse() {
        int length = number.length;
        reverseNumber = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            reverseNumber[i] = number[length - 1];
            length--;
        }

        return reverseNumber;
    }
}
