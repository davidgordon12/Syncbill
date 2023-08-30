package com.davidgordon.syncbill.Invoice;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
  public Invoice createFakeInvoice() {
    Invoice invoice = new Invoice();
    
    invoice.setId(UUID.randomUUID());
    invoice.setFrom("TD Bank");
    invoice.setTitle("Mortgage");
    invoice.setCategory(InvoiceCategory.MORTGAGE);
    invoice.setAmountDue(1727.27f);
    invoice.setDateRecieved(LocalDate.now().minusDays(3));
    invoice.setDueDate(LocalDate.now().plusDays(15));

    return invoice;
  }

  public Invoice createInvoice(Invoice invoice) {
    return invoice;
  }
}
