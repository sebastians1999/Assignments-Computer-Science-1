import java.util.Scanner;



public class RPSLO_copy {

    public static void main(String[] args) {
        System.out.println("Enter your play: R, P, S, L, O");
        Scanner scanner = new Scanner(System.in);
           // Write your code below
          char users_play = scanner.next().charAt(0);
          //System.out.println("> "+users_play);
          if((users_play == 'r')||(users_play == 'p')||(users_play == 's')||(users_play == 'l')||(users_play == 'o')||(users_play == 'R')||(users_play == 'P')||(users_play == 'S')||(users_play == 'L')||(users_play == 'O'))
         {
               char computers_choice = computers_choice();
               System.out.println("Computers play is "+computers_choice);
               users_play = Character.toLowerCase(users_play); //preparing the input of the user for swtich case statement which can only work with non capital letters
               char winner = 't';
             switch(users_play)
             {
                    case ('s'):
                     if(computers_choice=='p'||computers_choice=='P') winner = 'u';
                         else if(computers_choice=='L') winner = 'u';
                         else if(computers_choice=='O') winner = 'c';
                         else if(computers_choice=='R') winner = 'c';
                         else if(computers_choice=='S') winner = 't';
                   break;
               
                case ('p'):
                    if(computers_choice=='R') winner = 'u';
                         else if(computers_choice=='O') winner = 'u';
                         else if(computers_choice=='S') winner = 'c';
                         else if(computers_choice=='L') winner = 'c';
                         else if(computers_choice=='P') winner = 't';
                     break;
                 case ('r'):
                     if(computers_choice=='L') winner = 'u';
                         else if(computers_choice=='S') winner = 'u';
                         else if(computers_choice=='P') winner = 'c';
                         else if(computers_choice=='O') winner = 'c';
                         else if(computers_choice=='P') winner = 't';
                     break;  
                   case ('l'):
                       if(computers_choice=='O') winner = 'u';
                            else if(computers_choice=='P') winner = 'u';
                            else if(computers_choice=='R') winner = 'c';
                            else if(computers_choice=='L') winner = 'c';
                            else if(computers_choice=='L') winner = 't';
                      break;
                   case ('o'):
                       if(computers_choice=='S') winner = 'u';
                               else if(computers_choice=='R') winner = 'u';
                               else if(computers_choice=='P') winner = 'c';
                               else if(computers_choice=='L') winner = 'c';
                               else if(computers_choice=='O') winner = 't';
                    break;       
              }
              if(winner=='c') System.out.println("You win!");
              else if(winner=='u')System.out.println("Computer wins!");
              else if(winner=='t')System.out.println("It is a tie!");
        }  
        else System.out.println("\nInvalid input (valid inputs: R, P, S, L, O)");
       }// Write your code above
   public static char computers_choice()
   {

       int choice_value = (int)(Math.random()*(4-0+1)+0);
       char choice;
       switch(choice_value)
       {
           case 0: 
               choice = 'R';
               break;
           case 1:
               choice = 'P';
               break;
           case 2:
               choice = 'S';
               break;
           case 3:
               choice = 'L';
               break;
           case 4:
               choice = 'O';
               break;
           default: 
               choice = 'e';
               break;   
       }
       return choice;
   }
    
}
