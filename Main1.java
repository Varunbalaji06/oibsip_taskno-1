// Online Reservation System For Booking Train Ticket
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
// Code by varunbalaji
class Login extends JFrame
{
    JTextField t1,t2;
    JButton b1;
    JLabel l1,l2;
    Login()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        l1 = new JLabel("Login");
        l1.setFont(new Font("Times new Roman",Font.BOLD,30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(130,10,300,30);
        add(l1);

        t1 = new JTextField(60);
        t2 = new JPasswordField(60);
        b1 = new JButton("SignIn");

        t1.setBounds(100, 60, 120, 30);
        t2.setBounds(100, 100, 120, 30);
        b1.setBounds(120,140,80,30);

        l2 = new JLabel("");
        l2.setBounds(250,80,300,30);
        l2.setForeground(Color.RED);
        add(l2); 
        add(t1);
        add(t2);
        add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                if(t1.getText().toString().equals("varun") && t2.getText().toString().equals("varun01"))
                {
                    dispose();
                    ConfirmationPage p = new ConfirmationPage();
                }    
                else
                {
                    l2.setText("Invalid Username Or Password");
                }

            }           
        });

    }
}

class ConfirmationPage extends JFrame 
{
    Label Book;
    Button b3;
    ConfirmationPage()
    {
        // Window Code 
        super("Confirmation Page");
        setSize(700, 400);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(255,255,204);
        setBackground(formColor);

        // Close the window
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        Font labelFont = new Font("arial",Font.PLAIN, 18);
        // Label - Book Tickets
        Book = new Label("Click the button to book ticket : ");
        Book.setForeground(Color.BLACK);
        Book.setFont(labelFont);
        Book.setBounds(80, 20, 400, 100);
        add(Book);

        // Button to register new passenger
        b3 = new Button("Book Ticket");
        b3.setBackground(Color.RED);
        b3.setBounds(480,53, 180, 30);
        add(b3);

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   dispose();
                Myapp app = new Myapp();
            }
        });
        }

}

class Myapp extends Frame implements ActionListener
{
   
