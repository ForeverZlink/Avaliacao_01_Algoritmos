import Geometry.Rectangle;
import utils.Inputs_Handler;


//3.
//Um professor de matem?tica precisa de um software para ajudar no ensino de geometria.
// Sua ideia ? ter uma ferramenta em que ele vai colocar as dimens?es de um determinado pol?gono e o software apresentar? as respectivas ?rea e per?metro.
// Para testar sua ideia, ele optou por come?ar com ret?ngulos e lhe pediu ajuda no desenvolvimento. 
//Assim sendo, fa?a um algoritmo que receba as dimens?es de base e altura de um ret?ngulo e, ao final, apresente os valores de seu per?metro e ?rea.
public class Main_Program3{
      
      public static void main(String[] args){


         Inputs_Handler input = new Inputs_Handler();
         System.out.print("Digite a base do retangulo: ");
         double base = input.Read_Input_Of_Double();

         System.out.print("Digite a altura do retangulo: ");
         double height = input.Read_Input_Of_Double();

         Rectangle Rectangle_Instance = new Rectangle(base,height);
         String Message_Formated =String.format(
                 "O perimetro desse retangulo é %.2f e a sua área %.2f",
                 Rectangle_Instance.Calculate_Perimeter(),Rectangle_Instance.Calculate_Area()
         );
         System.out.println(Message_Formated);


            
      }
}