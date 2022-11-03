package basal.customer;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Customer customerkim = new Customer(1000, "김씨");
        vipCustomer vipCustomerpark = new vipCustomer(1001, "박씨");
        GoldCustomer goldCustomergawk=new GoldCustomer(1002,"곽씨");

        customerkim.bonusPoint=1000;
        vipCustomerpark.bonusPoint=1000;
        goldCustomergawk.bonusPoint=1000;

        ArrayList<Customer> customerArrayList=new ArrayList<Customer>();

        customerArrayList.add(customerkim);
        customerArrayList.add(vipCustomerpark);
        customerArrayList.add(goldCustomergawk);

        for(Customer customer:customerArrayList){
            System.out.println(customer.showinfo()+" 지불금액은 "+customer.calcPrice(10000)+"원 입니다");
        }
        /*
        int pricekim=customerkim.calcPrice(10000);
        int pricepark=vipCustomerpark.calcPrice(10000);//같은 메서드 이름이지만 따로존재. 인스턴스의 메소드의 주소 호출(vip꺼는 가상 메서드)
        int pricegawk=goldCustomergawk.calcPrice(10000);

        System.out.println(customerkim.showinfo()+"지불금액은 "+pricekim+"원 입니다");
        System.out.println(vipCustomerpark.showinfo()+"지불금액은 "+pricepark+"원 입니다");
        System.out.println(goldCustomergawk.showinfo()+"지불금액은 "+pricegawk+"원 입니다");
        */

    }
}
