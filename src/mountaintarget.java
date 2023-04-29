public class mountaintarget {
    public static void main(String[] args) {
        int[] arr = {40, 48, 61, 75, 100, 99, 98, 39, 30, 10};
        System.out.println(peakIndexInMountainArray(arr));
    }
    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderagnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderagnostic(arr, target, peak+1,arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - 2) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;

    }

    public static int orderagnostic(int[] a, int t, int l, int h) {
        boolean isAsc = a[l] < a[h];
        while (l <= h) {
            {
                int mid = l + (h - l) / 2;
                if (a[mid] == t) {
                    return mid;
                }
                if (isAsc) {
                    if (t <= a[mid]) {
                        h = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    l = mid + 1;
                }

            }
        }
        return -1;
    }
}



