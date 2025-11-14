public class bankAccount {
    //abt encapsulation or hidden data
    private final int accNum;
    private int accBal;
    public  bankAccount(int accNum, int accBal) {
        this.accNum = accNum;
        this.accBal = accBal;
        System.out.println("Your accNum is"+ accNum);
    }
    public void deposit(int addMoney){
        if(addMoney<0){
            System.out.println("You have added an invalid amount");
        }
        else {
            this.accBal = this.accBal+addMoney;
            System.out.println("You have deposited $"+addMoney+" to your accountNum "+accNum);

        }
    }

    public void withdraw(int withdrawMoney){
        if(withdrawMoney>accBal){
            System.out.println("withdraw exceeded");
        }
        else {
           this.accBal= this.accBal-withdrawMoney;
            System.out.println("Your remaining balance is:"+accBal);
        }
    }
}
