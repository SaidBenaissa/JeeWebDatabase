package com.octest.bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.octest.beans.Utilisateur;
public class Noms {
	public List<Utilisateur> recupererUtilisateurs(){
		List<Utilisateur> utilisateurs=new ArrayList<Utilisateur>();
	// chargement du driver	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
	}
		// Connexion a la base
		Connection connexion=null;
		Statement statement=null;
		ResultSet resultat=null;
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee","root","root");
			statement = (Statement) connexion.createStatement();
			//Execution de la requete
			resultat = statement.executeQuery("SELECT nom, prenom FROM noms;");
			
			//recuperation des donnees
			while(resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				utilisateurs.add(utilisateur);
				
				
			}
			}catch(SQLException e){
			}finally {
				//fermeture du connexion
				try {
					if(resultat != null) {
						resultat.close();
					}
					if(statement != null) {
						statement.close();
					}
					if(connexion != null) {
						connexion.close();
					}
				}catch(SQLException ignore) {
					
				}
			}
		return utilisateurs;
		}
		

}
