/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Cuentas;
import ModeloDao.DaoCuenta;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author v00
 */
public class Controladorcuenta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            RequestDispatcher despachador = null;
            String pagina = request.getServletPath();

            if (pagina.equals("/MostrarCuentas.do")) {

                List<Cuentas> listaDeCuentas = new ArrayList<>();
                DaoCuenta c = new DaoCuenta();
                //listaDeCuentas = c.obtenerlistaCuentas();
                request.setAttribute("listaDeLugares", listaDeCuentas);
                despachador = request.getRequestDispatcher("NuevaCuenta.jsp");
            } else if (pagina.equals("/AgregarCuentas.do")) {

                int codigo = Integer.parseInt(request.getParameter("codigo"));
                String des = request.getParameter("descripcion");
                String municipio = request.getParameter("id_municipio");
                DaoCuenta dao = new DaoCuenta();
                dao.GuardarCuentas();
                despachador = request.getRequestDispatcher("MostrarCuenta.do");
            }
            /*else if (pagina.equals("/BorrarLugar.do")) {
                
                int  codigo= Integer.parseInt(request.getParameter("id_codigo"));
                Lugar lugar = new Lugar(codigo);
                DaoLugar controllugar = new DaoLugar(codigo);
                 controllugar.eliminarLugar(lugar);
                despachador = request.getRequestDispatcher("MostrarLugar.do");
            }else if (pagina.equals("/ModificarLugar.do")) {
                Lugar lugar= new Lugar();
                lugar.setCodigo(Integer.parseInt(request.getParameter("id_codigo")));
                DaoLugar controllugar = new DaoLugar(lugar.getCodigo());
                lugar=controllugar .obtenerLugar();
                request.setAttribute("lugares",lugar);
                despachador=request.getRequestDispatcher("Catalogos/Lugares/modificarLugar.jsp");
                
            }*/
            
                //despachador = request.getRequestDispatcher("NuevaCuenta.jsp");
            request.getRequestDispatcher("NuevaCuenta.jsp").forward(request, response);
            despachador.forward(request, response);
            

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code>
     * metho...............33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333.........................................................................................................................................................................................................03d.00.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
