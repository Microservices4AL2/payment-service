package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PaymentOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2022-06-01T16:46:40.877Z")

public class PaymentOutput   {
  @JsonProperty("id")
  private String id = null;

  /**
   * Payment Status
   */
  public enum PaymentStatusEnum {
    SUCCEDED("succeded"),
    
    PROCESSING("processing"),
    
    FAILED("failed"),
    
    REFUSED("refused");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentStatusEnum fromValue(String text) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("paymentStatus")
  private PaymentStatusEnum paymentStatus = null;

  public PaymentOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "pm_1L31tt2eZvKYlo2ChZQJXKWX", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentOutput paymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Payment Status
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "Payment Status")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOutput paymentOutput = (PaymentOutput) o;
    return Objects.equals(this.id, paymentOutput.id) &&
        Objects.equals(this.paymentStatus, paymentOutput.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOutput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

