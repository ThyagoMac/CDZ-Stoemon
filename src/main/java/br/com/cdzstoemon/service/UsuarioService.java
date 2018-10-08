package br.com.cdzstoemon.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cdzstoemon.model.Usuario;
import br.com.cdzstoemon.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	//injeta o usuarioRespostory
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	
	
	
//	private Map<Integer, Usuario> usuarios = new HashMap<>();
//	private Integer proximoId=1;
	//regras de negocio
	
	public Usuario cadastrar(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
		
//		usuario.setId(proximoId++);
//		usuarios.put(usuario.getId(), usuario);
//		return usuario;
		
	}
	
	public Collection<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
//		return usuarios.values();
	}
	
	public void excluir (Usuario usuario) {
		usuarioRepository.delete(usuario);
//		usuarios.remove(usuario.getId());
	}
	
	public Usuario buscaPorId(Integer id) {
		return usuarioRepository.getOne(id);
//		return usuarios.get(id);
	}
	
	public Usuario alterar(Usuario usuario) {
		return usuarioRepository.save(usuario);
//		return usuarios.put(usuario.getId(), usuario);
	}
}
