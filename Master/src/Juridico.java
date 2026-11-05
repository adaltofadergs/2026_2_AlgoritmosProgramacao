import javax.swing.*;

public class Juridico extends Cliente{
    public String cnpj;

    public Juridico(){
        super();
    }

    @Override
    public void cadastrar() {
        this.nome =  JOptionPane.showInputDialog("Nome do Cliente Jurídico: ");
        this.cnpj = JOptionPane.showInputDialog("CNPJ: ");
    }

    public Juridico(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }



}