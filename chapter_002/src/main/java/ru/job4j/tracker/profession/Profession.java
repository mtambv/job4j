package ru.job4j.tracker.profession;

public class Profession {
    public String name;
    public String lastName;
    public String education;
    public int dateOfBirth;

    public Profession (String name, String lastName, String education, int dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.education = education;
        this.dateOfBirth = dateOfBirth;
    }
    public String getName() {
        return name;
    }
    public String getLastName (){
        return lastName;
    }
    public String getEducation (){
        return education;
    }
    public int getDateOfBirth (){ return dateOfBirth;
    }

    public void applyForJob (){
    }
}
