import javax.swing.JOptionPane;

public class JOptionStoreApp {

    public static void main(String[] args) {
        while (true) {
            int total = 0;
            String cart = "";

            // Step 1: Display product list and ask for product code
            String menu = "Welcome to Tindahan ni Pilapil\n"
                    + String.format("%-8s %-25s %s %n", "Code", "Product", "Price")
                    + String.format("%-8s %-26s %s %n", "1", "Water 500ml", "P15")
                    + String.format("%-8s %-29s %s %n", "2", "Water 1L", "P20")
                    + String.format("%-8s %-25s %s %n", "3", "Marlboro Stick", "P8  (P150/pack)")
                    + String.format("%-8s %-26s %s %n", "4", "Fortune Stick", "P8  (P150/pack)")
                    + String.format("%-8s %-26s %s %n", "5", "Jackpot Stick", "P7  (P130/pack)")
                    + String.format("%-8s %-27s %s %n", "6", "Mighty Stick", "P7  (P130/pack)")
                    + String.format("%-8s %-27s %s %n", "7", "Loaf Bread", "P70")
                    + String.format("%-8s %-25s %s %n", "8", "Tonner Rice", "P45/Kilo  (P2200/Sack)")
                    + String.format("%-8s %-24s %s", "9", "Diamond Rice", "P50/Kilo  (P2400/sack)\n"
                            + "1 Pack = 20 cigarettes, 1 Sack = 50 kilos\n"
                            + "\nInput the code of the product you want to buy");

            // Step 2: Product selection and quantity input
            while (true) {
                String codeInput = JOptionPane.showInputDialog(menu);
                if (codeInput == null) return; // Exit if user presses Cancel
                int code = Integer.parseInt(codeInput);

                String quantityInput = JOptionPane.showInputDialog("How many?");
                if (quantityInput == null) return; // Exit if user presses Cancel
                int quantity = Integer.parseInt(quantityInput);

                String name;
                int price;
                int subtotal;
                String itemDetail;

                // Switch for product details based on code
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
                        JOptionPane.showMessageDialog(null, "Invalid code. Please try again.");
                        continue;
                }

                total += subtotal;
                cart += itemDetail + "\n";
                JOptionPane.showMessageDialog(null, "Added to cart: " + itemDetail);

                // Step 3: Show cart and ask if they want to buy more or proceed
                String response = JOptionPane.showInputDialog("Cart:\n" + cart + "\nTotal: P" + total + "\nDo you want to make another purchase? (Y/N)");
                if (response == null || response.equalsIgnoreCase("N")) {
                    break; // Proceed to payment
                }
            }

            // Step 4: Input cash and show cart again
            String cashInput = JOptionPane.showInputDialog("Cart:\n" + cart + "\nTotal: P" + total + "\nPlease enter cash:");
            if (cashInput == null) return; // Exit if user presses Cancel
            try {
                int cash = Integer.parseInt(cashInput);
                if (cash >= total) {
                    int change = cash - total;
                    JOptionPane.showMessageDialog(null, "Your change is P" + change + ". Thank you for shopping in our store.");
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient cash. Please try again.");
                    continue; // Go back to payment if insufficient cash
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid cash amount.");
                continue; // Go back to payment if invalid input
            }

            // Step 5: Ask if the user wants to make another transaction
            String continueTransacting = JOptionPane.showInputDialog("Do you want to transact again? (Y/N)");
            if (continueTransacting == null || continueTransacting.equalsIgnoreCase("N")) {
                JOptionPane.showMessageDialog(null, "Goodbye! Thank you for shopping with us.");
                return; // Exit the program
            }
        }
    }
}
