import java.util.Scanner;

public class Storeapp {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int total = 0;
        String cart = "";

        System.out.println("Welcome to Tindahan ni Pilapil\n"
                + String.format("%-3s %-23s %s %n", "Code", "Product", "Price")
                + String.format("%-3s %-25s %s %n", "1", "Water 500ml", "P15")
                + String.format("%-3s %-25s %s %n", "2", "Water 1L", "P20")
                + String.format("%-3s %-25s %s %n", "3", "Marlboro Stick", "P8 (P150/pack)")
                + String.format("%-3s %-25s %s %n", "4", "Fortune Stick", "P8 (P150/pack)")
                + String.format("%-3s %-25s %s %n", "5", "Jackpot Stick", "P7 (P130/pack)")
                + String.format("%-3s %-25s %s %n", "6", "Mighty Stick", "P7 (P130/pack)")
                + String.format("%-3s %-25s %s %n", "7", "Loaf Bread", "P70")
                + String.format("%-3s %-25s %s %n", "8", "Tonner Rice", "P45/Kilo (P2200/Sack)")
                + String.format("%-3s %-25s %s", "9", "Diamond Rice", "P50/Kilo (P2400/sack)\n"
                        + "1 Pack = 20 cigarettes, 1 Sack = 50 kilos"));

        while (true) {
            System.out.println("Type the code of the product you want to buy.");
            int code = reader.nextInt();
            System.out.println("How many?");
            int quantity = reader.nextInt();

            String name;
            int price;
            int subtotal;
            String itemDetail;

            switch (code) {
                case 1:
                    price = 15;
                    name = "Water 500ml";
                    subtotal = price * quantity;
                    itemDetail = name + " x" + quantity + " = P" + subtotal;
                    break;
                case 2:
                    price = 20;
                    name = "Water 1L";
                    subtotal = price * quantity;
                    itemDetail = name + " x" + quantity + " = P" + subtotal;
                    break;
                case 3:
                    int marlboroPacks = quantity / 20;
                    int remainingMarlboroSticks = quantity % 20;
                    subtotal = (marlboroPacks * 150) + (remainingMarlboroSticks * 8);
                    name = "Marlboro Stick";
                    itemDetail = name + ": "
                               + (marlboroPacks > 0 ? marlboroPacks + " pack(s) = P" + (marlboroPacks * 150) + ", " : "")
                               + (remainingMarlboroSticks > 0 ? remainingMarlboroSticks + " stick(s) = P" + (remainingMarlboroSticks * 8) + ", " : "")
                               + "Total = P" + subtotal;
                    break;
                case 4:
                    int fortunePacks = quantity / 20;
                    int remainingFortuneSticks = quantity % 20;
                    subtotal = (fortunePacks * 150) + (remainingFortuneSticks * 8);
                    name = "Fortune Stick";
                    itemDetail = name + ": "
                               + (fortunePacks > 0 ? fortunePacks + " pack(s) = P" + (fortunePacks * 150) + ", " : "")
                               + (remainingFortuneSticks > 0 ? remainingFortuneSticks + " stick(s) = P" + (remainingFortuneSticks * 8) + ", " : "")
                               + "Total = P" + subtotal;
                    break;
                case 5:
                    int jackpotPacks = quantity / 20;
                    int remainingJackpotSticks = quantity % 20;
                    subtotal = (jackpotPacks * 130) + (remainingJackpotSticks * 7);
                    name = "Jackpot Stick";
                    itemDetail = name + ": "
                               + (jackpotPacks > 0 ? jackpotPacks + " pack(s) = P" + (jackpotPacks * 130) + ", " : "")
                               + (remainingJackpotSticks > 0 ? remainingJackpotSticks + " stick(s) = P" + (remainingJackpotSticks * 7) + ", " : "")
                               + "Total = P" + subtotal;
                    break;
                case 6:
                    int mightyPacks = quantity / 20;
                    int remainingMightySticks = quantity % 20;
                    subtotal = (mightyPacks * 130) + (remainingMightySticks * 7);
                    name = "Mighty Stick";
                    itemDetail = name + ": "
                               + (mightyPacks > 0 ? mightyPacks + " pack(s) = P" + (mightyPacks * 130) + ", " : "")
                               + (remainingMightySticks > 0 ? remainingMightySticks + " stick(s) = P" + (remainingMightySticks * 7) + ", " : "")
                               + "Total = P" + subtotal;
                    break;
                case 7:
                    price = 70;
                    name = "Loaf Bread";
                    subtotal = price * quantity;
                    itemDetail = name + " x" + quantity + " = P" + subtotal;
                    break;
                case 8:
                    int tonnerSacks = quantity / 50;
                    int remainingTonnerKilos = quantity % 50;
                    subtotal = (tonnerSacks * 2200) + (remainingTonnerKilos * 45);
                    name = "Tonner Rice";
                    itemDetail = name + ": "
                               + (tonnerSacks > 0 ? tonnerSacks + " sack(s) = P" + (tonnerSacks * 2200) + ", " : "")
                               + (remainingTonnerKilos > 0 ? remainingTonnerKilos + " kilo(s) = P" + (remainingTonnerKilos * 45) + ", " : "")
                               + "Total = P" + subtotal;
                    break;
                case 9:
                    int diamondSacks = quantity / 50;
                    int remainingDiamondKilos = quantity % 50;
                    subtotal = (diamondSacks * 2400) + (remainingDiamondKilos * 50);
                    name = "Diamond Rice";
                    itemDetail = name + ": "
                               + (diamondSacks > 0 ? diamondSacks + " sack(s) = P" + (diamondSacks * 2400) + ", " : "")
                               + (remainingDiamondKilos > 0 ? remainingDiamondKilos + " kilo(s) = P" + (remainingDiamondKilos * 50) + ", " : "")
                               + "Total = P" + subtotal;
                    break;
                default:
                    System.out.println("Invalid code. Please try again.");
                    continue;
            }

            total += subtotal;
            cart += itemDetail + "\n";
            System.out.println("Added to cart: " + itemDetail);

            while (true) {
                System.out.println("Do you want to make another purchase? Y/N/EXIT");
                String response = reader.next();
                if (response.equalsIgnoreCase("Y")) {
                    break;
                } else if (response.equalsIgnoreCase("EXIT")) {
                    System.out.println("Thank you for checking out our store. Please come back again.");
                    return;
                } else if (response.equalsIgnoreCase("N")) {
                    System.out.println("\nCart:");
                    System.out.println(cart);
                    System.out.println("Total: P" + total);
                    System.out.println("Confirm Purchase? Y/N");

                    while (true) {
                        String purchase = reader.next();
                        if (purchase.equalsIgnoreCase("Y")) {
                            int attempts = 0;
                            while (attempts < 3) {
                                System.out.println("Please enter cash:");
                                String cashInput = reader.next();
                                try {
                                    int cash = Integer.parseInt(cashInput);
                                    if (cash >= total) {
                                        int change = cash - total;
                                        System.out.println("Your change is P" + change + ". Thank you for shopping in our store. Please come back again.");
                                        return;
                                    } else {
                                        System.out.println("Insufficient cash. Please try again.");
                                        attempts++;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Invalid input. Please enter a valid cash amount.");
                                    attempts++;
                                }
                            }
                            System.out.println("Too many failed attempts. The store is now closing.");
                            return;
                        } else if (purchase.equalsIgnoreCase("N")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter Y to confirm purchase or N to continue purchasing.");
                        }
                    }
                } else {
                    System.out.println("Invalid input. Please enter Y to continue, N to proceed to cart or EXIT to exit the store.");
                }
            }
        }
    }
}
