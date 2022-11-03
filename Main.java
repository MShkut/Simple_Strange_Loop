import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean bool = true;

        while (bool == true) {

            System.out.println();
            System.out.println("I am a Cretan. All Cretan's are liars");
            System.out.print("Is my statement true or false (Enter T/F, E to exit)");

            String inp = scan.nextLine();

            if (inp.equals("t") || inp.equals("T")) {
                System.out.println("True eh? Well that means that I, a Cretan, am a liar. So it can't be true!");

            } else if (inp.equals("f") || inp.equals("F")) {
                System.out.println("Ah false you say. But if I, a Cretan, am lying. Therefore I must in fact be telling the truth!");
            }
            else if (inp.equals("e") || inp.equals("E"))
            {
                bool = false;
            }
            else
            {
                bool = false;
            }
        }

    }
}