package modelo;

/**
 *
 * @author Aluno
 */
public class BuscaInterpolada {

    private int vet[];
    private int resposta;
    private int chave;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int[] getVet() {
        return vet;
    }

    public void setVet(int[] vet) {
        this.vet = vet;
    }

    public int[] ordenacao(int vet[]) {

        int i, j, aux;

        for (i = 0; i < vet.length - 1; i++) {

            for (j = 0; j < vet.length - 1; j++) {

                if (vet[j] > vet[j + 1]) {

                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        return vet;
    }

    public int buscaInterpolacao(int vet[], int tamanho, int chave) {

        int ini = 0;
        int fim = tamanho - 1;
        boolean flag = false;
        int percentualPosicao=0;

        if (chave >= Math.abs(vet[0]) && chave <= Math.abs(vet[vet.length - 1])) { // senao tiver este if já elvis valores negativos e maiores que o array

            if (Math.abs(vet[fim]) - Math.abs(vet[ini]) != 0) {
                percentualPosicao = ini + (fim - ini) * ((chave - Math.abs(vet[ini])) / (Math.abs(vet[fim]) - Math.abs(vet[ini])));
            }

            while (!flag && ini < fim && Math.abs(vet[percentualPosicao]) != chave) {

                if (chave < Math.abs(vet[percentualPosicao])) {
                    fim = percentualPosicao - 1;
                } else {
                    if (chave > Math.abs(vet[percentualPosicao])) {
                        ini = percentualPosicao + 1;
                    }
                }
                if (chave >= Math.abs(vet[0]) && chave <= Math.abs(vet[vet.length - 1])) {
                    if (Math.abs(vet[fim]) - Math.abs(vet[ini]) != 0) {
                        percentualPosicao = ini + (fim - ini) * ((chave - Math.abs(vet[ini])) / (Math.abs(vet[fim]) - Math.abs(vet[ini])));
                    }
                } else {
                    flag = true;
                }
            }
            if (chave == Math.abs(vet[percentualPosicao])) {
                this.resposta = percentualPosicao;
                return this.resposta;
            } else {
                this.resposta = -2;
                return this.resposta;
            }
        } else {
            this.resposta = -2;
            return this.resposta;
        }
    }

    public int getResposta() {
        return resposta;
    }

    @Override
    public String toString() {
        return "BuscaInterpoladaVetor{" + vet + '}';
    }
}
