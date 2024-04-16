class Employee implements IEmployee {
    private static int employeeCount = 0;
    private String id;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private String employeeType;

    public Employee(String id, String fullName, String birthDay, String phone, String email, String employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Day: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Employee Type: " + employeeType);
    }

    // Getters and setters

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}