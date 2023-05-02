import static java.lang.Thread.sleep;
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        Mundo m = new Mundo();
        m.geraPessoas();
        while (true) {
            m.desenhaMundo();
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(contador);
            contador++;
        }
    }
}