    Label lbl_Title,lbl_Name,lbl_Age,lbl_Gender,lbl_From,lbl_To,lbl_TrainNo,lbl_TrainName,lbl_Date,lbl_Class;
    TextField txt_Name,txt_Age,txt_From,txt_To,txt_TrainNo,txt_TrainName,txt_Date;
    Choice c;
    Button Submit,Bookings,cancelBooking;
    Checkbox checkMale,checkFemale;
    CheckboxGroup cbg;
    Button btn1;
    ArrayList<data> details = new ArrayList<>();
   // JDateChooser date;
    public Myapp()
    {
        // Window Code 
        super("Reservation Form");
        setSize(820, 700);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(255,255,204);
        setBackground(formColor);

        // Close the window
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });        

        // Font Styling
        Font titleFont = new Font("arial",Font.BOLD, 25);
        Font labelFont = new Font("arial",Font.PLAIN, 18);
        Font textFont = new Font("arial",Font.PLAIN, 15);
   
        // Adding labels to frame

        lbl_Title = new Label("Registration Form");
        lbl_Title.setBounds(320,10,350,100);
        lbl_Title.setFont(titleFont);
        lbl_Title.setForeground(Color.RED);
        add(lbl_Title);
        
        //Name
        lbl_Name = new Label("Name :");
        lbl_Name.setBounds(60,90,160,90);
        lbl_Name.setFont(labelFont);
        lbl_Name.setForeground(Color.BLACK);
        add(lbl_Name);

        txt_Name = new TextField();
        txt_Name.setBounds(300, 120, 400, 30);
        txt_Name.setFont(textFont);
        add(txt_Name);
        
        //Age
        lbl_Age = new Label("Age :");
        lbl_Age.setBounds(60,140,160,90);
        lbl_Age.setFont(labelFont);
        lbl_Age.setForeground(Color.BLACK);
        add(lbl_Age);

        txt_Age = new TextField();
        txt_Age.setBounds(300, 170, 400, 30);
        txt_Age.setFont(textFont);
        add(txt_Age);
        
        //Gender
        lbl_Gender = new Label("Gender :");
        lbl_Gender.setBounds(60,200,160,90);
        lbl_Gender.setFont(labelFont);
        lbl_Gender.setForeground(Color.BLACK);
        add(lbl_Gender);

        cbg = new CheckboxGroup();

        checkMale = new Checkbox("Male",cbg,false);
        checkMale.setBounds(300,230,200,30);
        checkMale.setFont(labelFont);
        checkMale.setForeground(Color.BLACK);
        add(checkMale);

        checkFemale = new Checkbox("Female",cbg,false);
        checkFemale.setBounds(500,230,200,30);
        checkFemale.setFont(labelFont);
        checkFemale.setForeground(Color.BLACK);
        add(checkFemale);
     
        //From
        lbl_From = new Label("From :");
        lbl_From.setBounds(60,260,160,90);
        lbl_From.setFont(labelFont);
        lbl_From.setForeground(Color.BLACK);
        add(lbl_From);

        txt_From = new TextField();
        txt_From.setBounds(300, 290, 400, 30);
        txt_From.setFont(textFont);
        add(txt_From); 
        
        //To
        lbl_To = new Label("To :");
        lbl_To.setBounds(60,320,160,90);
        lbl_To.setFont(labelFont);
        lbl_To.setForeground(Color.BLACK);
        add(lbl_To);

        txt_To = new TextField();
        txt_To.setBounds(300, 350, 400, 30);
        txt_To.setFont(textFont);
        add(txt_To); 

        //Train No
        lbl_TrainNo = new Label("Train No :");
        lbl_TrainNo.setBounds(60,375,160,90);
        lbl_TrainNo.setFont(labelFont);
        lbl_TrainNo.setForeground(Color.BLACK);
        add(lbl_TrainNo);

        txt_TrainNo = new TextField();
        txt_TrainNo.setBounds(300, 405, 400, 30);
        txt_TrainNo.setFont(textFont);
        add(txt_TrainNo); 

        //Train Name
        lbl_TrainName = new Label("Train Name:");
        lbl_TrainName.setBounds(60,430,160,90);
        lbl_TrainName.setFont(labelFont);
        lbl_TrainName.setForeground(Color.BLACK);
        add(lbl_TrainName);

        txt_TrainName = new TextField();
        txt_TrainName.setBounds(300, 460, 400, 30);
        txt_TrainName.setFont(textFont);
        add(txt_TrainName); 

        //Class Type 
        lbl_Class = new Label("Class Type:");
        lbl_Class.setBounds(60,490,160,90);
        lbl_Class.setFont(labelFont);
        lbl_Class.setForeground(Color.BLACK);
        add(lbl_Class);

        c = new Choice();
        c.setBounds(300, 520, 400, 30);
        c.setBackground(Color.WHITE);
        c.setFont(labelFont);
        c.add("All Classes");
        c.add("AC First Class(1A)");
        c.add("AC 2 Tier(2A)");
        c.add("AC 3 Tier(3A)");
        c.add("AC Chair Car(CC)");
        c.add("Sleeper(SL)");
        c.add("First Class(FC)");
        c.add("Second Sitting(2S)");
        add(c);

        //Date
        lbl_Date = new Label("Date Of Journey:");
        lbl_Date.setBounds(60,560,160,90);
        lbl_Date.setFont(labelFont);
        add(lbl_Date);       

        txt_Date = new TextField();
        txt_Date.setBounds(300, 590, 400, 30);
        txt_Date.setFont(textFont);
        add(txt_Date);
        
        //Buttom-Submit
        Submit = new Button("Book");
        Submit.setBackground(Color.RED);
        Submit.setFont(labelFont);
        Submit.setBounds(200, 650, 100, 30);
        Submit.addActionListener(this);
        add(Submit);

        //Button-Bookings
        Bookings = new Button("Show Bookings");
        Bookings.setBackground(Color.BLUE);
        Bookings.setFont(labelFont);
        Bookings.setBounds(400, 650, 200, 30);
        add(Bookings);

        Submit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                //System.out.println("Submit button clicked");  // debugging statement
                String Name = txt_Name.getText();
                String Age = txt_Age.getText();
                String From = txt_From.getText();
                String To = txt_To.getText();
                String TrainNo = txt_TrainNo.getText();
                String TrainName = txt_TrainName.getText();
                String Class = c.getSelectedItem();
                String Date = txt_Date.getText();
                // Validating inputs of Age,TrainNo and Date
                if (!isInteger(Age)) 
                {
                    JOptionPane.showMessageDialog(null, "Age must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!isInteger(TrainNo)) {
                JOptionPane.showMessageDialog(null, "Train No must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
                }

                if (!isValidDate(Date)) {
                JOptionPane.showMessageDialog(null, "Date must be in the format dd/mm/yyyy.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
                }

                String Gender = "";
                if (checkMale.getState())
                {
                    Gender = "Male";
                }
                else if (checkFemale.getState())
                {
                    Gender = "Female";
                }
                data newdetail = new data(Name, Age, Gender, From, To, TrainNo, TrainName, Class, Date);
                details.add(newdetail);

                JOptionPane.showMessageDialog(
                Myapp.this,
                "Booking successful!\nYour PNR: " + newdetail.getPNR(),
                "Booking Confirmation",
                JOptionPane.INFORMATION_MESSAGE
                );  

                // Clear the input fields
                txt_Name.setText("");
                txt_Age.setText("");
                txt_From.setText("");
                txt_To.setText("");
                txt_TrainNo.setText("");
                txt_TrainName.setText("");
                txt_Date.setText("");
               
                checkMale.setState(false);
                checkFemale.setState(false);
            }

            private boolean isValidDate(String str) 
            {
                String regex = "^\\d{2}/\\d{2}/\\d{4}$";
                return str.matches(regex);
            }

            private boolean isInteger(String str) 
            {
                try
                {
                    Integer.parseInt(str);
                    return true;
                } catch (NumberFormatException e){
                return false;
                }
            }
        });

        Bookings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //System.out.println("Bookings button clicked");  // Debugging Statement
                showBookings();
            }
        }); 

        // Cancel Booking Button
        cancelBooking = new Button("Cancel Booking");
        cancelBooking.setBackground(Color.GREEN);
        cancelBooking.setFont(labelFont); 
        cancelBooking.setBounds(650, 650, 140, 30);
        cancelBooking.addActionListener(this);
        add(cancelBooking);

        cancelBooking.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                CancelBooking();
            }
        });
    }

 private void CancelBooking() 
    {
    String inputPNR = JOptionPane.showInputDialog("Enter PNR Number to cancel booking:");
    if (inputPNR != null && !inputPNR.isEmpty()) {
        for (int i = 0; i < details.size(); i++) {
            data booking = details.get(i);
            if (booking.getPNR().equalsIgnoreCase(inputPNR)) {
                int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Booking found!\n" + booking.toString() + "\nDo you want to cancel this booking?",
                    "Confirm Cancellation",
                    JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    details.remove(i);
                    showBookings();
                    JOptionPane.showMessageDialog(this, "Booking has been canceled.", "Cancellation Successful", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Booking with PNR " + inputPNR + " not found.", "Booking Not Found", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Please enter a valid PNR number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
    }
    }

    
    private void showBookings()
    {
        JFrame userFrame = new JFrame("My Bookings");
        userFrame.setSize(400, 300);
        userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea userTextArea = new JTextArea();
        userTextArea.setEditable(false);

        if (details.isEmpty())
        {
            userTextArea.append("No Bookings available");
        }
        else
        {
        int bookingCount = 1;
        for (data user : details) 
        {
        userTextArea.append("Booking Number: " + bookingCount + "\n");    
        userTextArea.append("Name: " + user.getName() + "\n");
        userTextArea.append("Age: " + user.getAge() + "\n");
        userTextArea.append("Gender: " + user.getGender() + "\n");
        userTextArea.append("From: " + user.getFrom() + "\n");
        userTextArea.append("To: " + user.getTo() + "\n"); 
        userTextArea.append("TrainNo: " + user.getTrainNo() + "\n");
        userTextArea.append("TrainName: " + user.getTrainName() + "\n");
        userTextArea.append("Class: " + user.getClassType() + "\n");
        userTextArea.append("Date: " + user.getDate() + "\n" + "----------------------" +"\n");
        bookingCount++;
         }
        }

        JScrollPane scrollPane = new JScrollPane(userTextArea);
        cancelBooking = new Button("Cancel Bookings");
        cancelBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int selectedIndex = userTextArea.getCaretPosition();
                System.out.println("Caret position : " + selectedIndex);
                int startOfBooking = userTextArea.getText().lastIndexOf("Booking Number: ", selectedIndex);
                if (startOfBooking == -1)
                    {
                        return;
                    }
                    int endOfBooking = userTextArea.getText().indexOf("----------------------", startOfBooking);
                    if (endOfBooking == -1)
                    {
                        endOfBooking = userTextArea.getText().length();
                    }

                    String selectedBooking = userTextArea.getText().substring(startOfBooking, endOfBooking);
                    System.out.println("Selected Booking: " + selectedBooking);

                    String[] lines = selectedBooking.split("\n");
                    String bookingNumberLine = lines[0];
                    String[] parts = bookingNumberLine.split(" ");
        
                    if (parts.length >= 3) 
                    {
                        try{
                            int bookingIndex = Integer.parseInt(parts[2]) - 1;
                            if (bookingIndex >=0 && bookingIndex < details.size())
                            {
                                details.remove(bookingIndex);
                                showBookings();
                            }
                        } catch (NumberFormatException ex)
                        {
                            System.out.println("Error parsing Booking number");
                        }   
                    }       
        }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelBooking);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        userFrame.add(mainPanel);
        userFrame.setVisible(true);
    }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
        if (e.getSource() == Submit) 
        {

        } 
        else if (e.getSource() == Bookings) 
        {
            showBookings();
        }
    }

}

