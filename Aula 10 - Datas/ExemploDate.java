import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate{
    public static void main(String[] args) {
        Date agora = new Date(); //pegando a data e horário local
        System.out.println("Agora: " + agora);

        /* SimpleDateFormat -> Formatação de Data 
         * ----------------
         * Símbolo  Significado
         *    y        Ano
         *    M        Mês 
         *    d        Dia 
         *    H        Hora 
         *    m        Minuto 
         *    s        Segundo
         *    E        Dia da semana 
        */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(agora); //extraindo a data do atributo "agora" com o a formatação "dd/MM/yyyy"
        System.out.println("Data formatada: " + dataFormatada);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("SHORT: " + df.format(agora));
        
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("MEDIUM: " + df.format(agora));
        
        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("LONG: " + df.format(agora));
    
        
    }
}
