import java.util.ArrayList;

public class Pessoa {
    private int x;
    private int y;
    private int cor;
    private String whatsappID;
    private ArrayList<String> AgendaContatos = new ArrayList<>();

    public Pessoa(int x, int y, int cor, String whatsappID){
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.whatsappID = whatsappID;
    }
}
