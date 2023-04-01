import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;

public class SimpleOrderSystem
{
  public static final int ADD_CUSTOMER = 1;
  public static final int ADD_ORDER = 2;
  public static final int ADD_PRODUCT = 3;
  public static final int LIST_CUSTOMERS = 4;
  public static final int OVERALL_TOTAL = 5;
  public static final int SELECTED_PRODUCT = 6;
  public static final int ALL_ORDERS = 7;
  public static final int QUIT = 10;
  private Input in = new Input();
  private ArrayList<Customer> customers;
  private ArrayList<Product> products;

  public SimpleOrderSystem()
  {
    customers = new ArrayList<Customer>();
    products = new ArrayList<Product>();
  }

  public void run()
  {
    while(true)
    {
      displayMenu();
      int option = getMenuInput();
      if (option == QUIT)
      {
        break;
      }
      doOption(option);
    }
  }

  private void displayMenu()
  {
    System.out.println("Simple Order System Menu");
    System.out.println(ADD_CUSTOMER + ". Add Customer");
    System.out.println(ADD_ORDER + ". Add Order");
    System.out.println(ADD_PRODUCT + ". Add Product");
    System.out.println(LIST_CUSTOMERS + ". List Customers");
    System.out.println(OVERALL_TOTAL + ". Overall Total");
    System.out.println(SELECTED_PRODUCT + ". Selected Product");
    System.out.println(ALL_ORDERS + ". All Orders");
    System.out.println();
    System.out.println(QUIT + ". Quit");
  }
  
  private void doOption(int option)
  {
    switch (option)
    {
      case ALL_ORDERS:
        allOrders();
        break;
      case SELECTED_PRODUCT:
        selectedProduct();
        break;
      case OVERALL_TOTAL:
        overallTotal();
        break;
      case ADD_CUSTOMER:
        addCustomer();
        break;
      case ADD_ORDER:
         addOrder();
        break;
      case ADD_PRODUCT:
         addProduct();
         break;
      case LIST_CUSTOMERS:
        listCustomers();
        break;
      default:
        System.out.println("Invalid option - try again");
    }
  }

  private int getMenuInput()
  {
    System.out.print("Enter menu selection: ");
    int option = in.nextInt();
    in.nextLine();
    return option;
  }

  private void addCustomer()
  {
    System.out.println("Add new customer");
    System.out.println("Enter first name:");
    String firstName = in.nextLine();
    System.out.println("Enter last name:");
    String lastName = in.nextLine();
    System.out.println("Enter address:");
    String address = in.nextLine();
    System.out.println("Enter postcode:");
    String postcode = in.nextLine();
    System.out.println("Enter phone number:");
    String phone = in.nextLine();
    System.out.println("Enter email address:");
    String email = in.nextLine();
    Customer customer = new Customer(firstName,lastName,address,phone,email, postcode);
    customers.add(customer);
    FileOutput fo = new FileOutput("customers.txt", true);
    fo.writeString(firstName + "\n" + lastName + "\n" + address + "\n" + phone + "\n" + email + "\n" + postcode + "\n");
    fo.close();
  }

  private void addOrder()
  {
    Customer customer = findCustomer();
    if (customer == null)
    {
      System.out.println("Unable to add order");
      return;
    }
    Order order = new Order();
    addLineItems(order);
    if (order.getLineItemCount() == 0)
    {
      System.out.println("Cannot have an empty order");
      return;
    }
    customer.addOrder(order);
    FileOutput fo = new FileOutput("orders.txt", true);
    fo.writeString(customer.getFirstName() + "\n" + customer.getLastName() + "\n");
    for (LineItem l : order.getLineItems()){
      fo.writeString(l.getProduct().getCode() + "\n" + l.getQuantity() + "\n");
    }
    fo.writeString("end" + "\n");
    fo.close();
  }

  private Customer findCustomer()
  {
    System.out.print("Enter customer last name: ");
    String lastName = in.nextLine();
    System.out.print("Enter customer first name: ");
    String firstName = in.nextLine();
    return getCustomer(lastName, firstName);
  }

  private Customer getCustomer(String lastName, String firstName)
  {
    for (Customer customer : customers)
    {
      if (customer.getLastName().equals(lastName)
          && customer.getFirstName().equals(firstName))
      {
        return customer;
      }
    }
    return null;
  }

  private void addLineItems(Order order)
  {
    while (true)
    {
      System.out.print("Enter line item (y/n): ");
      String reply = in.nextLine();
      if (reply.startsWith("y"))
      {
        LineItem item = getLineItem();
        if (item != null)
        {
          order.add(item);
        }
      }
      else
      {
        break;
      }
    }
  }

  private LineItem getLineItem()
  {
    System.out.print("Enter product code: ");
    int code = in.nextInt();
    in.nextLine();
    Product product = getProduct(code);
    if (product == null)
    {
      System.out.println("Invalid product code");
      return null;
    }
    System.out.print("Enter quantity: ");
    int quantity = in.nextInt();
    in.nextLine();
    return new LineItem(quantity,product);
  }

  private Product getProduct(int code)
  {
    for (Product product : products)
    {
      if (product.getCode() == code)
      {
        return product;
      }
    }
    return null;
  }

