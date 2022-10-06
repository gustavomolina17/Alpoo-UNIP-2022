
import java.sql.*;

public class ConnectionFactory {
	
	private String driver, url, login, senha;
	private Connection con;
	
	public ConnectionFactory() {
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/aula_alpoo";
		//...e porque em meu MySQL n�o foi configurado o TimeZone
		url += "?useTimezone=true&serverTimezone=UTC";
		login = "root";
		senha = "root";
		con = null;
	}
	
	public Connection getConnection() {
		try{
			Class.forName(driver);
			this.con = DriverManager.getConnection(url,login,senha);
		}catch(ClassNotFoundException ex){
			System.out.println(":: ERRO :: Driver JDBC n�o encontrado na aplica��o!");
		}catch(SQLException ex){
			System.out.println(":: ERRO :: Problemas na conex�o com a fonte de dados");
		}catch(Exception ex){
			System.out.println(":: ERRO :: Outros problemas na conex�o...");
		}
		return this.con;
	}

}