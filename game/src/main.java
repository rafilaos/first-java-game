import javax.swing.JFrame;

public class main{

    private JFrame window;

    public main(){
        window = new JFrame();
        window.setTitle("Hello world");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1024,768);
        window.setLocationRelativeTo(null);;
    }

    public void show(){
        window.setVisible(true);
    }
}