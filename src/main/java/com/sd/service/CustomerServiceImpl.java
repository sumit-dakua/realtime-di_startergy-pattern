package com.sd.service;

import com.sd.bo.CustomerBo;
import com.sd.dao.ICustomerDao;
import com.sd.dto.CustomerDto;

public class CustomerServiceImpl implements IcustomerService {

  private ICustomerDao dao;

  public CustomerServiceImpl(ICustomerDao dao) {
    this.dao = dao;
  }

  public String registerCustomer(CustomerDto custDto) throws Exception {

    double interestAmount = (custDto.getPrincipleAmount() * custDto.getRateOfInterest() * custDto.getTimePeriod())
        / 100;

    CustomerBo bo = new CustomerBo();
    bo.setCustomerName(custDto.getCustomerName());
    bo.setCustomerAddress(custDto.getCustomerAddress());
    bo.setPrincipleAmount(custDto.getPrincipleAmount());
    bo.setInterestAmount(interestAmount);

    int count = dao.insert(bo);

    return count == 0 ? "Registration failed " : "Registration succeed : : interest amount ->" + interestAmount;

  }
}
