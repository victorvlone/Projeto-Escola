package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class validações {

    public static boolean ValidacaoNome (String nome) {
        for (char c : nome.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return true;   
            }        
        }
        return false;
    }

    public static boolean ValidacaoCPF (String cpf) {
        for (char c : cpf.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ValidacaoData (String data){
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(data, formato);
            return true;
            
        } catch (Exception e) {
            return false;
        }

    }
    
}
