# CIMB - Decorator Pattern

This repository contains the solution for the CIMB banking activity using the **Decorator Design Pattern**.

## Problem Statement

CIMB is a digital bank that offers GSave and UpSave savings accounts. As with a typical Savings Account, it contains account Number, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%. The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%. Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%. Benefits include the "Standard Savings Account" plus "with Insurance".

Develop a decorator pattern approach that will implement the given UML diagram.

## UML Class Diagram

![UML Class Diagram](Place_Your_UML_Image_Here.png)

## Files Included

* `Cimb.java` (Main class)
* `BankAccount.java` (Interface)
* `SavingsAccount.java`
* `BankAccountDecorator.java` (Interface)
* `GSave.java`
* `UpSave.java`

## Description of the following methods

1.  **showAccountType()** - Either returns "Savings Account", "GSave" or "UpSave"
2.  **getInterestRate()** - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave
3.  **getBalance()** - Returns the balance of the account set.
4.  **showBenefits()** - Either returns "Standard Savings Account" for Savings Account; benefits offered by savings account + "GSave Transfer"; benefits offered by savings account + "With Insurance";
5.  **computeBalanceWithInterest()** - returns new balance by computing the balance plus the interest depending on the interest rate.
6.  **showInfo()** - Returns details of account number, account name, and balance.
