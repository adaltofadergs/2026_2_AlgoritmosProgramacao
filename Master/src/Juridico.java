public class Juridico extends Cliente{
    public String cnpj;

    public Juridico(){
        super();
    }

    @Override
    public void cadastrar() {

    }

    public Juridico(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }



}