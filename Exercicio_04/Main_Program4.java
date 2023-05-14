import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

//Você foi contratado para desenvolver um algoritmo para ajudar uma indústria fabricante de relógios a contabilizar sua produção.
// A solução precisa contar cada peça produzida e, ao final, informar ao usuário o número total.
// Quem faz a entrada de dados é um sensor que identifica cada relógio que passa na esteira.
// O algoritmo só se encerra quando um item que não seja relógio for identificado. É neste momento que o total deve ser apresentado na tela.
public class Main_Program4 {
      
      public static void main(String[] args) throws InterruptedException {
            ArrayList<Items> Items_to_Pass_In_Mat = new ArrayList<Items>();
            Items_to_Pass_In_Mat.add(Items.WATCH);
            Items_to_Pass_In_Mat.add(Items.WATCH);
            Items_to_Pass_In_Mat.add(Items.WATCH);
            Items_to_Pass_In_Mat.add(Items.WATCH);
            Items_to_Pass_In_Mat.add(Items.WATCH);
            Items_to_Pass_In_Mat.add(Items.OTHERS);
            Items_to_Pass_In_Mat.add(Items.WATCH);
            Mat mat_Instance = new Mat();

            for(Items item:Items_to_Pass_In_Mat ){
                  //to simulate a time of to a watch and another ;
                  Random random_Instance = new Random();
                  Timer timer = new Timer();
                  int Time_To_Pass_Watch = random_Instance.nextInt(5000);
                  Thread.sleep(Time_To_Pass_Watch);
                  boolean Its_Watch= mat_Instance.Verify_If_Its_Watch(item);
                  if(!Its_Watch){
                        System.out.println("Algo que não é um relogio acaba de passar. Parando esteira.");
                        break;

                  }
                  System.out.println("Um relogio acabou de passar na esteira...");





            }
            System.out.printf("Quantidade de relógios que passaram na esteira é de %d", mat_Instance.List_Of_Watchs_Passed_In_Mat.size());


            
      }
}

