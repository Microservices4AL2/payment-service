package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Adress
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2022-06-01T16:46:40.877Z")

public class Adress   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("line1")
  private String line1 = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("state")
  private String state = null;

  public Adress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Kianaport", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Adress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "QA", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Adress line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(example = "26781 Margarette Port", value = "")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public Adress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "42105", value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Adress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "South Dakota", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adress adress = (Adress) o;
    return Objects.equals(this.city, adress.city) &&
        Objects.equals(this.country, adress.country) &&
        Objects.equals(this.line1, adress.line1) &&
        Objects.equals(this.postalCode, adress.postalCode) &&
        Objects.equals(this.state, adress.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, line1, postalCode, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

