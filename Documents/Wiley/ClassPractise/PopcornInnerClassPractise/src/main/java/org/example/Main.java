package org.example;

public class Main {
    public static void main(String[] args) {
        PopCornStore popCornStore=new PopCornStore();

        popCornStore.buy(new SaltedPopCorn());

        // We can convert this chunk of code (anonymous inner class) :

//        popCornStore.buy(new PopCorn() {
//            @Override
//            public void pop() {
//                System.out.println("Salted Caramel PopCorn Popping");
//            }
//        });

        // Into this gorgeous streamline (lambda)
        popCornStore.buy(()->System.out.println("Salted Caramel PopCorn Popping"));

        PopCorn p1 = new PopCorn() {
            @Override
            public void pop() {
                System.out.println("Butter PopCorn Popping");
            }
        };

        popCornStore.buy(p1);
    }
}