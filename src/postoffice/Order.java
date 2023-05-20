
package postoffice;


public class Order {
    
    private String serial;
    private String orderName;
    private String amount;
    
    public Order(){
     this.serial="";  
     this.orderName="";
     this.amount="";
    } 

    public Order(String serial, String orderName, String amount) {
        this.serial=serial;
        this.orderName=orderName; 
        this.amount=amount;
       
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" + "serial=" + serial + ", orderName=" + orderName + ", amount=" + amount + '}';
    }
    
    }

       

