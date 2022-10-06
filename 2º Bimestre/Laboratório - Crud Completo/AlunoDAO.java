
import java.sql.*;

/*
...............................................
NESTA CLASSE TEMOS OS MÉTODOS QUE FAZEM ACESSO DIRETO
AO BANCO DE DADOS.
...............................................
*/

public class AlunoDAO {

	private Connection con;

	public String select(Aluno a) {
		String ret = "Dados resgatados com Sucesso";
		// ...abrindo a conexão
		this.abreCon();
		String sql = "SELECT * FROM aluno  WHERE id=?";
		try {
			// ...abrindo um canal de conexao com a linguagem sql
			PreparedStatement stmt = con.prepareStatement(sql);
			// ...setando os valores
			stmt.setLong(1, a.getId());
			// ...executando o comando sql para retornar os valores lidos
			ResultSet rs = stmt.executeQuery();
			a.setNome("");
			a.setRa("");
			a.setIdade(0);
			while (rs.next()) {
				a.setNome(rs.getString("nome"));
				a.setRa(rs.getString("ra"));
				a.setIdade(rs.getInt("idade"));
			}
			stmt.close();
		} catch (Exception e) {
			ret = "ERRO ao tentar ler os dados...";
			System.out.println(":: ERRO :: Problemas com a leitura de dados no BD...");
		}
		// ...fechando a conexão
		this.fechaCon();
		return ret;
	}

	public String insert(Aluno a) {
		String ret = "Dados Inseridos com Sucesso";
		// ...abrindo a conexão
		this.abreCon();
		String sql = "insert into aluno	(id,nome,ra,idade) values (?,?,?,?)";
		try {
			// ...abrindo um canal de conexao com a linguagem sql
			PreparedStatement stmt = con.prepareStatement(sql);
			// ...setando os valores
			stmt.setLong(1, a.getId());
			stmt.setString(3, a.getRa());
			stmt.setInt(4, a.getIdade());
			stmt.setString(2, a.getNome());
			// ...executando o comando sql
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			ret = "ERRO ao tentar inserir os dados...";
			System.out.println(":: ERRO :: Problemas com a inserção de dados no BD...");
		}
		// ...fechando a conexão
		this.fechaCon();
		return ret;
	}
	
	public String delete(Aluno a) {
		String ret = "Dados Exluídos com Sucesso";
		// ...abrindo a conexão
		this.abreCon();
		String sql = "DELETE FROM aluno  WHERE id=?";
		try {
			// ...abrindo um canal de conexao com a linguagem sql
			PreparedStatement stmt = con.prepareStatement(sql);
			// ...setando os valores
			stmt.setLong(1, a.getId());
			// ...executando o comando sql para retornar os valores lidos
			stmt.execute();
			a.setNome("");
			a.setRa("");
			a.setIdade(0);
			stmt.close();
		} catch (Exception e) {
			ret = "ERRO ao tentar excluir os dados...";
			System.out.println(":: ERRO :: Problemas com a exclusão de dados no BD...");
		}
		// ...fechando a conexão
		this.fechaCon();
		return ret;
	}

	public String update(Aluno a) {
		String ret = "Dados Alterados com Sucesso";
		// ...abrindo a conexão
		this.abreCon();
		String sql = "update aluno set nome=?,ra=?,idade=? where id=?";
		try {
			// ...abrindo um canal de conexao com a linguagem sql
			PreparedStatement stmt = con.prepareStatement(sql);
			// ...setando os valores
			stmt.setLong(4, a.getId());
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getRa());
			stmt.setInt(3, a.getIdade());
			// ...executando o comando sql
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			ret = "ERRO ao tentar atualizar os dados...";
			System.out.println(":: ERRO :: Problemas com a atualização de dados no BD...");
		}
		// ...fechando a conexão
		this.fechaCon();
		return ret;
	}
	
	//......PARA LIDAR COM O BANCO DE DADOS..........
	//...............................................

	private void abreCon() {
		this.con = new ConnectionFactory().getConnection();
	}

	private void fechaCon() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
