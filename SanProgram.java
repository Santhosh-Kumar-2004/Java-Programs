import java.awt.*;
import java.awt.event.*;
public class SanProgram
{
public static void main(String[]args)
{
Frame x1=new Frame("UUCMS Potral");
Label y1=new Label("Which student details you wanna see? ");
Label y2=new Label("IS your job Done? ");
y1.setFont(new Font("Italic",Font.BOLD,20));
y2.setFont(new Font("Calibri",Font.BOLD,18));
x1.setFont(new Font("Ariel Black",Font.BOLD,24));

Label a1=new Label();
Label a2=new Label();
Label a3=new Label();
Label a4=new Label();
Label a5=new Label();
Label a6=new Label();
Label a7=new Label();
Label a8=new Label();

Label b1=new Label();
Label b2=new Label();
Label b3=new Label();
Label b4=new Label();
Label b5=new Label();
Label b6=new Label();
Label b7=new Label();
Label b8=new Label();

a1.setBounds(500,220,600,30);
a2.setBounds(500,260,600,30);
a3.setBounds(500,300,600,30);
a4.setBounds(500,340,600,30);
a5.setBounds(500,380,600,30);
a6.setBounds(500,420,600,30);
a7.setBounds(500,460,600,30);
a8.setBounds(500,500,600,30); 

b1.setBounds(950,220,600,30);
b2.setBounds(950,260,600,30);
b3.setBounds(950,300,600,30);
b4.setBounds(950,340,600,30);
b5.setBounds(950,380,600,30);
b6.setBounds(950,420,600,30);
b7.setBounds(950,460,600,30);
b8.setBounds(950,500,600,30);

      //Button of Student Details
Button s1=new Button("Student Details");
s1.setBounds(30,50,250,50);
s1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent x)
{
y1.setBounds(40,100,500,50);
}
});
       //Button Of Gokul
Button s2=new Button("Gokuleshwar's Info");
s2.setBounds(500,150,250,50);
s2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent y)
{
a1.setText("Name: Gokuleshwar");
a2.setText("Date of Birth: 24 01 2005");
a3.setText("Father's Name: Srinivas");
a4.setText("Mother's Name: Madhana");
a5.setText("Register No: U18JX22S0021");
a6.setText("College Name: Vivekananda Degree College");
a7.setText("Contact No: 9035775538");
a8.setText("Address: I don't Know ,the MF not told to me");
}
});
    //Button Of Santhosh
Button s3=new Button("Santhosh's Info");
s3.setBounds(950,150,250,50);
s3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent z)
{
a1.setText("Name: Santhosh Kumar Agarwal");
a2.setText("Date of Birth: 21 11 2004");
a3.setText("Father's Name: Vijaya Kumar");
a4.setText("Mother's Name: Manjula");
a5.setText("Register No: U18JX22S0005");
a6.setText("College Name: Vivekananda Degree College");
a7.setText("Contact No: 9606887205");
a8.setText("Address: Malleshwaram Bangalore-55");
}
});
     //Button Of Submit
Button s4=new Button("SUBMIT");
s4.setBounds(100,650,150,50);
s4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent w)
{ 
y2.setBounds(100,700,600,50);
}
});

x1.add(y1);
x1.add(y2);
x1.add(s1);
x1.add(s2);
x1.add(s3);
x1.add(s4);
x1.add(y1);
x1.add(y2);
x1.add(a1);
x1.add(a2);
x1.add(a3);
x1.add(a4);
x1.add(a5);
x1.add(a6);
x1.add(a7);
x1.add(a8);
x1.add(b1);
x1.add(b2);
x1.add(b3);
x1.add(b4);
x1.add(b5);
x1.add(b6);
x1.add(b7);
x1.add(b8);
x1.setSize(2000,2000);
x1.setLayout(null);
x1.setVisible(true);
}
}







