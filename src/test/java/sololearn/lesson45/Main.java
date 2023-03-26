package sololearn.lesson45;

class Main {
    public static void main(String[] args) {
        //не меняйте этот код
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

        monopoly.play();
        chess.play();
        battleships.play();
    }
}

abstract class Game {
    public String name;
    abstract String getName();
    abstract void play();
}

class Monopoly extends Game {
    //присвойте игре имя "Monopoly"
    String getName() {
        return name;
    }

    void play() {
        System.out.println("Buy all property.");
    }
}

class Chess extends Game {
    //присвойте игре имя "Chess"
    String getName() {
        return name;
    }

    // метод play должен вывести "Kill the enemy king"
    void play() {
        System.out.println("Kill the enemy king.");
    }
}

class Battleships extends Game {
    //присвойте игре имя "Battleships"
    String getName() {

        return "Battleships";
    }

    // метод play должен вывести "Sink all ships"
    void play() {
        System.out.println("Sink all ships.");
    }
}