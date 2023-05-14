import java.util.ArrayList;

public class Mat {
    public ArrayList<Items> List_Of_Watchs_Passed_In_Mat = new ArrayList<Items>();

    public void Add_Item_Will_Pass_In_MaT(Items item_will_pass) {

        this.List_Of_Watchs_Passed_In_Mat.add(item_will_pass);

    }

    public boolean Verify_If_Its_Watch(Items item) {
        if (item.equals(Items.WATCH)) {
            this.Add_Item_Will_Pass_In_MaT(item);
            return true;
        } else {
            return false;
        }
    }

}
