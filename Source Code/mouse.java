/*
Copyright 2011 Navin, Krishnapriya M.S.,Shireen Sidhara A. 
    
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.Window.*;
import java.awt.geom.*;
import java.awt.Component.*;
import javax.swing.event.*;
import javax.swing.text.*;
import javax.swing.undo.*;
import java.util.*;
import java.awt.Graphics;
import java.io.*;

class global1
{

	int isscan=0;
	int cnt=0;
	int stopmain=0;
	int scanquad=0;
	int x1=0,y1=0,x2=0,y2=0,ny2=0;
	int cndx=0,cndy=0;
	int width=0,height=0;
	int xscan=0,yscan=0;
	int fscan=0;
	int mscan=0;
	int ibt=0;
	int ismscan=0;
	int mfscan=0;
	int candd=0;
        
}
 class action implements ActionListener 
{
        
	mouse bg;
	global1 obg;
	pop obpop;
   //  public static Graphics g1;
	static Process process;
	action(mouse bg,global1 obg, pop obpop){
            System.out.println("constructor inside class action");
		this.bg=bg;
		this.obg=obg;
		this.obpop=obpop;
	}
		      
	public void actionPerformed(ActionEvent event)
	{try{
		if(obg.ismscan==0)
		{
			timer3 myTask3 = new timer3(bg,obg,obpop);
			java.util.Timer myTimer3 = new java.util.Timer();
			myTimer3.schedule(myTask3, 1000, 1000);
		}
		else
		{
			obg.mfscan=1;
			Thread.sleep(1000);
			obpop.setVisible(false);
			obg.mscan=0;
			obg.ismscan=0;
			obg.mfscan=0;
			System.out.println(obg.ibt);
			if(obg.ibt==1)
			{
				obg.ibt=0;
				Robot robot = new Robot( );
				robot.mouseMove(obg.x2,obg.ny2);
				bg.frame.hide();
                        //robot.delay(2000);
				robot.mousePress(InputEvent.BUTTON1_MASK);
                        //robot.delay(2000);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(2000);
				bg.updateBackground();
				bg.frame.show();
				bg.frame.getContentPane( ).add("Center",bg);
				bg.frame.repaint();
                        //Thread.sleep(1000);
				obg.cnt=0;
				timer myTask = new timer(bg,obg);
				java.util.Timer myTimer = new java.util.Timer();
				myTimer.schedule(myTask, 1000, 1000);
			}
			else if(obg.ibt==3)
			{obg.ibt=0;
			Robot robot = new Robot( );
			robot.mouseMove(obg.x2,obg.ny2);
			bg.frame.hide();
                        //robot.delay(2000);
			robot.mousePress(InputEvent.BUTTON1_MASK);
                       // robot.delay(1000);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			bg.updateBackground();
                        //robot.delay(2000);
			robot.mousePress(InputEvent.BUTTON1_MASK);
                        //robot.delay(100);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.delay(2000);
			bg.updateBackground();
			bg.frame.show();
			bg.frame.getContentPane( ).add("Center",bg);
			bg.frame.repaint();
                        //Thread.sleep(1000);
			obg.cnt=0;
			timer myTask = new timer(bg,obg);
			java.util.Timer myTimer = new java.util.Timer();
			myTimer.schedule(myTask, 1000, 1000);
			}
			else if(obg.ibt==2)
			{obg.ibt=0;
			obg.candd=1; 
			obg.cndx=obg.x2;
			obg.cndy=obg.ny2;
			obg.cnt=0;
			obg.x1=obg.width/2;
			obg.y1=obg.height/2;
			obg.x2=obg.x1;
			timer myTask = new timer(bg,obg);
			java.util.Timer myTimer = new java.util.Timer();
			myTimer.schedule(myTask, 1000, 1000);
                        
			}
                        else if(obg.ibt==0)
                        {
                            System.out.println("area of exit");
                           // System.exit(0);
                            
                        }
                        else if(obg.ibt==5)
			{
                      
				//System.exit(0);
				System.out.println("prom");
				process =Runtime.getRuntime().exec( "/home/bala/Projects/prom/src/prom cd");
				System.exit(0);
                
			}
			else
			{
				obg.ibt=0;
				obg.cnt=0;
				obg.x1=obg.width/2;
				obg.y1=obg.height/2;
				obg.x2=obg.x1;
				timer myTask = new timer(bg,obg);
				java.util.Timer myTimer = new java.util.Timer();
				myTimer.schedule(myTask, 1000, 1000);
			}
		}
	}
	catch(Exception e){}
	}
}
class pop extends javax.swing.JFrame
{
	public javax.swing.JButton jButton1;
	public javax.swing.JButton jButton2;
	public javax.swing.JButton jButton3;
	public javax.swing.JButton jButton4;
	public javax.swing.JButton jButton5;
        public javax.swing.JButton jButton6;
  
	public pop() {
         
         
	
        
		initComponents();
	}
	private void initComponents() {
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
		getContentPane().setLayout(new java.awt.GridLayout());
     //   setAlwaysOnTop(true);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     //   setMinimumSize(new java.awt.Dimension(505, 150));
	//this.HEIGTH=505;
	//this.WIDTH=150;s
		setResizable(false);
		setUndecorated(true);
//          setFocusTraversalPolicyProvider(true);
        // setFont(new java.awt.Font("Tahoma", 0, 44));
         //setFormPosition(100,200);
		jButton1.setText("Click");
		getContentPane().add(jButton1);
		jButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
		jButton2.setFont(new java.awt.Font("Tahoma", 0, 18));
		jButton3.setFont(new java.awt.Font("Tahoma", 0, 18));
		jButton4.setFont(new java.awt.Font("Tahoma", 0, 18));
		jButton5.setFont(new java.awt.Font("Tahoma", 0, 18));
                jButton6.setFont(new java.awt.Font("Tahoma", 0, 18));
		jButton2.setText("Click & Drag");
		getContentPane().add(jButton2);

		jButton3.setText("Double Click");
		getContentPane().add(jButton3);

		jButton4.setText("Cancel");
		getContentPane().add(jButton4);

		jButton5.setText("Keyboard");
		getContentPane().add(jButton5);

                jButton6.setText("Exit");
		getContentPane().add(jButton6);
        

		pack();
	}// </editor-fold>                        

}
class timer2 extends TimerTask
{ mouse bg;
    static int scancnt;
    global1 obg;
    timer2(mouse bg,global1 obg){this.bg=bg;this.obg=obg; }
    public void run()
    {
	    obg.yscan=1;
	    if(obg.fscan==1)
	    {
		    obg.fscan=0;
		    scancnt=0;
		    obg.isscan=0;
		    obg.yscan=0; 
		    obg.xscan=0;
		    this.cancel();
                   // return;
	    }
	    if((obg.cnt-1)%4==1||(obg.cnt-1)%4==2)
	    {
		    obg.ny2-=3;
		    if(obg.ny2<=0)
		    {
			    scancnt++;
			    if(scancnt==2)
			    {
				    scancnt=0;
				    obg.isscan=0;
				    obg.yscan=0; 
				    obg.xscan=0;
				    this.cancel();
				    return;
			    }
			    obg.ny2=obg.y1;
		    }
	    }
	    else
	    {
		    obg.ny2+=3;
		    if(obg.ny2>=obg.height)
		    {
			    scancnt++;
			    if(scancnt==2)
			    {
				    scancnt=0;
				    obg.isscan=0;
				    obg.yscan=0; 
				    obg.xscan=0;
				    this.cancel();
				    return;
			    }
			    obg.ny2=obg.y1;
		    }
	    }
	    bg.frame.getContentPane( ).add("Center",bg);

	    bg.frame.repaint();
    }
}
class timer1 extends TimerTask
{ mouse bg;
    static int scancnt;
    global1 obg;
    timer1(mouse bg,global1 obg){this.bg=bg;this.obg=obg; }
    public void run()
    {
        //System.out.println("timer1"+obg.scanquad);
	    obg.xscan=1; 
       
	    if((obg.cnt-1)%4==2||(obg.cnt-1)%4==3)
	    {
		    if(obg.yscan==1)
		    { // obg.x1-=3;
                // obg.x2-=3;
			    scancnt=0;
			    this.cancel();
			    return;
		    }
		    if(obg.x1>=obg.width)
		    {
			    obg.x1=obg.width/2;
			    obg.y1=obg.height/2;
			    obg.x2=obg.x1;
			    if((obg.cnt-1)%4==2)
				    obg.y2=0;
			    else
				    obg.y2=obg.height;
			    scancnt++;
                      
			    if(scancnt==2)
			    {
				    obg.xscan=0;
				    scancnt=0;
				    obg.isscan=0;
				    this.cancel();
				    return;
			    }
		    }
		    obg.x1+=3;
		    obg.x2+=3;
                    
	    }
	    else
	    {
		    if(obg.yscan==1)
		    {  scancnt=0;
               //obg.x1+=3;
                 //obg.x2+=3;
               
               
		    this.cancel();
		    return;
            
		    }
		    if(obg.x1<=0)
		    {   obg.x1=obg.width/2;
		    obg.y1=obg.height/2;
		    obg.x2=obg.x1;
		    if((obg.cnt-1)%4==1)
			    obg.y2=0;
		    else
			    obg.y2=obg.height;
		    scancnt++;
                    
		    if(scancnt==2)
		    {
			    obg.xscan=0;
			    obg.isscan=0;
			    scancnt=0;
			    this.cancel();
			    return;
		    }
		    }
		    obg.x1-=3;
		    obg.x2-=3;
                    
	    }
	    bg.frame.getContentPane( ).add("Center",bg);

	    bg.frame.repaint();
        
    }
   
}
class timer extends TimerTask
{
	mouse bg;
    
	global1 obg;
	timer(mouse bg,global1 obg){this.bg=bg;this.obg=obg; }
	public void run()
    
	{
		try{
		
			obg.isscan=1;
			obg.cnt++;
			if(obg.cnt==9||obg.stopmain==1)
			{
			
				if(obg.cnt==9)
				{
					obg.isscan=0;
					obg.cnt=0;
				}
				obg.stopmain=0;
                       
				this.cancel();
                      //  return;
			
			}
			bg.frame.getContentPane( ).add("Center",bg);

			bg.frame.repaint();
     
		}
		catch(Exception e){}
	}
}
class timer3 extends TimerTask
{
	mouse bg;
	pop obpop;
	global1 obg;
	int scancnt;
	Color c;
    
	javax.swing.JButton jb[];
	timer3(mouse bg,global1 obg,pop obpop){
		this.bg=bg;
		this.obg=obg;
		this.obpop=obpop;
		scancnt=0;
		jb= new javax.swing.JButton[6];
		jb[0]=obpop.jButton1;
		jb[1]=obpop.jButton2;
		jb[2]=obpop.jButton3;
		jb[3]=obpop.jButton4;
		jb[4]=obpop.jButton5;
                jb[5]=obpop.jButton6;
		c=obpop.jButton3.getBackground();
	}
	public void run()
    
	{
		try{
            //Thread.sleep(1000);
            
           //  System.out.println("jbf");
          
			obg.ismscan=1;
			if(obg.ibt==6)
			{
				obg.ibt=0;
				scancnt++;
			}
             
			if(obg.ibt==0)
			{
				jb[5].setBackground(c);
			}
			else
				jb[(obg.ibt-1)].setBackground(c);
			if(obg.mfscan==1)
			{
				obg.ismscan=0;
				obg.mfscan=0;
                //obg.ibt=0;
				scancnt=0;
				this.cancel();
				return;
			}
            
			jb[obg.ibt].setBackground(Color.blue);
			obg.ibt++;
			if(scancnt==2)
			{
				obg.ismscan=0;
				scancnt=0;
				obg.ibt=0;
				jb[obg.ibt].setBackground(c);
				this.cancel();
				return;
			}
       //   bg.frame.getContentPane( ).add("Center",bg);
         //  bg.frame.repaint();
           // obpop.getContentPane().repaint();
             //           obpop.repaint();
          //  System.out.println("jb");
            
            
		}
		catch(Exception e){
			System.out.println("jb"+e);
		}
	}
}
    

 class mousehand extends MouseAdapter
{
	JFrame frame;
	mouse bg;
	static int i;
	global1 obg;
	pop obpop;
	static Process process;
   //  public static Graphics g1;
	mousehand(JFrame frame,mouse bg,global1 obg)
		      
	{
		this.obg=obg;
		i=1;
		this.bg=bg;
		this.frame=frame;
        
	}
	public void mouseClicked(MouseEvent me)
	{
   
		try
		{ 
			if(obg.mscan==0)
			{
				if(obg.isscan==0)
				{
					obg.cnt=0;
					timer myTask = new timer(bg,obg);
					java.util.Timer myTimer = new java.util.Timer();
					myTimer.schedule(myTask, 1000, 1000);
				}
				else if(obg.xscan==0)
				{
					obg.xscan=1;
					obg.stopmain=1;
					Thread.sleep(1000);
					System.out.println("rect"+(obg.cnt-1));
					obg.x1=obg.width/2;
					obg.y1=obg.height/2;
					obg.x2=obg.x1;
					if((obg.cnt-1)%4==1||(obg.cnt-1)%4==2)
					{
                         
						obg.y2=0;
					}
					else
					{
						obg.y2=obg.width;
					}
                      
					timer1 myTask1 = new timer1(bg,obg);
					java.util.Timer myTimer1 = new java.util.Timer();
					myTimer1.schedule(myTask1, 1000, 100);
					System.out.println(obg.cnt);
                          
				}
				else if(obg.yscan==0)
				{
					System.out.println("xx"+obg.x2);
					obg.yscan=1;
					Thread.sleep(1000);
					obg.ny2=obg.y1;
					timer2 myTask2 = new timer2(bg,obg);
					java.util.Timer myTimer2 = new java.util.Timer();
					myTimer2.schedule(myTask2, 1000, 100);
                      
				}
				else if(obg.yscan==1)
				{
					if(obg.candd==1)
					{
						obg.candd=0;
						obg.fscan=1;
						Robot robot = new Robot( );
						robot.mouseMove(obg.cndx,obg.cndy);
						bg.frame.hide();
                       // robot.delay(2000);
						robot.mousePress(InputEvent.BUTTON1_MASK);
                        //robot.delay(1000);
                        //System.out.println("hi"+obg.x2+"hi"+obg.ny2);
						robot.mouseMove(obg.x2,obg.ny2);
                          //robot.delay(1000);
						robot.mouseRelease(InputEvent.BUTTON1_MASK);
						robot.delay(2000);
						bg.updateBackground();
						bg.frame.show();
						bg.frame.getContentPane( ).add("Center",bg);
						bg.frame.repaint();
						obg.isscan=0;
						obg.ismscan=0;
						obg.mfscan=0;
						obg.xscan=0;
						obg.yscan=0;
						obg.cnt=0;
						timer myTask = new timer(bg,obg);
						java.util.Timer myTimer = new java.util.Timer();
						myTimer.schedule(myTask, 1000, 1000);
					}
					else
					{
						obg.mscan=1;
						obg.fscan=1;
						Thread.sleep(1000);
						obpop=new pop();
						obpop.toFront();
//						obpop.setAlwaysOnTop(true);
//						obpop.setMinimumSize(new java.awt.Dimension(505, 150));
    
                     //  obpop.set
		      // obpop.setPreferredSize((float)500,(float)150);
						obpop.setVisible(true);
						obpop.setSize(800,150);
                                              //obpop.setSize(700,550);
                    //  obpop.setLocation(obg.x1,obg.ny2);
                      //obpop.setAlwaysOnTop(true);
					     // obpop.HEIGHT=500;
						System.out.println("hiframe");
						action obact = new action(bg,obg,obpop);
						obpop.jButton1.addActionListener(obact);
						obpop.jButton2.addActionListener(obact);
						obpop.jButton3.addActionListener(obact);
						obpop.jButton4.addActionListener(obact);
						obpop.jButton5.addActionListener(obact);
                     // obpop.jButton1.setBackground(Color.blue);
                    //  Thread.sleep(1000);
						timer3 myTask3 = new timer3(bg,obg,obpop);
						java.util.Timer myTimer3 = new java.util.Timer();
						myTimer3.schedule(myTask3, 10, 1000);
					}
				}
			}
			else if(obg.mscan==1&&obg.ismscan==0)
			{
				obpop.hide();
				obpop.show();
				System.out.println("front");
				timer3 myTask3 = new timer3(bg,obg,obpop);
				java.util.Timer myTimer3 = new java.util.Timer();
				myTimer3.schedule(myTask3, 0, 1000);
			}
			else if(obg.mscan==1&&obg.ismscan==1)
			{
				obg.mfscan=1;
				Thread.sleep(1000);
				obpop.setVisible(false);
				obg.mscan=0;
				obg.ismscan=0;
				obg.mfscan=0;
				System.out.println(obg.ibt);
				if(obg.ibt==1)
				{
					obg.ibt=0;
					Robot robot = new Robot( );
					robot.mouseMove(obg.x2,obg.ny2);
					bg.frame.hide();
                        //robot.delay(2000);
					robot.mousePress(InputEvent.BUTTON1_MASK);
                       // robot.delay(2000);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.delay(2000);
					bg.updateBackground();
					bg.frame.show();
					bg.frame.getContentPane( ).add("Center",bg);
					bg.frame.repaint();
                        //Thread.sleep(1000);
					obg.cnt=0;
					timer myTask = new timer(bg,obg);
					java.util.Timer myTimer = new java.util.Timer();
					myTimer.schedule(myTask, 1000, 1000);
				}
				else if(obg.ibt==3)
				{obg.ibt=0;
				Robot robot = new Robot( );
				robot.mouseMove(obg.x2,obg.ny2);
				bg.frame.hide();
                        //robot.delay(2000);
				robot.mousePress(InputEvent.BUTTON1_MASK);
                        //robot.delay(1000);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				bg.updateBackground();
                        //robot.delay(2000);
				robot.mousePress(InputEvent.BUTTON1_MASK);
                        //robot.delay(100);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(2000);
				bg.updateBackground();
				bg.frame.show();
				bg.frame.getContentPane( ).add("Center",bg);
				bg.frame.repaint();
                        //Thread.sleep(1000);
				obg.cnt=0;
				timer myTask = new timer(bg,obg);
				java.util.Timer myTimer = new java.util.Timer();
				myTimer.schedule(myTask, 1000, 1000);
				}
				else if(obg.ibt==2)
				{
                      
					obg.ibt=0;
					obg.candd=1; 
					obg.cndx=obg.x2;
					obg.cndy=obg.ny2;
					obg.cnt=0;
					obg.x1=obg.width/2;
					obg.y1=obg.height/2;
					obg.x2=obg.x1;
					obg.ny2=0;
					timer myTask5 = new timer(bg,obg);
					java.util.Timer myTimer5 = new java.util.Timer();
					myTimer5.schedule(myTask5, 1000, 1000);
                        
				}
				else if(obg.ibt==0)
				{

                                    System.out.println("i am on exit");
                                    System.exit(0);
				}
                                else if(obg.ibt==5)
                                {
                                     System.out.println("obg.ibt==5");
					System.out.println("prom");
					process =Runtime.getRuntime().exec( "/home/bala/Projects/prom/src/prom cd");
					System.exit(0);
                                }
                                else
				{
					obg.ibt=0;
					obg.cnt=0;
					obg.x1=obg.width/2;
					obg.y1=obg.height/2;
					obg.x2=obg.x1;
					timer myTask = new timer(bg,obg);
					java.util.Timer myTimer = new java.util.Timer();
					myTimer.schedule(myTask, 1000, 1000);
				}
			}
              
        // Thread.sleep(2000);
      // frame.hide();
      //  Thread.sleep(2000);
     //  frame.show();
          
		}
		catch(Exception e){}
   
	}
}
     

public class mouse extends JComponent{
	public JFrame frame;  
	private Image background;
	public static Graphics g1;
  
	global1 obg;
	public mouse(){}
	public mouse(JFrame frame,global1 obg) {
		this.frame = frame;
		this.obg=obg;
    //this.frame.setAlwaysOnTop(true);
		this.frame.setUndecorated(true); 
    
		addMouseListener(new mousehand(this.frame,this,this.obg));
		updateBackground( );
	}


	public void updateBackground( ) {
		try {
			Robot rbt = new Robot( );
			Toolkit tk = Toolkit.getDefaultToolkit( );
			Dimension dim = tk.getScreenSize( );
			background = rbt.createScreenCapture(
					new Rectangle(0,0,(int)dim.getWidth( ),
					(int)dim.getHeight( )));
        
		} catch (Exception ex) {
		}
	}    
   


	public void paintComponent(Graphics g) {
		try{
			Point pos = this.getLocationOnScreen( );
			Graphics2D g2 = (Graphics2D)g;
			Point offset = new Point(-pos.x,-pos.y);
			g.drawImage(background,offset.x,offset.y,null);
  // g1=g;
       //   Graphics2D g2=(Graphics2D)g;
			g1=g;
          
			Toolkit tk = Toolkit.getDefaultToolkit( );
			Dimension dim = tk.getScreenSize( );
			int cnt=2;    
			int w = (int)dim.getWidth();
			int h = (int)dim.getHeight();
			obg.width=w;
			obg.height=h;
    
			Rectangle2D r[] =new Rectangle2D[4] ;
			r[1] =new Rectangle2D.Double(0,0,w/2,h/2);
			r[2] =new Rectangle2D.Double(w/2,0,w/2,h/2);
			r[3] =new Rectangle2D.Double(w/2,h/2,w/2,h/2);
			r[0] =new Rectangle2D.Double(0,h/2,w/2,h/2);
			g2.setStroke( new BasicStroke( 10.0f ) ); 
   // if(obg.scanquad==0)
    
  
  
   //System.out.println("hi");
  // if(i==1)
   //{
			if(obg.isscan==1&&obg.xscan==0)
			{
				if(obg.cnt%4==1)
				{
					g2.setPaint(Color.white);
					g2.draw(r[0]);
					g2.setPaint(Color.blue);
     
					g2.draw(r[1]);
   
   // i=1;
				}
				else if(obg.cnt%4==2)
				{
    //Thread.sleep(1000);
					g2.setPaint(Color.white);
					g2.draw(r[1]);
					g2.setPaint(Color.blue);
       
					g2.draw(r[2]);
   
    //i=2;
				}
				else if(obg.cnt%4==3)
				{
    //Thread.sleep(1000);
					g2.setPaint(Color.white);
					g2.draw(r[2]);
					g2.setPaint(Color.blue);
	 
					g2.draw(r[3]);
   
	   //i=3;
				}
				else if(obg.cnt%4==0)
				{
    //Thread.sleep(1000);
					g2.setPaint(Color.white);
					g2.draw(r[3]);
					g2.setPaint(Color.blue);
	  
					g2.draw(r[0]);
   
	   //i=0;
				}
   
			}
 
			else
			{
				g2.setPaint(Color.blue);
				g2.draw(r[(obg.cnt-1)%4]);
				if(obg.xscan==1&&obg.yscan==0)
				{
					g2.setStroke( new BasicStroke( 5.0f ) ); 
					Line2D line = new Line2D.Double(obg.x1, obg.y1,obg.x2,obg.y2);
					g2.draw(line);
				}
				else
				{
					g2.setStroke( new BasicStroke( 5.0f ) ); 
					Line2D line = new Line2D.Double(obg.x1, obg.y1,obg.x2,obg.y2);
					g2.draw(line);
					g2.setPaint(Color.red);
					Line2D line1 = new Line2D.Double(obg.x1, obg.y1,obg.x2,obg.ny2);
					g2.draw(line1);
				}
			}
  //  mousehand mob=new mousehand(frame);
  //  mob.scanfirst(g);
    
 //frame.update(g);
    //Rectangle2D r2 =new Rectangle2D.Double(1,1,dim.getWidth()/2-2,dim.getHeight()/2-2);
    //g2.setPaint(Color.blue);
    //g2.draw(r2);
		}
		catch(Exception e){//System.out.println("error"+e);}
    
		}
	}
	public static void main(String[] args) {
		try
		{
    
   
    
			JFrame frame = new JFrame("Transparent Window");
			global1 obg=new global1();
			Toolkit tk = Toolkit.getDefaultToolkit( );
			mouse bg = new mouse(frame,obg);
   
			Dimension dim = tk.getScreenSize( );
			bg.setLayout(new BorderLayout( ));
			frame.getContentPane( ).add("Center",bg);
			frame.pack( );
  //  frame.setSize(150,100);
			frame.setSize((int)dim.getWidth(),(int)dim.getHeight());
//frame.setExtendedState(frame.MAXIMIZED_BOTH);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
//frame.setUndecorated(true);
//Robot robot = new Robot();
			frame.show( );
    
			timer myTask = new timer(bg,obg);
			java.util.Timer myTimer = new java.util.Timer();
/* Set an initial delay of 1 second,
			then repeat every half second.
*/
			myTimer.schedule(myTask, 1000, 1000);
   /* Thread.sleep(2000);
			mousehand mob=new mousehand(frame);
			mob.scanfirst(bg,Color.blue);
			Thread.sleep(1000);
			mob.scanfirst(bg,Color.red);*/
    //Thread.sleep(1000);
    //frame.hide();
    
     
 //robot.mouseMove(10,20);
// robot.delay(2000);
 //robot.mousePress(InputEvent.BUTTON1_MASK);
    //robot.delay(2000);
 //robot.mouseRelease(InputEvent.BUTTON1_MASK);
 //Thread.sleep(2000);
   // bg.updateBackground();
   // frame.show();
    // Thread.sleep(1000);
    //frame.hide();
    
     
 //robot.mouseMove(10,45);
 //robot.delay(2000);
 //robot.mousePress(InputEvent.BUTTON1_MASK);
   // robot.delay(2000);
 //robot.mouseRelease(InputEvent.BUTTON1_MASK);
 //Thread.sleep(2000);
   // bg.updateBackground();
    //frame.show();
//Thread.sleep(10000);
//myTask.cancel();
		}
		catch(Exception e)
		{}
    
	}
    
}