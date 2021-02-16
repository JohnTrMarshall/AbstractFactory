public class Word20Factory extends WordFactory {

    @Override
    Button createButton() {

        return new Word20Button();
    }
    @Override
    Panel createPanel() {

        return new Word20Panel();
    }

    @Override
    TextBox createTextBox() {

        return new Word20TextBox();
    }
}
