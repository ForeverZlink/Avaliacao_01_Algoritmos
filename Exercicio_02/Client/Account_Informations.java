package Client;


import payments_solutions.Payments_Information_Model;


import java.util.ArrayList;
import java.util.Collection;

public class Account_Informations {
    private Client_Model Client;
    private double Value_Total_In_Account;
    private double Overdraft=0;
    private String Password;
    private Collection<Payments_Information_Model> Historic_of_Transactions;

    public Account_Informations(Client_Model Client){

        this.Client = Client;
        this.Historic_of_Transactions = new ArrayList<Payments_Information_Model>();
    }
    public boolean Add_Balance (Payments_Information_Model Payment_Information){
        try{

            this.Historic_of_Transactions.add(Payment_Information);
            this.Value_Total_In_Account +=Payment_Information.GetterQuantity_Of_Money_Transaction();
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public boolean Remove_Balance (Payments_Information_Model Payment_Information){
        double Quantity_to_be_Removed_Of_Account = Payment_Information.GetterQuantity_Of_Money_Transaction();

        this.Historic_of_Transactions.add(Payment_Information);
        this.Value_Total_In_Account -=Payment_Information.GetterQuantity_Of_Money_Transaction();
        return true;


    }
    private boolean Verify_If_Its_Possible_Remove_Balance_Of_Account (Double Quantity_To_Be_Removed){

        if(this.Value_Total_In_Account>0){
            Double Total_Available_To_Remove_Of_Account = this.Value_Total_In_Account + this.Overdraft;
            if(Total_Available_To_Remove_Of_Account>=Quantity_To_Be_Removed){
                return true;
            }
        }
        return false;
    }
}
