import java.util.Random;

public class PessoaBemInformada extends Pessoa implements IMovable{

    public PessoaBemInformada(int x, int y, int cor, String whatsappID) {
        super(x, y, cor, whatsappID);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 5; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void move() {
        Random rand = new Random();
        int n = rand.nextInt();
        if(isPrime(n)){
            this.setX(this.getX()+1);
            this.setY(this.getY()+1);
        }else if(n % 10 == 0){
            this.setX(this.getX()-1);
            this.setY(this.getY()-1);
        } else if (n % 2 == 0) {
            this.setX(this.getX()+1);
            this.setY(this.getY()-1);
        }else{
            this.setX(this.getX()-1);
            this.setY(this.getY()+1);
        }
    }
}
