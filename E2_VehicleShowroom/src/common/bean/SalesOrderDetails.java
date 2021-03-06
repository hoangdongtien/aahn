package common.bean;
// Generated Mar 14, 2015 11:28:19 PM by Hibernate Tools 4.3.1



/**
 * SalesOrderDetails generated by hbm2java
 */
public class SalesOrderDetails  implements java.io.Serializable {


     private SalesOrderDetailsId id;
     private SalesOrder salesOrder;
     private VehicleRegistration vehicleRegistration;
     private Double salesPrice;

    public SalesOrderDetails() {
    }

	
    public SalesOrderDetails(SalesOrderDetailsId id, SalesOrder salesOrder, VehicleRegistration vehicleRegistration) {
        this.id = id;
        this.salesOrder = salesOrder;
        this.vehicleRegistration = vehicleRegistration;
    }
    public SalesOrderDetails(SalesOrderDetailsId id, SalesOrder salesOrder, VehicleRegistration vehicleRegistration, Double salesPrice) {
       this.id = id;
       this.salesOrder = salesOrder;
       this.vehicleRegistration = vehicleRegistration;
       this.salesPrice = salesPrice;
    }
   
    public SalesOrderDetailsId getId() {
        return this.id;
    }
    
    public void setId(SalesOrderDetailsId id) {
        this.id = id;
    }
    public SalesOrder getSalesOrder() {
        return this.salesOrder;
    }
    
    public void setSalesOrder(SalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }
    public VehicleRegistration getVehicleRegistration() {
        return this.vehicleRegistration;
    }
    
    public void setVehicleRegistration(VehicleRegistration vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }
    public Double getSalesPrice() {
        return this.salesPrice;
    }
    
    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }




}


