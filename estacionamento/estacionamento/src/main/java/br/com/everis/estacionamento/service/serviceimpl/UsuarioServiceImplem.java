package br.com.everis.estacionamento.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.estacionamento.model.Usuario;
import br.com.everis.estacionamento.repository.UsuarioRepository;
import br.com.everis.estacionamento.service.UsuarioService;

@Service
public class UsuarioServiceImplem implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(Long IdUsuario) {
		return usuarioRepository.findById(IdUsuario).get();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
