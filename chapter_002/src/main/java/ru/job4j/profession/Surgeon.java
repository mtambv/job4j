package ru.job4j.profession;

import ru.job4j.profession.Doctor;

public class Surgeon extends Doctor {
    private String typeOfScalpel;
    private int skillScore;
    private boolean isDrunk;

    public Surgeon ( String name, String lastName, String education,int dateOfBirth, String specialty, int skillScore) {
        super (name, lastName, education, dateOfBirth, specialty);
        this.skillScore = skillScore;
    }
    private void anasthesia (int gramsNovocaine) {

    }
    private void cut (int lengthOfIncision) {

    }

}

