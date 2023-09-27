package com.ExceptionAssignment;


class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

        validateInput();
    }

    private void validateInput() {
        if (partNumber <= 0) {
            throw new IllegalArgumentException("Part number Should be greater than 0");
        }
        if (partDescription == null || partDescription.isEmpty()) {
            throw new IllegalArgumentException("Part description Should not be null or empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity Should be greater than 0");
        }
        if (pricePerItem <= 0) {
            throw new IllegalArgumentException("Price per item Should be greater than 0");
        }
    }
}


   

