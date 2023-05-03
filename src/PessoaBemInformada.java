import java.util.ArrayList;
import java.util.Random;

public class PessoaBemInformada extends Pessoa implements IMovable {

    public PessoaBemInformada(int x, int y, int cor, String whatsappID, int tempoImune, ArrayList<String> AgendaContatos) {
        super(x, y, cor, whatsappID, tempoImune, false, AgendaContatos);
    }

    @Override
    public void move() {
        Random rand = new Random();
        int direction = rand.nextInt(4);
        switch (direction) {
            case 0 -> { // direita
                if (this.getY() < 28) {
                    this.setY(this.getY() + 1);
                } else {
                    this.setY(27);
                }
            }
            case 1 -> { // esquerda
                if (this.getY() > 1) {
                    this.setY(this.getY() - 1);
                } else {
                    this.setY(1);
                }
            }
            case 2 -> { // cima
                if (this.getX() > 1) {
                    this.setX(this.getX() - 1);
                } else {
                    this.setX(1);
                }
            }
            case 3 -> { // baixo
                if (this.getX() < 58) {
                    this.setX(this.getX() + 1);
                } else {
                    this.setX(57);
                }
            }
        }
    }
}
