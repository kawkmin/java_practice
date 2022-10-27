package customer;

public class vipCustomer extends Customer{
    double slaeRatio;
    private int agentID;
    public vipCustomer(int customerID,String customerName){
        super(customerID,customerName);//부모의 타입을 받기 때문에 부모의 생성자 호출
        customerGrade="VIP";
        bonusRaito=0.05;
        slaeRatio=0.1;
        System.out.println("vip 생성자");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint+=price*bonusRaito;
        return price-(int)(price*slaeRatio);
    }
}
