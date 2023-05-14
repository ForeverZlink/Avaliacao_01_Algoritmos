


//Problem 2

//Um artes?o que vende seus produtos em uma feira precisa de um sistema para registrar suas vendas. 
//Voc? decidiu ajud?-lo e vai escrever um algoritmo para obter o valor das vendas, e a respectiva forma de pagamento.
// No seu algoritmo, o usu?rio vai poder digitar o produto e o valor, repetidamente, at? que digite FIM no nome do produto.
//  Em seguida, ele ir? digitar a forma de pagamento. Se a forma escolhida for dinheiro, voc? aplicar? 10% de desconto.
//  Se o pagamento for feito com pix, aplicar? 5% de desconto. 
//Ap?s todas as leituras e c?lculos necess?rios, informe o valor final da venda ao negociante,
//mostrando o valor bruto e o valor com desconto (caso a forma de pagamento seja dinheiro ou pix), perguntando se ele confirma a opera??o. 
//Ap?s a resposta, diga a ele se a venda foi realizada com sucesso ou cancelada.

import Client.Account_Informations;
import Client.Client_Model;
import Product.Cart_Of_Purchases;
import Product.Product_Model;
import payments_solutions.*;



public class Main_Program2
{
      static String Text_To_Stop_Program= "FIM";
      static Inputs_Handler inputsHandler = new Inputs_Handler();


      public static void main(String[] args){
            while (true){
                  Cart_Of_Purchases cart = new Cart_Of_Purchases();
                  String Seller_Cpf = "000.123.413-22";
                  String Seller_Name = "Tiago";
                  String Seller_Complete_Name = "Torres";

                  Client_Model Seller = new Client_Model(
                          Seller_Cpf,Seller_Name,Seller_Complete_Name
                  );

                  Account_Informations Account_Seller = new Account_Informations(Seller);

                  String Buyer_Cpf = "000.222.222-22";
                  String Buyer_Name = "Andrew";
                  String Buyer_Complete_Name = "Torres";
                  Client_Model Buyer = new Client_Model(
                          Buyer_Cpf,Buyer_Name,Buyer_Complete_Name
                  );
                  Account_Informations Account_BUyer = new Account_Informations(Buyer);


                  System.out.println("Bem vindo ao Sistema de Vendas SZelda!");
                  Loop_Of_Insert_Products_And_Prices(cart);
                  Show_Method_Of_Payments();
                  Payments_Methods_Enum Type_of_Payment = inputsHandler.Read_Input_Of_Options_Of_Payments();

                  Payments payments_method = null;
                  Double Value_Total_To_Be_Pay = cart.Calculate_Total_of_Value_Of_Cart();
                  switch (Type_of_Payment){
                        case PIX:
                               payments_method = new Pix_Payment(Account_Seller,Account_BUyer);
                               break;


                        case CURRENCY :
                              payments_method = new Currency_Money_Payment(
                                      Account_Seller,Account_BUyer
                              );
                              break;


                  }
                  double Price_With_Discount= payments_method.Calculate_Price_With_Discount(Value_Total_To_Be_Pay);
                  Payments_Information_Model Payment_Informations = new Payments_Information_Model(
                          Price_With_Discount,Seller.Id.toString(),Buyer.Id.toString(),Type_of_Payment
                  );
                  Show_Informations_of_Operation(Value_Total_To_Be_Pay,Price_With_Discount,Type_of_Payment);
                  if(inputsHandler.Read_If_User_Confirm_Payment()){
                        payments_method.Make_Payment(Payment_Informations);
                        System.out.println("Venda registrada com SUCESSO.");
                  }else {
                        System.out.println("Venda cancelada.");
                  }

            }

      }
      static public void Loop_Of_Insert_Products_And_Prices(Cart_Of_Purchases cart){
            while (true){
                  System.out.print("Digite o nome do produto que você está vendendo (FIM para parar de adicionar): ");
                  String Product_Name = inputsHandler.Read_Input_String();

                  if(Product_Name.equals(Text_To_Stop_Program)){
                        break;
                  }
                  System.out.print("Agora digite qual é preço desse produto:R$");
                  double Price_Product = inputsHandler.Read_Input_Of_Double();

                  Product_Model Product_To_Add = new Product_Model(Product_Name,Price_Product);
                 cart.Add_In_Cart(Product_To_Add);

            }
      }
      static void Show_Informations_of_Operation(double Value_Total_Brute,double Value_With_Discount, Payments_Methods_Enum Type_of_Payment ){
            String Message_Format = String.format(
                    "O valor total bruto da venda é R$%.2f, o valor com disconto é R$%.2f e método de pagamento é %s"
                    , Value_Total_Brute, Value_With_Discount, Type_of_Payment.toString());
            System.out.println(Message_Format);
      }
      static public void Show_Method_Of_Payments(){
            System.out.println("Formas de pagamento disponíveis:");
            System.out.println("\tDescrição                    \tDesconto");
            for(Payments_Methods_Enum payment_method: Payments_Methods_Enum.values()){
                  String Message_Formated = String.format("\t%s                           \t%.2f porcento",payment_method.getDescricao(),payment_method.getValor());
                  System.out.println(Message_Formated);
            }
      }
}
