package utils;

import java.util.ArrayList;
import java.util.Collection;

public class Prescription {
    public Collection<Remedy> Prescription_Remedys = new ArrayList<Remedy>();

    public void Add_Remedy_To_Prescription(Remedy Remedy_To_Add){
        this.Prescription_Remedys.add(Remedy_To_Add);
    }
}
