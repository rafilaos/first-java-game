import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.BorderLayout;

public class optionsMenu {
    
    private JFrame optionsMenuFrame;
    private JPanel optionsMenuPanel;

    public void addOptionsFrame(int width, int height){

        optionsMenuFrame = new JFrame();
        optionsMenuFrame.setTitle("Options Menu");
        optionsMenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        optionsMenuFrame.setSize(width, height);
        optionsMenuFrame.setLocationRelativeTo(null);;

     }

    public void addOptionsPanel(){

        optionsMenuPanel = new JPanel();
        optionsMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        optionsMenuPanel.setBackground(Color.RED);

        optionsMenuFrame.add(optionsMenuPanel, BorderLayout.CENTER);

        optionsMenuPanel.setVisible(false);
    }

    public JFrame getOptionsMenuFrame(){
        return optionsMenuFrame;
    }

    public JPanel getOptionsMenuPanel(){
        return optionsMenuPanel;
    }

    public void add1920x1080Button(){

        Button button1 = new Button("1920 x 1080");
        optionsMenuPanel.add(button1);

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1920 x 1080 button pressed");

            }
        });

    }

    public void addBackButton(){

        Button backButton = new Button("Back");
        optionsMenuPanel.add(backButton);

        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Back button pressed");

                optionsMenuFrame.setVisible(false);
                
            }
        });

    }
}
