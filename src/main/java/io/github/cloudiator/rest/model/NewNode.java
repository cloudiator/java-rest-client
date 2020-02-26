/*
 * Cloudiator REST Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.rest.model.IpAddress;
import io.github.cloudiator.rest.model.LoginCredential;
import io.github.cloudiator.rest.model.NodeProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Represents a new node that is to be created 
 */
@ApiModel(description = "Represents a new node that is to be created ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-13T10:47:33.672+01:00[Europe/Berlin]")
public class NewNode implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOGIN_CREDENTIAL = "loginCredential";
  @SerializedName(SERIALIZED_NAME_LOGIN_CREDENTIAL)
  private LoginCredential loginCredential;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ipAddresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<IpAddress> ipAddresses = null;

  public static final String SERIALIZED_NAME_NODE_PROPERTIES = "nodeProperties";
  @SerializedName(SERIALIZED_NAME_NODE_PROPERTIES)
  private NodeProperties nodeProperties;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_DIAGNOSTIC = "diagnostic";
  @SerializedName(SERIALIZED_NAME_DIAGNOSTIC)
  private String diagnostic;

  public static final String SERIALIZED_NAME_NODE_CANDIDATE = "nodeCandidate";
  @SerializedName(SERIALIZED_NAME_NODE_CANDIDATE)
  private String nodeCandidate;


  public NewNode name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Human-readable name for the node. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable name for the node. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewNode loginCredential(LoginCredential loginCredential) {
    
    this.loginCredential = loginCredential;
    return this;
  }

   /**
   * Get loginCredential
   * @return loginCredential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoginCredential getLoginCredential() {
    return loginCredential;
  }


  public void setLoginCredential(LoginCredential loginCredential) {
    this.loginCredential = loginCredential;
  }


  public NewNode ipAddresses(List<IpAddress> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public NewNode addIpAddressesItem(IpAddress ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<IpAddress>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * The public/private ip addresses under which this node is reachable. 
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public/private ip addresses under which this node is reachable. ")

  public List<IpAddress> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<IpAddress> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public NewNode nodeProperties(NodeProperties nodeProperties) {
    
    this.nodeProperties = nodeProperties;
    return this;
  }

   /**
   * Get nodeProperties
   * @return nodeProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeProperties getNodeProperties() {
    return nodeProperties;
  }


  public void setNodeProperties(NodeProperties nodeProperties) {
    this.nodeProperties = nodeProperties;
  }


  public NewNode reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason this node was created 
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason this node was created ")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public NewNode diagnostic(String diagnostic) {
    
    this.diagnostic = diagnostic;
    return this;
  }

   /**
   * Diagnostic information about the node state 
   * @return diagnostic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Diagnostic information about the node state ")

  public String getDiagnostic() {
    return diagnostic;
  }


  public void setDiagnostic(String diagnostic) {
    this.diagnostic = diagnostic;
  }


  public NewNode nodeCandidate(String nodeCandidate) {
    
    this.nodeCandidate = nodeCandidate;
    return this;
  }

   /**
   * The node candidate this node was created from if applicable. 
   * @return nodeCandidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The node candidate this node was created from if applicable. ")

  public String getNodeCandidate() {
    return nodeCandidate;
  }


  public void setNodeCandidate(String nodeCandidate) {
    this.nodeCandidate = nodeCandidate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewNode newNode = (NewNode) o;
    return Objects.equals(this.name, newNode.name) &&
        Objects.equals(this.loginCredential, newNode.loginCredential) &&
        Objects.equals(this.ipAddresses, newNode.ipAddresses) &&
        Objects.equals(this.nodeProperties, newNode.nodeProperties) &&
        Objects.equals(this.reason, newNode.reason) &&
        Objects.equals(this.diagnostic, newNode.diagnostic) &&
        Objects.equals(this.nodeCandidate, newNode.nodeCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, loginCredential, ipAddresses, nodeProperties, reason, diagnostic, nodeCandidate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewNode {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loginCredential: ").append(toIndentedString(loginCredential)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    nodeProperties: ").append(toIndentedString(nodeProperties)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    diagnostic: ").append(toIndentedString(diagnostic)).append("\n");
    sb.append("    nodeCandidate: ").append(toIndentedString(nodeCandidate)).append("\n");
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

