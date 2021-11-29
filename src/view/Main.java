package view;

import java.util.Scanner;

public class Main {
    StudentView studentView = new StudentView();

    public Main() {
        while (true) {
            System.out.println("1. Display List Student");
            System.out.println("2. Add New Student");
            System.out.println("Enter CHOICE");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    studentView.viewShowStudentList();
                    break;
                }
                case 2: {
                    studentView.viewCreateStudent();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
