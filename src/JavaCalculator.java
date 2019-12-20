import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnMultiply;
    private JButton btnTow;
    private JButton btnPlus;
    private JButton btnFive;
    private JButton btnEignt;
    private JButton btnThree;
    private JButton btnPoint;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private double total1 =0.0;
    private double total2 =0.0;
    private char math_operator;

    public void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 =  total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public JavaCalculator() {
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }

        });
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }

        });
        btnTow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTowText = textDisplay.getText() + btnTow.getText();
                textDisplay.setText(btnTowText);
            }

        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnthreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnthreeText);
            }

        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }

        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }

        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }

        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }

        });
        btnEignt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEignt.getText();
                textDisplay.setText(btnEightText);
            }

        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }

        });
        //----


        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;

            }
        });


        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //This will make it neater - "0." instead of "."
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                } else if (textDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                }
                btnPoint.setEnabled(true);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);

            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
