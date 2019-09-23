/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;
 
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author v00
 */
public class DaoTrasaccion {
     private SessionFactory sesFact;
    private Session ses;
    private Transaction tra;
    
    private int codigo;
    private int filasAfectadas=0;
    /*
    Transacciones  tras=new  Transacciones();

    public DaoTrasaccion (Transacciones tras) {
        this.tras=tras;
    }

    public DaoTrasaccion (int  codigo) {
        this.codigo = codigo;
    }

    public DaoTrasaccion () {
    }
    
    
    
    private void iniciaOperacion()throws HibernateException{
        sesFact=HibernateUtil.getSessionFactory();
        ses=sesFact.openSession();
        tra=ses.beginTransaction();
    }
    
    private void manejaException(HibernateException he)throws HibernateException{
        tra.rollback();
        throw new HibernateException("Ocrurrio un error en la capa de acceso a datos",he);
    }
    
   public void GuardarTransacciones()throws HibernateException
    {
        try {
            iniciaOperacion();
            ses.save(tras);
            tra.commit();
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        }finally{
            ses.close();
        }
    }
    
      public void eliminarTransacciones(Transacciones trasa)throws HibernateException
    {
        try {
            iniciaOperacion();
            ses.delete(trasa);
            tra.commit();
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        }finally{
            ses.close();
        }
    }
       
   public Transacciones obtenerTransacciones()throws HibernateException
    {
        try {
            iniciaOperacion();
            tras=(Transacciones)ses.get(Transacciones.class,codigo);

        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        }finally{
            ses.close();
        }
        return tras;
    }
   
      public List<Transacciones> obtenerlistaTransacciones()throws HibernateException
    {
        List<Transacciones> listatras=null;
        try {
            iniciaOperacion();
            listatras=ses.createQuery("SELECT FROM transacciones").list();

        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        }finally{
            ses.close();
        }
        return listatras;
    }
      
     public void actualizarLugar(Transacciones tras) throws HibernateException {
        try {
            iniciaOperacion();
            ses.update(tras);
            tra.commit();
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        } finally {
            ses.close();
        }
    }
*/
     
     

}
