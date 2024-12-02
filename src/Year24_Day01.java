import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Year24_Day01 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("24/1");
        Scanner s = new Scanner(f);

        int total = 0;
        String line = s.nextLine();

        for (int i = 0; i < line.length(); i += 3) {
            String sub = line.substring(i, i + 3);
            int xCounter = 0;

            switch (sub.charAt(0)) {
                case 'B':
                    total++;
                    break;
                case 'C':
                    total += 3;
                    break;
                case 'D':
                    total += 5;
                    break;
                case 'x':
                    xCounter++;
                    break;
            }
            switch (sub.charAt(1)) {
                case 'B':
                    total++;
                    break;
                case 'C':
                    total += 3;
                    break;
                case 'D':
                    total += 5;
                    break;
                case 'x':
                    xCounter++;
                    break;
            }
            switch (sub.charAt(2)) {
                case 'B':
                    total++;
                    break;
                case 'C':
                    total += 3;
                    break;
                case 'D':
                    total += 5;
                    break;
                case 'x':
                    xCounter++;
                    break;
            }
            switch (xCounter) {
                case 0:
                    total += 6;
                    break;
                case 1:
                    total += 2;
                    break;
            }
        }
        System.out.println(total);

    }


}