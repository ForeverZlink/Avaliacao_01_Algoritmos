package payments_solutions;

import Client.Account_Informations;
public class Currency_Money_Payment extends Payments {
    private Double DISCOUNT_ALIQUOT = 10.0;
    public Currency_Money_Payment(Account_Informations Account_Receive_Payment, Account_Informations Account_Will_Make_Payment) {
        super(Account_Receive_Payment, Account_Will_Make_Payment);

    }
    public double Calculate_Price_With_Discount(double Quantity_Of_Money){
        double Discount_Value = (Quantity_Of_Money*DISCOUNT_ALIQUOT)/100;
        return Quantity_Of_Money - Discount_Value;
    }
}
