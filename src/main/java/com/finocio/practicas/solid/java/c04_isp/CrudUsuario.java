package com.finocio.practicas.solid.java.c04_isp;

public interface CrudUsuario {

    Usuario obtenerUsuario(long id);

    Usuario crearUsuario(Usuario usuario);

    void eliminarUsuario(long id);

    Usuario actualizarUsuario(Usuario usuario);
}
