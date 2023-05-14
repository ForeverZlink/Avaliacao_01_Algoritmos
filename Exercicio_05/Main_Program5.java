import utils.Inputs_Handler_Exercise5;
import utils.People;
import utils.Prescription;
import utils.Remedy;

//Um consultório médico lhe solicitou um aplicativo para emissão de receituário de pacientes.
//O funcionamento é o seguinte: o médico informa o nome do paciente e, a seguir, digita o nome e a dosagem dos remédios (remédio 1, 3x ao dia, remédio 2, 12 em 12 hs, etc.). 
//A leitura se encerra quando o médico digitar a palavra ?FIM? no nome do remédio. 
//Ao final, uma mensagem de sucesso deve ser apresentada ao médico e o programa terminar após a impressão do receituário digitado na tela. 
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

                  System.out.print("Digite agora o nome do "+counter+"° remédio (fim para encerrar): ");
                  String Name_Remedy = Input.Read_Input_String().strip();
                  if(Input.Must_Stop_Programa(Name_Remedy)){

                        break;
                  }else{
                        System.out.print("Digite agora a dosagem do "+counter+"° remédio: ");
                        String Dosage_Remedy = Input.Read_Input_String().strip();

                        Remedy New_Remedy_Prescription = new Remedy(Name_Remedy,Dosage_Remedy);
                        Prescription_Instance.Add_Remedy_To_Prescription(New_Remedy_Prescription);
                        counter++;

                  }


            }
            Pacient.Add_Prescription(Prescription_Instance);
            System.out.println("SUCESSO, PRESCRIÇÃO MÉDICA FEITA.");
            ShowPrescription(Pacient);




      }
      public static void ShowPrescription(People Pacient){
            String Message ="Segue abaixo o Receituário do paciente " +Pacient.Name;
            System.out.println(Message);
            System.out.println("\tNOME DO REMÉDIO                                   \tDOSAGEM");

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

