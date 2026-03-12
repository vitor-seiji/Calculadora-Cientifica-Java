/**
 * Calculadora científica com operações de cálculo de fatorial, cosseno, seno e inverso
 * 
 * @author Vitor Seiji Colombo Nishida
 * @author Pedro Cione Barbosa
 * @version 11/03/2026
 */
public class CalculadoraScien {
    public CalculadoraScien() {}

    Utils util = new  Utils();
    Calculadora calc = new Calculadora();

    public double calcScien(String[] str){
        if(util.tamanhoCerto(str)){
            if(str.length == 3){
                return calc.calcular(str);
            }
            else{
                if(util.isNumeric(str[1])){
                    double a = Double.parseDouble(str[1]);
                    switch(str[0]){
                        case "cos":
                            //a = Double.parseDouble(str[1]);
                            a = Math.toRadians(a);
                            return Math.cos(a);
                        case "sen":
                            // a = Double.parseDouble(str[1]);
                            a = Math.toRadians(a);
                            return Math.sin(a);
                        case "inv":
                            //a = Double.parseDouble(str[1]);
                            if(a == 0){
                                System.out.println("Inverso de 0 impossível");
                                System.exit(1);
                            }
                            else{
                                return 1/a;
                            }
                        case "fat":
                            if (a < 0 || a != Math.floor(a)) {
                                System.out.println("Fatorial inválido: utilize inteiros não negativos");
                                System.exit(1);
                            }
                            return fat(a);
                        default:
                            System.out.println("Operador inválido");
                            System.exit(1);
                    }
                }else{
                    System.out.println("Parâmetros inválidos");
                    System.exit(1);
                }

            }

        }
        else{
            System.out.println("Parâmetros inválidos");
            System.exit(1);
        }

        throw new IllegalStateException("Erro no cálculo");//caso algo dê muito errado
    }


    public double fat(double n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fat(n - 1);
    }
}
