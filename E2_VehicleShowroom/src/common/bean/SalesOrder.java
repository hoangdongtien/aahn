package common.bean;
// Generated Mar 14, 2015 11:28:19 PM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;

/**
 * SalesOrder generated by hbm2java
 */
public class SalesOrder  implements java.io.Serializable {


     private int salesId;
     private Customer customer;
     private String salesDate;
     private Integer status;
     private Set salesOrderDetailses = new HashSet(0);

    public SalesOrder() {
    }

	
    public SalesOrder(int salesId) {
        this.salesId = salesId;
    }
    public SalesOrder(int salesId, Customer customer, String salesDate, Integer status, Set salesOrderDetailses) {
       this.salesId = salesId;
       this.customer = customer;
       this.salesDate = salesDate;
       this.status = status;
       this.salesOrderDetailses = salesOrderDetailses;
    }
   
    public int getSalesId() {
        return this.salesId;
    }
    
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getSalesDate() {
        return this.salesDate;
    }
    
    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getSalesOrderDetailses() {
        return this.salesOrderDetailses;
    }
    
    public void setSalesOrderDetailses(Set salesOrderDetailses) {
        this.salesOrderDetailses = salesOrderDetailses;
    }




}


