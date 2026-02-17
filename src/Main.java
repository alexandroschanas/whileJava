

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int currentYear = 2026;


        //System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));


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

        System.out.print("Enter your name");;
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();



        boolean validDOB = true;
        int ageInt = 0;

        do{

            try{

                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Give DOB");
                String age = myObj2.nextLine();
                ageInt = Integer.parseInt(age);
                System.out.println("Date of birth must be between " + (currentYear - 100) + " and " + currentYear);


                if((ageInt < currentYear-100) || (ageInt > currentYear+100)){

                validDOB = false;

            }

            }catch(NumberFormatException b) {

                System.out.println("Please enter a valid numeric value between and ");

            }

        }while(!validDOB);

        System.out.println("Your birthdate is " + ageInt);
        System.out.println("Your age is " + (currentYear - ageInt));

        return "";

        }

    }


