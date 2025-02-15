                                                         

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{

    JLabel label1, label2, label3, label4,label5,label6;
    JTextField t1,t2,t3;
    JRadioButton single_face, double_face;
    JComboBox type, size, orien;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTable table;
    ImageIcon icon;

    MyFrame(){
        //Basic layout of Frame
        setTitle("World of SketchArt");
        setSize(1000,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(null);

        label1 = new JLabel("Name: ");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(150,50,100,20);
        c.add(t1);

        label2 = new JLabel("Mobile: ");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(150,100,100,20);
        c.add(t2);

        label3 = new JLabel("Faces: ");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        single_face = new JRadioButton("Single Face");
        double_face = new JRadioButton("Double Face");

        single_face.setBounds(150,150,100,20);
        double_face.setBounds(260,150,100,20);
        single_face.setSelected(true);

        c.add(single_face);
        c.add(double_face);

        ButtonGroup faces = new ButtonGroup();
        faces.add(single_face);
        faces.add(double_face);

        label4 = new JLabel("Choose your art type : ");
        label4.setBounds(20,200,150,20);
        c.add(label4);

        String types[] = {"Normal Pencil Sketch", 
                          "Charcoal Realistic Sketch", "Oil painting",
                          "Water Color Painting",
                          "Color Pencil Sketch"};
        String sizes[]= {"8x12(A4)", "12x16(A3)","16x24(A2)"};
        String orient[] = {"Vertical", "Horizontal"};

        type = new JComboBox(types);
        size = new JComboBox(sizes);
        orien = new JComboBox(orient);

        type.setBounds(150,200,200,25);
        size.setBounds(150,230,100,25);
        orien.setBounds(260,230,100,25);

        c.add(type);
        c.add(size);
        c.add(orien);

        label5 = new JLabel("Mail Id: ");
        label5.setBounds(20,270,100,20);
        c.add(label5);

        t3 = new JTextField();
        t3.setBounds(150,270,200,20);
        c.add(t3);

        terms = new JCheckBox("Confirm your Order");
        terms.setBounds(50,320,250,20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);

        submit.addActionListener(this);

        String imagePath1 = "C:\\Users\\Nehak\\Desktop\\IMG_20220216_013631_255 (1).jpg";
        label6 = new JLabel(new ImageIcon(imagePath1));
        label6.setBounds(430,250,150,150);
        c.add(label6);

        String imagePath2 = "C:\\Users\\Nehak\\Downloads\\20210530_152847.jpg";
        label6 = new JLabel(new ImageIcon(imagePath2));
        label6.setBounds(550,250,150,150);
        c.add(label6);

        String imagePath3 = "C:\\Users\\Nehak\\Downloads\\20210530_152801.jpg";
        label6 = new JLabel(new ImageIcon(imagePath3));
        label6.setBounds(670,250,150,150);
        c.add(label6);

        String imagePath4 = "C:\\Users\\Nehak\\Downloads\\20210822_011300.jpg";
        label6 = new JLabel(new ImageIcon(imagePath4));
        label6.setBounds(790,250,150,150);
        c.add(label6);


        msg = new JLabel();
        msg.setBounds(20,400,400,20);
        c.add(msg);
        c.setBackground(Color.LIGHT_GRAY);

        setVisible(true);

        String[][] data = {{"Art Types","A4(8X12)","A3(12X16)","A2(16X24)"},
                           {"Normal Sketch","899/-","999/-","1199/-"},
                           {"Charcoal Realistic Sketch","1199/-","1499/-","1999/-"},
                           {"Oil Painting","1699/-","2499/-","3799/-"},
                           {"Water Color Painting","1399/-","2199/-","3299/-"},
                           {"Pencil Sketch","1999/-","2299/-","3999/-"}};
        String[] columnNames = {"Art Types","A4(8X12)","A3(12X16)","A2(16X24)"};
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        table.setBounds(400,50,550,120);
        c.add(table);

        validate();
    }

    public void actionPerformed(ActionEvent e){
        if(terms.isSelected()){
            msg.setText("Order placed Successfully!!"+"\n" +" Our team will contact you soon."); 

            String face = "Single Face";
            if(double_face.isSelected()){
                face = "Double Face";
            }

        }
        else{
            msg.setText("Click to Confirm your Order.");
            msg.setForeground(Color.RED);
        }

    }

}

public class OrderForm {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\Nehak\\Downloads\\World of sketchart logo 1.jpg");
        f.setIconImage(icon.getImage());
    }
}
