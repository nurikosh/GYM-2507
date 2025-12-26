class Main {
    static void main() {
        // Member
        System.out.println("Member");
        Member member = new Member("123456789", "John", 25, "");
        member.setWeight(80.0);
        member.attendSession();
        member.displayInfo();
        member.calculateBMI(1.75);
        System.out.print("\n");

        // Trainer
        System.out.println("Trainer");
        Trainer trainer = new Trainer("987654321", "Jane", "Yoga", 10);
        trainer.assignClient();
        trainer.setHourlyRate(5000);
        trainer.displayInfo();
        trainer.calculateMonthlyEarnings(40);
        System.out.print("\n");


        //Memberships

        System.out.println("Memberships");
        Membership membership1 = new Membership("4792920", "Premium", 100000, 12);
        membership1.displayInfo();
        System.out.println();

        membership1.calculateTotalCost();
        membership1.applyDiscount(10);
        System.out.println("\n");

        Membership membership2 = new Membership("3783787832", "Basic", 19990, 6);
        membership2.displayInfo();
        System.out.println();
        membership2.calculateTotalCost();
        System.out.println();

        membership2.cancelMembership();
        System.out.println("Status after cancellation: " + (membership2.isActive() ? "Active" : "Inactive"));


    }
}

