public class Word10Factory extends WordFactory {

    @Override
    Button createButton() {

        return new Word10Button();
    }
    @Override
    Panel createPanel() {

        return new Word10Panel();
    }

    @Override
    TextBox createTextBox() {

        return new Word10TextBox();
    }
}
