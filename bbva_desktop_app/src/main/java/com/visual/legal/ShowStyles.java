package main.java.com.visual.legal;

import java.awt.Font;
import java.util.*;
import javax.swing.text.*;
import javax.swing.text.html.*;

public class ShowStyles {

    public static void main(String[] args) {
      HTMLEditorKit kit = new HTMLEditorKit();
      HTMLDocument doc = (HTMLDocument) kit.createDefaultDocument();
      StyleSheet styles = doc.getStyleSheet();
      System.out.print(styles.getFont("https://fonts.googleapis.com/css2?family=Annie+Use+Your+Telescope&family=Coral+Pixels&display=swap",Font.PLAIN, 22));
      
      Enumeration rules = styles.getStyleNames();
      while (rules.hasMoreElements()) {
          String name = (String) rules.nextElement();
          Style rule = styles.getStyle(name);
          System.out.println(rule.toString());
      }
      System.exit(0);
    }
}