  private void addProduct()
  {
    System.out.print("Enter product code: ");
    int code = in.nextInt();
    in.nextLine();
    if (!isAvailableProductCode(code))
    {
      return;
    }
    System.out.println("Enter the type of product: 1 for books, 2 for games: ");
    String choice = in.nextLine();
    System.out.print("Enter product price: ");
    int price = in.nextInt();
    in.nextLine();
    if (choice.equals("1")){
      System.out.println("Enter the title: ");
      String title = in.nextLine();
      System.out.println("Enter the author: ");
      String author = in.nextLine();
      System.out.println("Enter the publication date: ");
      String publicationDate = in.nextLine();
      Product product = new Book(code,price, title, author, publicationDate);
      products.add(product);
      FileOutput fo = new FileOutput("products.txt", true);
      fo.writeString("Book" + "\n" + code + "\n" + price + "\n" + title + "\n" + author + "\n" + publicationDate + "\n");
      fo.close();
    }
    else {
      System.out.println("Enter the name: ");
      String name = in.nextLine();
      System.out.println("Enter the producer: ");
      String producer = in.nextLine();
      System.out.println("Enter the platform: ");
      String platform = in.nextLine();
      Product product = new Game(code,price, name, producer, platform);
      products.add(product);
      FileOutput fo = new FileOutput("products.txt", true);
      fo.writeString("Game" + "\n" + code + "\n" + price + "\n" + name + "\n" + producer + "\n" + platform + "\n");
      fo.close();
    }
  }

  private boolean isAvailableProductCode(int code)
  {
    if (code < 1)
    {
      return false;
    }
    for (Product product : products)
    {
      if (product.getCode() == code)
      {
        return false;
      }
    }
    return true;
  }

  public void listCustomers()
  {
    System.out.println("List of customers");
    for (Customer customer : customers)
    {
      System.out.println("Name: " + customer.getLastName()
                                  + ", "
                                  + customer.getFirstName());
      System.out.println("Address: " + customer.getAddress());
      System.out.println("Postcode: " + customer.getPostcode());
      System.out.println("Phone: " + customer.getPhone());
      System.out.println("Email: " + customer.getEmail());
      System.out.println("Orders made: " + customer.getOrders().size());
      System.out.println("Total for all orders: " + customer.getTotalForAllOrders());
      System.out.println();
    }
  }

  public void overallTotal(){
    int total = 0;
    for (Customer customer : customers){
      total += customer.getTotalForAllOrders();
    }
    System.out.println("the total value of all orders for all customers is " + total);
  }

  public void selectedProduct(){
    System.out.println("Enter the product code: ");
    int code = in.nextInt();
    in.nextLine();
    Product product = getProduct(code);
    if (product == null)
    {
      System.out.println("Invalid product code");
      return;
    }
    for (Customer c : customers){
      ArrayList<Order> orders = c.getOrders();
      for (Order o : orders){
        ArrayList<LineItem> lineItems = o.getLineItems();
        for (LineItem l : lineItems){
          if (l.getProduct().getCode() == code){
            displayOrder(c, o);
          }
        }
      }
    }
  }

  public void displayOrder(Customer c, Order o){
    System.out.println("Customer: " + c.getFirstName() + " " + c.getLastName());
    for (LineItem l : o.getLineItems()){
      System.out.println("Quantity: " + l.getQuantity());
      System.out.println("Product code: " + l.getProduct().getCode());
      System.out.println("Price: " + l.getProduct().getPrice());
      System.out.println("Description: " + l.getProduct().getDescription());
    }
    System.out.println();
  }

  public void allOrders(){
    Customer customer = findCustomer();
    if (customer == null)
    {
      System.out.println("Unable to find target customer");
      return;
    }
    for (Order o : customer.getOrders()){
      displayOrder(customer, o);
    }
  }

  private void loadProduct(){
    FileInput fi = new FileInput("products.txt");
    while (fi.hasNextLine()){
      String type = fi.nextLine();
      if (type.equals("Book")){
        int code = Integer.valueOf(fi.nextLine());
        int price = Integer.valueOf(fi.nextLine());
        String title = fi.nextLine();
        String author = fi.nextLine();
        String publicationDate = fi.nextLine();
        Product product = new Book(code,price, title, author, publicationDate);
        products.add(product);
      }
      else{
        int code = Integer.valueOf(fi.nextLine());
        int price = Integer.valueOf(fi.nextLine());
        String name = fi.nextLine();
        String producer = fi.nextLine();
        String platform = fi.nextLine();
        Product product = new Game(code,price, name, producer, platform);
        products.add(product);
      }
    }
    fi.close();
  }
  private void loadCustomers(){
    FileInput fi = new FileInput("customers.txt");
    while (fi.hasNextLine()){
      String firstName = fi.nextLine();
      String lastName = fi.nextLine();
      String address = fi.nextLine();
      String phone = fi.nextLine();
      String email = fi.nextLine();
      String postcode = fi.nextLine();
      Customer customer = new Customer(firstName,lastName,address,phone,email, postcode);
      customers.add(customer);
    }
    fi.close();
  }
  private void loadOrders(){
    FileInput fi = new FileInput("orders.txt");
    while (fi.hasNextLine()){
      String firstName = fi.nextLine();
      String lastName = fi.nextLine();
      Customer c = getCustomer(lastName, firstName);
      Order o = new Order();
      String code = fi.nextLine();
      while (! code.equals("end")){
        Product p = getProduct(Integer.valueOf(code));
        int quantity = Integer.valueOf(fi.nextLine());
        o.add(new LineItem(quantity,p));
        code = fi.nextLine();
      }
      c.addOrder(o);
    }
    fi.close();
  }
  public void load(){
    loadProduct();
    loadCustomers();
    loadOrders();
  }

  public static void main(String[] args)
  {
    SimpleOrderSystem orderSystem = new SimpleOrderSystem();
    orderSystem.load();
    orderSystem.run();
  }
}
