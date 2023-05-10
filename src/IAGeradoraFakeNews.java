public class IAGeradoraFakeNews {
    private int cor = 2;

    public int[][] desenhaGeradora(int[][] mundo){
        for(int i = 0; i < mundo.length; i++){
            for(int j = 0; j < mundo[i].length; j++){
                if((j >= 8 && j <= 19) && (i >= 3 && i <= 9)) mundo[i][j] = cor;
            }
        }
        return mundo;
    }
}
