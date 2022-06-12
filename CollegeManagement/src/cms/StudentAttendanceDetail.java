package cms;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Roll Number","Date Time","Attendance"};
    
    String d[][]=new String[15][3];  
    int i=0,j=0;
    

    
    StudentAttendanceDetail(){
        super("View Students Attendence");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance_student";
            conn c1=new conn();
            ResultSet rs = c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("first");
                i++;
                j=0;
            }
        } catch(Exception e){}
        DefaultTableModel model = new DefaultTableModel(d,h);
        JTable jTable = new JTable(model);

        TableRowSorter<TableModel> rowSorter
            = new TableRowSorter<>(jTable.getModel());

        JTextField jtfFilter = new JTextField();
//        jtfFilter.setBounds(280, 260, 100, 30);
        JButton jbtFilter = new JButton("Filter");
            jTable.setRowSorter(rowSorter);
            b1 = new JButton("Print");
            JPanel panel = new JPanel(new GridLayout(3,1,0,2));//new GridLayout(3,1
            panel.add(new JLabel("Enter RollNo"),BorderLayout.WEST);
            panel.add(jtfFilter, BorderLayout.WEST);
            
            

            setLayout(new BorderLayout());
//            jtfFilter.setBounds(150,250,150,30);
//            add(panel, BorderLayout.NORTH);
            panel.add(b1,BorderLayout.EAST);
            add(panel, BorderLayout.SOUTH);
            add(new JScrollPane(jTable), BorderLayout.CENTER);

            jtfFilter.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfFilter.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

          });
            b1.addActionListener(this);
    }
//    public static void main(String[] args){
//        new StudentAttendanceDetail().setVisible(true);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new JTable().print();
        } catch (Exception eaq) {}
    }
}