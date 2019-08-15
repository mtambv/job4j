package ru.job4j.profession;

public class Doctor extends Profession {
    public String specialty;

    public Doctor(String name, String lastName, String education, int dateOfBirth, String specialty) {
        super(name, lastName, education, dateOfBirth);
        this.specialty = specialty;
    }

    public void diagnose(double temperature, String symptom) {
    }

    public void writeExuseforWork() {
    }

    public void applyForJob(int experience, int salary) {

    }
}