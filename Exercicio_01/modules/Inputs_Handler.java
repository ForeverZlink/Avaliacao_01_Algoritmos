package modules;

import java.util.Scanner;
import java.util.stream.Stream;

//Class to handler with inputs of users and the treatment of data.
public class Inputs_Handler {
    public Scanner Read_Input_Generic(){
        Scanner Input_of_User = new Scanner(System.in);
        return Input_of_User;
    }
    public double Read_Input_Of_Double(){

        while(true){
            
            Scanner input_of_user = this.Read_Input_Generic();
            double Input_of_User_As_Integer = this.Convert_Input_To_Double(input_of_user);

            if(Input_of_User_As_Integer == 0){
                continue;
            }
            return Input_of_User_As_Integer;

        }
        
    }
    public double Convert_Input_To_Double(Scanner input_of_user){
        double Input_of_User_As_Integer;
        try{
            Input_of_User_As_Integer  = Double.parseDouble(input_of_user.nextLine());
        }catch(Exception e){
            System.out.print("Digite apenas um número válido:");
            return 0;
        }
        return Input_of_User_As_Integer;
    }
}
