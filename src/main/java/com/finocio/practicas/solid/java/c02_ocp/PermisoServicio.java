package com.finocio.practicas.solid.java.c02_ocp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PermisoServicio {

    private final UsuarioServicio usuarioServicio;

    public PermisoServicio(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    public List<Permiso> obtenerPermisos(long usuariId) {
        final Usuario usuario = usuarioServicio.obtenerUsuario(usuariId);
        return usuario.getPermisos();
    }

    public void eliminarPermisos(long usuarioId, Permiso permiso) {

    }
}
