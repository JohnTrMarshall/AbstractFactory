public class Client {

    private Button button;
    private Panel panel;
    private TextBox textBox;

    public Client(WordFactory wordFactory) {

        button = wordFactory.createButton();
        panel = wordFactory.createPanel();
        textBox = wordFactory.createTextBox();
    }
    public void run() {

        button.showButton();
        panel.showPanel();
        textBox.showTextBox();
        System.out.println();
    }
}