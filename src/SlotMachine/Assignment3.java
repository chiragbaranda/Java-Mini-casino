
package SlotMachine;

import java.util.Scanner;

/** 
* This is a main program of slot machine which contains a main method of program
* Program only ask user to input a quarter.
* when user play a turn automatically he's entering a 25 cents.
* Machine calculate the winning numbers and show as output
* User can see what are the fruits in the slots by pressing v1
* Program also show how much money left in machine and Also reload the machine to the initial value
*
* @author 000759867 CHIRAG BARANDA
*/
public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /*  Creating object of scanner*/
        CasinoSlotMachine sm1 = new CasinoSlotMachine(); /* Creating object of the machine 1*/
        CasinoSlotMachine sm2 = new CasinoSlotMachine(); /* Creating object of the machine 2*/
        String input; //single input from user
            System.out.println("P1 = Put a Quarter in Machine 1");
            System.out.println("P2 = Put a Quarter in Machine 2");
            System.out.println("V1 = View machine 1");
            System.out.println("V2 = View machine 2");
            System.out.println("C1 = Check machine 1 cash");
            System.out.println("C2 = Check machine 2 cash");
            System.out.println("R1 = Reload machine 1");
            System.out.println("R2 = Reload machine 2");
            System.out.print(">>>  ");
            input = sc.next();
        
        	/* according to user input this will give output */
            while (!input.equals("q") && !input.equals("Q")) /* loop will run untill user enters q or Q*/
            {
                


                switch (input)
                {
                   case "p1" :
                   case "P1" :
                            sm1.spin1();
                            break;
                   case "p2" :
                   case "P2" :
                            sm2.spin2();
                            break;
                    case "v1" :
                    case "V1" :
                            sm1.view();
                            break;
                    case "v2" :
                    case "V2" :
                            sm2.view();
                            break;
                    case "c1" :
                    case "C1" :
                            sm1.checkm1();
                            break;
                    case "c2" :
                    case "C2" :
                            sm2.checkm2();
                            break;
                    case "r1" :
                    case "R1" :
                            sm1.reloadm1();
                            break;
                    case "r2" :
                    case "R2" :
                            sm2.reloadm2();
                            break;
                    default:
                            System.out.println("Invalid Input!!! Try Again!!");
                            break;
                } //end of switch case
                System.out.println("\n\n");
                System.out.println("P1 = Put a Quarter in Machine 1");
                System.out.println("P2 = Put a Quarter in Machine 2");
                System.out.println("V1 = View machine 1");
                System.out.println("V2 = View machine 2");
                System.out.println("C1 = Check machine 1 cash");
                System.out.println("C2 = Check machine 2 cash");
                System.out.println("R1 = Reload machine 1");
                System.out.println("R2 = Reload machine 2");
                System.out.println("Q = Quit"); 
 
              System.out.print(">>>  ");    
              input = sc.next(); 

            } //end of while loop
          System.out.println("good bye! See you Again!s");
        } //end of main method
    } //end of class
