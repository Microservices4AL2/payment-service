package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreditCardInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2022-06-01T16:46:40.877Z")

public class CreditCardInfo   {
  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("cardOwner")
  private String cardOwner = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  @JsonProperty("cvv")
  private String cvv = null;

  public CreditCardInfo cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(example = "4012888888881881", value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CreditCardInfo cardOwner(String cardOwner) {
    this.cardOwner = cardOwner;
    return this;
  }

   /**
   * Get cardOwner
   * @return cardOwner
  **/
  @ApiModelProperty(example = "Jenny B", value = "")
  public String getCardOwner() {
    return cardOwner;
  }

  public void setCardOwner(String cardOwner) {
    this.cardOwner = cardOwner;
  }

  public CreditCardInfo expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CreditCardInfo cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

   /**
   * Get cvv
   * @return cvv
  **/
  @ApiModelProperty(value = "")
  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInfo creditCardInfo = (CreditCardInfo) o;
    return Objects.equals(this.cardNumber, creditCardInfo.cardNumber) &&
        Objects.equals(this.cardOwner, creditCardInfo.cardOwner) &&
        Objects.equals(this.expirationDate, creditCardInfo.expirationDate) &&
        Objects.equals(this.cvv, creditCardInfo.cvv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardOwner, expirationDate, cvv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInfo {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardOwner: ").append(toIndentedString(cardOwner)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
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

