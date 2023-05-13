package modules.payments_context;

import Client.Account_Informations;

public class Pix_Payment extends Payments {

    public Pix_Payment(Account_Informations Account_Receive_Payment, Account_Informations Account_Will_Make_Payment) {
        super(Account_Receive_Payment, Account_Will_Make_Payment);
    }

}
