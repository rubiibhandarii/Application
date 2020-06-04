package application;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegistrationTable extends JFrame implements ActionListener{
    JButton btnback;
    JTable jtable;
    JScrollPane jScrollPane1;
    
public RegistrationTable(){
      Container c = getContentPane();
        c.setBackground(Color.GRAY);
        
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,900);
        setTitle("Registered Students");
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
       setLayout(null);
       
            btnback=new JButton("Back");
       btnback.setBounds(730, 0, 150, 30);
       add(btnback);
       btnback.addActionListener(this);
        btnback.setForeground(Color.WHITE);
        btnback.setFont(new Font("Calibri",Font.PLAIN,20));
      btnback.setBackground(Color.BLACK);
      
 jScrollPane1 = new javax.swing.JScrollPane();
       jScrollPane1.getViewport().setBackground(Color.WHITE);
       jtable = new javax.swing.JTable();
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
        show_user();


}

    public static void main(String[] args) {
        new RegistrationTable().setVisible(true);
    }


public ArrayList<Register> userList(){
        ArrayList<Register> userList = new ArrayList<>();
        try{
        database db = new database();
        String query="select * from examinee_signup"; //showing students who have signed up
        Statement st =db.conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        Register user;
        while(rs.next()){
            user=new Register(rs.getInt("Examinee_ID"),
                    rs.getString("Username"),
                    rs.getString("Email"),
                    rs.getString("Password")
            );
            userList.add(user);
        }
        }
        catch(Exception ex){
        }
        return userList;
    }
    
    public void show_user(){
        ArrayList<Register> list = userList();
        DefaultTableModel model =(DefaultTableModel)jtable.getModel();
        Object[] row = new Object[4];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getUsername();
            row[2]=list.get(i).getEmail();
            row[3]=list.get(i).getPassword();
            
            model.addRow(row);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    
     if(ae.getSource().equals(btnback)){     
        new AdminDashboard(); 
        this.dispose();
    }
    }
}
