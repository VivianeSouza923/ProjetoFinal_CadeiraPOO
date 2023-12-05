package questaoum;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Beisebol bola1 = new Beisebol();
        bola1.arremessar();
        bola1.marca = "Beisebolas";
        bola1.quicar();

        // Acesso à variável marca usando a referência à instância (bola1)
        System.out.println("A bola de beisebol é da marca " + bola1.marca + "." );
    }
}
