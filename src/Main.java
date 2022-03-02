public class Main {
    public static void main(String[] args) {
    User user = new User();
    Account account = new Account();
    account.setUserName("Bianca25");
    account.setPassword("BiaMaria10");
    user.setAccount(account);
    user.setOrder(new Order("Apple"));
    user.setOrder(new Order("Banana"));
    user.setOrder(new Order("Cherry"));
    user.addToWhisList("Carrots");
    user.addToWhisList("Tomatoes");
    user.addToWhisList("Potatoes");
    user.showAllOrders();
    user.showSpecificOrder(2);
    user.viewWisList();
    user.makeReturn(2);
        System.out.println(user);

    }
}
