import utils.Inputs_Handler;


//3.
//Um professor de matemática precisa de um software para ajudar no ensino de geometria.
// Sua ideia é ter uma ferramenta em que ele vai colocar as dimensões de um determinado polígono e o software apresentará as respectivas área e perímetro.
// Para testar sua ideia, ele optou por começar com retângulos e lhe pediu ajuda no desenvolvimento. 
//Assim sendo, faça um algoritmo que receba as dimensões de base e altura de um retângulo e, ao final, apresente os valores de seu perímetro e área.
public class Main_Program3{
      
      public static void main(String[] args){
         Inputs_Handler input = new Inputs_Handler();
         System.out.print("Digite a base do retangulo: ");
         double base = input.Read_Input_Of_Double();

         System.out.print("Digite a altura do retangulo: ");
         double height = input.Read_Input_Of_Double();
            
      }
}