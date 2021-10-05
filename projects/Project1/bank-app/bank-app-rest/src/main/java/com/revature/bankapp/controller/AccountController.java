package com.revature.bankapp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;

@Path("/accounts")
public class AccountController {
	@Context
	private HttpServletRequest httpServletRequest;
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	AccountDao dao = new AccountDaoImpl();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerAccounts(){
		LOGGER.info("GetAccounts Method Called");
		Customer customer = (Customer) httpServletRequest.getSession().getAttribute("customer");
		//System.out.println(httpServletRequest.getSession().getAttributeNames());
		LOGGER.debug("{}",customer);
		try {
			ArrayList<Account> accountList = (ArrayList<Account>) dao.showAccounts(4);
			LOGGER.info(" getting accounts Successfull");
			return Response.ok().entity(accountList).build();
			
		} catch (AppException e) {
			// TODO Auto-generated catch block
			LOGGER.info(" getting accounts failed");
			e.printStackTrace();
			return Response.status(500).build();
		}
		
		
		
		
	}
}