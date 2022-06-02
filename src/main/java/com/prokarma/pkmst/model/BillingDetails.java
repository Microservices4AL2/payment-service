package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.Adress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BillingDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2022-06-01T16:46:40.877Z")

public class BillingDetails   {
  @JsonProperty("address")
  private Adress address = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phone")
  private String phone = null;

  public BillingDetails address(Adress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Adress getAddress() {
    return address;
  }

  public void setAddress(Adress address) {
    this.address = address;
  }

  public BillingDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "jenny@example.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BillingDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "jenny", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingDetails phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "15555555555", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingDetails billingDetails = (BillingDetails) o;
    return Objects.equals(this.address, billingDetails.address) &&
        Objects.equals(this.email, billingDetails.email) &&
        Objects.equals(this.name, billingDetails.name) &&
        Objects.equals(this.phone, billingDetails.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, name, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDetails {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

