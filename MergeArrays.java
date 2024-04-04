import java.util.Arrays;
public class MergeArrays {

    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Move non-zero elements of X to the end
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }

        // Merge Y[] into X[] by considering non-zero elements
        int i = n;
        int j = 0;
        int l = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[l] = X[i];
                i++;
            } else {
                X[l] = Y[j];
                j++;
            }
            l++;
        }

        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[l] = Y[j];
            j++;
            l++;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        merge(X, Y);
        System.out.println(Arrays.toString(X));
    }
	

}
