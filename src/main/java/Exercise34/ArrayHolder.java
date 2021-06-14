/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise34;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayHolder {
    private static final Scanner UserInput = new Scanner(System.in);

    public void ArrayHolderA() {
        ArrayList<String> Employees = new ArrayList<>();
        System.out.println("There are 5 employees");
        Employees.add("John Smith");
        Employees.add("Jackie Jackson");
        Employees.add("Chris Jones");
        Employees.add("Amanda Cullen");
        Employees.add("Jeremy Goodwin");

        System.out.println(Employees.get(0) + "\n" + Employees.get(1) + "\n" + Employees.get(2) +
                "\n" + Employees.get(3) + "\n" + Employees.get(4)+"\n");

        System.out.println("Enter an employee name to remove:");
        String In = UserInput.nextLine();
        switch (In) {
            case "John Smith":
                Employees.remove(0);
                System.out.println("\n"+"There are 4 employees:"+"\n"+Employees.get(0) + "\n" + Employees.get(1) + "\n" + Employees.get(2) +
                        "\n" + Employees.get(3) );
                break;
            case "Jackie Jackson":
                Employees.remove(1);
                System.out.println("\n"+"There are 4 employees:"+"\n"+Employees.get(0) + "\n" + Employees.get(1) + "\n" + Employees.get(2) +
                        "\n" + Employees.get(3) );
                break;
            case "Chris Jones":
                Employees.remove(2);
                System.out.println("\n"+"There are 4 employees:"+"\n"+Employees.get(0) + "\n" + Employees.get(1) + "\n" + Employees.get(2) +
                        "\n" + Employees.get(3) );
                break;
            case "Amanda Cullen":
                Employees.remove(3);
                System.out.println("\n"+"There are 4 employees:"+"\n"+Employees.get(0) + "\n" + Employees.get(1) + "\n" + Employees.get(2) +
                        "\n" + Employees.get(3) );
                break;
            case "Jeremy Goodwin":
                Employees.remove(4);
                System.out.println("\n"+"There are 4 employees:"+"\n"+Employees.get(0) + "\n" + Employees.get(1) + "\n" + Employees.get(2) +
                        "\n" + Employees.get(3) );
                break;
            default:
                System.out.println("Enter an employee name");

        }

    }
}