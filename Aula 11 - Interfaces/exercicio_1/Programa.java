import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa{
    BufferedReader reader;
    public static void main(String[] args) throws Exception{
        Programa p = new Programa();
        p.reader = new BufferedReader(new InputStreamReader(System.in));
        p.menu();
    }

    private void menu() throws Exception{
        String opc = "";

        while(!opc.equals("4")){ 
            System.out.println("====================");
            System.out.println("[1]. Calcular área do Quadrado");
            System.out.println("[2]. Calcular área do Retângulo");
            System.out.println("[3]. Calcular área do Círculo");
            System.out.println("[4]. Sair.");
            System.out.println();
            System.out.println("Sua opção:");

            opc = reader.readLine();

            switch(opc){
                case "1": areaQuadrado();
                case "2": areaRetangulo();
                case "3": areaCirculo();
                case "4": System.out.println("SAINDO...");
                default:
                    break;
            }
        }
    }

    private void areaQuadrado() throws IOException{
        Quadrado quad = new Quadrado();
        System.out.println("Lado um do quadrado: ");
        quad.setLadoUm(Float.parseFloat(reader.readLine()));
        System.out.println("Lado dois do quadrado: ");
        quad.setLadoDois(Float.parseFloat(reader.readLine()));

        System.out.println("Área total: " + quad.calcularArea());
    }

    private void areaRetangulo() throws IOException{
        Retangulo ret = new Retangulo();
        System.out.println("Base do retângulo:");
        ret.setBase(Float.parseFloat(reader.readLine()));
        System.out.println("Altura do retângulo:");
        ret.setAltura(Float.parseFloat(reader.readLine()));

        System.out.println("Área total: " + ret.calcularArea());
    }

    private void areaCirculo() throws IOException{
        Circulo circ = new Circulo();
        System.out.println("Raio do círculo:");
        circ.setRaio(Float.parseFloat(reader.readLine()));

        System.out.println("Área total: " + circ.calcularArea());
    }
}