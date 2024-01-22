public class Main {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 9, 10};
        int[] arr2 = {5, 4, 3, 2, 10, 11};
        System.out.println(changingSequence(arr));
        System.out.println(changingSequence(arr2));
    }
    public static int changingSequence(int[] arr) {
        // checks if the first number is less than the second. if true, cycle through the array, searching for where
        // it changes from increasing to decreasing
        int n = arr.length;
        if (arr[0] < arr[1]) {
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return i;
                }
            }
            // checks if the first number is greater than the second. if true, cycle through the array, searching for where
            // it changes from decreasing to increasing
        } else if (arr[0] > arr[1]) {
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    return i;
                }
            }
        }
        //if no change is found return -1
        return -1;
    }
}