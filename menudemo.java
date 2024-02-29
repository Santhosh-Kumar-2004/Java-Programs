import java.awt.*;
public class menudemo
{
public static void main(String args[])
{
Frame fr=new Frame("Menu Demo");
MenuBar mb=new MenuBar();
Menu fileMenu=new Menu("File");
Menu editMenu=new Menu("Edit");
Menu viewMenu=new Menu("VIew");
mb.add(fileMenu);
mb.add(editMenu);
mb.add(viewMenu);
MenuItem a1=new MenuItem("new");
MenuItem a2=new MenuItem("open");
MenuItem a3=new MenuItem("save");
MenuItem a4=new MenuItem("Save as");
MenuItem b1=new MenuItem("copy");
MenuItem b2=new MenuItem("find");
MenuItem c1=new MenuItem("show");
fileMenu.add(a1);
fileMenu.add(a2);
fileMenu.add(a3);
fileMenu.add(a4);
editMenu.add(b1);
editMenu.add(b2);
viewMenu.add(c1);
fr.setMenuBar(mb);
fr.setSize(500,500);
fr.setVisible(true);
}
}