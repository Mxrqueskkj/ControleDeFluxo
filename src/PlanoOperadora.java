import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Os Planos são (B)Basic,(M)Midia,(T)Turbo");
        System.out.print("Qual plano você gostaria?");
        String plano = entrada.next(); // B / M / T

        switch (plano){
            case "nao":{
                System.out.println("como vc n sabe meu filho");
            break;
            }
            case "T":{
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}