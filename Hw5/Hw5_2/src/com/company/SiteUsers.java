package com.company;

public class SiteUsers implements Cloneable {
    public String Name;
    public String Family;
    public int NationalCode;
    public int CellphoneNumber;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public String getFamily() {
        return Family;
    }

    public void setNationalCode(int nationalCode) {
        NationalCode = nationalCode;
    }

    public int getNationalCode() {
        return NationalCode;
    }

    public void setCellphoneNumber(int cellphoneNumber) {
        CellphoneNumber = cellphoneNumber;
    }

    public int getCellphoneNumber() {
        return CellphoneNumber;
    }
}
