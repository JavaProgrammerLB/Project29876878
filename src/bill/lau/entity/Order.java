package bill.lau.entity;

import java.util.List;

public class Order {

    // --------------- Attribute -----------
    private Integer order;
    private List<Medicine> medicineCollections;
    private Integer patientId;

    // --------------- Getter and Setter -----------

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Medicine> getMedicineCollections() {
        return medicineCollections;
    }

    public void setMedicineCollections(List<Medicine> medicineCollections) {
        this.medicineCollections = medicineCollections;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }


    // --------------- Operation -----------
    public Double caculatePrice(){
        return 0D;
    }

}
