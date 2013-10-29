package stat.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Stconnection{

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:mysql://localhost:3306/memoire";
	/**
	 * Nom du user
	 */
	private static String user = "root";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "carine";
	/**
	 * Objet Connection
	 */
	private static Connection connect;
	
	/**
	 * Méthode qui va retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
			}
		}		
		return connect;	
	}
}