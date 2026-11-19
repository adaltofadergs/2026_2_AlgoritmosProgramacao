import javax.swing.*;
import java.util.ArrayList;

public class Lista {
    ArrayList<Produto> produtos;

    public Lista(){
        this.produtos = new ArrayList<Produto>();
    }

    public boolean add( Produto prod ){
        if( prod != null ){
            if( !prod.nome.isEmpty()  && prod.quantidade >= 0){
                this.produtos.add( prod );
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        String txt = "";
        for( Produto prod : this.produtos){
            // txt = txt.concat( prod.toString() + "\n");
            txt += prod + "\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }

    public Produto getProdutoByPosicao(int posicao){
        try {
            return this.produtos.get( posicao );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }

    }


}
