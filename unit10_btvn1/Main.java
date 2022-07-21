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


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 *
 * @author falcon
 */
public class Main {
	public static void main(String[] args) {
		List<Customer> listCustomers = new ArrayList<>();
		List<Transaction> listTransactions = new ArrayList<>();

		listCustomers.add(new Customer("John", "USA"));
		listCustomers.add(new Customer("Duy Ha", "Viet Nam"));
		listCustomers.add(new Customer("Zhen Chen", "Singapor"));
		listCustomers.add(new Customer("calkj", "Singapor"));

		listTransactions.add(new Transaction(listCustomers.get(0), 2000, "HPG", 1000));
		listTransactions.add(new Transaction(listCustomers.get(1), 2020, "VIC", 300));
		listTransactions.add(new Transaction(listCustomers.get(2), 2021, "LDG", 500));
		listTransactions.add(new Transaction(listCustomers.get(2), 2021, "LDG", 200));
		listTransactions.add(new Transaction(listCustomers.get(2), 2021, "LDG", 100));
		listTransactions.add(new Transaction(listCustomers.get(2), 2021, "LDG", 400));

		List<Transaction> listTransaction2021 = listTransactions.stream()
								.filter(s -> s.getYear() >= 2021)
								.collect(Collectors.toList());
		/* listTransaction2021.forEach(System.out::println); */
		// for (Transaction transaction : listTransaction2021) {
		// System.out.println(transaction);
		// }

		/*
		 * 2.1. giao dịch thực hiện trong năm 2021 và sắp xếp chúng theo số lượng tăng dần.
		 */

		List<Transaction> listTransaction2021Sorted = listTransaction2021.stream()
								.sorted(Comparator.comparing(Transaction::getAmount))
								.collect(Collectors.toList());
		// .sorted((o1, o2) -> o1.getAmount().compareTo(o2.getAmount()))
		// listTransaction2021Sorted.forEach(System.out::println);

		/* 2.2. In ra danh sách các địa chỉ của Customer (trùng thì loại) */
		List<Customer> listDistinctCustomers = listCustomers.stream()
								.filter(distinctByKey(Customer::getAddress))
								.collect(Collectors.toList());
		listDistinctCustomers.forEach(System.out::println);

		/*
		 * 2.2.1.
		 */

	}


	/*
	 * Consider distinct to be a stateful filter. Here is a function that returns a predicate that
	 * maintains state about what it's seen previously, and that returns whether the given element was
	 * seen for the first time:
	 * 1. public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	 * Set<Object> seen = ConcurrentHashMap.newKeySet();
	 * return t -> seen.add(keyExtractor.apply(t));}
	 * 2. persons.stream().filter(distinctByKey(Person::getName))
	 */
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}
}
