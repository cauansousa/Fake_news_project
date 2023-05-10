import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        Mundo m = new Mundo();
        m.geraPessoas();
        while (true) {
            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println("\033[47m \033[0m Tempo: " + contador);
            m.desenhaMundo();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            contador++;
        }
    }
}