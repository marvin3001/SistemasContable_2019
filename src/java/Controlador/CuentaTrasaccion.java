/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

//import Entidades.Lugar;
//import Entidades.Obras;
//import Entidades.Trabajadores;
//import ModeloDao.DaoTrasaccion;
//import ModeloDao.DaoCuenta;
//import ModeloDao.DaoTrabajador;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.math.BigDecimal;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author v00
 */
public class CuentaTrasaccion extends HttpServlet {

//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            RequestDispatcher despachador = null;
//            String pagina = request.getServletPath();
//            if (pagina.equals("/MostrarObra.do")) {
//
//                List<Obras> listaDeObra = new ArrayList<>();
//                DaoCuenta controlobra = new DaoCuenta();
//                listaDeObra = controlobra.obtenerlistaObra();
//                request.setAttribute("listaDeObras", listaDeObra);
//
//                despachador = request.getRequestDispatcher("Catalogos/Obras/mostrarObra.jsp");
//            } else if (pagina.equals("/AgregarObra.do")) {
//
//                SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
//                int codigo = Integer.parseInt(request.getParameter("id_codigo"));
//                int ciudad = Integer.parseInt(request.getParameter("id_ciudad"));
//                String direccion = request.getParameter("id_direccion");
//                String descripcion = request.getParameter("id_descripcion");
//                BigDecimal costo = BigDecimal.valueOf(Double.parseDouble(request.getParameter("id_costo")));
//                Date fechainicio = Date.valueOf(formato.format(Date.valueOf(request.getParameter("id_fechainicio"))));
//                Date fechafin = Date.valueOf(formato.format(Date.valueOf(request.getParameter("id_fechafin"))));
//
//                Obras obra = new Obras(codigo, new Lugar(ciudad), descripcion, costo, fechainicio, fechafin, direccion);
//                DaoCuenta controlobra = new DaoCuenta(obra);
//                controlobra.GuardarObra();
//                despachador = request.getRequestDispatcher("MostrarObra.do");
//
//            } else if (pagina.equals("/BorrarObra.do")) {
//
//                int codigo = Integer.parseInt(request.getParameter("id_codigo"));
//                Obras obra = new Obras(codigo);
//                DaoCuenta controlobra = new DaoCuenta(codigo);
//                controlobra.eliminarObra(obra);
//                despachador = request.getRequestDispatcher("MostrarObra.do");
//            } else if (pagina.equals("/ModificarObra.do")) {
//                Obras obra = new Obras();
//                obra.setCodigo(Integer.parseInt(request.getParameter("id_codigo")));
//                DaoCuenta controlobra = new DaoCuenta(obra.getCodigo());
//                obra = controlobra.obtenerObra();
//                request.setAttribute("obras", obra);
//                despachador = request.getRequestDispatcher("Catalogos/Obras/modificarObra.jsp");
//            } else if (pagina.equals("/UpdateObra.do")) {
//                SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
//                int codigo = Integer.parseInt(request.getParameter("id_codigo"));
//                int ciudad = Integer.parseInt(request.getParameter("id_ciudad"));
//                String direccion = request.getParameter("id_direccion");
//                String descripcion = request.getParameter("id_descripcion");
//                BigDecimal costo = BigDecimal.valueOf(Double.parseDouble(request.getParameter("id_costo")));
//                Date fechainicio = Date.valueOf(formato.format(Date.valueOf(request.getParameter("id_fechainicio"))));
//                Date fechafin = Date.valueOf(formato.format(Date.valueOf(request.getParameter("id_fechafin"))));
//
//                Obras obra = new Obras(codigo, new Lugar(ciudad), descripcion, costo, fechainicio, fechafin, direccion);
//                DaoCuenta controlobra = new DaoCuenta(obra);
//                controlobra.actualizarObra(obra);
//                despachador = request.getRequestDispatcher("MostrarObra.do");
//            }
//            despachador.forward(request, response);
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}
