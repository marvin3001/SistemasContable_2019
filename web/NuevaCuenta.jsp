<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Cuentas"%>
<%@page import="ModeloDao.DaoCuenta"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        ModeloDao.DaoCuenta cuenta = new DaoCuenta();
        Cuentas c = new Cuentas();
        Cuentas CueEspecifica = (Cuentas) request.getAttribute("cuentaEspecifica");
        int cuentas = -1;

    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Cuenta</title>


        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
        <link rel="../jajajajastylesheet" href="assets/js/Lightweight-Chart/cssCharts.css">

        <link href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.8.0/sweetalert2.min.css" rel="stylesheet" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.8.0/sweetalert2.min.js"></script>
        <link rel="../Js/alertas.js">


        <script type="text/javascript">

            function JS() {
                var combo;
                combo = $("#tipo").val();

            }
            function escogerServicio() {
                if (document.tabla.cuentas.selectedIndex == 0) {
                    alert("Debe seleccionar un Servicio para mostrar .");
                    document.tabla.cuenta.focus();
                    return 0;
                } else {
                    document.tabla.submit();
                }
            }

            function limpiar() {
                location.reload();
            }
        </script>
    </head>
    <body>

        <%@include file="Menu.jsp" %><%--para llamar al menu e Inculirlo en esta vista --%>

        <div id="page-wrapper">


            <div class="container-fluid"><br/>
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">

                            <div class="col-md-4 col-sm-12 col-xs-4">                     
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        Agregar Cuenta
                                    </div>
                                    <div class="panel-body">
                                        <div id="morris-line-chart">

                                            <form id="formulario" action="AgregarCuentas.do"  method="get" role="form"  >

                                                <div class="form-group">
                                                    <label for="codigo">
                                                        Codigo
                                                    </label>
                                                    <input type="text" class="form-control" 
                                                           <%if (CueEspecifica != null) {
                                                                   System.out.println("Cuenta de codigo:" + CueEspecifica.getNombre());%>

                                                           value="<%= CueEspecifica.getCuenta()%>"
                                                           <%}
                                                           %>
                                                           name="codigo" id="codigo" />
                                                </div>
                                                <div class="form-group">
                                                    <label for="descripcion">
                                                        Descripción
                                                    </label>
                                                    <input type="text" class="form-control" name="descripcion" id="descripcion" />
                                                </div>



                                                <button  type="sumbit" class="btn btn-primary">Registrar</button>


                                            </form>
                                        </div>
                                    </div>
                                </div>            
                            </div>
                            <div class="col-md-8">
                                <!-- Advanced Tables -->
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        Catalogo de Cuentas
                                    </div>
                                    <div class="panel-body">
                                        <div class="table-responsive">
                                            <form method="get" action="ServletCuenta" name="tabla">
                                                <div class="form-group">
                                                    <label for="inputState">Tipo Cuenta</label>
                                                    <select name="cuentas" onchange="escogerServicio()"  class="form-control" >
                                                        <option selected>Seleccionar</option>
                                                        <option value="1" >Activo</option>
                                                        <option value="2">Pasivo</option>
                                                        <option value="3">Capital Contable</option>
                                                        <option value="4">Cuenta de Resultado Deudora</option>
                                                        <option value="5">Cuenta de Resultado Acreedora</option>
                                                        <option value="6">Cuenta de Cierre</option>

                                                    </select>
                                                </div>
                                                <%  
                                                    try {
                                                        cuentas = Integer.parseInt(request.getParameter("cuentas"));
                                                    } catch (Exception e) {
                                                        System.out.println("Try catch:" + e.getMessage());
                                                    }

                                                    if (cuentas != -1) {
                                                %>                    
                                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                                    <thead>
                                                        <tr>
                                                            <th>Cuenta</th>
                                                            <th>Descripcion</th>
                                                            <th>Acciones</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%  if (cuenta.obtenerlistaCuenta(cuentas).size() > 0) {

                                                                for (Cuentas cl : cuenta.obtenerlistaCuenta(cuentas)) {
                                                        %>
                                                        <tr class="gradeU">
                                                            <td><%=cl.getCuenta()%></td>
                                                            <td><%=cl.getNombre()%></td>
                                                            <td>

                                                                <a name="editar" href="Codigo.do?codigo=<%= cl.getCuenta()%>" class="btn btn-success"><span class="fa fa-edit"></span></a>

                                                            </td>
                                                        </tr>
                                                        <%
                                                                }

                                                            }
                                                        %>
                                                    </tbody>
                                                </table>
                                                <%
                                                    }
                                                %>

                                            </form>

                                        </div>

                                    </div>
                                </div>
                                <!--End Advanced Tables -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

