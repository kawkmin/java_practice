package customer;

public class GoldCustomer extends Customer{
    double slaeRatio;
    private int agentID;

    public GoldCustomer(int customerID,String customerName){
        super(customerID,customerName);
        customerGrade="Gold";
        bonusRaito=0.02;
        slaeRatio=0.1;
        System.out.println("Gold 생성자");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint+=price*bonusRaito;
        return price-(int)(price*slaeRatio);
    }
}
