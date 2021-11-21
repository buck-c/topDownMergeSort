import java.util.Random;
public class randomNumberGenerator{

    int[] rng(int size){

        int [] rngArray = new int[size];
        Random rand = new Random();

        for(int i=0;i<size;i++){
            rngArray[i]=rand.nextInt(100); //fills array with random integers 0-99
        }

        return rngArray;
    }

    void print(int[] arr){ // prints array, 20 numbers to a line to make it easier to read

        int  j = 0;
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + ", ");
            j++;
            if(j==20){
                System.out.println();
                j=0;
            }
        }
        System.out.println(arr[arr.length-1]+"\n"); //prints the last element without a comma
    }

}