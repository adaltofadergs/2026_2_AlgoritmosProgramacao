public class Fisico extends Cliente{
    public String cpf;

    public Fisico(){
        super();
    }

    public Fisico(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
}
