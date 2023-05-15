package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class People {
    UUID Id;
    public  String Name;
    public  Collection<Prescription> List_Of_Prescription;

    public People(String Name){
        this.Id = new UUID(0,0);
        this.Name= Name;
        this.List_Of_Prescription = new ArrayList<Prescription>();
    }
    public void Add_Prescription(Prescription prescription){
        this.List_Of_Prescription.add(prescription);
    }
}
