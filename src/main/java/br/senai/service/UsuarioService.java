package br.senai.service;

import br.senai.model.Usuario;

import java.util.List;

public interface UsuarioService {
    //pesquise todos
    public List<Usuario> findAll();
    //pesquise pelo usuario aparti do id
    public Usuario findById(Long id);
    //novo usurio
    public Usuario create(Usuario usuario);
    //editar usuario
    public Usuario update(Usuario usuario,long id);
    //deletar usuario
    public void delete(long id);
}
