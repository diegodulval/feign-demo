/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dulval.demo.feign;

import com.dulval.demo.feign.dto.Endereco;
import com.dulval.demo.feign.services.ViaCEPClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author diego
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ViaCEPClient client) {
        return args -> {
            if (args.length > 0) {
                String cep = args[0];

                Endereco endereco = client
                        .buscaEnderecoPor(cep);

                System.out.println(endereco);
            }
        };
    }
}
