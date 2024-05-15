package com.sd.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sd.controller.MainController;
import com.sd.vo.CustomerVo;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    // read inputs from enduser as String values
    Scanner sc = new Scanner(System.in);
    String customerName = null, customerAddress = null, principleAmount = null, rateOfInterest = null,
        timePeriod = null;
    if (sc != null) {
      System.out.println("Enter  customer name::");
      customerName = sc.next();
      System.out.println("Enter  customer address::");
      customerAddress = sc.next();
      System.out.println("Enter  customer principle amount::");
      principleAmount = sc.next();
      System.out.println("Enter  rate  of intrest::");
      rateOfInterest = sc.next();
      System.out.println("Enter  time in months::");
      timePeriod = sc.next();
    }
    // prepare VO class object having inputs
    CustomerVo vo = new CustomerVo();
    vo.setCustomerName(customerName);
    vo.setCustomerAddress(customerAddress);
    vo.setPrincipleAmount(principleAmount);
    vo.setRateOfInterest(rateOfInterest);
    vo.setTimePeriod(timePeriod);
    // create IOC contatiner
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/sd/config/applicationContext.xml");

    // get controller class object
    MainController controller = factory.getBean("controller", MainController.class);
    try {
      String resultMsg = controller.processCutomer(vo);
      System.out.println(resultMsg);
    } catch (Exception e) {
      System.err.println("problem in customer registration: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
