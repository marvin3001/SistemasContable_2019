package Entidades;
// Generated 23-sep-2019 13:49:05 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cuentas generated by hbm2java
 */
@Entity
@Table(name="cuentas"
    ,schema="public"
)
public class Cuentas  implements java.io.Serializable {


     private int cuenta;
     private String nombre;
     private String tipo;
     private int nivel;
     private String saldo;
     private String rcuenta;
     private Integer padre;
     private Set<Dettransaccion> dettransaccions = new HashSet<Dettransaccion>(0);

    public Cuentas() {
    }

	
    public Cuentas(int cuenta, String nombre, String tipo, int nivel, String saldo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.saldo = saldo;
    }
    public Cuentas(int cuenta, String nombre, String tipo, int nivel, String saldo, String rcuenta, Integer padre, Set<Dettransaccion> dettransaccions) {
       this.cuenta = cuenta;
       this.nombre = nombre;
       this.tipo = tipo;
       this.nivel = nivel;
       this.saldo = saldo;
       this.rcuenta = rcuenta;
       this.padre = padre;
       this.dettransaccions = dettransaccions;
    }
   
     @Id 

    
    @Column(name="cuenta", unique=true, nullable=false)
    public int getCuenta() {
        return this.cuenta;
    }
    
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    
    @Column(name="nombre", nullable=false, length=20)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="tipo", nullable=false, length=20)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="nivel", nullable=false)
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    @Column(name="saldo", nullable=false, length=20)
    public String getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    
    @Column(name="rcuenta", length=2)
    public String getRcuenta() {
        return this.rcuenta;
    }
    
    public void setRcuenta(String rcuenta) {
        this.rcuenta = rcuenta;
    }

    
    @Column(name="padre")
    public Integer getPadre() {
        return this.padre;
    }
    
    public void setPadre(Integer padre) {
        this.padre = padre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cuentas")
    public Set<Dettransaccion> getDettransaccions() {
        return this.dettransaccions;
    }
    
    public void setDettransaccions(Set<Dettransaccion> dettransaccions) {
        this.dettransaccions = dettransaccions;
    }




}


