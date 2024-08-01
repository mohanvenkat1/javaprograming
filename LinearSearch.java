public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i+1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        int key = 3;
        int result = linearSearch(num, key);
        if (result != -1) {
            System.out.println("Element found at : " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
