package com.finocio.practicas.solid.java.c02_ocp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Anonimo extends Usuario {

    public Anonimo (Rol rol, List<Permiso> permisos) {
        super (Rol.ANONIMO, Collections.emptyList());
    }

}
