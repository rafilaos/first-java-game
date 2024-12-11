import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.BorderLayout;

public class mainMenu {

    private JFrame mainMenuFrame;
    private JPanel mainMenuPanel;

    public void main(JPanel optionsMenu){

        addMainMenuFrame();
        addMainPanel();

        addExitButton(mainMenuFrame);
        addOptionsButton(optionsMenu);
        addStartButton();

    }

    public void addMainMenuFrame(){

        mainMenuFrame = new JFrame();
        mainMenuFrame.setTitle("Main Menu");
        mainMenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainMenuFrame.setSize(1024,768);
        mainMenuFrame.setLocationRelativeTo(null);;

     }

    public void addMainPanel(){

        mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        mainMenuPanel.setBackground(Color.GRAY);

        mainMenuFrame.add(mainMenuPanel, BorderLayout.CENTER);

    }

    public JPanel getMainMenuPanel(){
        return mainMenuPanel;
    }

    public void addExitButton(JFrame mainMenuPanel){

        Button exitButton = new Button("Exit");
        mainMenuPanel.add(exitButton);

        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit button pressed");
                mainMenuPanel.dispose();
            }
        });

    }

    public void addStartButton(){

        Button startButton = new Button("Start");
        mainMenuPanel.add(startButton);

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

        optionsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                mainMenuPanel.setVisible(false);
                optionsMenuPanel.setVisible(true);
            }
        });

    }
}
