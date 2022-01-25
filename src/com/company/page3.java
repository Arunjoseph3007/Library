package com.company;

import java.awt.*;
import java.awt.event.*;

public class page3 {
  public static void useroption() {
  Frame frm=new Frame("User Options");
  frm.setSize(300,200);
  frm.setVisible(true);
  frm.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent e){
  System.exit(0);
  }
  });
  Panel p = new Panel();
  Panel p1 = new Panel();
  Button Allbooks=new Button("See all books");
  p.add(Allbooks);

  Button Reqbook=new Button("Request a book");
  p.add(Reqbook);
  Reqbook.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      page4.reqbook();
    }
  });
  
  Button bookwm=new Button("Books with me");
  p.add(bookwm);

  bookwm.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
  });

  Button retbook=new Button("Pay fine");
  p.add(retbook);
  GridLayout newGrid=new GridLayout(4,1);
  newGrid.setVgap(10);
  p.setLayout(newGrid);
  p1.add(p);
  frm.add(p1,BorderLayout.NORTH);
  }
}