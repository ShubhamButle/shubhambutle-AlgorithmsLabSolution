package com.greatlearning.lab.algorithms;

import java.util.Scanner;

public class Transactions {

	private final Scanner scanner;

	private int noOfTransactions;
	private long[] transactions;

	public Transactions() {

		this.scanner = new Scanner(System.in);

	}

	void inputTransactionInformation() {

			System.out.println("Enter the size of transaction array -");

			noOfTransactions = scanner.nextInt();

			scanner.nextLine();

			transactions = new long[noOfTransactions];

			System.out.println("Enter the values of the array -");

					String transactionValuesInput = scanner.nextLine();

					String[] transactionValues = transactionValuesInput.split(" ");

					if (transactionValues.length != noOfTransactions) {

						System.out.println("Invalid no of transactions entered, please restart ");

							System.exit(0);

						}

						for (int i = 0; i<noOfTransactions; i++)
					 {
							transactions[i] = Long.parseLong(transactionValues[i]);
					}
			}

					void inputAndCheckTargetInformation() {

						System.out.println("Enter the total no of targets that needs to be achieved -");

							int noOfTargets = scanner.nextInt();

							Long[] targetValues = new Long[noOfTargets];

							for (int i = 0; i<noOfTargets; i++) {

								System.out.println("Enter the value of the target=");
									targetValues[i] = scanner.nextLong(); checkIfTargetAchieved(targetValues[i]);

								}
							}

							private void checkIfTargetAchieved(long targetValue) {

								boolean targetAchieved = false;
								int noOfTransactionsForTarget = 0;

								long sumOfTransactions = 0;

								for (int i = 0; i<noOfTransactions; i++) {
									sumOfTransactions += transactions[i];

									noOfTransactionsForTarget++;

									if (sumOfTransactions >= targetValue) {

										targetAchieved = true;

										break;

									}

								}

								if (targetAchieved) {

									System.out.println("Target achieved after "+ noOfTransactionsForTarget +" transactions\n ");

								} else {

									System.out.println("Given target is not achieved");

								}
							}
							
							public static void main(String[] args) {
								// TODO Auto-generated method stub
									
								Transactions transaction = new Transactions();
								
								transaction.inputTransactionInformation();
								transaction.inputAndCheckTargetInformation();
								
							}

							
						}