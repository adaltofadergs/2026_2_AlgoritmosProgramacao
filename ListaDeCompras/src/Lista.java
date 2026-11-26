import javax.swing.*;
import java.util.ArrayList;

public class Lista {
    ArrayList<Produto> products;

    public Lista(){
        this.products = new ArrayList<Produto>();
    }

    public boolean add( Produto prod ){
        if( prod != null ){
            if( !prod.nome.isEmpty()  && prod.quantidade >= 0){
                this.products.add( prod );
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        String txt = "";
        for( Produto prod : this.products){
            // txt = txt.concat( prod.toString() + "\n");
            txt += prod + "\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }

    public Produto getProdutoByPosicao(int posicao){
        try {
            return this.products.get( posicao );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }

    }

    public int getTamanho(){
        return this.products.size();
    }


}
