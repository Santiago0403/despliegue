package com.visiontech.dto;

import com.visiontech.entities.Usuario;

public class NumeroEmergenciaDTO {
    private int idNumeroEmergencia;
    private String tipoEmergencia;
    private String distrito;
    private int telefonoEmergencia;
    private Usuario usuario;

    public int getIdNumeroEmergencia() {
        return idNumeroEmergencia;
    }

    public void setIdNumeroEmergencia(int idNumeroEmergencia) {
        this.idNumeroEmergencia = idNumeroEmergencia;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(int telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
