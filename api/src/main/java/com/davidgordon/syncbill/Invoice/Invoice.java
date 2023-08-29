package com.davidgordon.syncbill.Invoice;

import java.util.Date;
import java.util.UUID;

public class Invoice {
  private UUID id;
  private float amountDue;
  private Date uploadDate;
  private Date dueDate;
  private Date dateRecieved;
  
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public float getAmountDue() {
    return amountDue;
  }
  public void setAmountDue(float amountDue) {
    this.amountDue = amountDue;
  }
  public Date getUploadDate() {
    return uploadDate;
  }
  public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }
  public Date getDueDate() {
    return dueDate;
  }
  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
  public Date getDateRecieved() {
    return dateRecieved;
  }
  public void setDateRecieved(Date dateRecieved) {
    this.dateRecieved = dateRecieved;
  }
}