public class ForLoop {
    public static void main ( String[] args ) {
        int x = 1;
        while ( x <= 3 ) {
            int y = 1;
            while ( y <= x ) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            x++;
        }
        x = 2;
        while ( x >= 1 ) {
            int y = 1;
            while ( y <= x ) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            x--;
        }
    }
}