package mx.sam.apiEjemplo.controller.api.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.sam.apiEjemplo.dto.UsuarioDTO;
import mx.sam.apiEjemplo.service.IUsuarioService;

@RestController
@RequestMapping(path="/Usuario")
public class UsuarioController {
	@Autowired
	IUsuarioService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public List<UsuarioDTO> get() {
		List<UsuarioDTO> lista=service.findAll();
		return lista;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public UsuarioDTO post(@RequestBody UsuarioDTO dto) {
		UsuarioDTO saved=service.save(dto);
		return saved;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public UsuarioDTO put(@PathVariable Integer id,@RequestBody UsuarioDTO dto) {
		UsuarioDTO saved=service.update(id,dto);
		return saved;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/{id}")
	public UsuarioDTO findById(@PathVariable Integer id) {
		UsuarioDTO dto=service.findById(id);
		return dto;
	}
}
