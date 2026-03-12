import java.util.Scanner;
/**
 * Classe principal, gerencia a interação com o usuário
 * 
 * @author Vitor Seiji Colombo Nishida
 * @author Pedro Cione Barbosa
 * @version 11/03/2026
 */
public class Principal {

    public static void main(String[] args) {

       // Calculadora calcBasico = new Calculadora();
        CalculadoraScien calcCientifico = new  CalculadoraScien();
        Utils util = new  Utils();
        Scanner sc = new Scanner(System.in);

        if(args.length == 0){
            System.out.printf("+: Soma\n-: Subtração\nx: Multiplicação\n/: Divisão\nsen: Seno\ncos: Cosseno\nfat: Fatorial\ninv: Inverso\n");
            System.out.print("Forneça a equação: ");
            String op = sc.nextLine();
            args = op.split(" ");
        }

        System.out.printf("Resultado: %.3f%n", calcCientifico.calcScien(args));

        sc.close();
    }
}
