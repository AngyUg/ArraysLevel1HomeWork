public class ArrayPositiveFinder {
    public int findFirstPositive(int array[]) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                value = array[i];
                break;
            }
        }
        return value;
    }
    public int lastFirstPositive(int array[]) {
        int value = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > 0) {
                value = array[i];
                break;
            }
        }
        return value;

    }}