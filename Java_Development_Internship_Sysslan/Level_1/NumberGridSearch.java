import java.util.Scanner;
public class NumberGridSearch {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("3x3 Number Grid:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == target) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found!");
        }
        sc.close();
    }
}