import javax.swing.*;

public class Main {

    private static int menu(){
        String txt =    "1) Mostrar Saldo   \n";
        txt +=          "2) Depositar  \n";
        txt +=          "3) Sacar  \n";
        txt +=          "0) Sair  \n\n";
        txt +=          "Digite sua opção:";
        return Integer.parseInt( JOptionPane.showInputDialog( txt ) );
    }

    public static void main(String[] args) {
        String txt = "Qual tipo de cliente: \n  1)Físico \n  2)Jurídico";
        int tipoCli = Integer.parseInt(  JOptionPane.showInputDialog(txt));
        Cliente client = null;
        String nome = JOptionPane.showInputDialog("Nome do cliente: ");
        if(tipoCli == 1){
            String cpf = JOptionPane.showInputDialog("CPF: ");
            client = new Fisico(nome, cpf);
        }else {
            String cnpj = JOptionPane.showInputDialog("CNPJ: ");
            client = new Juridico(nome, cnpj);
        }

        Conta c1 = new Conta();
        c1.titular = client;

        int op = -1;

        while( op != 0 ){
            op = menu();
            switch ( op ){
                case 1:
                    String msg = "Saldo: " + c1.getSaldo();
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 2:
                    String sValor = JOptionPane.showInputDialog("Valor a depositar:");
                    double valor = Double.parseDouble( sValor );
                    c1.depositar( valor );
                    break;
                case 3:
                    String sValor2 = JOptionPane.showInputDialog("Valor a sacar:");
                    c1.sacar( Double.parseDouble( sValor2 ) );
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Bye-Bye");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}