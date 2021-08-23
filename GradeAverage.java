import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GradeAverage
{
    public static void main(String args[])
    {
        JFrame calc = new JFrame("Grade Average");
        calc.setLayout(null);

        JLabel s1 = new JLabel("Student 1: ");
        JTextField s1Text = new JTextField();
        s1.setBounds(50, 50, 120, 30);
        s1Text.setBounds(170, 50, 100, 30);
        calc.add(s1);
        calc.add(s1Text);

        JLabel s2 = new JLabel("Student 2: ");
        JTextField s2Text = new JTextField();
        s2.setBounds(50, 80, 120, 30);
        s2Text.setBounds(170, 80, 100, 30);
        calc.add(s2);
        calc.add(s2Text);

        JLabel s3 = new JLabel("Student 3: ");
        JTextField s3Text = new JTextField();
        s3.setBounds(50, 110, 120, 30);
        s3Text.setBounds(170, 110, 100, 30);
        calc.add(s3);
        calc.add(s3Text);

        JLabel s4 = new JLabel("Student 4: ");
        JTextField s4Text = new JTextField();
        s4.setBounds(50, 140, 120, 30);
        s4Text.setBounds(170, 140, 100, 30);
        calc.add(s4);
        calc.add(s4Text);

        JLabel s5 = new JLabel("Student 5: ");
        JTextField s5Text = new JTextField();
        s5.setBounds(50, 170, 120, 30);
        s5Text.setBounds(170, 170, 100, 30);
        calc.add(s5);
        calc.add(s5Text);

        JLabel s6 = new JLabel("Student 6: ");
        JTextField s6Text = new JTextField();
        s6.setBounds(50, 200, 120, 30);
        s6Text.setBounds(170, 200, 100, 30);
        calc.add(s6);
        calc.add(s6Text);

        JLabel s7 = new JLabel("Student 7: ");
        JTextField s7Text = new JTextField();
        s7.setBounds(50, 230, 120, 30);
        s7Text.setBounds(170, 230, 100, 30);
        calc.add(s7);
        calc.add(s7Text);

        JLabel s8 = new JLabel("Student 8: ");
        JTextField s8Text = new JTextField();
        s8.setBounds(50, 260, 120, 30);
        s8Text.setBounds(170, 260, 100, 30);
        calc.add(s8);
        calc.add(s8Text);

        JLabel s9 = new JLabel("Student 9: ");
        JTextField s9Text = new JTextField();
        s9.setBounds(50, 290, 120, 30);
        s9Text.setBounds(170, 290, 100, 30);
        calc.add(s9);
        calc.add(s9Text);

        JLabel s10 = new JLabel("Student 10: ");
        JTextField s10Text = new JTextField();
        s10.setBounds(50, 320, 120, 30);
        s10Text.setBounds(170, 320, 100, 30);
        calc.add(s10);
        calc.add(s10Text);

        JButton done = new JButton("Calculate");
        JLabel average = new JLabel();
        done.setBounds(50, 380, 100, 30);
        average.setBounds(50, 410, 200, 30);
        calc.add(done);
        calc.add(average);

        calc.setVisible(true);
        calc.setSize(350, 500);

        done.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double s1I, s2I, s3I, s4I, s5I, s6I, s7I, s8I, s9I, s10I, gradeAverage;
                s1I = Double.parseDouble(s1Text.getText());
                s2I = Double.parseDouble(s2Text.getText());
                s3I = Double.parseDouble(s3Text.getText());
                s4I = Double.parseDouble(s4Text.getText());
                s5I = Double.parseDouble(s5Text.getText());
                s6I = Double.parseDouble(s6Text.getText());
                s7I = Double.parseDouble(s7Text.getText());
                s8I = Double.parseDouble(s8Text.getText());
                s9I = Double.parseDouble(s9Text.getText());
                s10I = Double.parseDouble(s10Text.getText());


                gradeAverage = (s1I + s2I + s3I + s4I + s5I + s6I + s7I + s8I +s9I + s10I)/10;
                average.setText("Average: " + String.format("%.2f", gradeAverage) + "%");
            }
        });



        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
