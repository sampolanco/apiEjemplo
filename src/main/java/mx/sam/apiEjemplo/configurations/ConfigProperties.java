package mx.sam.apiEjemplo.configurations;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).
		setMatchingStrategy(MatchingStrategies.STRICT);;
	    return mapper;
	}
	
}
