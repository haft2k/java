/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. All rights reserved.
 * address: Viet Nam
 * This software is the confidential and proprietary
 * information of GumBox, Inc
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it
 * only in
 * accordance with the terms of the license agreement you
 * entered into
 * with GumBox
 */
/**
 *
 */
package unit10_btvn1;

/**
 * @author falcon
 *
 */
public class Transaction implements Comparable<Transaction> {
	private Customer trader;
	private int year; // Năm thực hiện giao dịch
	private String prodName;// Tên sản phẩm
	private int amount; // Số lượng

	public Transaction(Customer trader, int year, String prodName, int amount) {
		this.trader = trader;
		this.year = year;
		this.prodName = prodName;
		this.amount = amount;
	}

	public Customer getTrader() { return trader; }

	public void setTrader(Customer trader) { this.trader = trader; }

	public Integer getYear() { return this.year; }

	public void setYear(Integer year) { this.year = year; }

	public String getProdName() { return prodName; }

	public void setProdName(String prodName) { this.prodName = prodName; }

	public Integer getAmount() { return amount; }

	public void setAmount(Integer amount) { this.amount = amount; }

	@Override
	public String toString() {
		return this.trader + "\nYear: " + this.year + " - Amount: " + this.amount;
	}

	@Override
	public int compareTo(Transaction o1) {
		return o1.getAmount().compareTo(this.getAmount());
	}

}
