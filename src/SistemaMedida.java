
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);

        System.out.println("O tamanho da Blusa é P/M/G? ");
        String sigla = entrada.next();

        switch (sigla){
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
