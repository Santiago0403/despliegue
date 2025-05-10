package com.visiontech.dto;
import com.visiontech.entities.Usuario;



public class RutaDTO {
    private int idRuta;
    private String nombreRuta;
    private String destino;
    private String inicio;
    private String fin;
    private int distanciaMinutos;
    private int tiempoRuta;
    private int longitud;
    private int latitud;
    private Usuario usuario;

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public int getDistanciaMinutos() {
        return distanciaMinutos;
    }

    public void setDistanciaMinutos(int distanciaMinutos) {
        this.distanciaMinutos = distanciaMinutos;
    }

    public int getTiempoRuta() {
        return tiempoRuta;
    }

    public void setTiempoRuta(int tiempoRuta) {
        this.tiempoRuta = tiempoRuta;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}





