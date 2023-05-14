package payments_solutions;

import Client.Account_Informations;



public  class Payments {
    public Payments(Account_Informations Account_Receive_Payment, Account_Informations Account_Will_Make_Payment ){
        this.Account_Will_Make_Payment= Account_Will_Make_Payment;
        this.Account_Receive_Payment = Account_Receive_Payment;
    }
    private Account_Informations Account_Receive_Payment;
    private Account_Informations Account_Will_Make_Payment;
    public boolean Make_Payment(Payments_Information_Model PaymentsInformation ){

        boolean Success_Make_Payment= Account_Will_Make_Payment.Remove_Balance(PaymentsInformation);
        boolean Success_Receive_Payment= Account_Receive_Payment.Add_Balance(PaymentsInformation);
        if(Success_Make_Payment && Success_Receive_Payment){
            return true;
        }
        return false;


    }
    public double Calculate_Price_With_Discount(double Value_To_Calculate){
        return 0;
    }




}
