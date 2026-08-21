import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class QuizBattleGUI extends JFrame implements ActionListener {
    private final Questions question;
    private final JLabel lblQuestion;
    private final JLabel lblResult;
    private final JButton btn1;
    private final JButton btn2;

    public QuizBattleGUI() {
        question = new Questions(
                "Which keyword creates an object?",
                "new",
                "class",
                "new"
        );

        setTitle("Programming Quiz Battle");
        setSize(520, 330);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(245, 247, 250));

        lblQuestion = new JLabel(question.getQuestion(), SwingConstants.CENTER);
        lblQuestion.setBounds(30, 35, 440, 35);
        lblQuestion.setFont(new Font("SansSerif", Font.BOLD, 17));

        btn1 = createAnswerButton(question.getOption1(), 70);
        btn1.setBounds(70, 105, 150, 48);

        btn2 = createAnswerButton(question.getOption2(), 260);
        btn2.setBounds(280, 105, 150, 48);

        lblResult = new JLabel("Answer the question", SwingConstants.CENTER);
        lblResult.setBounds(50, 190, 400, 40);
        lblResult.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblResult.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 220)));

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);
    }

    private JButton createAnswerButton(String text, int x) {
        JButton button = new JButton(text);
        button.setBounds(x, 105, 150, 48);
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
        button.addActionListener(this);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
            lblResult.setForeground(new Color(20, 120, 60));
        } else {
            lblResult.setText("Wrong! Try again!");
            lblResult.setForeground(new Color(190, 45, 45));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizBattleGUI().setVisible(true));
    }
}
