import java.util.Scanner;
 class ShipCalc {
    public static void main(String[] args) {
        System.out.print("Enter the item price: ");
        Scanner in = new Scanner(System.in);
        double shipCost = 0;
        double itemPrice = in.nextDouble();
        if  (itemPrice < 100) {
            shipCost = itemPrice * .02;
            System.out.println("The shipping cost is under $100, so the shipping cost is 2% of the item price.");
        }
        else {
            System.out.println("The shipping is free because the item price is over $100.");
        }
        itemPrice = itemPrice + shipCost;
        System.out.println("Shipping cost: $" + shipCost);
        System.out.println("Total cost: $" + itemPrice);
    }
}
