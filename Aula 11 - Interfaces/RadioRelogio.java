import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RadioRelogio implements Radio, Relogio{
    public String ligar(){
        return "Rádio ligado.";
    }

    public String desligar(){
        return "Rádio desligado.";
    }

    public String trocarEstacao(float estacao){
        return "Mudando estação para: " + estacao;
    }

    public String getHoras(){
        // LocalTime horaAtual = LocalTime.now();
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        // return horaAtual.format(dtf);
        // ou:
           
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")); 
    }
}