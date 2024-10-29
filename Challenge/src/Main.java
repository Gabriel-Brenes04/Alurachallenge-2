import java.util.Scanner;
import com.google.gson.GsonBuilder;


public class Main {


    public static void main(String[] args) {
        boolean verifier = false;
        do{
            Scanner escribir = new Scanner(System.in);
            System.out.println("******************");
            System.out.println("Conversor de monedas");
            System.out.println("*****************");
            System.out.println("1 - ARS - BOB");
            System.out.println("2 - BOB - ARS");
            System.out.println("3 - ARS - USD");
            System.out.println("4 - USD - ARS");
            System.out.println("5 - BOB - USD");
            System.out.println("6 - USD - BOB");

            System.out.println("*****************");
            System.out.println("Escoja una opcion para la moneda que desea convertir");
            String Div1 = escribir.nextLine();
            String Div2 = "";

            if (Div1.equals("1")) {
                Div1 = "ARS";
                Div2 = "BOB";
                verifier = true;
            }
            else if(Div1.equals("2")) {
                Div1 = "BOB";
                Div2 = "ARS";
                verifier = true;
            }
            else if (Div1.equals("3")) {
                Div1 = "ARS";
                Div2 = "USD";
                verifier = true;
            }
            else if (Div1.equals("4")) {
                Div1 = "USD";
                Div2 = "ARS";
                verifier = true;
            }
            else if (Div1.equals("5")) {
                Div1 = "BOB";
                Div2 = "USD";
                verifier = true;
            }
            else if (Div1.equals("6")) {
                Div1 = "USD";
                Div2 = "BOB";
                verifier = true;
            }
            else{
                System.out.println("Ingresaste un valor incorrecto");
            }

            System.out.println("Escriba el monto");
            int Monto = Integer.parseInt(escribir.nextLine());
            ExchangeRateResponse.getExchangeRate(Div1, Div2, Monto);

        }while(!verifier);




    }
}


