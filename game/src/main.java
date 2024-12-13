public class main{

    private int height = 768;
    private int width = 1024;

    optionsMenu optionsMenu = new optionsMenu();
    mainMenu mainMenu = new mainMenu();

    public void Main(){

        mainMenu.addMainMenuFrame();
        mainMenu.addMainPanel();
        mainMenu.addExitButton();
        mainMenu.addStartButton();
        mainMenu.addOptionsButton(optionsMenu.getOptionsMenuPanel());

        optionsMenu.addOptionsFrame(width, height);
        optionsMenu.addOptionsPanel();
        optionsMenu.addBackButton();

    }



}