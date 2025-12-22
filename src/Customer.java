public class Customer {

    private int customerID;
    private String name;
    private String membershipLevel;
    private double totalPrice;

    public Customer(int customerID, String name, String membershipLevel, double totalPrice) {
        this.customerID = customerID;
        this.name = name;
        this.membershipLevel = membershipLevel;
        this.totalPrice = totalPrice;
    }

    public Customer() {}

    public int getCustomerID() {
        return customerID;
    } public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    } public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public double getTotalPrice() {
        return totalPrice;
    } public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isVIP() {
        return membershipLevel.equals("Platinum");
    }

    private void upgradeMembershipLevel() {
        if (this.totalPrice > 50000) {
            this.membershipLevel = "Platinum";
        } else if (this.totalPrice > 30000) {
            this.membershipLevel = "Gold";
        }  else if (this.totalPrice > 20000) {
            this.membershipLevel = "Silver";
        }  else if (this.totalPrice > 1000) {
            this.membershipLevel = "Copper";
        } else  {
            this.membershipLevel = "Standard";
        }
    }

    public void addPurchase(double price) {
        this.totalPrice += price;
        upgradeMembershipLevel();
        System.out.println("Customer " + this.name+ "(" + this.customerID + ")" + " added items for " + price + " total is " + this.totalPrice + ". Status: " + this.membershipLevel);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ",name='" + name + '\'' +
                ",membershipLevel='" + membershipLevel +  '\'' +
                ",totalPrice="  + totalPrice +
                '}';

    }
}
