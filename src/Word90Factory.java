public class Word90Factory extends WordFactory {

    @Override
    Button createButton() {

        return new Word90Button();
    }
    @Override
    Panel createPanel() {

        return new Word90Panel();
    }

    @Override
    TextBox createTextBox() {

        return new Word90TextBox();
    }
}
