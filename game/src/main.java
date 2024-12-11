public class main{

    optionsMenu optionsMenu = new optionsMenu();
    mainMenu mainMenu = new mainMenu();

    public void Main(){

        optionsMenu.main();
        mainMenu.main(optionsMenu.getOptionsMenuPanel());

    }

}