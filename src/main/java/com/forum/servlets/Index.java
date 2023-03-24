package com.forum.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.forum.bdd.Commentaires;
import com.forum.beans.Commentaire;


@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Index() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Commentaires tableForum = new Commentaires();
		request.setAttribute("commentaires", tableForum.recupererCommentaires());
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String auteur = request.getParameter("auteur");
		String contenu = request.getParameter("commentaire");
		
		Commentaire commentaire = new Commentaire(auteur, contenu);
		Commentaires tableForum = new Commentaires();
		tableForum.ajouterCommentaire(commentaire);
		request.setAttribute("commentaires", tableForum.recupererCommentaires());

		doGet(request, response);
	}

}
