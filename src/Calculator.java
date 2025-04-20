import java.awt.*;
import javax.swing.*;

public class Calculator {
    //ventana para la calculadora
    int boardWidth = 360;
    int boardHeight = 540;

    JFrame frame = new JFrame("Calculator");

    Calculator(){
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        //que no pueda cambiar el tamaño de la ventana
        frame.setResizable(false);
        //que se cierre el programa al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

}
