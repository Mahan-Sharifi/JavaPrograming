package com.company;

public class Coordinate <FIRST,SECOND,THIRD> {
    public FIRST NameOfStudent;
    public SECOND NumberOfStudent;
    public THIRD FatherName;
    public double score;

    public FIRST getNameOfStudent() {
        return NameOfStudent;
    }

    public void setNameOfStudent(FIRST nameOfStudent) {
        NameOfStudent = nameOfStudent;
    }

    public SECOND getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(SECOND numberOfStudent) {
        NumberOfStudent = numberOfStudent;
    }

    public THIRD getFatherName() {
        return FatherName;
    }

    public void setFatherName(THIRD fatherName) {
        FatherName = fatherName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
