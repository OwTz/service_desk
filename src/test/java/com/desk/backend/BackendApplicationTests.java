package com.desk.backend;

import com.desk.backend.repository.CardRepository;
import com.desk.backend.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private UsuarioRepository query;

	@Autowired
	private CardRepository queryCard;

	@Test
	void databaseUsers(){
		System.out.println(query.findAll().toString());
		query.findAll().toString();
		System.out.println("realizando busca no banco");
		System.out.println(queryCard.findAll().toString());
		queryCard.findAll().toString();
	}
	@Test
	void contextLoads() {


	}

}
