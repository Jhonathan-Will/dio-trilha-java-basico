import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);

        String  entradaTexto  =   "";
        double  entradaNumero =    0;
        boolean ok            = false;

        do {
            System.out.print("Insira seu nome: ");
            entradaTexto = y.nextLine();

            if(!entradaTexto.matches("[a-zA-ZÀ-ÿ\\s]+")){
                System.out.println("Entrada invalida, pfv insira somente letras");
                ok = true;
            }else{
                ok = false;
                conta.setNomeCliente(entradaTexto.toUpperCase());
            }
        } while (ok);

        do {
            System.out.print("Insira o número de sua conta: ");
            entradaTexto = y.nextLine();

            if(!entradaTexto.matches("[0-9]+")){
                System.out.println("Entrada invalida, pfv insira somente números");
                ok = true;
            }else{
                ok = false;
                conta.setNumeroConta(Integer.valueOf(entradaTexto));
            }
        } while (ok);

        do {
            System.out.print("Insira o número de sua agência (somente números): ");
            entradaTexto = y.nextLine();

            if(!entradaTexto.matches("[0-9]+")){
                System.out.println("Entrada invalida, pfv insira somente números");
                ok = true;
            }else{
                ok = false;
                conta.setAgencia(formatarNumeroAgencia(entradaTexto));
            }
        } while (ok);

        x.close();
        y.close();
    }

    static String formatarNumeroAgencia(String texto){
        String parteUm = texto.substring(0, 2);
        String parteDois = texto.substring(3);

        return parteUm+"-"+parteDois;
    }
}
