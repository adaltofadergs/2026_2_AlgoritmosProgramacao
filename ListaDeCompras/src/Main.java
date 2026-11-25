import javax.swing.*;

public class Main {

    public static int menu(){

        String txt =  "1) Adicionar Produto \n"
                    + "2) Imprimir Lista \n"
                    + "3) Remover Último \n"
                    + "4) Buscar item pela posição \n"
                    + "5) Retornar Tamanho da Lista \n"
                    + "0) Sair \n\n "
                    + "Digite sua opção: ";
        try {
            String resposta = JOptionPane.showInputDialog(txt);
            if (resposta.isEmpty()) {
                return -1;
            }
            return Integer.parseInt(resposta);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return -1;
        }
    }


    public static void main(String[] args) {
        Lista listProd = new Lista();
        int opcao;
        do {
            opcao = menu();
            switch ( opcao ){
                case 1:
                    Produto newProd = new Produto();
                    newProd.nome = JOptionPane.showInputDialog("Nome: ");
                    String qtd = JOptionPane.showInputDialog("Quantidade: ");
                    if( qtd.isEmpty() )
                        newProd.quantidade = 0;
                    else
                        newProd.quantidade = Integer.parseInt( qtd );
                    listProd.add( newProd );
                    break;
                case 2:
                    listProd.imprimir();
                    break;
                case 3:
                    listProd.produtos.removeLast();
                    break;
                case 4:
                    int position = Integer.parseInt( JOptionPane.showInputDialog("Qual posição?") );
                    Produto p = listProd.getProdutoByPosicao( position );
                    if (p != null )
                        JOptionPane.showMessageDialog( null, p.toString() );
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Bye-bye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }while ( opcao != 0 );


//        Produto p1 = new Produto("Coca-cola", 5);
//        if( listProd.add( p1 ) ){
//            JOptionPane.showMessageDialog(null, "Adicionou o P1" );
//        }else {
//            JOptionPane.showMessageDialog(null, "Não adicionou o P1" );
//        }
//
//        listProd.add( new Produto("Chocolate" ,  2) );
//
//        listProd.imprimir();

    }
}