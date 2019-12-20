import java.util.Scanner;
public class Atm1
{
    public static void main(String[] args)
 {
     
     Scanner input= new Scanner(System.in);
     int pin = 0;
     int count =0;
     System.out.println("enter a pin ");
     do {
        pin = input.nextInt();
        if (count<3){
        System.out.println("count =" +count);
        System.out.println("enter your pin again");
        pin = input.nextInt();
        count++;
        }
        else {
        System.out.println("blocked");
        break;
        }
        }
     while(pin != 123);
     {
        
        if (pin == 123)
        {
        System.out.println("welcome to sunway");
        
         int balance = 10000, w_amt, d_amt;
     System.out.println("Enter 1 for balance check, 2 for withdrawl and 3 for deposite");
     int choice = input.nextInt();
     switch(choice)
     {
         case 1:
          System.out.println("your balance is"+ balance);
          break;
          case 2:
           System.out.println("enter amount to withdrawl");
           w_amt=input.nextInt();
          
           if(w_amt>balance )
           {
                System.out.println("insufficient balance");
                System.out.println("your balance is " + balance);
            }
            else 
            {
                 System.out.println("the amount is sucsessfully withdrawl");
                 balance=balance - w_amt;
                 System.out.println("your remaining balance" +balance);
                }
            break;
                
                case 3:
                 System.out.println("enter amount to deposite");
                 d_amt=input.nextInt();
                 balance = balance + d_amt;
                 System.out.println("your new amount is"+balance);
                 break;
                 default:
                 System.out.println("please enter a valid no.");
                 break;
                }
                System.out.println("Do you want print receipt press 0 for printed receipt! ");
                int receipt = input.nextInt();
                System.out.println("your balance is" + balance );
            }
        }
        }
        }
     
     
     
    
        
                 
           
     
     