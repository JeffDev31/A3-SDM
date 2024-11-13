package br.uam.sdm.config;

import br.uam.sdm.entities.Cliente;
import br.uam.sdm.repositories.ClienteRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
        Cliente marcelo = new Cliente(null, "marcelo", "itu", "SP", "48028922", 
        "marcelo@gmail.com", "369630518");
        Cliente carlos = new Cliente(null, "carlos", "santos", "SP", "48028933", 
        "carlos@gmail.com", "369630544");
               
        clienteRepository.saveAll(Arrays.asList(marcelo, carlos));
    }

}
