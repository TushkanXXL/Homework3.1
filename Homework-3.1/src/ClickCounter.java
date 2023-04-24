import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickCounter extends JFrame {

    private int count;
    private JLabel label;

    public ClickCounter() {
        count = 0;
        label = new JLabel("Количество кликов: " + count);
        JButton button1 = new JButton("Прибавление кликов");
        JButton button2 = new JButton("Убавление кликов");
        JPanel panel = new JPanel();

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                count++;
                label.setText("Количество кликов: " + count);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                count--;
                label.setText("Количество кликов: " + count);
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(label);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Счетчик кликов");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickCounter();
    }
}