package com.davidgordon.syncbill.Invoice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InvoiceConfig {

    @Bean
    CommandLineRunner commandLineRunner(InvoiceRepository repository) {
        return args -> { };
    }
}