/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Entidades.Cuentas;
import HibernateUtil.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author v00
 */
public class DaoCuenta {

    private SessionFactory sesFact;
    private Session ses;
    private Transaction tra;

    private int codigo;
    private int filasAfectadas = 0;

    Cuentas cuenta = new Cuentas();

    public DaoCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }

    public DaoCuenta(int codigo) {
        this.codigo = codigo;
    }

    public DaoCuenta() {
    }

    private void iniciaOperacion() throws HibernateException {
        sesFact = HibernateUtil.getSessionFactory();
        ses = sesFact.openSession();
        tra = ses.beginTransaction();
    }

    private void manejaException(HibernateException he) throws HibernateException {
        tra.rollback();
        throw new HibernateException("Ocrurrio un error en la capa de acceso a datos" + he.getMessage(), he);
    }

    public void GuardarCuentas() throws HibernateException {
        try {
            iniciaOperacion();
            ses.save(cuenta);
            tra.commit();
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
    }

    public void eliminarCuentas(Cuentas cuentas) throws HibernateException {
        try {
            iniciaOperacion();
            ses.delete(cuentas);
            tra.commit();
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
    }

    public Cuentas obtenerCuentas(String codigo) throws HibernateException {
        try {
            iniciaOperacion();
            cuenta = (Cuentas) ses.get(Cuentas.class, codigo);

        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
        return cuenta;
    }

    public List<Cuentas> obtenerlistaCuentas() throws HibernateException {
        List<Cuentas> listaDeObra = null;
        try {
            iniciaOperacion();
            listaDeObra = (List<Cuentas>) ses.createQuery("from Cuentas").list();

        } catch (HibernateException he) {
            System.out.println("Error en :" + he.getMessage());
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
        return listaDeObra;
    }
    public List<Cuentas> obtenerlistaCuenta(int id) throws HibernateException {
        List<Cuentas> listaDeObra = null;
        try {
            iniciaOperacion();
            listaDeObra = (List<Cuentas>) ses.createQuery("from Cuentas  where str(cuenta) like'"+id+"%' order by cuenta desc").list();
        } catch (HibernateException he) {
            System.out.println("Error en :" + he.getMessage());
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
        return listaDeObra;
    }
    
    public void actualizarCuentas(Cuentas cuentas) throws HibernateException {
        try {
            iniciaOperacion();
            ses.update(cuentas);
            tra.commit();
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
    }

   

}
