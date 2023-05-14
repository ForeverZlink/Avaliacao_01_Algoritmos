package utils;

import java.util.Scanner;


//Class to handler with inputs of users and the treatment of data.
public class Inputs_Handler_Exercise5 {
    public Scanner Read_Input_Generic(){
        Scanner Input_of_User = new Scanner(System.in);
        return Input_of_User;
    }
    public String Read_Input_String(){
        var input = this.Read_Input_Generic();
        return  input.nextLine();
    }
    public boolean Must_Stop_Programa(String Input){
        String Text_To_Stop_Program  = "FIM";
        return Input.toUpperCase().equals(Text_To_Stop_Program);
    }
}
