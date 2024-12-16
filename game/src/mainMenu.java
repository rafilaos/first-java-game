import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class mainMenu {

    Jframes_Jpanels jframes_Jpanels = new Jframes_Jpanels();

    public void addExitButton(){

        Button exitButton = new Button("Exit");
        jframes_Jpanels.getMainMenuPanel().add(exitButton);

        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit button pressed");
                jframes_Jpanels.getMainMenuFrame().dispose();
            }
        });

    }

    public void addStartButton(){

        Button startButton = new Button("Start");
        jframes_Jpanels.getMainMenuPanel().add(startButton);

        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start button pressed");
            }
        });

    }

    public void addOptionsButton(JPanel optionsMenuPanel){

        Button optionsButton = new Button("Options");
        jframes_Jpanels.getMainMenuPanel().add(optionsButton);

        optionsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });

    }

}