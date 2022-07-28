/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. All rights reserved.
 * address: Viet Nam
 * This software is the confidential and proprietary information of GumBox, Inc
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with GumBox
 */
package unit10_btvn1;

/**
 *
 * @author falcon
 */
public class Customer implements Comparable<Customer>{
	private String name, address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getAddress() { return address; }

	public void setAddress(String address) { this.address = address; }

	@Override
	public String toString() {
		return "Customer Name: " + this.name + " Address: " + this.address;
	}

	@Override
	public int compareTo(Customer cus1) {
//		return cus1.getName().compareTo(this.name);
		return 0;
	}


}
