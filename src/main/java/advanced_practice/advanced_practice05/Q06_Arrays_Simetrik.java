package advanced_practice.advanced_practice05;

public class Q06_Arrays_Simetrik {

    // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        System.out.println(isSimetrik(arr));

    }
    public static boolean isSimetrik(int[] arr) {
        boolean isSimetrik = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[arr.length - 1 - i]) {
                isSimetrik = true;
            } else {
                isSimetrik = false;
            }
        }
        return isSimetrik;

    }


}
