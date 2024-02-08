import java.io.File;
import java.util.Scanner;

import model.Model;

public class App {

    static Scanner scanner;
    static Model model;

    public static void main(String[] args) throws Exception {
        final String petFileName = args[0];
        final File petFile = new File(petFileName);
        scanner = new Scanner(petFile);
        model = new Model(scanner);

        scanner.close();

    }
}
