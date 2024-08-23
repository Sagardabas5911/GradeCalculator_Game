import java.awt.*;
import java.awt.event.*;
class Grade implements ActionListener
{
    Frame frm;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    Button b1,b2,b3;
    Grade()
    {
        frm = new Frame("Grade Calculater");
        l1 = new Label("Enter the Marks");
        l2 = new Label("Subject 1");
        l3 = new Label("Subject 2");
        l4 = new Label("Subject 3");
        l5 = new Label("Subject 4");
        l6 = new Label("Subject 5");
        l7 = new Label("Total Marks");
        l8 = new Label("Percentage");
        l9 = new Label("Grade");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        t6 = new TextField();
        t7 = new TextField();
        t8 = new TextField();
        b1 = new Button("Info");
        b2 = new Button("Add");
        b3 = new Button("Exit");
        frm.setLayout(new GridLayout(10,2));
        frm.setBackground(Color.LIGHT_GRAY);
        frm.setForeground(Color.BLACK);
        frm.add(l1);
        frm.add(b1);
        frm.add(l2);
        frm.add(t1);
        frm.add(l3);
        frm.add(t2);
        frm.add(l4);
        frm.add(t3);
        frm.add(l5);
        frm.add(t4);
        frm.add(l6);
        frm.add(t5);
        frm.add(b2);
        frm.add(b3);
        frm.add(l7);
        frm.add(t6);
        frm.add(l8);
        frm.add(t7);
        frm.add(l9);
        frm.add(t8);
        b1.addActionListener(this);
        b2.addActionListener(this);
        frm.setSize(500,500);
        frm.show();
    }
    public void actionPerformed (ActionEvent y)
    {
        if(y.getSource()== b1)
        {
           b1.setLabel("@Designed by: Sagar Dabas"); 
        }
        else if(y.getSource()== b2)
        {
            int a,b,c,d,e,x;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=Integer.parseInt(t3.getText());
            d=Integer.parseInt(t4.getText());
            e=Integer.parseInt(t5.getText());
            x=a+b+c+d+e;
            t6.setText(""+x);
            double per=x/5.0;
            t7.setText(""+per);
            if(per>=90)
            {
                t8.setText("A+");
            }
            else if(per>=80)
            {
                t8.setText("A");
            }
            else if(per>=70)
            {
                t8.setText("B");
            }
            else if(per>=60)
            {
                t8.setText("C");
            }
            else if(per>=50)
            {
                t8.setText("D");
            }
            else if(per>=40)
            {
                t8.setText("E");
            }
            else 
            {
                t8.setText("Fail");
            }
        }
        else 
        {
            System.exit(0);
        }
    }
}
class Mainclass
{
    public static void main(String[] args)
    {
        new Grade();
    }
} 