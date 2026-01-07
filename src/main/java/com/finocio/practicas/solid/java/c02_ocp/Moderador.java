package com.finocio.practicas.solid.java.c02_ocp;

import java.util.List;

public class Moderador extends Usuario{

    public Moderador (Rol rol, List<Permiso> permisos){
        super (Rol.MODERADOR, List.of(Permiso.ESCRITURA, Permiso.LECTURA));
    }

}
