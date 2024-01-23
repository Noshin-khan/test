
 import java.util.Scanner;
 
 public class task2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ATM a=new ATM();
          int c;
          
        
       do{
        System.out.println("welcome to the ATM");
        System.out.println("*****ATM menu*****");
        System.out.println("1.cash withdraw");
                System.out.println("2.cash Deposit");
                  System.out.println("3.check Balance");
                  System.out.println("Enter your choice");
                  int choice=scan.nextInt();
                  switch(choice)
                  {
                    case 1:
                   a.withdraw();
                   break;
                   case 2:
                   a.Deposit();
                   break;
                    case 3:
                   a.checkbalance();
                   break;
                   default:
                    System.out.println("Invalid choice.");
                }
                System.out.println("you wants to continue");
                System.out.println("1.YES");
                System.out.println("2.NO");
                c=scan.nextInt();
              

            
               
            }
            while(c<=1);
         System.out.println("Thank you for using ATM");   

            
        }
                  }                 
class ATM{
    int balance=25000;
        int PIN=78654;
        int withdraw;
      Scanner scan=new Scanner(System.in);  

public void withdraw()
{    System.out.println("Enter the PIN");
                        int PIN1=scan.nextInt();
                    if(PIN1==PIN){
                        System.out.println("Enter Amount to withdrawl");
                        withdraw=scan.nextInt();
                         if(withdraw<=balance) 
                   {
                       balance=balance-withdraw;
                       System.out.println("please collect your amount");
                     System.out.println("your current balance is : " + balance);

                   }
                   else{
                       System.out.println("insufficient Balance");
                   }
                    }
                    else{
                        System.out.println("Incorrect PIN");
                    }
                }

                    public void Deposit(){
                        System.out.println("Enter amount to deposit");
                     int dep=scan.nextInt();
                     System.out.println("Enter the PIN");
                    int PIN1=scan.nextInt();
                    if(PIN1==PIN){
                        balance=balance+dep;
                        System.out.println("Amount is deposited Successfully");
                        System.out.println("your current balance is : "+ balance);
                    }
                    else{
                        System.out.println("Incorrect PIN");
                    }


                    }
                    public void checkbalance()
                    {   System.out.println("Enter the PIN");
                        int PIN1=scan.nextInt();
                    if(PIN1==PIN){
                        System.out.println("your's balance is : "+ balance);
                        

                    }
                    else{
                          System.out.println("Incorrect PIN");
                    }
                }
            }

                
                    


                


    

                              
    

