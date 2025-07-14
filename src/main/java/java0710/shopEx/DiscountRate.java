package java0710.shopEx;

public class DiscountRate {
    public static double serviceDiscountPremium = 0.2;
    public static double serviceDiscountGold = 0.15;
    public static double serviceDiscountSilver = 0.1;

    public static double productDiscountPremium = 0.1;
    public static double productDiscountGold = 0.1;
    public static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type == null) return 0;
        double rate = switch(type) {
            case "Premium" -> serviceDiscountPremium;
            case "Gold" -> serviceDiscountGold;
            case "Silver" -> serviceDiscountSilver;
            default -> 0;
        };
        return rate;
}
    public static double getProductDiscountRate(String type) {
        if (type == null) return 0;
        double rate = switch(type) {
            case "Premium" -> productDiscountPremium;
            case "Gold" -> productDiscountGold;
            case "Silver" -> productDiscountSilver;
            default -> 0;
        };
        return rate;
    }
}
