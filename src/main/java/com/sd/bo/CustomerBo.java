package com.sd.bo;

public class CustomerBo {

  private String customerNo;
  private String customerName;
  private String customerAddress;
  private double principleAmount;
  private double InterestAmount;

  // getters and setters
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

  public double getInterestAmount() {
    return InterestAmount;
  }

  public void setInterestAmount(double interestAmount) {
    InterestAmount = interestAmount;
  }

}
