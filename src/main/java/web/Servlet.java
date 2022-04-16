/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.ws.rs.core.Response;

/**
 *
 * @author delga
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Simulacion de los valores correctos
        String usuarioOk = "daniel";
        String passwordOk = "123";

        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        if (usuarioOk.equalsIgnoreCase(usuario) && passwordOk.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br />");
            out.print("Usuario: " + usuario);
            out.print("<br />");
            out.print("password: " + password);
            out.print("</h1>");
        } else {
            resp.sendError(resp.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }

}
