package com.ExceptionAssignment;


class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String message) {
        super(message);
    }
}

class AccountManagement {
    private int currentBalance = 80000;

    public void checkForDebit(int amount) throws PayOutOfBoundsException {
        if (amount > 30000) {
            throw new PayOutOfBoundsException("Transation amount exceeds the limit!");
        } else if (amount > currentBalance) {
            throw new PayOutOfBoundsException("Amount Exceeded insufficient!");
        } else {
            System.out.println("Transaction successful!");
        }
    }

    public void withdrawAmount(int amount) throws PayOutOfBoundsException {
        checkForDebit(amount);
        currentBalance -= amount;
        System.out.println("Current balance: " + currentBalance);
    }
}


    

