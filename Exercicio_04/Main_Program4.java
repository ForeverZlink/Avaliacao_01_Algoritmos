import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

//Voc� foi contratado para desenvolver um algoritmo para ajudar uma ind�stria fabricante de rel�gios a contabilizar sua produ��o.
// A solu��o precisa contar cada pe�a produzida e, ao final, informar ao usu�rio o n�mero total.
// Quem faz a entrada de dados � um sensor que identifica cada rel�gio que passa na esteira.
// O algoritmo s� se encerra quando um item que n�o seja rel�gio for identificado. � neste momento que o total deve ser apresentado na tela.
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
                        System.out.println("Algo que n�o � um relogio acaba de passar. Parando esteira.");
                        break;

                  }
                  System.out.println("Um relogio acabou de passar na esteira...");





            }
            System.out.printf("Quantidade de rel�gios que passaram na esteira � de %d", mat_Instance.List_Of_Watchs_Passed_In_Mat.size());


            
      }
}

