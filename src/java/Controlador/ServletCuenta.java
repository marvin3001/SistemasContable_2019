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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 14-CKOO13LA
 */
@WebServlet(name = "ServletCuenta", urlPatterns = {"/ServletCuenta"})
public class ServletCuenta extends HttpServlet {

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
                request.getSession().getAttribute("listaDeCuentas");
                //listaDeCuentas = c.obtenerlistaCuentas();
                request.setAttribute("listaDeLugares", listaDeCuentas);
                despachador = request.getRequestDispatcher("NuevaCuenta.jsp");
            } else if (pagina.equals("/AgregarCuentas.do")) {

                ArrayList<Cuentas> cu = (ArrayList<Cuentas>) request.getSession().getAttribute("lista");
                System.out.println("-----------------------------------------");
                if (cu != null) {
                    for (Cuentas cuentas : cu) {
                        System.out.println("codigo" + cuentas.getCuenta() + "         descripcio:" + cuentas.getNombre());
                    }
                }

                request.getSession().setAttribute("lista", cu);
                despachador = request.getRequestDispatcher("NuevaCuenta.jsp");
            } else if (pagina.equals("/Codigo.do")) {
                Cuentas cuen = new Cuentas();
                //cuen.setCuenta(request.getParameter("codigo"));

                System.out.println("Dentro del servlet el codigo de la cuenta es :" + cuen.getCuenta());
                DaoCuenta control = new DaoCuenta();
                //cuen=control.obtenerCuentas(cuen.getCuenta());
                request.setAttribute("cuentaEspecifica", cuen);

                despachador = request.getRequestDispatcher("NuevaCuenta.jsp");
            }
            /*else if (pagina.equals("/BorrarLugar.do")) {
                
                int  codigo= Integer.parseInt(request.getParameter("id_codigo"));
                Lugar lugar = new Lugar(codigo);
                DaoLugar controllugar = new DaoLugar(codigo);
                 controllugar.eliminarLugar(lugar);
                despachador = request.getRequestDispatcher("MostrarLugar.do");
            } else if (pagina.equals("/UpdateLugar.do")) {
                int codigo=Integer.parseInt(request.getParameter("id_codigo"));
                String departamento=request.getParameter("id_departamento");
                String municipio=request.getParameter("id_municipio");
                Lugar lugar=new Lugar(codigo,departamento,municipio);
                
                
                DaoLugar  controllugar=new DaoLugar ();
                controllugar.actualizarLugar(lugar);
                despachador = request.getRequestDispatcher("MostrarLugar.do");
            
            }*/

            //despachador = request.getRequestDispatcher("NuevaCuenta.jsp");
            request.getRequestDispatcher("NuevaCuenta.jsp").forward(request, response);
            despachador.forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
