package SlotMachine;
/*
+------------------------------+
+           slotMachine        +
+------------------------------+
+  +machine_Cash : double = 100+
+  +reloadmachine 1 : double   +             
+  +machine_Cash : double = 200+
+  +reloadmachine 1 : double   +                   
+  +win1 : double = 0.00       +   
+  +win2: double  = 2.00       +                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
+  +win3 :  double = 10.00     +                                                                      
+  +index0: int                +
+  +inex1: int                 +
+  +index2: int		       +
+  quarter: double	       +
+------------------------------+
+  spin1() : void	       +
+  spin1() : void	       +
+  view() : void	       +
+  check() : void	       +
+  reload() : void             +
+------------------------------+

*/


import java.util.Random;

/** This class describe the casino slot machine, which ask user to enter quarter and then play by it self
 * user can play a game on machine,
 *
 * @author 000759867 CHIRAG BARANDA
 */
public class CasinoSlotMachine 
{
    /**  Initial cash in machine 1**/
    double Machine1_Cash = 100.00;
    /** Initial cash when machine reloaded (machine defalut value)**/
    double reloadMachine1= Machine1_Cash;
    
    /**Initial cash in machine 2 **/
    double Machine2_Cash = 200.00;
    /** Machine 2 defalut cash**/
    double reloadMachine2= Machine2_Cash;
    
    double winning_Price; /**Wining price **/
    final static int MAX = 7; /** Static value MAX **/
    final static double win1=0; /** Winning price 1 : $0 **/
    final static double win2=2; /** Winning price 2: $2**/
    final static double win3=10; /** Winning price 3: $10 **/
    int index0 = 9,index1= 9,index2= 9; /**Defining 3 slots of machine, in which the fruit numbers will randomixe **/
    
    
    double quarter = 0.25; /** Value of Quarter**/
    Random random= new Random(MAX); /** creating random value for user turn **/
    
    public void spin1() /** spin1 method where different methods will be generated **/
    {
        System.out.println("spin method!");
        Machine1_Cash= Machine1_Cash + quarter; //add quarter to machine money
        //random function for 3 variable
        index0 = random.nextInt(MAX); /** 1st sloat random value, fruit **/
        index1 = random.nextInt(MAX); /** 2nd sloat random value, fruit **/ 
        index2 = random.nextInt(MAX);/** 3rd sloat random value, fruit **/
        
        /**  **/
        /** Checking the winning conditions, ow user will get price as per his paliyng numbers **/
        
        if (index0 != index1 && index0 != index2 && index1 != index2)
           {
               System.out.println("You have won $0");
           }
           else if (index0 == index1 || index0 == index2 || index1 == index2)
           {
               System.out.println("Congratulations, you have won $" + win2);
                  winning_Price += win2;
                  Machine1_Cash = Machine1_Cash - win2;
           }
           else if (index0 == index1 && index0 == index2 && index0 != 0)
           {
               System.out.println("Congratulations, you have won $" + win3);
                  winning_Price += win3;
                  Machine1_Cash = Machine1_Cash - win3;
           }
        
        
    }
	
	public void spin2() /** spin2 method where different methods will be generated **/
    {
        System.out.println("spin method!");
        Machine2_Cash= Machine2_Cash + quarter; //add quarter to machine money
        //random function for 3 variable
        index0 = random.nextInt(MAX); /** 1st slot random value, fruit **/
        index1 = random.nextInt(MAX); /** 2nd slot random value, fruit **/ 
        index2 = random.nextInt(MAX);/** 3rd slot random value, fruit **/
        
        /**  **/
        /** Checking the winning conditions, ow user will get price as per his playing numbers **/
        
        if (index0 != index1 && index0 != index2 && index1 != index2)
           {
               System.out.println("You have won $0");
           }
           else if (index0 == index1 || index0 == index2 || index1 == index2)
           {
               System.out.println("Congratulations, you have won $" + win2);
                  winning_Price += win2;
                  Machine2_Cash = Machine2_Cash - win2;
           }
           else if (index0 == index1 && index0 == index2 && index0 != 0)
           {
               System.out.println("Congratulations, you have won $" + win3);
                  winning_Price += win3;
                  Machine2_Cash = Machine2_Cash - win3;
           }
        
        
    }
	
    /** View the Numbers you get in the slots **/
    public void view()
    {
        System.out.println("view method");
        switch(index0)
        {
            case 0: System.out.print(" APPLE "); break;
            case 1: System.out.print(" CHERRY ");  break;
            case 2: System.out.print(" GRAPES ");  break;
            case 3: System.out.print(" LEMON ");  break;
            case 4: System.out.print(" ORANGE ");  break;
            case 5: System.out.print(" PEAR ");  break;
            case 6: System.out.print(" WATERMELON ");  break;
            default: System.out.println("Invalid choice,Quarter required for playing");
        }
        switch(index1)
        {
            case 0: System.out.print(" APPLE "); break;
            case 1: System.out.print(" CHERRY ");  break;
            case 2: System.out.print(" GRAPES ");  break;
            case 3: System.out.print(" LEMON ");  break;
            case 4: System.out.print(" ORANGE ");  break;
            case 5: System.out.print(" PEAR ");  break;
            case 6: System.out.print(" WATERMELON ");  break;
        }
        switch(index2)
        {
            case 0: System.out.print(" APPLE "); break;
            case 1: System.out.print(" CHERRY ");  break;
            case 2: System.out.print(" GRAPES ");  break;
            case 3: System.out.print(" LEMON ");  break;
            case 4: System.out.print(" ORANGE ");  break;
            case 5: System.out.print(" PEAR ");  break;
            case 6: System.out.print(" WATERMELON ");  break;
        }
        System.out.println("");
    }
   
	
    /** check machine 1 cash **/
    public void checkm1()
    {
        
        System.out.println("check method");
        System.out.println("Machine cash "+Machine1_Cash);
    }
    /** check machine cash 2 **/
    public void checkm2()
    {
        
        System.out.println("check method");
        System.out.println("Machine cash "+Machine2_Cash);
    }
    /**  reload machine 1**/
    public void reloadm1()
    {
        //System.out.println("reload method");
        Machine1_Cash = reloadMachine1;
        System.out.println("Machine 1 reloaded!");
        //System.out.println("machine cash: "+ Machine1_Cash);
    }
    /** reload  machine 2 **/
    public void reloadm2()
    {
        //System.out.println("reload method");
        Machine1_Cash = reloadMachine2;
        System.out.println("Machine 2 reloaded!");
        //System.out.println("machine cash: "+ Machine2_Cash);
    }
    

    
    
}



