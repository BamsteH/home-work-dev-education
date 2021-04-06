package org.bitbucket.trees;

public class Warrior {
    String soso4ka;
    String cabriolet;
    String flowers;

    public Warrior(String soso4ka, String cabriolet, String flowers) {
        this.soso4ka = soso4ka;
        this.cabriolet = cabriolet;
        this.flowers = flowers;
    }

    public Warrior() {
    }

    public static void main(String[] args) {
        Warrior commonOmezhkaWarrior = new Warrior();
        Warrior chadWarrior = new Warrior(
                "Сосочка-девочка, почему одна, сейчас будет два.",
                "Не стесняйся давай, полчасика на подмыться и жду на своем одноместном кабриолете телесного цвета",
                "Цветок – тебе"
        );
    }
}
