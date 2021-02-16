public class Word00Factory extends WordFactory {

    @Override
    Button createButton() {

        return Word00Button.getInstance();
    }
    @Override
    Panel createPanel() {

       return new Word00Panel();
    }

    @Override
    TextBox createTextBox() {

        return new Word00TextBox();
    }
}
