package br.com.controller;

import br.com.controller.model.Curriculo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/curriculo")
public class CurriculoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("form-curriculo.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String paragrafo = req.getParameter("paragrafo");
        String sobre = req.getParameter("sobre");
        String formacoes = req.getParameter("formacoes");
        String experiencias = req.getParameter("experiencias");

        Curriculo curriculo = new Curriculo(nome, paragrafo, sobre, formacoes, experiencias);

       
        req.setAttribute("curriculo", curriculo);

        req.getRequestDispatcher("/exibir_informacoes.jsp").forward(req, resp);
    }
}
