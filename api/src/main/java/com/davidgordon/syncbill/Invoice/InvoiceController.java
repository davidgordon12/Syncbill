package com.davidgordon.syncbill.Invoice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/invoice")
public class InvoiceController {
  private final InvoiceService invoiceService;

  @Autowired
  public InvoiceController(InvoiceService invoiceService) {
    this.invoiceService = invoiceService;
  }

  @GetMapping("/getInvoice/{id}")
  public Invoice getInvoiceById(@PathVariable UUID id) {
    Invoice invoice = invoiceService.getInvoiceById(id);

    if(invoice != null) {
      return invoice;
    }

    return new Invoice();
  }
}
