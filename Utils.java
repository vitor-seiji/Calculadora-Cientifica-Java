/**
 * Classe de funções utéis com métodos auxiliares
 * 
 * @author Vitor Seiji Colombo Nishida
 * @author Pedro Cione Barbosa
 * @version 11/03/2026
 */
public class Utils {

    public boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        boolean foundDecimal = false;
        int start = 0;

        // permite sinal negativo no início
        if (str.charAt(0) == '-' && str.length() > 1) {
            start = 1;
        }

        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                if (c == '.' && !foundDecimal) {
                    foundDecimal = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean tamanhoCerto(String[] str){
        if(str.length < 2 || str.length > 3){
            return false;
        }
        return true;
    }


}
