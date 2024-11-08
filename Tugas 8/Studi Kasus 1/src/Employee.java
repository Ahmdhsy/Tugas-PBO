public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee (String eName, String eAdress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAdress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString() {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    public double pay() {
        return payRate;
    }
}
