public class Membership {
    // Private fields
    private final String membershipId;
    private String planType; // Basic, Premium, VIP
    private int monthlyFee;
    private int durationMonths;
    private boolean isActive;
    private String startDate;

    // Constructor
    public Membership(String membershipId, String planType, int monthlyFee, int durationMonths) {
        this.membershipId = membershipId;
        this.planType = planType;
        this.monthlyFee = monthlyFee;
        this.durationMonths = durationMonths;
        this.isActive = true;
        this.startDate = "2025-12-26"; // Default start date
    }

    // Getters
    public String getMembershipId() {
        return membershipId;
    }

    public String getPlanType() {
        return planType;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getStartDate() {
        return startDate;
    }

    // Setters
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // Logic methods
    public double calculateTotalCost() {
        int totalCost = monthlyFee * durationMonths;
        System.out.println("Total cost for " + planType + " plan (" + durationMonths + " months): " + totalCost);
        return totalCost;
    }

    public double applyDiscount(int discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            System.out.println("Invalid discount percentage");
            return monthlyFee;
        }
        int discountedFee = monthlyFee - (monthlyFee * discountPercent / 100);
        System.out.println("Original fee:" + monthlyFee);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("New monthly fee:" + discountedFee);
        this.monthlyFee = discountedFee;
        return discountedFee;
    }

    public void cancelMembership() {
        this.isActive = false;
        System.out.println("Membership " + membershipId + " has been cancelled");
    }

    public void displayInfo() {
        System.out.println("Membership ID: " + membershipId);
        System.out.println("Plan Type: " + planType);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Duration: " + durationMonths + " months");
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Start Date: " + startDate);
    }
}
