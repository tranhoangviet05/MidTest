class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public Intern(String id, String fullName, String birthDay, String phone, String email, String employeeType, String majors, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email, employeeType);

        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University name: " + universityName);
    }

    // Getters and setters

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}