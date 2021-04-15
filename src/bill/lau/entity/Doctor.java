package bill.lau.entity;

public class Doctor extends User{

    public Order getAnOrder(){
        return null;
    }

    public void prepareMedicine(){
        System.out.println("Docer " + getUsername() + " is preparing the Medicine");
    }

}
