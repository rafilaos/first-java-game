import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main{

    private JFrame frame;
    private JPanel panel;

    public main() {
        
        addJFrame();

        addJPanel();
        
        addExitButton();
        addStartButton();
        addOptionsButton();
    }

     public void addJFrame(){

        frame = new JFrame();
        frame.setTitle("Hello world");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1024,768);
        frame.setLocationRelativeTo(null);;

     }

     public void show(){
        frame.setVisible(true);
     }

     public void addJPanel(){

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.GRAY);

        frame.add(panel, BorderLayout.CENTER);
    }

    public void addExitButton(){

        Button exitButton = new Button("Exit");
        panel.add(exitButton);

        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit button pressed");
                frame.dispose();
            }
        });

    }

    public void addStartButton(){

        Button startButton = new Button("Start");
        panel.add(startButton);

        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start button pressed");
            }
        });

    }

    public void addOptionsButton(){

        Button optionsButton = new Button("Options");
        panel.add(optionsButton);

        optionsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Options button pressed");
            }
        });

    }

}