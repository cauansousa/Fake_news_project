import java.util.ArrayList;

public class Pessoa {
    private int x;
    private int y;
    private int cor;
    private String whatsappID;
    private int tempoImune = 0;
    private ArrayList<String> AgendaContatos = new ArrayList<>();

    public Pessoa(int x, int y, int cor, String whatsappID){
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.whatsappID = whatsappID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public String getWhatsappID() {
        return whatsappID;
    }

    public void setWhatsappID(String whatsappID) {
        this.whatsappID = whatsappID;
    }

    public ArrayList<String> getAgendaContatos() {
        return AgendaContatos;
    }

    public void setAgendaContatos(ArrayList<String> agendaContatos) {
        AgendaContatos = agendaContatos;
    }

    public int getTempoImune() {return tempoImune;}

    public void setTempoImune(int tempoImune) {this.tempoImune = tempoImune;}
    @Override
    public String toString(){
        return "x: " + x + " y: " + y + " cor: " + cor + " whatsappID: " + whatsappID;
    }
}
