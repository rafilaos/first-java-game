import javax.swing.JFrame;

public class main{

    private JFrame frame;

    public void Main(){
                
        addJFrame();

        optionsMenu optionsMenu = new optionsMenu();
        mainMenu mainMenu = new mainMenu();

        mainMenu.main(frame, optionsMenu.getOptionsMenuPanel());
        optionsMenu.main(frame);

        mainMenu.getMainMenuPanel().setVisible(true);
        optionsMenu.getOptionsMenuPanel().setVisible(false);
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

}