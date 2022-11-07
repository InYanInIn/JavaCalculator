import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener, ActionListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonComma, buttonEqual,
    buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonPercent, buttonAC, buttonClear;


    JTextField textField;

    int WIDTH = 600;
    int HEIGHT = 600;

    String a = "";
    String b = "";
    float res = 0;
    char sign = ' ';


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setFocusable(true);


//        JPanel panelButtons = new JPanel();
//
//        panelButtons.setLayout(new GridLayout(6,4));


        textField = new JTextField();
        textField.setBounds(25, 25, 545, 75);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("Serif",Font.BOLD, 35));
        textField.setText("0");

        button1 = new Button("1", this);
        button2 = new Button("2", this);
        button3 = new Button("3", this);
        button4 = new Button("4", this);
        button5 = new Button("5", this);
        button6 = new Button("6", this);
        button7 = new Button("7", this);
        button8 = new Button("8", this);
        button9 = new Button("9", this);
        button0 = new Button("0", this);
        buttonComma = new Button(",", this);
        buttonEqual = new Button("=", this);
        buttonPlus = new Button("+", this);
        buttonMinus = new Button("-", this);
        buttonMultiply = new Button("*", this);
        buttonDivide = new Button("/", this);
        buttonPercent = new Button("%", this);
        buttonAC = new Button("AC", this);
        buttonClear = new Button(">", this);


        buttonPercent.setBounds(1, 500, 190, 45);
        buttonAC.setBounds(199, 500, 190, 45);
        buttonClear.setBounds(399, 500, 190, 45);

        this.add(textField);
        this.add(buttonPercent);
        this.add(buttonAC);
        this.add(buttonClear);

        JPanel panel = new JPanel();
        panel.setBounds(10, 120, 560, 360);
        panel.setBackground(Color.GRAY);
        panel.setLayout(new GridLayout(4,4, 5, 5));
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonEqual);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonPlus);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMinus);
        panel.add(buttonComma);
        panel.add(button0);
        panel.add(buttonDivide);
        panel.add(buttonMultiply);


        this.add(panel);


        this.setVisible(true);
    }

    // Checks if you press on keyboard
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='0'){
            a = a + "0";
            textField.setText(a);
        }
        if(e.getKeyChar()=='1'){
            a = a + "1";
            textField.setText(a);
        }
        if(e.getKeyChar()=='2'){
            a = a + "2";
            textField.setText(a);
        }
        if(e.getKeyChar()=='3'){
            a = a + "3";
            textField.setText(a);
        }
        if(e.getKeyChar()=='4'){
            a = a + "4";
            textField.setText(a);
        }
        if(e.getKeyChar()=='5'){
            a = a + "5";
            textField.setText(a);
        }
        if(e.getKeyChar()=='6'){
            System.out.println("6");
            a = a + "6";
            textField.setText(a);
        }
        if(e.getKeyChar()=='7'){
            a = a + "7";
            textField.setText(a);
        }
        if(e.getKeyChar()=='8'){
            a = a + "8";
            textField.setText(a);
        }
        if(e.getKeyChar()=='9'){
            a = a + "9";
            textField.setText(a);
        }
        if(e.getKeyChar()=='.'||e.getKeyChar()==','){
            a = a + ".";
            textField.setText(a);
        }
        if(e.getKeyChar() == 8){
            if (a.length() != 0){
                a = a.substring(0, a.length() - 1);
            }
            textField.setText(a);
        }
        if(e.getKeyChar()=='+'){
            makeResult();
            b = a;
            a = "";
            sign = '+';
            textField.setText(String.valueOf(res));
        }
        if(e.getKeyChar()=='-'){
            makeResult();
            b = a;
            a = "";
            sign = '-';
            textField.setText(String.valueOf(res));
        }
        if(e.getKeyChar()=='*'){
            makeResult();
            b = a;
            a = "";
            sign = '*';
            textField.setText(String.valueOf(res));
        }
        if(e.getKeyChar()=='/'){
            makeResult();
            b = a;
            a = "";
            sign = '/';
            textField.setText(String.valueOf(res));
        }
        if(e.getKeyChar() == 127){
            textField.setText(String.valueOf(res));
            res = 0;
            a = "";
            b = "";
            sign = ' ';
            textField.setText(String.valueOf(res));
        }
        if(e.getKeyChar()=='\n'){
            makeResult();
            textField.setText(String.valueOf(res));

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

        // It was only for helping to create previous override method
    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("You released key: " + (int) e.getKeyChar());
    }

    // Checks if you press on buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button0){
            a = a + "0";
            textField.setText(a);
        }
        if(e.getSource()==button1){
            a = a + "1";
            textField.setText(a);
        }
        if(e.getSource()==button2){
            a = a + "2";
            textField.setText(a);
        }
        if(e.getSource()==button3){
            a = a + "3";
            textField.setText(a);
        }
        if(e.getSource()==button4){
            a = a + "4";
            textField.setText(a);
        }
        if(e.getSource()==button5){
            a = a + "5";
            textField.setText(a);
        }
        if(e.getSource()==button6){
            a = a + "6";
            textField.setText(a);
        }
        if(e.getSource()==button7){
            a = a + "7";
            textField.setText(a);
        }
        if(e.getSource()==button8){
            a = a + "8";
            textField.setText(a);
        }
        if(e.getSource()==button9){
            a = a + "9";
            textField.setText(a);
        }
        if(e.getSource()== buttonComma){
            a = a + ".";
            textField.setText(a);
        }
        if(e.getSource()== buttonClear){
            if (a.length() != 0){
                a = a.substring(0, a.length() - 1);
            }
            textField.setText(a);
        }
        if(e.getSource()==buttonPlus){
            makeResult();
            b = a;
            a = "";
            sign = '+';
            textField.setText(String.valueOf(res));
        }
        if(e.getSource()==buttonMinus){
            makeResult();
            b = a;
            a = "";
            sign = '-';
            textField.setText(String.valueOf(res));
        }
        if(e.getSource()==buttonMultiply){
            makeResult();
            b = a;
            a = "";
            sign = '*';
            textField.setText(String.valueOf(res));
        }
        if(e.getSource()==buttonDivide){
            makeResult();
            b = a;
            a = "";
            sign = '/';
            textField.setText(String.valueOf(res));
        }
        if(e.getSource()==buttonPercent){
            makeResult();
            b = a;
            a = "";
            sign = '%';
            makeResult();
            textField.setText(String.valueOf(res));
        }
        if(e.getSource()==buttonAC){
            textField.setText(String.valueOf(res));
            res = 0;
            a = "";
            b = "";
            sign = ' ';
            textField.setText(String.valueOf(res));
        }
        if(e.getSource()==buttonEqual){
            makeResult();
            textField.setText(String.valueOf(res));

        }
    }

    // main logic of the calculator
    public void makeResult(){

        switch (sign){
            case ' ':
                break;

            case '+':
                res = Float.parseFloat(String.format("%.8f", res)) + (b.equals("") ? 0:Float.parseFloat(b)) + (a.equals("") ? 0:Float.parseFloat(a));

                a = "";
                b = "";
                sign = ' ';
                break;

            case '-':
                res = Float.parseFloat(String.format("%.8f", res)) + (b.equals("") ? 0:Float.parseFloat(b)) - (a.equals("") ? 0:Float.parseFloat(a));

                a = "";
                b = "";
                sign = ' ';
                break;

            case '*':
                res = res == 0 ? Float.parseFloat(a) * (b.equals("") ? 0:Float.parseFloat(b)) : res * (a.equals("") ? 0:Float.parseFloat(a));

                a = "";
                b = "";
                sign = ' ';
                break;

            case '/':
                res = res == 0 ? (b.equals("") ? 0:Float.parseFloat(b)) / (a.equals("") ? 0:Float.parseFloat(a)) : res / (a.equals("") ? 0:Float.parseFloat(a));

                a = "";
                b = "";
                sign = ' ';
                break;

            case '%':
                res = res == 0 ? (b.equals("") ? 0:Float.parseFloat(b)) / 100 : Float.parseFloat(String.format("%.8f", res)) / 100;

                a = "";
                b = "";
                sign = ' ';
                break;
        }
    }

}
