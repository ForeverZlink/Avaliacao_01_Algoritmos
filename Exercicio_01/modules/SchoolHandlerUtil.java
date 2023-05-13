package modules;

public class SchoolHandlerUtil {
    public double Quantity_of_Students_With_Not_Pwd;
    public double Quantity_of_Students_With_PwD;
    public double Quantity_Total_of_Students;

    //constructor
    public SchoolHandlerUtil(double Quantity_of_Students_With_Not_Pwd, double Quantity_of_Students_With_PwD){
        this.Quantity_of_Students_With_Not_Pwd =Quantity_of_Students_With_Not_Pwd;
        this.Quantity_of_Students_With_PwD  =Quantity_of_Students_With_PwD;
        this.Quantity_Total_of_Students = this.Quantity_of_Students_With_Not_Pwd + this.Quantity_of_Students_With_PwD;
    }
    public double Calculate_Percentage (double Value_To_Be_Compared_With_Percentage ){
        double Percentage = (Value_To_Be_Compared_With_Percentage*100)/Quantity_Total_of_Students;
        return Percentage;
    }
    public double Calculate_Percentage_of_Students_With_PwD_Compared_With_Quantity_Total_Of_Students(){
        
        double Percentage_Students_With_Pwd = this.Calculate_Percentage(this.Quantity_of_Students_With_PwD);
        return Percentage_Students_With_Pwd;
    }
    public double Calculate_Percentage_of_Students_With_Not_PwD_Compared_With_Quantity_Total_Of_Students(){

        double Percentage_Students_With_Not_Pwd =this.Calculate_Percentage(this.Quantity_of_Students_With_Not_Pwd);
        return Percentage_Students_With_Not_Pwd;
    }
}
