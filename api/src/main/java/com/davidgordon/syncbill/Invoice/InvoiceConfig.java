package com.davidgordon.syncbill.Invoice;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InvoiceConfig {
  
  @Bean
  CommandLineRunner commandLineRunner(InvoiceRepository repository) {
    return args -> {
      Invoice invoice = new Invoice();  
      
      invoice.setId(UUID.randomUUID());
      invoice.setSender("TD Bank");
      invoice.setTitle("Mortgage");
      invoice.setCategory(InvoiceCategory.MORTGAGE);
      invoice.setAmountDue(1727.27f);
      invoice.setDateRecieved(LocalDate.now().minusDays(3));
      invoice.setDueDate(LocalDate.now().plusDays(15));

      repository.save(invoice);
    };
  }
}
