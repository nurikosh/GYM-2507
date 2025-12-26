public class Member {

    private final String memberId;
    private String name;
    private int age;
    private String email;
    private double weight; // in kg
    private int sessionsAttended;

    // Constructor
    public Member(String memberId, String name, int age, String email) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.weight = 0.0;
        this.sessionsAttended = 0;
    }

    // Getters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getWeight() {
        return weight;
    }

    public int getSessionsAttended() {
        return sessionsAttended;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Logic methods
    public void attendSession() {
        this.sessionsAttended++;
        System.out.println(name + " attended a session. Total sessions: " + sessionsAttended);
    }

    public double calculateBMI(double heightInMeters) {
        if (heightInMeters <= 0 || weight <= 0) {
            System.out.println("Invalid height or weight");
            return 0.0;
        }
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println(name + "'s BMI: " + String.format("%.2f", bmi));
        return bmi;
    }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Sessions Attended: " + sessionsAttended);
    }
}
