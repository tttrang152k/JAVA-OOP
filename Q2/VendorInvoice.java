package Q2;

class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }

    // Accessors / Mutators with validation
    public String getVendorName() { return vendorName; }
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }

    public String getInvoiceNumber() { return invoiceNumber; }
    public void setInvoiceNumber(String invoiceNumber) { this.invoiceNumber = invoiceNumber; }

    public double getAmountDue() { return amountDue; }
    public void setAmountDue(double amountDue) {
        if (amountDue < 0) throw new IllegalArgumentException("Amount due cannot be negative.");
        this.amountDue = amountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    @Override
    public String toString() {
        return String.format(
            "Vendor      | %-15s | #%s | Payment: $%,.2f",
            vendorName, invoiceNumber, calculatePayment()
        );
    }
    
}
