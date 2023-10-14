// import java.applet.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Mulselist extends Applet implements ActionListener {
//     List os;
//     String msg = "";
//     public void init(){
//         os = new List(4,true);
//         os.add("Apple");
//         os.add("Max");
//         os.add("windows");
//         add(os);
//         os.addActionListener(this);
//     }

//     public void actionPerformed(ActionEvent ae){
//         repaint();
//     }
    
//     public void paint(Graphics g ){
//         int ind[];
//         msg = "Current os : ";
//         ind = os.getSelectedIndexes();
        
//         for (int i = 0; i < ind.length; i++) {
//             msg += os.getItem(ind[i]);
//             g.drawString(msg,6,120);
//             msg = "Current Browser : ";
//         }
//     }

//     public static void main(String[] args){

//     }
// }
