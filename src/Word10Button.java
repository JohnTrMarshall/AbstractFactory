public class Word10Button extends Button {

    private static int instanceCount; // tracks the number of instances of this button

    private Word10Button() {
        instanceCount++;
    }
    /*
        Description: Checks if instance count has been exceeded and returns a new instance
        Pre-Condition:
        Post-Condition: Returns a new instance if instance count has not been exceeded, otherwise returns null
     */
    static Button getInstance() {

        if(instanceCount < 2) {

            return new Word10Button();
        }

        return null;
    }
    @Override
    void showButton() {

        System.out.println("Button Word10");
    }
}
