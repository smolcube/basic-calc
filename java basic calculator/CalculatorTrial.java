
package calculator.trial;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorTrial implements ActionListener{
JFrame frame;
JTextField text;
JButton[] numbtns = new JButton[10];
JButton[] funcbtns = new JButton[9];
JButton addBtn, subBtn, mulBtn,divBtn ;
JButton negBtn, decBtn, equBtn, delBtn, clrBtn;  
JPanel panel;

Font fnt = new Font("Arial", Font.BOLD, 30);

double num1=0,num2=0,result=0;
char operator;

    CalculatorTrial(){
            frame = new JFrame("calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,550);
            frame.setLayout(null);
            
            text = new JTextField();
            text.setBounds(50,25,300,50);
            text.setFont(fnt);
            text.setEditable(false);
            
            addBtn = new JButton("+");
             subBtn = new JButton("-");
              mulBtn = new JButton("*");
               divBtn = new JButton("/");
                negBtn = new JButton("(-)");
                decBtn = new JButton(".");
                 equBtn = new JButton("=");
                  delBtn = new JButton("<");
                   clrBtn = new JButton("x");
            
            funcbtns[0] = addBtn;      
            funcbtns[1] = subBtn;
            funcbtns[2] = mulBtn;
            funcbtns[3] = divBtn;
            funcbtns[4] = negBtn;
            funcbtns[5] = decBtn;
            funcbtns[6] = equBtn;
            funcbtns[7] = delBtn;
            funcbtns[8] = clrBtn;
            
for(int i=0;i<9;i++){
    funcbtns[i].addActionListener(this);
    funcbtns[i].setFont(fnt);
    funcbtns[i].setFocusable(false);
}            

for(int i=0;i<10;i++){
    numbtns[i] =  new JButton(String.valueOf(i));
    numbtns[i].addActionListener(this);
    numbtns[i].setFont(fnt);
}

delBtn.setBounds(50,430,145,50);
clrBtn.setBounds(150,430,100,50);
equBtn.setBounds(250,430,100,50);

panel= new JPanel();
panel.setBounds(50,100,300,300);
panel.setLayout(new GridLayout(4,4,10,10));
//panel.setBackground(Color.GRAY);

panel.add(numbtns[1]);
panel.add(numbtns[2]);
panel.add(numbtns[3]);
panel.add(addBtn);
panel.add(numbtns[4]);
panel.add(numbtns[5]);
panel.add(numbtns[6]);
panel.add(subBtn);
panel.add(numbtns[7]);
panel.add(numbtns[8]);
panel.add(numbtns[9]);
panel.add(mulBtn);
panel.add(negBtn);
panel.add(numbtns[0]);
panel.add(decBtn);
panel.add(divBtn);


            frame.add(panel);
            frame.add(delBtn);
            frame.add(equBtn);
            frame.add(clrBtn);
            frame.add(text);
            frame.setVisible(true);
            
}
    public static void main(String[] args) {
CalculatorTrial calc = new CalculatorTrial();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
for(int i=0; i<10; i++){
        if(e.getSource()== numbtns[i]){
            text.setText(text.getText().concat(String.valueOf(i)));
        }   
        }
 if(e.getSource()== decBtn){
            text.setText(text.getText().concat("."));}
            
 if(e.getSource()== addBtn){
            num1 = Double.parseDouble(text.getText());
            operator ='+';
            text.setText("");}
 
if(e.getSource()== subBtn){
            num1 = Double.parseDouble(text.getText());
            operator ='-';
            text.setText("");}    

if(e.getSource()== mulBtn){
            num1 = Double.parseDouble(text.getText());
            operator ='*';
            text.setText("");}

if(e.getSource()== divBtn){
            num1 = Double.parseDouble(text.getText());
            operator ='/';
            text.setText("");}

if(e.getSource()== equBtn){
            num2 = Double.parseDouble(text.getText());
            
            
            
            switch(operator){
                case '+':
                    result=num1+num2;
            break;  
                case '-':
                    result=num1-num2;
            break;    
                case '*':
                    result=num1*num2;
            break;   
                case '/':
                    result=num1/num2;
            break;    
            }
            
            
    text.setText(String.valueOf(result));
    num1=result;}
  if(e.getSource()== clrBtn){
           text.setText("");}
  
  if(e.getSource()== delBtn){
  String str = text.getText();
  text.setText("");
  for(int i=0; i<str.length()-1;i++){
      text.setText(text.getText()+str.charAt(i));
  }
   if(e.getSource()== negBtn){
       double neg = Double.parseDouble(text.getText());
       neg*=-1;
       text.setText(str.valueOf(neg));
  }
  
}}}
    
    
    

