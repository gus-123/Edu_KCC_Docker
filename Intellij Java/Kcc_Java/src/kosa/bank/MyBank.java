package kosa.bank;

public class MyBank {
    private Customer[] customers;
    private int customersNum;

    public MyBank() {
        customers = new Customer[10];
    }

    //수정함
    public void addCustomer(String id, String name, long balance) {
        customers[customersNum++] = new Customer(id, name, balance);
    }

    // 수정
    public Customer getCustomer(String id) {
        Customer cust = null;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId().equals(id)) {
                cust = customers[i];
                break;
            }
        }
        return cust;  //고객 리턴
    }

    //수정
    public Customer[] getAllCustomers() {
        Customer newCustomers[] = new Customer[customersNum];

//        for (int i=0; i<customersNum; i++) {
//            newCustomers[i] = customers[i];
//        }

//        System.arraycopy(customers, 0, newCustomers, 0, customersNum);

        return newCustomers;
    }

    public int getCustomersNum() {
        return customersNum;
    }
    public void setCustomersNum(int customersNum) {
        this.customersNum = customersNum;
    }


}
