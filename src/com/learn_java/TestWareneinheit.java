package com.learn_java;

public class TestWareneinheit {
    public static void main(String[] args) {
        Wareneinheit einheit1 = new Wareneinheit();
        Wareneinheit einheit2 = new Wareneinheit(20);

        einheit1.einheitAusgeben();
        einheit2.einheitAusgeben();

        einheit1.aktualisiereMenge(80);

        einheit1.einheitAusgeben();

        einheit1.aktualisiereMenge(0);

        einheit1.einheitAusgeben();

        einheit2.resetWareneinheit();

        einheit2.einheitAusgeben();
    }
}
