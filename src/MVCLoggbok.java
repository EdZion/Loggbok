import javax.swing.*;

public class MVCLoggbok {
    private JPanel Panel;
    private JButton Add;
    private JTextArea textArea1;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCLoggbok");
        frame.setContentPane(new MVCLoggbok().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
