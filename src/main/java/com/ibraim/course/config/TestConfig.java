package com.ibraim.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ibraim.course.entities.User;
import com.ibraim.course.repositories.UserRepository;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Configuration // Especifica para o perfil de testes
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired // O proprio Spring instancia as dependencias.
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // Sempre que for iniciado o spring vai subir.

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
