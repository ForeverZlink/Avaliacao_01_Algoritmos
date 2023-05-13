

import modules.*;

//Problem 1.
//Uma escola precisa fazer um levantamento do quantitativo de alunos com deficiência (PCD) para tomar algumas decis?es estratégicas. 
//Você foi contratado para projetar um algoritmo que obtenha o número total de alunos dessa escola e também quantos desses possuem necessidades especiais.
// Ao final, calcule e apresente o percentual de PCD?s dentre o total de alunos.///

public class Main_Program{
      
      public static void main(String[] args){
            
            Inputs_Handler Input_Handler = new Inputs_Handler();
            Messages_Of_Terminal Messages_Handler_Terminal = new Messages_Of_Terminal();
            
            
            
            Double Quantity_of_Students_With_No_PWD;
            Double Quantity_Of_Students_With_PWD;
            Double  Percentage_Of_Students_With_PWD;
            Double  Percentage_of_Students_With_Not_Pwd;
            
            Messages_Handler_Terminal.Show_Welcome_Message();
            Messages_Handler_Terminal.Show_Message_To_User_Input_Quantity_Students_With_Not_PWD();
            Quantity_of_Students_With_No_PWD = Input_Handler.Read_Input_Of_Double();
            Messages_Handler_Terminal.Show_Message_To_User_Input_Quantity_Students_With_PWD();
            Quantity_Of_Students_With_PWD = Input_Handler.Read_Input_Of_Double();
            
            SchoolHandlerUtil schoolHandlerUtil = new SchoolHandlerUtil(
                  Quantity_of_Students_With_No_PWD, Quantity_Of_Students_With_PWD
                  );

            Percentage_of_Students_With_Not_Pwd = schoolHandlerUtil.Calculate_Percentage_of_Students_With_Not_PwD_Compared_With_Quantity_Total_Of_Students();
            Percentage_Of_Students_With_PWD = schoolHandlerUtil.Calculate_Percentage_of_Students_With_PwD_Compared_With_Quantity_Total_Of_Students();
            Messages_Handler_Terminal.Show_Total_of_Students_In_The_School_With_Not_PWD_and_Percentagem(Quantity_of_Students_With_No_PWD, Percentage_of_Students_With_Not_Pwd);
            Messages_Handler_Terminal.Show_Total_of_Students_In_The_School_With_PWD_And_Percentage(Quantity_Of_Students_With_PWD, Percentage_Of_Students_With_PWD);
                
            

            
      }
}