package com.sd.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {

  private String customerNo;
  private String customerName;
  private String customerAddress;
  private double principleAmount;
  private double rateOfInterest;
  private double timePeriod;

  // getters and setter
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

  public double getPrincipleAmount() {
    return principleAmount;
  }

  public void setPrincipleAmount(double principleAmount) {
    this.principleAmount = principleAmount;
  }

  public double getRateOfInterest() {
    return rateOfInterest;
  }

  public void setRateOfInterest(double rateOfInterest) {
    this.rateOfInterest = rateOfInterest;
  }

  public double getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(double timePeriod) {
    this.timePeriod = timePeriod;
  }

  //

}
