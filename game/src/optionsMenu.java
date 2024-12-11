import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.Button;
import java.awt.BorderLayout;

public class optionsMenu {
    
    private JPanel optionsMenuPanel;

    public void main(JFrame frame){

        addOptionsPanel(frame);
        addBackButton(frame);

    }

    public void addOptionsPanel(JFrame frame){

        optionsMenuPanel = new JPanel();
        optionsMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        optionsMenuPanel.setBackground(Color.GRAY);

        frame.add(optionsMenuPanel, BorderLayout.CENTER);

    }

    public JPanel getOptionsMenuPanel(){
        return optionsMenuPanel;
    }

    public void addBackButton(JFrame frame){

        Button backButton = new Button("Start");
        optionsMenuPanel.add(backButton);

        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Back button pressed");
            }
        });

    }
}
