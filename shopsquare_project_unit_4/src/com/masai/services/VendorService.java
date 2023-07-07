package com.masai.services;

import java.util.List;
import java.util.Map;

import com.masai.entity.Customer;
import com.masai.entity.Vendor;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.ProductException;

public interface VendorService {
		
	public boolean login(String email,String password, Map<String, Vendor> vendor) throws InvalidDetailsException;

	public void signUp(Vendor ven, Map<String, Vendor> vendor) throws DuplicateDataException;
	
	public Vendor viewVendorDetails(String email, Map<String, Vendor> vendor);
	
	public List<Vendor> viewAllVendors(Map<String, Vendor> vendor) throws ProductException;
}
