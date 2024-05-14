package com.sd.controller;

import com.sd.service.IcustomerService;

/**
 * MainController
 */
public class MainController {

  private IcustomerService service;

  public MainController(IcustomerService service) {
    this.service = service;
  }

}
