package com.finocio.practicas.solid.java.c02_ocp;

import java.util.List;

public class Admin extends Usuario{

    public Admin(Rol rol, List<Permiso> permisos) {
        super(Rol.ADMIN, List.of(Permiso.LECTURA_ESCRITURA));
    }
}
