import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class User {
    private Account account;
    private Order order;
    private ArrayList<String> wishList=new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    public User (){}
    public void setAccount(Account account){
        this.account = account;
        accounts.add(account);
    }
    public void viewAccounts(){
        for (Account account :accounts){
            System.out.println(account);
        }
    }
    public Account getAccount(){
        return account;
    }
    public void setOrder(Order order){
        this.order=order;
        orders.add(order);
    }
    public Order getOrder(){
        return this.order;
    }

    @Override
    public String toString() {
        return "User{" +
                "account=" + account +
                ", wishList=" + wishList +
                ", order=" + orders +
                '}';
    }

    public void addToWhisList(String wish){
        wishList.add(wish);
    }
    public void viewWisList(){
        System.out.print("Yours actual wish list is: ");
        for (String wish : wishList){
            System.out.print(wish + ", ");
        }
        System.out.println();
    }

    public void showAllOrders(){
        System.out.print("Yours actual orders are: ");
        for (Order order : orders){
            System.out.print(order + ", ");
        }
    }

    public void showSpecificOrder(int orderNumber){
        for (Order order: orders){
            if (order.getOrderNumber() == orderNumber){
                System.out.println(order);
            }
        }
    }

    public void makeReturn(int orderNumber){
        System.out.println("Hello! I want to return the order with number " + orderNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return order.equals(user.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }
}
