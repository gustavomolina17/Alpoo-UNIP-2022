
public class Aluno {
	
/*
................................................
ESTA CLASSE É UM "JAVA BEAN", OU SEJA, UMA ENTIDADE
QUE REPRESENTA A TABELA ALUNO QUE LEMOS (E ALTERAMOS)
NO BANCO DE DADOS.
................................................
*/

	private long id;
	private String nome;
	private String ra;
	private int idade;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
