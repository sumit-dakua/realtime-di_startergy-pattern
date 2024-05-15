package com.sd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sd.bo.CustomerBo;

class CustomerDaoPostgres implements ICustomerDao {

  private static String CUSTOMER_INSERT_QUERY = "INSERT INTO realtimedi_customer(cname,cadd,pamt,interamt) VALUES(?,?,?,?)";

  private DataSource ds;

  @Override
  public int insert(CustomerBo custBo) throws Exception {
    int count = 0;
    try (Connection con = ds.getConnection();
        PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY)) {
      if (ps != null) {

      }

    } catch (SQLException se) {
      se.printStackTrace();

    }

    return count;

  }

}
