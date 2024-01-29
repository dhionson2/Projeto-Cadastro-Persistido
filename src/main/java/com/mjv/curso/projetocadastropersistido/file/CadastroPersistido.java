package com.mjv.curso.projetocadastropersistido.file;

import com.mjv.curso.projetocadastropersistido.model.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CadastroPersistido {

    private static final String NOME_ARQUIVO = "E:/CursoJava/Workspace/projeto-cadastro-persistido/projeto-cadastro-persistido/usuarios.txt";


    public static void gravarUsuario(Usuario usuario) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(NOME_ARQUIVO, true))) {
            writer.println(usuario.getNomeCompleto() + "," + usuario.getIdade() + "," + usuario.getProfissao());
            System.out.println("Usuário gravado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar usuário: " + e.getMessage());
        }
    }

    public static List<Usuario> lerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                Usuario usuario = new Usuario();
                usuario.setNomeCompleto(partes[0]);
                usuario.setIdade(Integer.parseInt(partes[1]));
                usuario.setProfissao(partes[2]);
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler usuários: " + e.getMessage());
        }
        return usuarios;
    }
}
