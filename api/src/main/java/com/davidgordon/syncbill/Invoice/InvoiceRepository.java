package com.davidgordon.syncbill.Invoice;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository 
  extends JpaRepository<Invoice, Integer> {
  
    @Query("")
    public Optional<Invoice> createInvoice(Invoice invoice);

    @Query("")
    public Optional<List<Invoice>> getAllInvoices();

    @Query("")
    public Optional<Invoice> getInvoiceById(UUID id);

    @Query("")
    public Optional<Invoice> deleteInvoiceById(UUID id);

    @Query("")
    public Optional<Invoice> updateInvoiceById(UUID id);
}
