import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import java.io.File;

public class Main {

    JFrame frame=new JFrame();
    JLabel label=new JLabel();
    

    Main() throws Exception {

        // Using external font;
        Font font=Font.createFont(Font.TRUETYPE_FONT,
            new File("src/MyFont.ttf"));
        font=font.deriveFont(25f);  // setting font size;
        font=font.deriveFont(Font.ITALIC);  // setting font style;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        label.setText("Exteral Font");
        label.setFont(font);
        label.setBounds(0, 150, 500, 30);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
