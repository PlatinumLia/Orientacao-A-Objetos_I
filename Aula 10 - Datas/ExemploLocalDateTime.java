import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime{
    public static void main(String[] args){
        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime horaData = LocalDateTime.now();
        System.out.println(horaData);

        //formatação das datas
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //com hora e minuto: DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        System.out.println("Data formatada: " + data.format(formatoData));

        //calcular datas e horas
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Hoje: " + hoje.format(formatoData));
        System.out.println("Amanha: " + amanha.format(formatoData));

        LocalTime horaAtual = LocalTime.now();
        LocalTime menosUmaHora = horaAtual.minusHours(1);

        //formatação das datas
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora atual: " + horaAtual.format(formatoHora));
        System.out.println("Menos uma hora: " + menosUmaHora.format(formatoHora));

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(5).minusHours(12).plusMinutes(5);
        
        //formatação de data e hora juntas
        DateTimeFormatter formatoDatahora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Agora: " + agora.format(formatoDatahora));
        System.out.println("Futuro: " + futuro.format(formatoDatahora));

        //comparar
        if(agora.equals(futuro)){}

        //criar uma data específica
        LocalDate minhaData = LocalDate.parse("21/05/2018", formatoData);
        System.out.println("Minha data: " + minhaData);
        System.out.println("Minha data: " + minhaData.format(formatoData));
    }
}
