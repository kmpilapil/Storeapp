import javax.swing.JOptionPane;

public class JOptionStoreApp {

    public static void main(String[] args) {
        int total = 0;
        String cart = "";

 while (true) {
        String menu = JOptionPane.showInputDialog("Welcome to Tindahan ni Pilapil\n"
                + String.format("%-3s %-23s %s %n", "Code", "Product", "Price")
                + String.format("%-3s %-25s %s %n", "1", "Water 500ml", "P15")
                + String.format("%-3s %-29s %s %n", "2", "Water 1L", "P20")
                + String.format("%-3s %-25s %s %n", "3", "Marlboro Stick", "P8 (P150/pack)")
                + String.format("%-3s %-27s %s %n", "4", "Fortune Stick", "P8 (P150/pack)")
                + String.format("%-3s %-26s %s %n", "5", "Jackpot Stick", "P7 (P130/pack)")
                + String.format("%-3s %-28s %s %n", "6", "Mighty Stick", "P7 (P130/pack)")
                + String.format("%-3s %-28s %s %n", "7", "Loaf Bread", "P70")
                + String.format("%-3s %-27s %s %n", "8", "Tonner Rice", "P45/Kilo (P2200/Sack)")
                + String.format("%-3s %-25s %s", "9", "Diamond Rice", "P50/Kilo (P2400/sack)\n"
                        + "1 Pack = 20 cigarettes, 1 Sack = 50 kilos\n"
                        + "Input the code of the product you want to buy"));
            int code = Integer.parseInt(menu);
            String quantityInput = JOptionPane.showInputDialog("How many?");
            int quantity = Integer.parseInt(quantityInput);

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
                    JOptionPane.showMessageDialog(null, "Invalid code. Please try again.");
                    continue;
            }

            total += subtotal;
            cart += itemDetail + "\n"; 
            String another = JOptionPane.showInputDialog("Added to cart: " + itemDetail +
                    "\n Do you want to make another purchase? Y/N/EXIT");
            if (another.equalsIgnoreCase("Y")) {}
            else if (another.equalsIgnoreCase("EXIT")) {
                JOptionPane.showMessageDialog(null, "Thank you for checking out our store. Please come back again.");
                return;
            } else {
                String confirm = JOptionPane.showInputDialog("\nCart:\n" + cart + "\nTotal: P" + total +
                        "\n Confirm Purchase? Y/N");
                if (confirm.equalsIgnoreCase("Y")) {
                    int attempts = 0;
                    while (attempts < 3) {
                        String cashinput = JOptionPane.showInputDialog("Please enter cash:");
                        try {
                            int cash = Integer.parseInt(cashinput);
                            if (cash >= total) {
                                int change = cash - total;
                                JOptionPane.showMessageDialog(null, "Your change is P" + change + ". Thank you for shopping!");
                                return;
                            } else {
                                JOptionPane.showMessageDialog(null, "Insufficient cash. Please try again.");
                                attempts++;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid cash amount.");
                            attempts++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Too many failed attempts. The store is now closing.");
                    return;
                }
            }
        }
    }
}

