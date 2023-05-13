package modules.payments_context;

import java.util.Date;
import java.util.UUID;

public class Payments_Information_Model {
    private UUID Id_Payment;

    private Date Date_of_Transaction;
    private Double Quantity_Of_Money_Transaction;
    private String Id_User_Received_Payment;
    private String Id_User_Made_Payment;
    private Payments_Methods_Enum Payment_Method;
    public Payments_Information_Model(
            Double Quantity_Of_Money_Transaction,
            String Id_User_Received_Payment,
            String Id_User_Made_Payment,
            Payments_Methods_Enum Payment_Method
    ){
        this.Id_Payment = new UUID(0,0);
        this.Date_of_Transaction = new Date();
        this.Id_User_Received_Payment = Id_User_Received_Payment;
        this.Id_User_Made_Payment = Id_User_Made_Payment;
        this.Payment_Method = Payment_Method;
    }

    public Double GetterQuantity_Of_Money_Transaction(){return this.Quantity_Of_Money_Transaction;}



}
