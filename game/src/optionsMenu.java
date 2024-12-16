import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class optionsMenu {

    Jframes_Jpanels jframes_Jpanels = new Jframes_Jpanels();

    public void add1920x1080Button(){

        Button button1 = new Button("1920 x 1080");
        jframes_Jpanels.getOptionsMenuPanel().add(button1);

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1920 x 1080 button pressed");

            }
        });

    }

    public void addBackButton(){

        Button backButton = new Button("Back");
        jframes_Jpanels.getOptionsMenuPanel().add(backButton);

        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Back button pressed");

            
                
                
            }
        });

    }
}
