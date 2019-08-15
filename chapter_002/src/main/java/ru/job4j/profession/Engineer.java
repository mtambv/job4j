package ru.job4j.profession;

public class Engineer extends Profession   {

    private int analyticalLevel;
    private String degree;
    private boolean isIntroverted;

    public Engineer(String name, String lastName, String education, int dateOfBirth, String specialty) {
        super(name, lastName, education, dateOfBirth);
        this.degree = degree;
    }

    public void workOnProject() {

    }
    public void writeProposal() {

    }
}
