class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(String id, String fullName, String birthDay, String phone, String email, String employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Experience in years: " + expInYear);
        System.out.println("Professional skill: " + proSkill);
    }

    // Getters and setters

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}