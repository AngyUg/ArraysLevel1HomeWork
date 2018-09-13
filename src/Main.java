public class Main {
    public static void main(String[] args) {

    ArraySumCalculator arraySumCalculator=new ArraySumCalculator();
        int sumArray = arraySumCalculator.sum;
        System.out.println(sumArray);

        System.out.println(" ");
        ArrayFiller arrayFiller = new ArrayFiller();
        System.out.println("Array with filler: ");
        arrayFiller.fill(5);

        System.out.println(" ");
        ArrayPositiveFinder arrayPositiveFinder=new ArrayPositiveFinder();
        int arrayS []={-1,2,6,4,-1};
        int readValue;
        int readValue2;
        readValue=arrayPositiveFinder.findFirstPositive(arrayS);
        System.out.println(" ");
        System.out.println("First positive value in arrey is:="+readValue);
        readValue2=arrayPositiveFinder.lastFirstPositive(arrayS);
        System.out.println("Last positive value in arrey is:="+readValue2);

    }

}
