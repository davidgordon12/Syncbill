package com.davidgordon.syncbill.Invoice;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceService {
  private final InvoiceRepository invoiceRepository;

  @Autowired
  public InvoiceService(InvoiceRepository invoiceRepository) {
    this.invoiceRepository = invoiceRepository;
  }

  public Invoice getInvoiceById(UUID id) {
    Optional<Invoice> invoice = invoiceRepository.getInvoiceById(id);

    if(invoice.isPresent()) {
      return invoice.get();
    }
    
    return null;
  }
}
