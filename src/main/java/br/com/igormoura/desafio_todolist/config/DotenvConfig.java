package br.com.igormoura.desafio_todolist.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.github.cdimascio.dotenv.Dotenv;

@Component
public class DotenvConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Dotenv dotenv = Dotenv.load();

        System.out.println("DB URL: " + dotenv.get("SPRING_DATASOURCE_URL"));
        System.out.println("DB User: " + dotenv.get("SPRING_DATASOURCE_USERNAME"));
    }
}
