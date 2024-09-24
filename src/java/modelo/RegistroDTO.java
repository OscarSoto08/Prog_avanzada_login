/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.util.Objects;

public class RegistroDTO {
    private String usuario;
    private String clave;
    private String correo;
    private boolean estado;
    private Date fecha;

    public RegistroDTO() {
    }

    public RegistroDTO(String usuario, String clave, String correo, boolean estado, Date fecha) {
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.estado = estado;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    //SETTERS
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "RegistroDTO{" + "usuario=" + usuario + ", clave=" + clave + ", correo=" + correo + ", estado=" + estado + ", fecha=" + fecha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.usuario);
        hash = 47 * hash + Objects.hashCode(this.clave);
        hash = 47 * hash + Objects.hashCode(this.correo);
        hash = 47 * hash + (this.estado ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistroDTO other = (RegistroDTO) obj;
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }
}
