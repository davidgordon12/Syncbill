package com.davidgordon.syncbill.Invoice;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class InvoiceService {
  private final InvoiceRepository invoiceRepository;

  @Autowired
  public InvoiceService(InvoiceRepository invoiceRepository) {
    this.invoiceRepository = invoiceRepository;
  }

  public Invoice findInvoiceById(UUID id) {
    Optional<Invoice> invoice = invoiceRepository.findById(id);

    if(invoice.isPresent()) {
      return invoice.get();
    }
    else {
      return new Invoice();
    }
  }

  public Invoice createInvoice(String invoiceJSON) {
    try {
      Gson g = new GsonBuilder()
        .registerTypeAdapter(LocalDate.class, new InvoiceTypeAdapter().nullSafe())
        .create();

      Invoice invoice = g.fromJson(invoiceJSON, Invoice.class);
      invoiceRepository.save(invoice);
      return invoice;
    }
    catch(Exception e) {
      System.out.println("There was a problem saving the invoice. Exception: " + e);
      return null;
    }
  }

  public Invoice deletInvoiceById(UUID id) {
    try {
      Optional<Invoice> invoice = invoiceRepository.findById(id);
      if(invoice.isPresent()) {
        invoiceRepository.delete(invoice.get());
      }
      return invoice.get();
    } 
    catch(Exception e) {
      System.out.println("There was a problem deleting the invoice. Exception: " + e);
      return null;
    }
  }
}
