package payments_solutions;

import Client.Account_Informations;

public class Pix_Payment extends Payments {
    private Double DISCOUNT_ALIQUOT = 5.0;
    public Pix_Payment(Account_Informations Account_Receive_Payment, Account_Informations Account_Will_Make_Payment) {
        super(Account_Receive_Payment, Account_Will_Make_Payment);
    }
    public double Calculate_Price_With_Discount(double Quantity_Of_Money){
        double Discount_Value = (Quantity_Of_Money*DISCOUNT_ALIQUOT)/100;
        return Quantity_Of_Money - Discount_Value;
    }
    public double Getter_Discount_Aliquot(){
        return DISCOUNT_ALIQUOT;
    }
}
