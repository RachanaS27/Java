package Assignments;

public class Account {

    int accountNum;
    int balanceAmount = 25000;
    int withdrawAmount = 3000;
    public static void main(String[] args) throws InsufficientBalanceException{

        Account a1 =  new Account();
        a1.withdraw();
        
    }
    public void withdraw(){

        try{
            if(this.balanceAmount>=this.withdrawAmount)
            {
                balanceAmount = balanceAmount-withdrawAmount;
                System.out.println("balance amount is "+balanceAmount);
            }
            else{
                throw new InsufficientBalanceException("balance amount is not sufficient for withdraw");
            }
        }catch(InsufficientBalanceException e)
        {
            System.out.println(e);
        }
    }
    
}
