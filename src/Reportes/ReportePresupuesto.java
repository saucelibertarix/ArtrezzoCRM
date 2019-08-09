/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author pfarinamoreno
 */
public class ReportePresupuesto {
    private int presupuestoId;
    private String presupuestoNombre;
    private String nombreCliente;
    private String dniCifCliente;
    private String direccionCliente;
    private int telefonoCliente;
    private String concepto;
    private double precio;
    private int cantidad;
    private double subtotal;
    private double total;
    private double iva;
    private double totalIva;

    public ReportePresupuesto() {
    }

    public ReportePresupuesto(int presupuestoId, String presupuestoNombre, String nombreCliente, String dniCifCliente, String direccionCliente, int telefonoCliente, String concepto, double precio, int cantidad, double subtotal, double total, double iva, double totalIva) {
        this.presupuestoId = presupuestoId;
        this.presupuestoNombre = presupuestoNombre;
        this.nombreCliente = nombreCliente;
        this.dniCifCliente = dniCifCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.concepto = concepto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
        this.totalIva = totalIva;
    }
     public ReportePresupuesto(int presupuestoId, String presupuestoNombre, String nombreCliente, String dniCifCliente, String direccionCliente, int telefonoCliente, double total, double iva, double totalIva) {
        this.presupuestoId = presupuestoId;
        this.presupuestoNombre = presupuestoNombre;
        this.nombreCliente = nombreCliente;
        this.dniCifCliente = dniCifCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.total = total;
        this.iva = iva;
        this.totalIva = totalIva;
    }

      public ReportePresupuesto(String concepto, double precio, int cantidad, double subtotal) {
        this.concepto = concepto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }
    
    
    public int getPresupuestoId() {
        return presupuestoId;
    }

    public void setPresupuestoId(int presupuestoId) {
        this.presupuestoId = presupuestoId;
    }

    public String getPresupuestoNombre() {
        return presupuestoNombre;
    }

    public void setPresupuestoNombre(String presupuestoNombre) {
        this.presupuestoNombre = presupuestoNombre;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCifCliente() {
        return dniCifCliente;
    }

    public void setDniCifCliente(String dniCifCliente) {
        this.dniCifCliente = dniCifCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }
      
    
}
