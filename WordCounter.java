/**This program uses the Java Swing GUI and counts the number of words and characters entered by the user and returns them to the user.
 * The code to calculate words and chars are found in Class Counter.
 * Upcoming improvements:
 * 1. Number of Characters currently only shows letters and digits. Include special characters ( and white space?).
 * 2. Update the GUI and make it better looking.
 */
import java.awt.*;
import javax.swing.*;
class WordCounter extends JFrame  {

    static JFrame window;
    static JPanel panel;
    static JLabel introLabel;
    static JTextArea inputTextArea;
    static JLabel displayNumOfWords;
    static JLabel numOfWords;
    static JLabel displayNumOfChars;
    static JLabel numofChars;
    static String text;

    WordCounter() {}// default constructor

    public static void main(String[] args)
    {
        mainFrame();//Setup of Jframe and components

        inputTextArea = new JTextArea();// create a text area, specifying the rows and columns

        // add components to frame
        panel.add(displayNumOfWords);
        panel.add(numOfWords);
        panel.add(displayNumOfChars);
        panel.add(numofChars);
        window.add(panel,BorderLayout.SOUTH);
        window.add(inputTextArea,BorderLayout.CENTER);
        window.add(introLabel,BorderLayout.NORTH);
        window.show();

       while (true) { //Loop answers
            text = inputTextArea.getText();

        //Calculates number of words and chars
        int numWords = Counter.countWordsInString(text);
        int numChars = Counter.countCharsInString(text);

        //Changes Jlabels to number of words and chars
        numofChars.setText(String.valueOf(numChars));
        numOfWords.setText(String.valueOf(numWords));
        }
    }

    public static void mainFrame(){

//        // create a new frame to store text fields
        window = new JFrame("Word and Character Counter");
        window.setLocation(250,0);
        window.setSize(800,800);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create panel to hold answers
        panel = new JPanel(new GridLayout(1,5));

        //Create labels to populate panel
        introLabel = new JLabel("Welcome to the word counter! Insert your text below");
        introLabel.setHorizontalAlignment(JLabel.CENTER);
        introLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        introLabel.setOpaque(true);
        introLabel.setBackground(Color.PINK);

        displayNumOfWords = new JLabel("Number of words:");
        displayNumOfWords.setHorizontalAlignment(JLabel.CENTER);
        displayNumOfWords.setFont(new Font("Serif", Font.PLAIN, 16));
        displayNumOfWords.setOpaque(true);
        displayNumOfWords.setBackground(Color.GREEN);

        numOfWords = new JLabel("0");
        numOfWords.setHorizontalAlignment(JLabel.CENTER);
        numOfWords.setFont(new Font("Serif", Font.PLAIN, 24));
        numOfWords.setOpaque(true);
        numOfWords.setBackground(Color.GREEN);

        displayNumOfChars = new JLabel("Number of characters:");
        displayNumOfChars.setHorizontalAlignment(JLabel.CENTER);
        displayNumOfChars.setFont(new Font("Serif", Font.PLAIN, 16));
        displayNumOfChars.setOpaque(true);
        displayNumOfChars.setBackground(Color.CYAN);

        numofChars = new JLabel("0");
        numofChars.setHorizontalAlignment(JLabel.CENTER);
        numofChars.setFont(new Font("Serif", Font.PLAIN, 24));
        numofChars.setOpaque(true);
        numofChars.setBackground(Color.CYAN);
    }//main
}//class
