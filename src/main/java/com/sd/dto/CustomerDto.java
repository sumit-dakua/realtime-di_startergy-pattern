package com.sd.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {

  private String customerNo;
  private String customerName;
  private String customerAddress;
  private String principleAmount;
  private String rateOfInterest;
  private String timePeriod;

  public String getCustomerNo() {
    return customerNo;
  }

  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  public String getPrincipleAmount() {
    return principleAmount;
  }

  public void setPrincipleAmount(String principleAmount) {
    this.principleAmount = principleAmount;
  }

  public String getRateOfInterest() {
    return rateOfInterest;
  }

  public void setRateOfInterest(String rateOfInterest) {
    this.rateOfInterest = rateOfInterest;
  }

  public String getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }

  // getters and setter
  //

}
