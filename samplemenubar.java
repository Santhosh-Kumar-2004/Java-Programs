import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class samplemenubar
{
    public static void main(String[]args)
    {
    //Frame creating
        Frame fr=new Frame("MenuBar Sample Own");
        
    //MenuBars creating
        MenuBar mb1=new MenuBar();
        fr.setMenuBar(mb1);
    //Menu creating
        Menu fileMenu=new Menu("File");
        Menu editMenu=new Menu("Edit");
        Menu viewMenu=new Menu("View");
    //menuitems creating
        MenuItem newitem=new MenuItem("New");
        MenuItem openitem=new MenuItem("Open");
        MenuItem saveitem=new MenuItem("Save");
        MenuItem exititem=new MenuItem("Exit");
        MenuItem undoitem=new MenuItem("Undo");
        MenuItem redoitem=new MenuItem("Redo");
        MenuItem cutitem=new MenuItem("Cut");
        MenuItem copyitem=new MenuItem("Copy");
        MenuItem zoomitem=new MenuItem("Zoom");
        MenuItem openview=new MenuItem("Open View");
        MenuItem searchitem=new MenuItem("Search");
        //Adding actions to menu item open
            openitem.addActionListener(new ActionListener()
            {
            @Override
                public void actionPerformed(ActionEvent e)
                {
                   
                }
            });
        //Adding actions to menu item exit
            exititem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.exit(0);
                }
            });
         //Adding action to menu item new
            newitem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                }
            });
        //Adding action to menu item Save
            saveitem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   
                }
            });
    //Adding file,edit and view menu to their Items
        fileMenu.add(newitem);
        fileMenu.add(openitem);
        fileMenu.add(saveitem);
        fileMenu.add(exititem);
        editMenu.add(undoitem);
        editMenu.add(redoitem);
        editMenu.add(cutitem);
        editMenu.add(copyitem);
        viewMenu.add(zoomitem);
        viewMenu.add(openview);
        viewMenu.add(searchitem);
    //Adding file,edit and view to the MenuBar
        mb1.add(fileMenu);
        mb1.add(editMenu);
        mb1.add(viewMenu);
    //adding menubar into frame
        fr.setMenuBar(mb1);
    //frame settings
        fr.setSize(1000,700);
        fr.setVisible(true);
   }
}