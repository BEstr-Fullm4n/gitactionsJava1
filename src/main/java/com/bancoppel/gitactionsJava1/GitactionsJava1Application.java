
package com.bancoppel.gitactionsJava1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot.
 */
@SpringBootApplication
public final class GitactionsJava1Application {
    /**
     * Constructor privado para la aplicación.
     */
    private GitactionsJava1Application() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de línea de comandos
     *
     */
    public static void main(final String[] args) {
        SpringApplication.run(GitactionsJava1Application.class, args);
    }
}
