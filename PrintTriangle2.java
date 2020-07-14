import java.util.Scanner;

public class PrintTriangle2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of triangle : ");
        int size = scan.nextInt();
        char symbol = '#';
        char space = ' ';
        if(size>0){
            for (int i = 0; i <size ; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(space);
                }
                for (int k = 0; k <= size-1-i; k++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }else{
            System.out.println("invalid input");
        }
    }
}
