public class Driver {

    public static void main(String[] args){

        randomNumberGenerator rng = new randomNumberGenerator();
        mergeSort m = new mergeSort();

        int[] arr = rng.rng(100); // creates array of 100 random integers 0-99
        System.out.println("Random integers 0-99:");
        rng.print(arr);

        m.mSort(arr,0,99); //sorts random array
        System.out.println("Sorted:");
        m.print();

    }

}
