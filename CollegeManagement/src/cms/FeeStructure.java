/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        setSize(1200,700);
        setLocation(80,20);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,40));
        i1.setBounds(500,5,400,50);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(30,80,100,40);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
         
        l2 = new JLabel("BTech");
        l2.setBounds(180,80,100,40);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        l3 = new JLabel("BCA");
        l3.setBounds(330,80,100,40);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        
        l4 = new JLabel("BBA");
        l4.setBounds(480,80,100,40);
        l4.setFont(new Font("serif",Font.BOLD,20));
        add(l4);
        
        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(480,140,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,20));
        add(bb5);
        
        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(480,200,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,20));
        add(bb6);
        
        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(480,260,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,20));
        add(bb7);
        
        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(480,320,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,20));
        add(bb8);
        
        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(480,380,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,20));
        add(bb13);
        
        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(480,440,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,20));
        add(bb14);
        
        l5 = new JLabel("Bsc");
        l5.setBounds(630,80,100,40);
        l5.setFont(new Font("serif",Font.BOLD,20));
        add(l5);
        
        bb9 = new JLabel("Rs 18000");
        bb9.setBounds(630,140,150,40);
        bb9.setFont(new Font("serif",Font.PLAIN,20));
        add(bb9);
        
        bb10 = new JLabel("Rs 18000");
        bb10.setBounds(630,200,150,40);
        bb10.setFont(new Font("serif",Font.PLAIN,20));
        add(bb10);
        
        bb11 = new JLabel("Rs 18000");
        bb11.setBounds(630,260,150,40);
        bb11.setFont(new Font("serif",Font.PLAIN,20));
        add(bb11);
        
        bb12 = new JLabel("Rs 18000");
        bb12.setBounds(630,320,150,40);
        bb12.setFont(new Font("serif",Font.PLAIN,20));
        add(bb12);
        
        bb15 = new JLabel("Rs 18000");
        bb15.setBounds(630,380,150,40);
        bb15.setFont(new Font("serif",Font.PLAIN,20));
        add(bb15);
        
        bb16 = new JLabel("Rs 18000");
        bb16.setBounds(630,440,150,40);
        bb16.setFont(new Font("serif",Font.PLAIN,20));
        add(bb16);
        
        l6 = new JLabel("MBA");
        l6.setBounds(780,80,100,40);
        l6.setFont(new Font("serif",Font.BOLD,20));
        add(l6);
        
        m1 = new JLabel("Rs 65000");
        m1.setBounds(780,140,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,20));
        add(m1);
        
        m2 = new JLabel("Rs 65000");
        m2.setBounds(780,200,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,20));
        add(m2);
        
        m3 = new JLabel("Rs 65000");
        m3.setBounds(780,260,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,20));
        add(m3);
        
        m4 = new JLabel("Rs 65000");
        m4.setBounds(780,320,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,20));
        add(m4);
         
        l7 = new JLabel("MCA");
        l7.setBounds(930,80,100,40);
        l7.setFont(new Font("serif",Font.BOLD,20));
        add(l7);
        
        m5 = new JLabel("Rs 55000");
        m5.setBounds(930,140,150,40);
        m5.setFont(new Font("serif",Font.PLAIN,20));
        add(m5);
        
        m6 = new JLabel("Rs 55000");
        m6.setBounds(930,200,150,40);
        m6.setFont(new Font("serif",Font.PLAIN,20));
        add(m6);
        
        m7 = new JLabel("Rs 55000");
        m7.setBounds(930,260,150,40);
        m7.setFont(new Font("serif",Font.PLAIN,20));
        add(m7);
        
        m8 = new JLabel("Rs 55000");
        m8.setBounds(930,320,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,20));
        add(m8);
        
        l8 = new JLabel("MTech");
        l8.setBounds(1080,80,100,40);
        l8.setFont(new Font("serif",Font.BOLD,20));
        add(l8);
        
        m9 = new JLabel("Rs 81000");
        m9.setBounds(1080,140,150,40);
        m9.setFont(new Font("serif",Font.PLAIN,20));
        add(m9);
        
        m10 = new JLabel("Rs 81000");
        m10.setBounds(1080,200,150,40);
        m10.setFont(new Font("serif",Font.PLAIN,20));
        add(m10);
        
        m11 = new JLabel("Rs 81000");
        m11.setBounds(1080,260,150,40);
        m11.setFont(new Font("serif",Font.PLAIN,20));
        add(m11);
        
        m12 = new JLabel("Rs 81000");
        m12.setBounds(1080,320,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,20));
        add(m12);
        
        l10 = new JLabel("Semester 1");
        l10.setBounds(30,140,150,40);
        l10.setFont(new Font("serif",Font.BOLD,20));
        add(l10);
        
        l11 = new JLabel("Semester 2");
        l11.setBounds(30,200,150,40);
        l11.setFont(new Font("serif",Font.BOLD,20));
        add(l11);
        
        l12 = new JLabel("Semester 3");
        l12.setBounds(30,260,150,40);
        l12.setFont(new Font("serif",Font.BOLD,20));
        add(l12);
        
        l13 = new JLabel("Semester 4");
        l13.setBounds(30,320,150,40);
        l13.setFont(new Font("serif",Font.BOLD,20));
        add(l13);
        
        l14 = new JLabel("Semester 5");
        l14.setBounds(30,380,150,40);
        l14.setFont(new Font("serif",Font.BOLD,20));
        add(l14);
        
        l15 = new JLabel("Semester 6");
        l15.setBounds(30,440,150,40);
        l15.setFont(new Font("serif",Font.BOLD,20));
        add(l15);
        
        l16 = new JLabel("Semester 7");
        l16.setBounds(30,500,150,40);
        l16.setFont(new Font("serif",Font.BOLD,20));
        add(l16);
        
        l17 = new JLabel("Semester 8");
        l17.setBounds(30,560,150,40);
        l17.setFont(new Font("serif",Font.BOLD,20));
        add(l17);
        
        
        b1 = new JLabel("Rs 35500");
        b1.setBounds(180,140,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,20));
        add(b1);
        
        b2 = new JLabel("Rs 35500");
        b2.setBounds(180,200,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,20));
        add(b2);
        
        b3 = new JLabel("Rs 35500");
        b3.setBounds(180,260,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,20));
        add(b3);
        
        b4 = new JLabel("Rs 35500");
        b4.setBounds(180,320,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,20));
        add(b4);
        
        b5 = new JLabel("Rs 35500");
        b5.setBounds(180,380,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,20));
        add(b5);
        
        b6 = new JLabel("Rs 35500");
        b6.setBounds(180,440,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,20));
        add(b6);
        
        b7 = new JLabel("Rs 35500");
        b7.setBounds(180,500,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,20));
        add(b7);
        
        b8 = new JLabel("Rs 35500");
        b8.setBounds(180,560,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,20));
        add(b8);
        
        
        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(330,140,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,20));
        add(bb1);
        
        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(330,200,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,20));
        add(bb2);
        
        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(330,260,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,20));
        add(bb3);
        
        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(330,320,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,20));
        add(bb4);
        
        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(330,380,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,20));
        add(bb17);
        
        bb18 = new JLabel("Rs 32000");
        bb18.setBounds(330,440,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,20));
        add(bb18);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
//    public static void main(String[] args){
//        new FeeStructure().setVisible(true);
//    }
}
