package com.davidgordon.syncbill.Invoice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    return invoiceService.findInvoiceById(id);
  }

  @DeleteMapping("/deleteInvoice/{id}")
  public Invoice deleteInvoice(@PathVariable UUID id) {
    return invoiceService.deletInvoiceById(id);
  }

  @PostMapping("/createInvoice") 
  public Invoice createInvoice(@RequestBody String invoiceJSON) {
    return invoiceService.createInvoice(invoiceJSON);
  }
}