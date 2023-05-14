import utils.Inputs_Handler_Exercise5;
import utils.People;
import utils.Prescription;
import utils.Remedy;

//Um consult�rio m�dico lhe solicitou um aplicativo para emiss�o de receitu�rio de pacientes.
//O funcionamento � o seguinte: o m�dico informa o nome do paciente e, a seguir, digita o nome e a dosagem dos rem�dios (rem�dio 1, 3x ao dia, rem�dio 2, 12 em 12 hs, etc.). 
//A leitura se encerra quando o m�dico digitar a palavra ?FIM? no nome do rem�dio. 
//Ao final, uma mensagem de sucesso deve ser apresentada ao m�dico e o programa terminar ap�s a impress�o do receitu�rio digitado na tela. 
//Apresente um algoritmo que resolva o problema apresentado. 
public class Main_Program5 {
      
      public static void main(String[] args) throws InterruptedException {
            Inputs_Handler_Exercise5 Input = new Inputs_Handler_Exercise5();

            System.out.print("Digite o nome do paciente: ");
            String Name_Patient = Input.Read_Input_String();
            People Pacient = new People(Name_Patient);
            Prescription Prescription_Instance= new Prescription();
            int counter = 1;
            while (true){

                  System.out.print("Digite agora o nome do "+counter+"� rem�dio (fim para encerrar): ");
                  String Name_Remedy = Input.Read_Input_String().strip();
                  if(Input.Must_Stop_Programa(Name_Remedy)){

                        break;
                  }else{
                        System.out.print("Digite agora a dosagem do "+counter+"� rem�dio: ");
                        String Dosage_Remedy = Input.Read_Input_String().strip();

                        Remedy New_Remedy_Prescription = new Remedy(Name_Remedy,Dosage_Remedy);
                        Prescription_Instance.Add_Remedy_To_Prescription(New_Remedy_Prescription);
                        counter++;

                  }


            }
            Pacient.Add_Prescription(Prescription_Instance);
            System.out.println("SUCESSO, PRESCRI��O M�DICA FEITA.");
            ShowPrescription(Pacient);




      }
      public static void ShowPrescription(People Pacient){
            String Message ="Segue abaixo o Receitu�rio do paciente " +Pacient.Name;
            System.out.println(Message);
            System.out.println("\tNOME DO REM�DIO                                   \tDOSAGEM");

            for(Prescription prescription : Pacient.List_Of_Prescription){
                  for (Remedy Remedy: prescription.Prescription_Remedys){
                        String Message_Formated = String.format(
                                "\t%s                                             %s ",Remedy.Name_Remedy,Remedy.Dosage
                        );
                        System.out.println(Message_Formated);
                  }

            }
      }
}

