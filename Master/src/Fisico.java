public class Fisico extends Cliente{
    public String cpf;

    public Fisico(){
        super();
    }

    public Fisico(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente Físico: \n" +
                super.toString() + "\n" +
                "CPF: " + cpf;

    }

    @Override
    public void cadastrar() {

    }
}
