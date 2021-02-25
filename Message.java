import javax.swing.JOptionPane;

public class Message {

    /**
     * Generates a pop-up message to inform what is the result after the counting of pixels
     *
     */
    public static void ResultMessage(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage,"End of counting", JOptionPane.INFORMATION_MESSAGE);
    }

}
