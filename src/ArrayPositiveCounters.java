public class ArrayPositiveCounters {
    public int countPositiveCounters(int array[]) {
        int counter = 0;
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
                value =counter;
            }
        }
        return value;
    }
}
