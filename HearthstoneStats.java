import java.util.*;

public class HearthstoneStats{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        //calculate the % chance of drawing a card in your opener
        System.out.print("How many of this card do you run in your deck?");
        int i = sc.nextInt();
        System.out.println();
        System.out.print("Are you going first? (y/n)");
        char c = sc.next().charAt(0);
        System.out.println();
        
        boolean invalid = false;
        int openerChance, drawChance;
        
        if(c.equals("y")){
            if(i = 0){
                openerChance = 0;
                drawChance = 0;
            }else if(i == 1){
                openerChance = (1/30 * 1/29 * 1/28)  //Is this math right?
            }else if(i == 2){
                
            }else{
                invalid = true;
            }
        }
        if(!invalid){
            System.out.println("The chance of having this card in your opening hand is " + openerChance);
            System.out.println("If you hard-mulligan, your chance of drawing that card is " + drawChance);
        }else{
            System.out.println("You entered an invalid card count!");
        }
    }
}