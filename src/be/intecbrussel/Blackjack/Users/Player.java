package be.intecbrussel.Blackjack.Users;

public class Player {
    private String name;
    private double money;
    private int age;
   // private Statistics statistics;

    public Player(String name,int age) {

    }

    public void addMoney(double amount) {

    }

    public void subtractMoney(double amount) {

        if (amount >0){
            System.out.println("Moet boven nul zitten");
        }else{
            this.money += amount;
        }


    }
}
