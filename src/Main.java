

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int currentYear = 2026;
        System.out.println(getInputFromConsole(currentYear));

    }
        public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, What's your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String born = System.console().readLine("När du har född?");
        int age = currentYear - Integer.parseInt((born));
        System.out.println("You are " + age + " years old");

        return "";
        }

        public static String getInputFromScanner(int currentYear){

        Scanner

        }

    }


