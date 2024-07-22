package br.com.alura.codechella.application.usecases;


import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public class CriarUsuario {

    private final RepositorioUsuario repositorio;

    public  CriarUsuario(RepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}
