public class NestLoopDemo {
    public static void main(String[] args)  {
        for (int row = 0; row < 5; row++)   {
            System.out.print("row " + row + ": ");
            for (int col = 0; col < 10; col++)  {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++)   {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int row = 0; row < 3; row++)   {
            for (int col = 0; col < 10; col++)  {
                for (int num=0; num < 3; num++) {
                    System.out.print(col);
                }
            }
            System.out.println();
        }

    }
}
