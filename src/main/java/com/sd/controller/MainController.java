package com.sd.controller;

import com.sd.dto.CustomerDto;
import com.sd.service.IcustomerService;
import com.sd.vo.CustomerVo;

/**
 * MainController
 */
public class MainController {

  private IcustomerService custService;

  public MainController(IcustomerService custService) {
    this.custService = custService;
  }

  public String processCutomer(CustomerVo custVo) throws Exception {

    CustomerDto dto = new CustomerDto();
    dto.setCustomerName(custVo.getCustomerName());
    dto.setCustomerAddress(custVo.getCustomerAddress());
    dto.setPrincipleAmount(Double.parseDouble(custVo.getPrincipleAmount()));
    dto.setRateOfInterest(Double.parseDouble(custVo.getRateOfInterest()));
    dto.setTimePeriod(Double.parseDouble(custVo.getTimePeriod()));

    // using service
    String resultMsg = custService.registerCustomer(dto);
    return resultMsg;
  }

}
