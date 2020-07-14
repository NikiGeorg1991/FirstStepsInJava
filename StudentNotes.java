public class StudentNotes {
    public static void main(String[] args) {

        int ivanchoNote = 2;
        int mariikaNote = 6;
        int penchoNote = 4;
        int bigPetkoNote = 5;
        String name = "STUDENT";
        String note = "NOTE";
        String ivancho = "Иванчо";
        String mariika = "Марийка";
        String pencho = "Пенчо";
        String bigPetko = "Голям Петко";


        System.out.printf("%-20s %7s %n",name,note);
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-20s %5s %n",ivancho,ivanchoNote);
        System.out.printf("%-20s %5s %n",mariika,mariikaNote);
        System.out.printf("%-20s %5s %n",pencho,penchoNote);
        System.out.printf("%-20s %5s %n",bigPetko,bigPetkoNote);
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
    }
}
