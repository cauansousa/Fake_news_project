import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Mundo {
    public int[][] mundo = new int[][]{
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//1
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//2
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//3
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//4
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//5
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//6
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//7
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//8
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//9
            {1,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//10
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//11
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//12
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//13
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},//14
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},//15
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},//16
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},//17
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,4,4,4,4,4,4,4,4,0,0,0,0,0,0,0,1},//18
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//19
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//20
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//21
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//22
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//23
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//24
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//25
            {1,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//26
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//27
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//28
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//29
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}//30
    };

    private ArrayList<Pessoa> pessoas;
    private void setPessoas(ArrayList<Pessoa> pessoas) {this.pessoas = pessoas;}

    public void geraPessoas(){
        int numeroPessoas = 100;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < numeroPessoas; i++){
            pessoas.add(new PessoaBemInformada(rand.nextInt(57)+1,rand.nextInt(27)+1, 6, String.valueOf(i+100), 0, new ArrayList<>()));
        }
        setPessoas(pessoas);
    }

    public int[][] desenhaPessoas(ArrayList<Pessoa> pessoas) {
        int[][] mapa = new int[this.mundo.length][60];
        for (int i = 0; i < mapa.length; i++) {
            System.arraycopy(mundo[i], 0, mapa[i], 0, mundo[i].length);
        }
        pessoas.forEach(p -> mapa[p.getY()][p.getX()] = p.getCor());
        return mapa;
    }

    public Pessoa checaPessoas(Pessoa p){
        if((p.getX() >= 42 && p.getX() <= 52) && (p.getY() >= 12 && p.getY() <= 18)){
            if(p instanceof PessoaBemInformada){
                return new PessoaMalInformada(p.getX(), p.getY(), 7, p.getWhatsappID(), p.getTempoImune(), p.getAgendaContatos());
            }
            p.setTempoImune(31);
            return null;
        }else if (p.getTempoImune() == 0) {
            if(p.getX() >=7 && p.getX() <= 20){
                if(p.getY() >= 2 && p.getY() <= 10){
                    if (p instanceof PessoaBemInformada) {
                        Pessoa p1 = new PessoaMalInformada(p.getX(), p.getY(), 5, p.getWhatsappID(), p.getTempoImune(), p.getAgendaContatos());
                        checaAgenda(p1);
                        return p1;
                    }
                } else if (p.getY() >= 18 && p.getY() <= 26) {
                    if (p instanceof PessoaMalInformada) {
                        Pessoa p1 = new PessoaBemInformada(p.getX(), p.getY(), 6, p.getWhatsappID(), p.getTempoImune(), p.getAgendaContatos());
                        checaAgenda(p1);
                        return p1;
                    }
                }
            }
//            for(Pessoa pessoa : this.pessoas){
//                if(pessoa.getTempoImune() == 0) {
//                    if (pessoa.getX() == p.getX() || pessoa.getX() + 1 == p.getX() || pessoa.getX() - 1 == p.getX()) {
//                        if (pessoa.getY() == p.getY() || pessoa.getY() + 1 == p.getY() || pessoa.getY() - 1 == p.getY()) {
//                            if (pessoa instanceof PessoaMalInformada) {
//                                if (p instanceof PessoaBemInformada) {
//                                    Pessoa p1 = new PessoaMalInformada(p.getX(), p.getY(), 7, p.getWhatsappID(), 0, p.getAgendaContatos());
//                                    checaAgenda(p1);
//                                    return p1;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
        }
        return null;
    }

    public void adicionaContatos(Pessoa pessoa){
        for(Pessoa p : this.pessoas){
            if(pessoa.getX() == p.getX() || pessoa.getX()+1 == p.getX() || pessoa.getX()-1 == p.getX()){
                if(pessoa.getY() == p.getY() || pessoa.getY()+1 == p.getY() || pessoa.getY()-1 == p.getY()){
                    if(!Objects.equals(pessoa.getWhatsappID(), p.getWhatsappID())){
                        if(!pessoa.getAgendaContatos().contains(p.getWhatsappID())) pessoa.addContato(p.getWhatsappID());
                    }
                }
            }
        }
    }

    public void checaAgenda(Pessoa p){
        for(Pessoa p2 : this.pessoas){
            if(p.getAgendaContatos().contains(p2.getWhatsappID())){
                if(p2 instanceof PessoaBemInformada && p instanceof PessoaMalInformada){
                    this.pessoas.set(this.pessoas.indexOf(p2), new PessoaMalInformada(p2.getX(), p2.getY(), 5, p2.getWhatsappID(), p2.getTempoImune(), p2.getAgendaContatos()));
                }else if(p2 instanceof PessoaMalInformada && p instanceof PessoaBemInformada){
                    this.pessoas.set(this.pessoas.indexOf(p2), new PessoaBemInformada(p2.getX(), p2.getY(), 6, p2.getWhatsappID(), p2.getTempoImune(), p2.getAgendaContatos()));
                }
            }
        }
    }

    public void desenhaMundo(){
        int[][] mapa = desenhaPessoas(this.pessoas);
        int bemInformadas = 0;
        int malInformadas = 0;
        int imunes = 0;
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 60; j++){
                if (mapa[i][j] == 0) {
                    System.out.print(" ");
                } else if (mapa[i][j] == 1) {
                    System.out.print("\033[47m \033[0m");
                } else if (mapa[i][j] == 2) {
                    System.out.print("\033[45m \033[0m");
                } else if (mapa[i][j] == 3) {
                    System.out.print("\033[44m \033[0m");
                } else if (mapa[i][j] == 4) {
                    System.out.print("\033[46m \033[0m");
                } else if (mapa[i][j] == 5) {
                    System.out.print("\033[41m \033[0m");
                    malInformadas += 1;
                } else if (mapa[i][j] == 6) {
                    System.out.print("\033[42m \033[0m");
                    bemInformadas += 1;
                } else if (mapa[i][j] == 7) {
                    System.out.print("\033[43m \033[0m");
                    imunes += 1;
                }
            }
            System.out.println();
        }
        System.out.println("\033[42m \033[0m Pessoa bem informada: "+bemInformadas);
        System.out.println("\033[41m \033[0m Pessoa mal informada: "+malInformadas);
        System.out.println("\033[43m \033[0m Pessoa imune: "+imunes);
        for(Pessoa p : pessoas){
            Pessoa newP = checaPessoas(p);
            adicionaContatos(p);
            if (newP != null) {
                pessoas.set(pessoas.indexOf(p), newP);
                if(newP instanceof PessoaBemInformada) ((PessoaBemInformada) newP).move();
                else ((PessoaMalInformada) newP).move();
            } else {
                if(p instanceof PessoaBemInformada) ((PessoaBemInformada) p).move();
                else ((PessoaMalInformada) p).move();
            }
            if(p.getTempoImune() != 0) {
                p.setTempoImune(p.getTempoImune()-1);
            }
            if(p.getTempoImune() == 0 && p.getCor() == 1) p.setCor(6);
        }
    }
}