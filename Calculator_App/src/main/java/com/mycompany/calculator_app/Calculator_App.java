/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator_app;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_App
{
    JFrame frame;
    JTextField Field;
    JButton[] NumberButtons = new JButton[10];
    JButton[] FunctionsButtons = new JButton[8];
    JButton AdditionButton, SubtractionButton, MultiplicationButton, DivisionButton;
    JButton DecimalButton, EqualButton, DeleteButton, ClearButton;
    JPanel Panel;
    
    Font MyFont = new Font("Ink Free",Font,BOLD,30);
    
    double num1 = 0, num2 = 0, result=0;
    char operator;
    
    Calculator_App()
    {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        Field = new JTextField();
        Field.setBounds(50,25,300,50);
        Field.setFont(MyFont);
        
        AdditionButton = new JButton("+");
        SubtractionButton = new JButton("-");
        MultiplicationButton = new JButton("*");
        DivisionButton = new JButton("/");
        DecimalButton = new JButton(".");
        EqualButton = new JButton("=");
        DeleteButton = new JButton("Delete");
        ClearButton = new JButton("Clear");
        
        FunctionsButtons[0] = AdditionButton;
        FunctionsButtons[1] = SubtractionButton;
        FunctionsButtons[2] = MultiplicationButton;
        FunctionsButtons[3] = DivisionButton;
        FunctionsButtons[4] = DecimalButton;
        FunctionsButtons[5] = EqualButton;
        FunctionsButtons[6] = DeleteButton;
        FunctionsButtons[7] = ClearButton;
        
        for(int i = 0; i < 8; i++)
        {
            FunctionsButtons[i].addActionListener(this);
            FunctionsButtons[i].setFont(MyFont);
            FunctionsButtons[i].setFocusable(false);
        }
        
        for(int i = 0; i < 10; i++)
        {
            NumberButtons[i] = new JButton(String.valueOf(i));
            NumberButtons[i].addActionListener(this);
            NumberButtons[i].setFont(MyFont);
            NumberButtons[i].setFocusable(false);
        }
        
        DeleteButton.setBounds(50,430,145,50);
        ClearButton.setBounds(50,430,145,50);
        
        frame.add(DeleteButton);
        frame.add(ClearButton);
        frame.add(Field);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Calculator_App calc = new Calculator_App();
    }
}
