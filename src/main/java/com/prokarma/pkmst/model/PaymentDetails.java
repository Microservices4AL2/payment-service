package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BillingDetails;
import com.prokarma.pkmst.model.CreditCardInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PaymentDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2022-06-01T16:46:40.877Z")

public class PaymentDetails   {
  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("billingDetails")
  private BillingDetails billingDetails = null;

  @JsonProperty("creditCardInfo")
  private CreditCardInfo creditCardInfo = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public PaymentDetails paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(example = "pm_1L31tt2eZvKYlo2ChZQJXKWX", value = "")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentDetails billingDetails(BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }

   /**
   * Get billingDetails
   * @return billingDetails
  **/
  @ApiModelProperty(value = "")
  public BillingDetails getBillingDetails() {
    return billingDetails;
  }

  public void setBillingDetails(BillingDetails billingDetails) {
    this.billingDetails = billingDetails;
  }

  public PaymentDetails creditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

   /**
   * Get creditCardInfo
   * @return creditCardInfo
  **/
  @ApiModelProperty(value = "")
  public CreditCardInfo getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public PaymentDetails amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "150.0", value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PaymentDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.paymentId, paymentDetails.paymentId) &&
        Objects.equals(this.billingDetails, paymentDetails.billingDetails) &&
        Objects.equals(this.creditCardInfo, paymentDetails.creditCardInfo) &&
        Objects.equals(this.amount, paymentDetails.amount) &&
        Objects.equals(this.currency, paymentDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, billingDetails, creditCardInfo, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

