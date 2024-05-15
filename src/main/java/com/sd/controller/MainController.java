package com.sd.controller;

import com.sd.dto.CustomerDto;
import com.sd.service.IcustomerService;
import com.sd.vo.CustomerVo;

/**
 * MainController
 */
public class MainController {

  private IcustomerService service;

  public MainController(IcustomerService service) {
    this.service = service;
  }

  public String processCutomer(CustomerVo custVo) throws Exception {

    CustomerDto dto = new CustomerDto();
    dto.setCustomerName(custVo.getCustomerName());
    dto.setCustomerAddress(custVo.getCustomerAddress());
    dto.setPrincipleAmount(custVo.getPrincipleAmount());
    dto.setRateOfInterest(custVo.getRateOfInterest());
    dto.setTimePeriod(custVo.getTimePeriod());

    // using service
    String resultMsg = service.registerCustomer(dto);
    return resultMsg;
  }

}
