package Product;

import java.util.UUID;

public class Product_Model {
    public UUID Id;
    public String Name;
    public double Price;
    public Product_Model(String Name, double Price){
        this.Id = new UUID(0,0);
        this.Price=Price;
        this.Name=Name;
    }
}
