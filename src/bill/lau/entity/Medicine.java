package bill.lau.entity;

public class Medicine {

    // --------------- Attribute ----------
    private Integer id;
    private String pharmaceuticalFactory;
    private String name;
    private String specification;
    private Double price;
    private Integer inventoryQuantity;
    private String allergies;
    private String medicineTypeName;

    // --------------- Getter and Setter -----------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPharmaceuticalFactory() {
        return pharmaceuticalFactory;
    }

    public void setPharmaceuticalFactory(String pharmaceuticalFactory) {
        this.pharmaceuticalFactory = pharmaceuticalFactory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedicineTypeName() {
        return medicineTypeName;
    }

    public void setMedicineTypeName(String medicineTypeName) {
        this.medicineTypeName = medicineTypeName;
    }

    // --------------- Operation -----------
    public void add(){

    }

}
