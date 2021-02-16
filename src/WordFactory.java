abstract class WordFactory {

    Button button;
    Panel panel;
    TextBox textBox;

    abstract Button createButton();
    abstract Panel createPanel();
    abstract TextBox createTextBox();
}
