import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioDePulso implements Relogio { //a classe herda os métodos da interface
    public String getHoras(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        return horaAtual.format(dtf);
    }

    public String iniciarCronometro(){
        return "Iniciando cronômetro...";
    }
}
