class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String id, String fullName, String birthDay, String phone, String email, String employeeType, String graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation date: " + graduationDate);
        System.out.println("Graduation rank: " + graduationRank);
        System.out.println("Education: " + education);
    }

    // Getters and setters

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}