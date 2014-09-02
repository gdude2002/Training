package exercises.september02;

import javax.swing.*;

public class Map extends JFrame {

    public Map() {
        super("Map");

        this.setSize(350, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MapPane map = new MapPane();

        this.add(map);
        setVisible(true);
    }

    public static void main(String[] args) {
        Map frame = new Map();
    }
}
