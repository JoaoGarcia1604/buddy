package model;

import javax.swing.event.TableColumnModelListener;
import java.time.LocalDate;

public class Delivery {

    private String clientName;
    private String clientAdress;
    private LocalDate deliveryDate;
    private String note;

    public Delivery(String clientName, String clientAdress, LocalDate deliveryDate){
        this.clientName = clientName;
        this.clientAdress = clientAdress;
        this.deliveryDate = deliveryDate;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    public String getClientAdress(){
        return clientAdress;
    }

    public void setClientAdress(String clientAdress){
        this.clientAdress = clientAdress;
    }

    public LocalDate getDeliveryDate(){
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate){
        this.deliveryDate = deliveryDate;
    }

}
