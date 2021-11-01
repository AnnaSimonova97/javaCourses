package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[][] nums = {{2, 4, 5, 6},
                {4, 2, 3, 5},
                {5, 3, 4, 5, 9},
                {3, 5, 7, 8}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
