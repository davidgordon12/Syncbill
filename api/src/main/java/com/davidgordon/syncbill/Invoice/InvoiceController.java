package com.davidgordon.syncbill.Invoice;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
    Invoice invoice = invoiceService.createFakeInvoice();

    if(invoice != null) {
      return invoice;
    }

    return invoice;
  }

  @PostMapping("/createInvoice") 
  public Invoice createInvoice(@RequestBody String invoiceJSON) {
    Gson g = new GsonBuilder()
      .registerTypeAdapter(LocalDate.class, new InvoiceTypeAdapter().nullSafe())
      .create();

    Invoice invoice = g.fromJson(invoiceJSON, Invoice.class);

    if(invoiceService.createInvoice(invoice) != null) {
      return invoice;
    }

    throw new IllegalArgumentException("The invoice was in an incorrect format");
  }
}