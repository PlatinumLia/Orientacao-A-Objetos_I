public class Utilizador{
    public static void main(String[] args) {
        System.out.println("[Relógio de pulso]");
        RelogioDePulso rp = new RelogioDePulso();
        System.out.println(rp.getHoras());
        System.out.println(rp.iniciarCronometro());

        //por padrão não pode instanciar uma interface
        // a menos que se faça na hora uma implementação dos métodos
        // recurso com uso restrito
        Relogio r = new Relogio() {
            public String getHoras(){
                return "Um horário qualquer";
            }
        };

        System.out.println("[Rádio relógio]");
        RadioRelogio rr = new RadioRelogio();
        System.out.println(rr.ligar());
        System.out.println(rr.getHoras());
        System.out.println(rr.trocarEstacao(estacao:101.8f));
        System.out.println(rr.desligar());
    }
}
