public class ToBinaryReverse {
    public static void main(String[] args) {
        int x = 1010101;
//        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x)).reverse();
//        System.out.println("sb = " + sb);
        int reminder = 0;

        while (x != 0)
        {
            reminder = x % 2 ;
            x /= 2;
            System.out.print(reminder);
        }
    }
}
