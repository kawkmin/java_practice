package basal.customer;

public class Customer {
    protected int customerID,bonusPoint;
    protected String customerName,customerGrade;
    double bonusRaito;

    public Customer(int customerID,String customerName){
        this.customerID=customerID;
        this.customerName=customerName;
        customerGrade="SLIVER";
        bonusRaito=0.01;
        System.out.println("손님 생성자");
    }

    public int calcPrice(int price){
        bonusPoint+=price*bonusRaito;
        return price;
    }

    public String showinfo(){
        return customerName+"님의 등급은"+ customerGrade+"이며 적립된 보너스 포인트 "+bonusPoint+"점 입니다";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