class data extends JFrame 
{
    private String PNR;
    private String Name,Age,Gender,From,To,TrainNo,TrainName,Class,Date;

    public data(String Name,String Age,String Gender,String From,String To,String TrainNo,String TrainName, String Class, String Date)
    {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.From = From;
        this.To = To;
        this.TrainNo = TrainNo;
        this.TrainName=TrainName ;
        this.Class = Class;
        this.Date = Date;
        this.PNR = generatePNR(); // Generate a random PNR while creating a new Booking
        System.out.println("Generated PNR: " + this.PNR);
    }

    public String getName()
    {
        return Name;
    }
    public String getAge()
    {
        return Age;
    }
    public String getGender()
    {
        return Gender;
    }
    public String getFrom()
    {
        return From;
    }
    public String getTo()
    {
        return To;
    }
    public String getTrainNo()
    {
        return TrainNo;
    }
    public String getTrainName()
    {
        return TrainName;
    }
    public String getClassType()
    {
        return Class;
    }
    public String getDate()
    {
        return Date;
    }
    public String getPNR()
    {
        return PNR;
    }

    private String generatePNR()
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder pnr = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            pnr.append(randomChar);
        }
        return pnr.toString();
    }
}
public class Main1
{
    public static void main(String[] args) 
    {
        Login l = new Login();
        l.setBounds(400, 200, 500, 300);
        l.setVisible(true);
    }   
}
