package common.bean;
// Generated Mar 14, 2015 11:28:19 PM by Hibernate Tools 4.3.1



/**
 * PurchaseOrderDetailsId generated by hbm2java
 */
public class PurchaseOrderDetailsId  implements java.io.Serializable {


     private int purchaseId;
     private int vehicleId;

    public PurchaseOrderDetailsId() {
    }

    public PurchaseOrderDetailsId(int purchaseId, int vehicleId) {
       this.purchaseId = purchaseId;
       this.vehicleId = vehicleId;
    }
   
    public int getPurchaseId() {
        return this.purchaseId;
    }
    
    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }
    public int getVehicleId() {
        return this.vehicleId;
    }
    
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PurchaseOrderDetailsId) ) return false;
		 PurchaseOrderDetailsId castOther = ( PurchaseOrderDetailsId ) other; 
         
		 return (this.getPurchaseId()==castOther.getPurchaseId())
 && (this.getVehicleId()==castOther.getVehicleId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPurchaseId();
         result = 37 * result + this.getVehicleId();
         return result;
   }   


}


