package Client;

import java.util.UUID;

public class Client_Model {
    public UUID Id;
    private String CPF;
    public String Name;
    public String Complete_Name;

    public Client_Model( String CPF, String Name, String Complete_Name){
        this.Complete_Name=Complete_Name;
        this.Id= new UUID(0,0);
        this.Name= Name;
        this.CPF = CPF;

    }



}
