package io.pleo.antaeus.core.services

import io.pleo.antaeus.core.external.PaymentProvider

class BillingService(
    private val paymentProvider: PaymentProvider
) {
   // TODO - Add code e.g. here
    for(invoice in invoiceService.fetchAll()){
      if(invoice.status== InvoiceStatus.PENDING){//check that invoice is not alrady paid
         if(paymentProvider.charge(invoice)){//get paid if posible
             //update invoice
         }
         else{
             //handle customers unable to pay
         }
      } 
    }
}
