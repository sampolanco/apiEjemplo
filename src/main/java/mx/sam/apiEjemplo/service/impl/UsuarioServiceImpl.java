package mx.sam.apiEjemplo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import mx.sam.apiEjemplo.dto.UsuarioDTO;
import mx.sam.apiEjemplo.model.Usuario;
import mx.sam.apiEjemplo.model.builder.UsuarioBuilder;
import mx.sam.apiEjemplo.repo.IUSuarioRepo;
import mx.sam.apiEjemplo.service.IUsuarioService;


/*
 * Implementacion de servicio para Usuario
 * @author Samuel
 * @version 1.0
 * */
@Service
public class UsuarioServiceImpl implements IUsuarioService{
	@Autowired
	IUSuarioRepo repo;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<UsuarioDTO> findAll() {
		List<Usuario> entityList = repo.findAll();
		List<UsuarioDTO> dtoList = new ArrayList<UsuarioDTO>();

		dtoList = entityList.stream().map(source -> modelMapper.map(source, UsuarioDTO.class))
				.collect(Collectors.toList());

		return dtoList;

	}

	@Override
	public UsuarioDTO findById(Integer id) {
		Assert.notNull(id, "id");

		Optional<Usuario> entity = repo.findById(id);
		UsuarioDTO dto = new UsuarioDTO();

		if (entity.isPresent())
			modelMapper.map(entity.get(), dto);

		return dto;
	}

	@Override
	public UsuarioDTO save(UsuarioDTO obj) {
		Assert.notNull(obj, "obj");
		UsuarioDTO dtoSaved = new UsuarioDTO();
		UsuarioBuilder builder = new UsuarioBuilder(new Usuario());

		builder.setDTO(obj);
		Usuario entity = builder.build();
		Usuario entitySaved = repo.save(entity);

		modelMapper.map(entitySaved, dtoSaved);
		return dtoSaved;
	}

	@Override
	public UsuarioDTO update(Integer id, UsuarioDTO obj) {
		Assert.notNull(id, "id");
		Assert.notNull(obj, "obj");
		
		UsuarioDTO dtoSaved = new UsuarioDTO();
		Optional<Usuario> optional = repo.findById(id.intValue());

		if (!optional.isPresent())
			return null;

		UsuarioBuilder builder = new UsuarioBuilder(optional.get());
		builder.setDTO(obj);
		Usuario entity = builder.build();
		Usuario entitySaved = repo.save(entity);

		modelMapper.map(entitySaved, dtoSaved);
		return dtoSaved;
	}

	@Override
	public boolean delete(Integer id) {
		Assert.notNull(id, "id");
		final boolean borrado = true;

		Optional<Usuario> optional = repo.findById(id.intValue());

		if (!optional.isPresent())
			return false;

		Usuario entity = optional.get();
		Usuario entitySaved = repo.save(entity);

		if (entitySaved == null)
			return false;
		return true;
	}
}
