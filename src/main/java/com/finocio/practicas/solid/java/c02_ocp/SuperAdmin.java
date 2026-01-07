package com.finocio.practicas.solid.java.c02_ocp;

import java.util.List;

public class SuperAdmin extends Usuario{

    public SuperAdmin(Rol rol, List<Permiso>permisos) {
        super (Rol.SUPER_ADMIN, List.of(Permiso.values()));
    }
}
