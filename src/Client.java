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

        if(checkInstance()) {

            button.showButton();
            panel.showPanel();
            textBox.showTextBox();
            System.out.println();
        }
        else {

            System.out.println("Maximum instance count exceeded\n");
        }
    }


    public boolean checkInstance() {

        return (button != null) && (panel != null) && (textBox != null);
    }
}