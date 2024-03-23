import javax.swing.*;

// -------------------------------------------------------------------------
/**
 * Perosnl project 1 
 * 
 *  @author rakan
 *  @version Mar 21, 2024
 */
public class TOdolistGUI extends JFrame{
    // ----------------------------------------------------------
    /**
     * Create a new TOdolistGUI object.
     */
    public TOdolistGUI() {
        super("To do List Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(CommonConstants.GUI_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        addGuiComponenet();

    }

    private void addGuiComponenet()
    {
        JLabel JLabel_bannerLabel = new JLabel( "To DO List");
        JLabel_bannerLabel.setBounds(
            (CommonConstants.GUI_SIZE.width - JLabel_bannerLabel.getPreferredSize(). width/2),
            15,
            CommonConstants.BANNER_SIZE.width,
            CommonConstants.BANNER_SIZE.height
    );
        
        
    }
    
}