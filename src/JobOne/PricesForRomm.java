package Job1;

/*Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее стоимость 40 грн.
 Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.*/

public class PricesForRomm {

    public static void main(String[] args) {

        int cost = 40;
        int days;
        days = 7;

        int discount = days > 7 ? 50 : days > 4 ? 20 : 0;
        int price = days * cost - discount;
        System.out.println("The price for a room for " + days + " days: " + price + " UAH");


    }
}
