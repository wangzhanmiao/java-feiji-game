/*import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class FrameMouseListener implements MouseListener {
    public BaseFrame baseFrame;

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        this.baseFrame.myPanel.player.x = e.getX() - this.baseFrame.myPanel.player.width / 2;
        this.baseFrame.myPanel.player.y = e.getY() - this.baseFrame.myPanel.player.height / 2;

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}*/

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


//实现键盘监听
public class FrameMouseListener implements KeyListener {
    public BaseFrame baseFrame;


    @Override
    public void keyTyped(KeyEvent e) {

    }
    //重写keyPressed方法
    @Override
    public void keyPressed(KeyEvent e) {
        //获取键盘按下的键
        int keycoude=e.getKeyCode();
        //如果按下的是上飞机的y轴下移25个单位
        if(keycoude==KeyEvent.VK_UP){
            this.baseFrame.myPanel.player.y=this.baseFrame.myPanel.player.y-25;
        }
        if(keycoude==KeyEvent.VK_W){
            this.baseFrame.myPanel.player2.y=this.baseFrame.myPanel.player2.y-25;
        }
        //如果按下的是上飞机的y轴上移25个单位
        if(keycoude==KeyEvent.VK_DOWN){
            this.baseFrame.myPanel.player.y=this.baseFrame.myPanel.player.y+25;
        }
        if(keycoude==KeyEvent.VK_S){
            this.baseFrame.myPanel.player2.y=this.baseFrame.myPanel.player2.y+25;
        }
        //如果按下的是左飞机的x轴左移25个单位
        if(keycoude==KeyEvent.VK_LEFT){
            this.baseFrame.myPanel.player.x=this.baseFrame.myPanel.player.x-25;
        }
        if(keycoude==KeyEvent.VK_A){
            this.baseFrame.myPanel.player2.x=this.baseFrame.myPanel.player2.x-25;
        }
        //如果按下的是上飞机的x轴右移25个单位
        if(keycoude==KeyEvent.VK_RIGHT){
            this.baseFrame.myPanel.player.x=this.baseFrame.myPanel.player.x+25;
        }
        if(keycoude==KeyEvent.VK_D){
            this.baseFrame.myPanel.player2.x=this.baseFrame.myPanel.player2.x+25;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

