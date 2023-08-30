package com.davidgordon.syncbill.Invoice;

import java.time.LocalDate;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String sender;
  private String title;
  private InvoiceCategory category;
  private float amountDue;
  private LocalDate uploadDate;
  private LocalDate dueDate;
  private LocalDate dateRecieved;
  
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InvoiceCategory getCategory() {
    return category;
  }

  public void setCategory(InvoiceCategory category) {
    this.category = category;
  }
 
  public float getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(float amountDue) {
    this.amountDue = amountDue;
  }

  public LocalDate getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(LocalDate uploadDate) {
    this.uploadDate = uploadDate;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public LocalDate getDateRecieved() {
    return dateRecieved;
  }

  public void setDateRecieved(LocalDate dateRecieved) {
    this.dateRecieved = dateRecieved;
  }
}
