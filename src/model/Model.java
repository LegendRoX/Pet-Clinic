package model;

import java.util.Scanner;

public class Model {

    Scanner scanner;

    public Model(Scanner scanner) {
        this.scanner = scanner;
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
