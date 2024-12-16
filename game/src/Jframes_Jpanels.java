import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class Jframes_Jpanels {
    
    /** 
     * Jframe section
    */

    private JFrame mainMenuFrame;
    private JFrame optionsMenuFrame;

    public void addMainMenuFrame(){

        mainMenuFrame = new JFrame();
        mainMenuFrame.setTitle("Main Menu");
        mainMenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainMenuFrame.setSize(1024, 768);
        mainMenuFrame.setLocationRelativeTo(null);

        mainMenuFrame.setVisible(true);
     }

    public JFrame getMainMenuFrame(){
        return mainMenuFrame;
    }

    public void addOptionsFrame(){

        optionsMenuFrame = new JFrame();
        optionsMenuFrame.setTitle("Options Menu");
        optionsMenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        optionsMenuFrame.setSize(1024, 768);
        optionsMenuFrame.setLocationRelativeTo(null);
     }

    public JFrame getOptionsMenuFrame(){
        return optionsMenuFrame;
    }

    /** 
     * Jpanel section
    */

    private JPanel mainMenuPanel;
    private JPanel optionsMenuPanel;

    public void addMainPanel(){

        mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        mainMenuPanel.setBackground(Color.GRAY);

        mainMenuFrame.add(mainMenuPanel, BorderLayout.CENTER);
    }

    public JPanel getMainMenuPanel(){
        return mainMenuPanel;
    }

    public void addOptionsPanel(){

        optionsMenuPanel = new JPanel();
        optionsMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        optionsMenuPanel.setBackground(Color.RED);

        optionsMenuFrame.add(optionsMenuPanel, BorderLayout.CENTER);

        optionsMenuPanel.setVisible(false);
    }

    public JPanel getOptionsMenuPanel(){
        return optionsMenuPanel;
    }

}
