package bill.lau.entity;

public class Patient extends User{

    // --------------- Attribute -----------
    private String medicalHistory;
    private String chronicDisease;

    // --------------- Getter and Setter -----------

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        this.chronicDisease = chronicDisease;
    }

    // --------------- Operation -----------

    public void orderAMedicine(){

    }

    public Double pay(){
        return 0D;
    }

    public Boolean takeMedicine(){
        return true;
    }
}
