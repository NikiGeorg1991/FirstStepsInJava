import java.util.Scanner;

public class IsPalindromWord {
    public static void main(String[] args) {

//    Доста интересен случай според мен. Това някак си не работи въпреки, че XET става същият като TEX.
//    Когато влезе в IF успява да направи някаква разлика между StringBuilder и String, но не мога да разбера защо?
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a word : ");
//        String tex = scan.nextLine();
//        StringBuilder xet = new StringBuilder(tex).reverse();
//        System.out.println("xet = " + xet);
//
//        if(tex.equals(xet)){
//            System.out.println("It is a palindrome");
//        }else{
//            System.out.println("NOT a palindrome");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String text = scan.nextLine();
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0 ;  i--) {
            reverseText += text.charAt(i);
        }
        System.out.println("reverseText = " + reverseText);
        if(text.equals(reverseText)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("NOT a palindrome");
        }

    }
}
