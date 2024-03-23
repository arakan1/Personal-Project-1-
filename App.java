import javax.swing.*;
// -------------------------------------------------------------------------
/**
 * Project 1 
 * 
 *  @author rakan
 *  @version Mar 21, 2024
 */
public class App
{
    // ----------------------------------------------------------
    /**
     * Personal projectr 1 
     * @param args
     */
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                new TOdolistGUI().setVisible(true);
               
                
            }
        });
        
    }
    
}


        
