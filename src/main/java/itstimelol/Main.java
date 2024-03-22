package itstimelol;

public class Main {
    public static void main(String[] args) {
        int [] ints = {1,2,3,4,5,6};

        takesAnArrayOfInt(ints);
printOddNumbs();

    }
    public static void printOddNumbs() {
        for (int i = 10; i >= 1; i--){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static int takesAnArrayOfInt(int [] numbers) {
        int[] myArray = {1, 132, 29, 12120};
        int sum = 0;
        int i;
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("The sum is: " + sum);
        return sum;
    }
    public static double calculateTheAverage (int [] arraysumnn) {

        return 0;
    }

}









