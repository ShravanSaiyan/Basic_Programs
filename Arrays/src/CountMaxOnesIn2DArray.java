public class CountMaxOnesIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 0},
            {1, 1, 1, 0}};
        int[] noOfRows = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    count++;
                }
            }
            noOfRows[i] = count;
        }
        int maxElementIndex = 0;
        int maxElement = noOfRows[0];
        for (int i = 0; i < noOfRows.length; i++) {
            if (noOfRows[i] > maxElement) {
                maxElement = noOfRows[i];
                maxElementIndex = i;
            }
        }
        System.out.println(maxElementIndex);

    }

}
