import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);


        double saldo = 25.0;
        System.out.println("Qaunto gostaria de sacar?: ");

        double valorSolicitado = entrada.nextDouble();

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo" + saldo);

        } else {
            System.out.println("Voce n tem saldo n fio ");
        }


    }
}
