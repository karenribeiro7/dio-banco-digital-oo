public class Cliente {
    private String nome;
    private String cpf;

    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public String toString() {
    return "Cliente [nome: " + nome + ", cpf: " + cpf + "]";
}
}
