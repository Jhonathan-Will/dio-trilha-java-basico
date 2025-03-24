import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);

        String  entradaTexto  =   "";
        double  entradaNumero =    0;
        boolean ok            = true;

        do {
            System.out.print("Insira seu nome: ");
            entradaTexto = y.nextLine();

            if(!entradaTexto.matches("[a-zA-ZÀ-ÿ\\s]+")){
                System.out.println("Entrada invalida, pfv insira somente letras");
                ok = false;
            }else{
                ok = true;
                conta.setNomeCliente(entradaTexto.toUpperCase());
            }
        } while (ok);

        do {
            System.out.print("Insira o número de sua conta: ");
            entradaTexto = x.nextLine();

            if(!entradaTexto.matches("[0-9]+")){
                System.out.println("Entrada invalida, pfv insira somente números");
                ok = false;
            }else{
                ok = true;
                conta.setNumeroConta(Integer.valueOf(entradaTexto));
            }
        } while (ok);

        
        x.close();
        y.close();
    }
}
