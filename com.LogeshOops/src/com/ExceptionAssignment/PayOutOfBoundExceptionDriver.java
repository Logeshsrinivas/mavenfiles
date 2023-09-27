package com.ExceptionAssignment;

public class PayOutOfBoundExceptionDriver {
	
	public static void main(String[] args) {
        AccountManagement account = new AccountManagement();

        try {
            account.withdrawAmount(40000);
        } catch (PayOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
	}

}
