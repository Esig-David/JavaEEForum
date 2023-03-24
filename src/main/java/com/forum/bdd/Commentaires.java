package com.forum.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.forum.beans.Commentaire;


public class Commentaires {
    private Connection connexion;
    
    public List<Commentaire> recupererCommentaires() {
        List<Commentaire> listeCommentaires = new ArrayList<Commentaire>();
        Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT nom, commentaire FROM commentaires;");

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String textCommentaire = resultat.getString("commentaire");
                
                Commentaire commentaire = new Commentaire(nom, textCommentaire);
                listeCommentaires.add(commentaire);
                
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return listeCommentaires;
    }
    
    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ajouterCommentaire(Commentaire commentaire) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO commentaire(nom, commentaire) VALUES(?, ?);");
            preparedStatement.setString(1, commentaire.getNom());
            preparedStatement.setString(2, commentaire.getCommentaire());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}