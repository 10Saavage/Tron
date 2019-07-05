/**
 * 
 */
package org.view;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.contract.BDconnexion;
import org.view.StartEnd;

/**
 * @author TOUSSI Manoel
 *
 */
public class BDConnection implements BDconnexion {
	/**
	 * nom de la base de données
	 */
	private String URL="jdbc:mysql://localhost/tron_rattrapage?autoReconnect=true&useSSL=false";
	/**
	 *nom d'utilisteur du serveur mysql 
	 */
	private String LOGIN="root";
	/**
	 * mot de passe de l'identifiant
	 */
	private String PASSWORD="";
	/**
	 * pour la connection à la BDD
	 */
	private java.sql.Connection connection;
	
	

	/**
	 * éxécuter les codes dès qu'il est extensié
	 */
	public BDConnection() {
		// TODO Auto-generated constructor stub
		this.open();
		Insertion();
	}

	/**
	 *open database
	 */
	public boolean open() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection=DriverManager.getConnection(URL,LOGIN, PASSWORD);
			this.connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("echec de la connection");
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("échec de la connection");
			e.printStackTrace();
		}
		
		System.out.println("Base de donnée connectée connecté");
		return true;
	}

	/**
	 *Insertion of data
	 */
	public void Insertion() {
		// TODO Auto-generated method stub
		try {
			String sql = "{call insertion(?, ?)}";
			this.open();
			CallableStatement statement = connection.prepareCall(sql);
			statement.setString(1, StartEnd.startEnd().getWinner());
			statement.setInt(2,StartEnd.startEnd().getTime());
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("procédure stockée non trouvée ou paramètre mauvais");
			e.printStackTrace();
		}
	}

	
}
