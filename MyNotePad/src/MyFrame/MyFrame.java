package MyFrame;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.swing.*;

/**
 * @version 1.0 2018-03-13
 * @author Wilson Song
 * @ The frame of MyNotePad
 */

public class MyFrame extends JFrame {
	
	public MyFrame() {
		initFrame();
	}
	
	
	public void initFrame(){  
        Properties p = new Properties();  
        //���ô����Сλ��  
        try {  
            if(new File("src/size.properties").exists()){  
                p.load(new FileReader("src/size.properties"));  
                this.setBounds(Integer.parseInt(p.getProperty("x")), Integer.parseInt(p.getProperty("y")), Integer.parseInt(p.getProperty("width")), Integer.parseInt(p.getProperty("height")));  
                //myFont = new Font(p.getProperty("FontName"),Integer.parseInt(p.getProperty("FontStyle")),Integer.parseInt(p.getProperty("FontSize")));  
                //editArea.setFont(myFont);  
                //editArea.setForeground(new Color(Integer.parseInt(p.getProperty("foreColor"))));  
                //editArea.setBackground(new Color(Integer.parseInt(p.getProperty("backColor"))));  
            }else{  
                this.setSize(640,480);  
                this.setLocationRelativeTo(null);  
            }  
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
  
  
        //�������Ի�����Ա��ر� 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //����ͼ��  
        Image img = new ImageIcon("image/logo.jpg").getImage();  
        this.setIconImage(img);  
        //���ñ�������  
        this.setTitle("���±�  by Wilson");  
    }//��ʼ���������  
	

}