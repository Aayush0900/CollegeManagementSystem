/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

/**
 *
 * @author AAYUSH VAGRECHA
 */
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TeacherAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Employee id","Date Time","First Half"};
    String d[][]=new String[15][3];  
    int i=0,j=0;
    
    TeacherAttendanceDetail(){
        super("View Teachers Attendance");
        setSize(800,300);
        setLocation(300,150);

        try{
            String q="select * from attendance_teacher";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("emp_id");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("first");
                i++;
                j=0;
            }
        
        }catch(Exception e){}
        
        DefaultTableModel model = new DefaultTableModel(d,h);
        JTable jTable = new JTable(model);

        TableRowSorter<TableModel> rowSorter
            = new TableRowSorter<>(jTable.getModel());

        JTextField jtfFilter = new JTextField();
        JButton jbtFilter = new JButton("Filter");
            jTable.setRowSorter(rowSorter);
            b1 = new JButton("Print");
            JPanel panel = new JPanel(new GridLayout(3,1,0,2));//new GridLayout(3,1
            panel.add(new JLabel("Enter Emp_id:"),BorderLayout.WEST);
            panel.add(jtfFilter, BorderLayout.WEST);
            
            

            setLayout(new BorderLayout());
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
        
        
        
        
        
        
//        b1=new JButton("Print");
//        add(b1,"South");
//        JScrollPane s1=new JScrollPane(j1);
//        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            new JTable().print();
        }catch(Exception e){}
    }
    
//    public static void main(String[] args){
//        new TeacherAttendanceDetail().setVisible(true);
//    }
}