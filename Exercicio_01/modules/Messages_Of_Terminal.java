package modules;

public class Messages_Of_Terminal {
    public void Show_Welcome_Message(){
        String Messages_of_Welcome = "Bem vindo ao SchoolHigh Solutions!";
        System.out.println(Messages_of_Welcome);
    }
    public void Show_Message_To_User_Input_Quantity_Students_With_PWD(){
        String Message_To_User_Input_Quantity_Students_With_PWD="Por favor, digite a quantidade de alunos que possuem deficiência: ";
        System.out.print(Message_To_User_Input_Quantity_Students_With_PWD);
    }
    public void Show_Message_To_User_Input_Quantity_Students_With_Not_PWD(){
        String Message_To_User_Input_Quantity_Students_With_Not_PWD="Por favor, digite a quantidade de alunos que n?o possuem deficiência: ";
        System.out.print(Message_To_User_Input_Quantity_Students_With_Not_PWD);
    }
    public void Show_Total_of_Students_In_The_School(double Total_of_Students){
        String Message_Total_of_Students = String.format("O total de alunos que estudam na escola é: %d", Total_of_Students);
        System.out.println(Message_Total_of_Students);
    }
    public void Show_Total_of_Students_In_The_School_With_PWD_And_Percentage(double Students_With_PWD, Double Percentage){
        String Message_Total_of_Students = String.format(
            "O total de alunos que POSSUEM deficiência é de %.0f. Isso representa uma porcentagem de %.2f porcento do total de alunos.", 
                    Students_With_PWD,Percentage
            );
        System.out.println(Message_Total_of_Students);
    }
    public void Show_Total_of_Students_In_The_School_With_Not_PWD_and_Percentagem(double Students_With_Not_PWD, Double Percentage){
        String Message_Total_of_Students = String.format(
            "O total de alunos que NÃO POSSUEM deficiência é de %.0f. Isso representa uma porcentagem de %.2f porcento do total de alunos.", 
            Students_With_Not_PWD,Percentage
            );
        System.out.println(Message_Total_of_Students);
    }
}
