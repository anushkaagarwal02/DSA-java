public class jump {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                System.out.println("-1");
            } else {
                i = i + arr[i];
                count++;

            }
            System.out.println(count);
        }
    }
}
