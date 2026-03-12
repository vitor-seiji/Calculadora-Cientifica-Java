/**
 * Calculadora básica com operações de adição, subtração, multiplicação e divisão
 * 
 * @author Vitor Seiji Colombo Nishida
 * @author Pedro Cione Barbosa
 * @version 11/03/2026
 */
public class Calculadora{

    public Calculadora() { }

    Utils util = new  Utils();

    public double calcular(String[] str){
        if(util.isNumeric(str[0]) && util.isNumeric(str[2])){
                double a = Double.parseDouble(str[0]);
                double b = Double.parseDouble(str[2]);
                switch (str[1]) {
                    case "+":
                        return a + b;
                    case "-":
                        return a - b;
                    case "x":
                        return a * b;
                    case "/":
                        if (b == 0) {
                            System.out.println("Divisão impossivel");
                            System.exit(1);
                        }
                        else {
                            return a / b;
                        }
                    default:
                        System.out.println("Operador inválido");
                        System.exit(1);
                }
            }
        else{
            System.out.println("Parâmetros inválidos");
            System.exit(1);
        }

        throw new IllegalStateException("Erro no cálculo");//caso algo dê muito errado
    }



}
