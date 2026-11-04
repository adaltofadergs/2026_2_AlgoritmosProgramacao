public abstract class Cliente {
    public String nome;
    public String fone;

    public Cliente(){

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + '\n' +
                "Telefone: " + fone;
    }

    public abstract void cadastrar();

}
