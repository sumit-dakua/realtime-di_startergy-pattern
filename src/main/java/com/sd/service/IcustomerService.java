package com.sd.service;

import com.sd.dto.CustomerDto;

/**
 * IcustomerService
 */
public interface IcustomerService {

  public String registerCustomer(CustomerDto custDto) throws Exception;
}
