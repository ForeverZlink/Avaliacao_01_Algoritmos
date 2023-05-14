import payments_solutions.Payments_Methods_Enum;

import java.util.Scanner;

//Class to handler with inputs of users and the treatment of data.
public class Inputs_Handler {
    public Scanner Read_Input_Generic(){
        Scanner Input_of_User = new Scanner(System.in);
        return Input_of_User;

    }
    public Payments_Methods_Enum Read_Input_Of_Options_Of_Payments(){
        while (true){
            System.out.print("Digite qual será a forma de pagamento:");
            String Input = this.Read_Input_Generic().nextLine().toUpperCase();

            if(Payments_Methods_Enum.PIX.toString().equals(Input)){
                return Payments_Methods_Enum.PIX;

            }else if (Payments_Methods_Enum.CURRENCY.toString().equals(Input)) {
                return Payments_Methods_Enum.CURRENCY;
            }else {
                System.out.println("Digite apenas uma opção valida!");
            }
        }
    }
    public String Read_Input_String(){


            Scanner input_of_user = this.Read_Input_Generic();
            String Input_of_User_As_String = input_of_user.nextLine().toUpperCase();
            return Input_of_User_As_String;


    }
    public boolean Read_If_User_Confirm_Payment(){
        String Text_To_Confim_Operation = "S";
        System.out.print("Você deseja confirmar essa operação?(Digite S para sim)");
        if(Read_Input_String().equals(Text_To_Confim_Operation)){
            return true;
        }
        return false;
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
            System.out.print("Digite apenas um número v?lido:");
            return 0;
        }
        return Input_of_User_As_Integer;
    }
}
