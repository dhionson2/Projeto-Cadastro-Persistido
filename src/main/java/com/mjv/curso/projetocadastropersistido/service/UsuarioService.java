package com.mjv.curso.projetocadastropersistido.service;

import com.mjv.curso.projetocadastropersistido.file.CadastroPersistido;
import com.mjv.curso.projetocadastropersistido.model.Usuario;

import java.util.List;

public class UsuarioService {

    public static void main(String[] args) {
        CadastroPersistido cadastroPersistido = new CadastroPersistido();

        Usuario usuario1 = new Usuario("Fulano Silva", 30, "Engenheiro");
        Usuario usuario2 = new Usuario("Ciclano Santos", 25, "Designer");

        cadastroPersistido.gravarUsuario(usuario1);
        cadastroPersistido.gravarUsuario(usuario2);

        List<Usuario> usuariosLidos = cadastroPersistido.lerUsuarios();
        for (Usuario usuario : usuariosLidos) {
            System.out.println("Nome: " + usuario.getNomeCompleto() +
                    ", Idade: " + usuario.getIdade() +
                    ", Profissão: " + usuario.getProfissao());
        }
    }
}
