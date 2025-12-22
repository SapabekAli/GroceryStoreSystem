public class Sale {

    private int saleId;
    private String customerName;
    private double totalAmount;
    private String date;
    private boolean isCompleted;

    public Sale(int saleId, String customerName, String date) {
        this.saleId = saleId;
        this.customerName = customerName;
        this.totalAmount = 0.0;
        this.date = date;
        this.isCompleted = false;

    }

    public Sale () {}

    public int getSaleId() {
        return saleId;
    }
    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }


    public void addItem(double price) {
        if (isCompleted) {
            System.out.println("Sale is already completed");
        } else {
            this.totalAmount += price;
            System.out.println("Item added to sale. " + price + " Total amount: " + this.totalAmount);
        }
    }
    public double calculateTotal(String membershipLevel){
        double discount = 0.0;

        if(membershipLevel.equals("Platinum")) {
            discount = 0.2;
        } else if (membershipLevel.equals("Gold")){
            discount = 0.15;
        } else if (membershipLevel.equals("Silver")){
            discount = 0.10;
        }  else if (membershipLevel.equals("Copper")){
            discount = 0.05;
        }
        double total = this.totalAmount - (this.totalAmount * discount);

        if (discount > 0.0) {
            System.out.println("Applied discount for " + membershipLevel + ": " + (discount * 100) + "%");
        }
        return total;
    }
    public void completeSale() {
        this.isCompleted = true;
    }
    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", customerName='" + customerName + '\'' +
                ", date='" + date + '\'' +
                ", totalAmount=" + totalAmount +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
