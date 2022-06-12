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

public class TeacherAttendance extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    TeacherAttendance(){
       
//        setLayout(new GridLayout(4,2,50,50));
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        c2 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()){
                c2.add(rs.getString("emp_id"));    
            }
      
      
       }catch(Exception e){ }
       
        l1 = new JLabel("Select Roll Number");
        l1.setBounds(10,40,150,30);
        c2.setBounds(200,40,150,30);
        add(l1);
        add(c2);
      
        l2 = new JLabel("Attendance");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
       
        l2.setBounds(10,100, 150,30);
        fh.setBounds(200, 100, 150,30);
        
        add(l2);
        add(fh);
        
//        l2 = new JLabel("Second Half");
//        sh = new Choice();
//        sh.add("Present");
//        sh.add("Absent");
//        sh.add("Leave");
       
//        add(l2);
//        add(sh);
        l3 = new JLabel("Date(dd/mm/yyyy)");
        t1 = new JTextField();
        l3.setBounds(10, 160, 150, 30);
        t1.setBounds(200, 160, 150, 30);
        add(l3);
        add(t1);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(60, 250, 100, 30);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200, 250, 100, 30);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.CYAN);
        
        setVisible(true);
        setSize(400,450);
        setLocation(500,150);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
//        String s = sh.getSelectedItem();
        String dt = t1.getText();
        String id = c2.getSelectedItem();
//        String qry = "insert into attendance_teacher values("+ id +",'"+dt+"','"+f+"')";
       if(ae.getSource()==b1){
        try{
            
            int i=0;
            conn c1 = new conn();
            if(dt.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill The field");
            }
            else{
                ResultSet rs2 = c1.s.executeQuery("select * from attendance_teacher");
                while(rs2.next()){
//                System.out.println("JHUm YAVn hd/fnk jh");
                    String s = rs2.getString("emp_id");
                    String s2 = rs2.getString("Date");
                 if(s.equals(id) && s2.equals(dt)){
                    i=1;
                }
            }
            if(i==0)
            {
                String qry = "insert into attendance_teacher values('"+id+"','"+dt+"','"+f+"')";
                c1.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null,"Attendance confirmed");
            }
            else{
                JOptionPane.showMessageDialog(null,"Attendance alredy Taken");                
            }
            dispose();
//            JOptionPane.showMessageDialog(null,"Attendance confirmed");
//            this.setVisible(false);
           }
        }catch(Exception ee){
            ee.printStackTrace();
        }
       }
       else if(ae.getSource()==b2){
           dispose();
       }
    }
    
//    public static void main(String s[]){
//        new TeacherAttendance();
//    }
}


