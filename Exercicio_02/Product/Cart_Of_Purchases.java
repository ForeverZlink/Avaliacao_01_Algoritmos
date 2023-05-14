package Product;

import java.util.ArrayList;
import java.util.UUID;

public class Cart_Of_Purchases {

    public ArrayList<Product_Model> products_intention_of_Purchase = new ArrayList<Product_Model>();

    public void Add_In_Cart(Product_Model product_to_add_In_Cart) {
        this.products_intention_of_Purchase.add(product_to_add_In_Cart);

    }

    public void Remove_Of_Cart(UUID Id_Purchase_Intention_Of_A_Product_To_Be_Removed) {
        int Index_Object_Counter = 0;
        for (Product_Model purchase_Intention_Of_A_Product : products_intention_of_Purchase) {
            if (purchase_Intention_Of_A_Product.Id == Id_Purchase_Intention_Of_A_Product_To_Be_Removed) {
                break;
            }
            Index_Object_Counter += 1;
        }
        products_intention_of_Purchase.remove(Index_Object_Counter);
    }

    public double Calculate_Total_of_Value_Of_Cart() {
        double value_total_of_The_cart = 0;
        for (Product_Model purchase_Intention_Of_A_Product : products_intention_of_Purchase) {
            value_total_of_The_cart += purchase_Intention_Of_A_Product.Price;
        }
        return value_total_of_The_cart;
    }

}
