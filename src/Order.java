public class Order {

    private User user;
    private String order;
    private int orderNumber;
    static int counter = 1;

    public Order(String order){
        this.order = order;
        this.orderNumber=counter++;
    }
    public void setOrderNumber(int orderNumber){
        this.order=order;
    }
    public void setUser(User user){
        this.user = user;
    }

    public void setOrder(String order){
        this.order = order;
    }

    public String getOrder(){
        return this.order;
    }

    public int getOrderNumber(){
        return this.orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order='" + order + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
