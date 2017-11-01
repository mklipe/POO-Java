package estruturas;

/**
 *
 * @author mauricio
 */
public class Vetor implements Lista {

    private Object[] itens = new Object[4];
    private int quantidadeItens = 0;

    @Override
    public void adicionar(Object obj) {

        if (isCheio()) {
            System.out.println("Estava cheio...");
            redimensionar();
        }

        itens[quantidadeItens] = obj;
        quantidadeItens++;
    }

    @Override
    public void adicionar(Object obj, int posicao) {
        if (posicao >= quantidadeItens) {
            adicionar(obj);
        } else {
            for (int i = quantidadeItens; i > posicao; i--) {
                itens[i] = itens[i - 1];
                itens[i - 1] = null;
            }
            itens[posicao] = obj;
            quantidadeItens++;

            if (isCheio()) {
                redimensionar();
            }

        }

    }

    public void redimensionar() {
        Object[] novo = new Object[getTamanho() * 2];

        for (int i = 0; i < itens.length; i++) {
            novo[i] = itens[i];
        }

        itens = novo;

    }

    public boolean isCheio() {
        return quantidadeItens >= itens.length;
    }

    @Override
    public Object getObjeto(int posicao) {
        return itens[posicao];
    }

    @Override
    public void removerElemento(int posicao) {

        if (quantidadeItens > posicao) 
        {
            for (int i = posicao; i < quantidadeItens; i++) 
            {
                itens[i] = itens[i+1];
            }
        }
        
        quantidadeItens --;

    }

    @Override
    public boolean contem(Object obj) {

        for (int i = 0; i < quantidadeItens; i++) {

            if (itens[i] == obj) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int getTamanho() {

        return quantidadeItens;
    }

    public String toString() {

        String texto = "";

        for (int i = 0; i < quantidadeItens; i++) {
            texto = texto + " - " + itens[i].toString();

        }

        return texto;
    }

}
