package exercisesChapter13;

import javax.swing.*;
import java.awt.*;

public class CodeFragments {

    class fragment1{
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        panel.add(buttonTwo);
        frame.getContenentPane().add(BorderLayout.CENTER,button);
    }
}
