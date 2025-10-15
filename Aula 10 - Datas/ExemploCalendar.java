import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar{
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);
        
        Calendar vencimento = agora;
        vencimento.add(Calendar.DATE, 7);
        System.out.println("Vencimento: " + vencimento);
        vencimento.add(Calendar.MONTH, -1);
        System.out.println("Novo vencimento: " + vencimento);
    
        //calendário gregoriano
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mês: " + gc.get(Calendar.MONTH));
        System.out.println("Dia do mês: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do mês: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia da semana no mês: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hora: " + gc.get(Calendar.HOUR));
        System.out.println("AM/PM: " + gc.get(Calendar.AM_PM));
        System.out.println("Hora do dia: " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
        System.out.println("Segundo: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data abreviada: " + df.format(gc.getTime())); 
        System.out.println("Vencimento: " + vencimento.getTime()); 
        System.out.println("Vencimento formatado: " + df.format(vencimento.getTime())); 
        
        //criar uma data específica
        System.out.println("Criar uma data específica");
        GregorianCalendar dtNascimento = new GregorianCalendar();
        dtNascimento.set(2006, Calendar.OCTOBER, 27);
        System.out.println("Aniversário: " + df.format(dtNascimento.getTime()));

        System.out.println("Criando uma data a partir de um String");
        String dataString = "19/05/2012";
        String[] vetDataString = dataString.split("/");
        dtNascimento.set(Calendar.YEAR, Integer.parseInt(vetDataString[2]));
        dtNascimento.set(Calendar.MONTH, Integer.parseInt(vetDataString[1]) - 1); //no mês precisa do "-1", pois começa em 0
        dtNascimento.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetDataString[0]));
        System.out.println("Nova data: " + df.format(dtNascimento.getTime()));

        //ou
        dtNascimento.set(Integer.parseInt(vetDataString[2]), Integer.parseInt(vetDataString[1]) - 1,Integer.parseInt(vetDataString[0]));
        System.out.println("Nova data: " + df.format(dtNascimento.getTime()));
    }
}