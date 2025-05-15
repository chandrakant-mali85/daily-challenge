public class LargestEle {

    public static void main(String args[]) {

        int arr[] = {2, 13, 34, 53, 7, 9};

        // Convert array to string format using loop
        String arrayStr = "";
        for (int i = 0; i < arr.length; i++) {
            arrayStr += arr[i];
            if (i < arr.length - 1) {
                arrayStr += ", ";
            }
        }

        System.out.println("Given array: [" + arrayStr + "]");

        // Find the largest element
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Largest element of the array: " + max);
    }
}
