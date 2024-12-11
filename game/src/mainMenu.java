import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.BorderLayout;

public class mainMenu {

    private JPanel mainMenuPanel;

    public void main(JFrame frame, JPanel optionsMenu){

        addMainPanel(frame);

        addExitButton(frame);
        addOptionsButton(optionsMenu);
        addStartButton();

    }

    public void addMainPanel(JFrame frame){

        mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        mainMenuPanel.setBackground(Color.BLUE);

        frame.add(mainMenuPanel, BorderLayout.CENTER);

    }

    public JPanel getMainMenuPanel(){
        return mainMenuPanel;
    }

    public void addExitButton(JFrame frame){

        Button exitButton = new Button("Exit");
        mainMenuPanel.add(exitButton);
        exitButton.setVisible(true);

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
        mainMenuPanel.add(startButton);
        startButton.setVisible(true);

        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start button pressed");
            }
        });

    }

    public void addOptionsButton(JPanel optionsMenuPanel){

        Button optionsButton = new Button("Options");
        mainMenuPanel.add(optionsButton);
        optionsButton.setVisible(true);

        optionsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                mainMenuPanel.setVisible(false);
                optionsMenuPanel.setVisible(true);
            }
        });

    }
}
