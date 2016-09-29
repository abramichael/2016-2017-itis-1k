import java.util.Scanner;

public class GameMiner {

    public static void main(String[] args) {

        final int SIZE = 10;
        Scanner sc = new Scanner(System.in);
        // 0-8 - закрытое поле без бомбы (с количеством бомб)
        // 9 - закрытое поле с бомбой
        // 10-18 - открытое поле без бомбы
        // 19 - открытое поле с бомбой
        int [][] field = new int[][] {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 9, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // ToDo generating bombs
        // ToDO Recounting

        // indexes of columns
        for (int j = 0; j < field[0].length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }

        // 0 - game is going, 1 - lost, 2 - won
        byte playing = 0;

        while (playing == 0) {
            String[] input = sc.nextLine().split(" ");
            int row = Integer.parseInt(input[1]);
            int column = Integer.parseInt(input[2]);

            if (input[0].equals("open")) {
                // ToDo изменить статус field[i][j]
                if (field[row][column] == 9) {
                    playing = 1;
                }
                field[row][column] += 10;
            }

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] <= 9) {
                        System.out.print(". ");
                    }
                    else if (field[i][j] <= 18) {
                        int d = field[i][j] % 10;
                        System.out.print(d + " ");
                    }
                    else if (field[i][j] == 19) {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }

        }
        if (playing == 1) {
            System.out.println("You lost!");
        } else {
            System.out.println("You won!");
        }

    }

}
