import java.util.*;


public class Main {
    public static void main(String[] args) {

        boolean run = true;

        while(run){


            Scanner inputObject = new Scanner(System.in);
            System.out.println("What number would you like to fibb?");
            String input = inputObject.nextLine();

            if (input.equals("done")){
                run = false;
            }
            else{

                int toReturn = fibonacci(Integer.parseInt(input));
                System.out.println(toReturn);
            }
        }


    }

    public static int fibonacci(int input){

        // my version
        if (input == 0){  // 0 and 1 have to be hardcoded for this to work; i realized this after googling the normal solution
           return 0;
        } else if (input == 1) {
            return 1;
        // if 0 and one aren't hard coded the program returns 0
        } else if (input >= 2){
            return fibonacci(input - 1) + fibonacci(input -2 ); // as fibonacci is the sum of the two numbers before it
        }else {
            return input; // needed an else statement as i had else ifs
        }

        // internet version ( i searched up after )

//        if (input <= 1){
//            return input;
//        }
//        return fibonacci(input -1) + fibonacci(input -2);


    }
}