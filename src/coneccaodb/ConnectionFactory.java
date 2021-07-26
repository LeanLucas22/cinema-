package coneccaodb;

import cinema.model.Ingresso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

	private final String USER = "root";
	private final String KEY = "";
	private final String URL = "jdbc:mysql://localhost:3306/cine";
	private Connection connection;
	private Statement stmt;
	private ResultSet rs;
	
	public ConnectionFactory(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, KEY);
			stmt = connection.createStatement();
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ConnectionFactory.class.getName())
				.log(Level.SEVERE, null, ex);
		}catch (SQLException e) {
			System.out.println("Error" + e.getLocalizedMessage() + e.getMessage());
		}
		
		 
	}
	
	public void updateIngresso(Ingresso i){
		try {
			stmt.executeUpdate("INSERT INTO ingresso VALUES(null, '"+ i.getFilme() +"','"+ i.getHorario() +"')");
			rs = stmt.executeQuery("SELECT * FROM ingresso");
		} catch (SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void updateIngresso() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	
	
}
