public class main{

    private int height = 768;
    private int width = 1024;

    Jframes_Jpanels jframes_Jpanels = new Jframes_Jpanels();

    mainMenu mainMenu = new mainMenu();
    optionsMenu optionsMenu = new optionsMenu();

    public void Main(){

        jframes_Jpanels.addMainMenuFrame();
        jframes_Jpanels.addMainPanel();
        mainMenu.addExitButton();
        mainMenu.addStartButton();

        jframes_Jpanels.addOptionsFrame();
        jframes_Jpanels.addOptionsPanel();

        mainMenu.addOptionsButton(jframes_Jpanels.getOptionsMenuPanel());

        optionsMenu.addBackButton();

    }

}