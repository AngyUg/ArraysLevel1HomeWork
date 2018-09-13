public class Main {
    public static void main(String[] args) {

    ArraySumCalculator arraySumCalculator=new ArraySumCalculator();
        int sumArray = arraySumCalculator.sum;
        System.out.println(sumArray);

        System.out.println(" ");
        ArrayFiller arrayFiller = new ArrayFiller();
        System.out.println("Array with filler: ");
        arrayFiller.fill(5);
    }
}
