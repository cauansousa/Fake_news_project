import java.util.Random;

public class PessoaBemInformada extends Pessoa implements IMovable{

    public PessoaBemInformada(int x, int y, int cor, String whatsappID) {
        super(x, y, cor, whatsappID);
    }

    @Override
    public void move() {
        Random rand = new Random();
        int direction = rand.nextInt(8);
        switch (direction) {
            case 0 -> { // direita
                if (this.getX() < 27) {
                    this.setX(this.getX() + 1);
                } else {
                    this.setX(27);
                }
            }
            case 1 -> { // esquerda
                if (this.getX() > 1) {
                    this.setX(this.getX() - 1);
                } else {
                    this.setX(1);
                }
            }
            case 2 -> { // cima
                if (this.getY() > 1) {
                    this.setY(this.getY() - 1);
                } else {
                    this.setY(1);
                }
            }
            case 3 -> { // baixo
                if (this.getY() < 57) {
                    this.setY(this.getY() + 1);
                } else {
                    this.setY(57);
                }
            }
        }
    }
}
