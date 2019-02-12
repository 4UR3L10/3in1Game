/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



/**
 *
 * @author aurel
 */
public class mineSweeperJFrame extends javax.swing.JFrame {
    Random rand = new Random();
    char grid[][] = new char[15][15];
    int maxRandom = 0;
    boolean color = false;
    
    
    
    
    /**
     * Creates new form mineSweeperJFrame
     */
    public mineSweeperJFrame() {       
        initComponents();
        setDisable();
        /*
        setMines();        
        setNumbers();
        setValues(); 
        */
    }
    
    public int getRandomNumber() {
       int  aNumber = rand.nextInt(maxRandom) + 1; 
       return aNumber;       
    }
    
    public void setMines() {
        // Y
        for (int i = 0; i < 15; i++) {
            // X
            for (int j = 0; j < 15; j++) {
                if(getRandomNumber() == maxRandom){
                    grid[i][j] = '*';
                }                
            }            
        }       
    }
    
    public void setNumbers() {
        int counter = 0;
        String fakeNumber = "";
        
        
        // Y
        for (int i = 0; i < 15; i++) {
            // X
            for (int j = 0; j < 15; j++) {
                    // Left
                    if (j - 1 < 0) {
                        // Out of Bounds
                    } else {
                        if(grid[i][j] != '*' && grid[i][j - 1] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                            
                        }
                    }
                    
                    // Right
                    if (j + 1 > 14) {
                        // Out of Bounds
                    } else {
                        if(grid[i][j] != '*' && grid[i][j + 1] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    // Up
                    if (i - 1 < 0) {
                        // Out of Bonds
                    } else {
                        if(grid[i][j] != '*' && grid[i - 1][j] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    // Down
                    if (i + 1 > 14) {
                        // Out of Bonds
                    } else {
                        if(grid[i][j] != '*' && grid[i + 1][j] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    // Diagonal up + left.
                    if (i - 1 < 0 || j - 1 < 0) {
                        // Out of Bonds
                    } else {
                        if(grid[i][j] != '*' && grid[i - 1][j - 1] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    // Diagonal up + right.
                    if (i - 1 < 0 || j + 1 > 14) {
                        // Out of Bonds
                    } else {
                        if(grid[i][j] != '*' && grid[i - 1][j + 1] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    // Diagonal down + left.
                    if (i + 1 > 14 || j - 1 < 0) {
                        // Out of Bonds
                    } else {
                        if(grid[i][j] != '*' && grid[i + 1][j - 1] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    // Diagonal down + right.
                    if (i + 1 > 14 || j + 1 > 14) {
                        // Out of Bonds
                    } else {
                        if(grid[i][j] != '*' && grid[i + 1][j + 1] == '*'){
                            counter = counter + 1;
                            fakeNumber = String.valueOf(counter);                   
                            grid[i][j] = fakeNumber.charAt(0);
                        }
                    }
                    
                    
                    
                   counter = 0;
                   
            }            
        }       
    }
    
    public void setValues() {        
        // Row 1
        button1.setLabel(Character.toString(grid[0][0]));
        button2.setLabel(Character.toString(grid[0][1]));
        button3.setLabel(Character.toString(grid[0][2]));
        button4.setLabel(Character.toString(grid[0][3]));
        button5.setLabel(Character.toString(grid[0][4]));
        button6.setLabel(Character.toString(grid[0][5]));
        button7.setLabel(Character.toString(grid[0][6]));
        button8.setLabel(Character.toString(grid[0][7]));
        button9.setLabel(Character.toString(grid[0][8]));
        button10.setLabel(Character.toString(grid[0][9]));
        button11.setLabel(Character.toString(grid[0][10]));
        button12.setLabel(Character.toString(grid[0][11]));
        button13.setLabel(Character.toString(grid[0][12]));
        button14.setLabel(Character.toString(grid[0][13]));
        button15.setLabel(Character.toString(grid[0][14]));
        
        // Row 2
        button16.setLabel(Character.toString(grid[1][0]));
        button17.setLabel(Character.toString(grid[1][1]));
        button18.setLabel(Character.toString(grid[1][2]));
        button19.setLabel(Character.toString(grid[1][3]));
        button20.setLabel(Character.toString(grid[1][4]));
        button21.setLabel(Character.toString(grid[1][5]));
        button22.setLabel(Character.toString(grid[1][6]));
        button23.setLabel(Character.toString(grid[1][7]));
        button24.setLabel(Character.toString(grid[1][8]));
        button25.setLabel(Character.toString(grid[1][9]));
        button26.setLabel(Character.toString(grid[1][10]));
        button27.setLabel(Character.toString(grid[1][11]));
        button28.setLabel(Character.toString(grid[1][12]));
        button29.setLabel(Character.toString(grid[1][13]));
        button30.setLabel(Character.toString(grid[1][14]));
        
        // Row 3
        button31.setLabel(Character.toString(grid[2][0]));
        button32.setLabel(Character.toString(grid[2][1]));
        button33.setLabel(Character.toString(grid[2][2]));
        button34.setLabel(Character.toString(grid[2][3]));
        button35.setLabel(Character.toString(grid[2][4]));
        button36.setLabel(Character.toString(grid[2][5]));
        button37.setLabel(Character.toString(grid[2][6]));
        button38.setLabel(Character.toString(grid[2][7]));
        button39.setLabel(Character.toString(grid[2][8]));
        button40.setLabel(Character.toString(grid[2][9]));
        button41.setLabel(Character.toString(grid[2][10]));
        button42.setLabel(Character.toString(grid[2][11]));
        button43.setLabel(Character.toString(grid[2][12]));
        button44.setLabel(Character.toString(grid[2][13]));
        button45.setLabel(Character.toString(grid[2][14]));
        
        // Row 4
        button46.setLabel(Character.toString(grid[3][0]));
        button47.setLabel(Character.toString(grid[3][1]));
        button48.setLabel(Character.toString(grid[3][2]));
        button49.setLabel(Character.toString(grid[3][3]));
        button50.setLabel(Character.toString(grid[3][4]));
        button51.setLabel(Character.toString(grid[3][5]));
        button52.setLabel(Character.toString(grid[3][6]));
        button53.setLabel(Character.toString(grid[3][7]));
        button54.setLabel(Character.toString(grid[3][8]));
        button55.setLabel(Character.toString(grid[3][9]));
        button56.setLabel(Character.toString(grid[3][10]));
        button57.setLabel(Character.toString(grid[3][11]));
        button58.setLabel(Character.toString(grid[3][12]));
        button59.setLabel(Character.toString(grid[3][13]));
        button60.setLabel(Character.toString(grid[3][14]));
        
        // Row 5
        button61.setLabel(Character.toString(grid[4][0]));
        button62.setLabel(Character.toString(grid[4][1]));
        button63.setLabel(Character.toString(grid[4][2]));
        button64.setLabel(Character.toString(grid[4][3]));
        button65.setLabel(Character.toString(grid[4][4]));
        button66.setLabel(Character.toString(grid[4][5]));
        button67.setLabel(Character.toString(grid[4][6]));
        button68.setLabel(Character.toString(grid[4][7]));
        button69.setLabel(Character.toString(grid[4][8]));
        button70.setLabel(Character.toString(grid[4][9]));
        button71.setLabel(Character.toString(grid[4][10]));
        button72.setLabel(Character.toString(grid[4][11]));
        button73.setLabel(Character.toString(grid[4][12]));
        button74.setLabel(Character.toString(grid[4][13]));
        button75.setLabel(Character.toString(grid[4][14]));
        
        // Row 6
        button76.setLabel(Character.toString(grid[5][0]));
        button77.setLabel(Character.toString(grid[5][1]));
        button78.setLabel(Character.toString(grid[5][2]));
        button79.setLabel(Character.toString(grid[5][3]));
        button80.setLabel(Character.toString(grid[5][4]));
        button81.setLabel(Character.toString(grid[5][5]));
        button82.setLabel(Character.toString(grid[5][6]));
        button83.setLabel(Character.toString(grid[5][7]));
        button84.setLabel(Character.toString(grid[5][8]));
        button85.setLabel(Character.toString(grid[5][9]));
        button86.setLabel(Character.toString(grid[5][10]));
        button87.setLabel(Character.toString(grid[5][11]));
        button88.setLabel(Character.toString(grid[5][12]));
        button89.setLabel(Character.toString(grid[5][13]));
        button90.setLabel(Character.toString(grid[5][14]));
        
        // Row 7
        button91.setLabel(Character.toString(grid[6][0]));
        button92.setLabel(Character.toString(grid[6][1]));
        button93.setLabel(Character.toString(grid[6][2]));
        button94.setLabel(Character.toString(grid[6][3]));
        button95.setLabel(Character.toString(grid[6][4]));
        button96.setLabel(Character.toString(grid[6][5]));
        button97.setLabel(Character.toString(grid[6][6]));
        button98.setLabel(Character.toString(grid[6][7]));
        button99.setLabel(Character.toString(grid[6][8]));
        button100.setLabel(Character.toString(grid[6][9]));
        button101.setLabel(Character.toString(grid[6][10]));
        button102.setLabel(Character.toString(grid[6][11]));
        button103.setLabel(Character.toString(grid[6][12]));
        button104.setLabel(Character.toString(grid[6][13]));
        button105.setLabel(Character.toString(grid[6][14]));
        
        // Row 8
        button106.setLabel(Character.toString(grid[7][0]));
        button107.setLabel(Character.toString(grid[7][1]));
        button108.setLabel(Character.toString(grid[7][2]));
        button109.setLabel(Character.toString(grid[7][3]));
        button110.setLabel(Character.toString(grid[7][4]));
        button111.setLabel(Character.toString(grid[7][5]));
        button112.setLabel(Character.toString(grid[7][6]));
        button113.setLabel(Character.toString(grid[7][7]));
        button114.setLabel(Character.toString(grid[7][8]));
        button115.setLabel(Character.toString(grid[7][9]));
        button116.setLabel(Character.toString(grid[7][10]));
        button117.setLabel(Character.toString(grid[7][11]));
        button118.setLabel(Character.toString(grid[7][12]));
        button119.setLabel(Character.toString(grid[7][13]));
        button120.setLabel(Character.toString(grid[7][14]));
        
        // Row 9
        button121.setLabel(Character.toString(grid[8][0]));
        button122.setLabel(Character.toString(grid[8][1]));
        button123.setLabel(Character.toString(grid[8][2]));
        button124.setLabel(Character.toString(grid[8][3]));
        button125.setLabel(Character.toString(grid[8][4]));
        button126.setLabel(Character.toString(grid[8][5]));
        button127.setLabel(Character.toString(grid[8][6]));
        button128.setLabel(Character.toString(grid[8][7]));
        button129.setLabel(Character.toString(grid[8][8]));
        button130.setLabel(Character.toString(grid[4][9]));
        button131.setLabel(Character.toString(grid[8][10]));
        button132.setLabel(Character.toString(grid[8][11]));
        button133.setLabel(Character.toString(grid[8][12]));
        button134.setLabel(Character.toString(grid[8][13]));
        button135.setLabel(Character.toString(grid[8][14]));
        
        // Row 10
        button136.setLabel(Character.toString(grid[9][0]));
        button137.setLabel(Character.toString(grid[9][1]));
        button138.setLabel(Character.toString(grid[9][2]));
        button139.setLabel(Character.toString(grid[9][3]));
        button140.setLabel(Character.toString(grid[9][4]));
        button141.setLabel(Character.toString(grid[9][5]));
        button142.setLabel(Character.toString(grid[9][6]));
        button143.setLabel(Character.toString(grid[9][7]));
        button144.setLabel(Character.toString(grid[9][8]));
        button145.setLabel(Character.toString(grid[9][9]));
        button146.setLabel(Character.toString(grid[9][10]));
        button147.setLabel(Character.toString(grid[9][11]));
        button148.setLabel(Character.toString(grid[9][12]));
        button149.setLabel(Character.toString(grid[9][13]));
        button150.setLabel(Character.toString(grid[9][14]));
        
        // Row 11
        button151.setLabel(Character.toString(grid[10][0]));
        button152.setLabel(Character.toString(grid[10][1]));
        button153.setLabel(Character.toString(grid[10][2]));
        button154.setLabel(Character.toString(grid[10][3]));
        button155.setLabel(Character.toString(grid[10][4]));
        button156.setLabel(Character.toString(grid[10][5]));
        button157.setLabel(Character.toString(grid[10][6]));
        button158.setLabel(Character.toString(grid[10][7]));
        button159.setLabel(Character.toString(grid[10][8]));
        button160.setLabel(Character.toString(grid[10][9]));
        button161.setLabel(Character.toString(grid[10][10]));
        button162.setLabel(Character.toString(grid[10][11]));
        button163.setLabel(Character.toString(grid[10][12]));
        button164.setLabel(Character.toString(grid[10][13]));
        button165.setLabel(Character.toString(grid[10][14]));
        
        // Row 12
        button166.setLabel(Character.toString(grid[11][0]));
        button167.setLabel(Character.toString(grid[11][1]));
        button168.setLabel(Character.toString(grid[11][2]));
        button169.setLabel(Character.toString(grid[11][3]));
        button170.setLabel(Character.toString(grid[11][4]));
        button171.setLabel(Character.toString(grid[11][5]));
        button172.setLabel(Character.toString(grid[11][6]));
        button173.setLabel(Character.toString(grid[11][7]));
        button174.setLabel(Character.toString(grid[11][8]));
        button175.setLabel(Character.toString(grid[11][9]));
        button176.setLabel(Character.toString(grid[11][10]));
        button177.setLabel(Character.toString(grid[11][11]));
        button178.setLabel(Character.toString(grid[11][12]));
        button179.setLabel(Character.toString(grid[11][13]));
        button180.setLabel(Character.toString(grid[11][14]));
        
        // Row 13
        button181.setLabel(Character.toString(grid[12][0]));
        button182.setLabel(Character.toString(grid[12][1]));
        button183.setLabel(Character.toString(grid[12][2]));
        button184.setLabel(Character.toString(grid[12][3]));
        button185.setLabel(Character.toString(grid[12][4]));
        button186.setLabel(Character.toString(grid[12][5]));
        button187.setLabel(Character.toString(grid[12][6]));
        button188.setLabel(Character.toString(grid[12][7]));
        button189.setLabel(Character.toString(grid[12][8]));
        button190.setLabel(Character.toString(grid[12][9]));
        button191.setLabel(Character.toString(grid[12][10]));
        button192.setLabel(Character.toString(grid[12][11]));
        button193.setLabel(Character.toString(grid[12][12]));
        button194.setLabel(Character.toString(grid[12][13]));
        button195.setLabel(Character.toString(grid[12][14]));
        
        // Row 14
        button196.setLabel(Character.toString(grid[13][0]));
        button197.setLabel(Character.toString(grid[13][1]));
        button198.setLabel(Character.toString(grid[13][2]));
        button199.setLabel(Character.toString(grid[13][3]));
        button200.setLabel(Character.toString(grid[13][4]));
        button201.setLabel(Character.toString(grid[13][5]));
        button202.setLabel(Character.toString(grid[13][6]));
        button203.setLabel(Character.toString(grid[13][7]));
        button204.setLabel(Character.toString(grid[13][8]));
        button205.setLabel(Character.toString(grid[13][9]));
        button206.setLabel(Character.toString(grid[13][10]));
        button207.setLabel(Character.toString(grid[13][11]));
        button208.setLabel(Character.toString(grid[13][12]));
        button209.setLabel(Character.toString(grid[13][13]));
        button210.setLabel(Character.toString(grid[13][14]));
        
        // Row 15
        button211.setLabel(Character.toString(grid[14][0]));
        button212.setLabel(Character.toString(grid[14][1]));
        button213.setLabel(Character.toString(grid[14][2]));
        button214.setLabel(Character.toString(grid[14][3]));
        button215.setLabel(Character.toString(grid[14][4]));
        button216.setLabel(Character.toString(grid[14][5]));
        button217.setLabel(Character.toString(grid[14][6]));
        button218.setLabel(Character.toString(grid[14][7]));
        button219.setLabel(Character.toString(grid[14][8]));
        button220.setLabel(Character.toString(grid[14][9]));
        button221.setLabel(Character.toString(grid[14][10]));
        button222.setLabel(Character.toString(grid[14][11]));
        button223.setLabel(Character.toString(grid[14][12]));
        button224.setLabel(Character.toString(grid[14][13]));
        button225.setLabel(Character.toString(grid[14][14]));
    } 
    
    public void setDisable() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button30.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
        button34.setEnabled(false);
        button35.setEnabled(false);
        button36.setEnabled(false);
        button37.setEnabled(false);
        button38.setEnabled(false);
        button39.setEnabled(false);
        button40.setEnabled(false);
        button41.setEnabled(false);
        button42.setEnabled(false);
        button43.setEnabled(false);
        button44.setEnabled(false);
        button45.setEnabled(false);
        button46.setEnabled(false);
        button47.setEnabled(false);
        button48.setEnabled(false);
        button49.setEnabled(false);
        button50.setEnabled(false);
        button51.setEnabled(false);
        button52.setEnabled(false);
        button53.setEnabled(false);
        button54.setEnabled(false);
        button55.setEnabled(false);
        button56.setEnabled(false);
        button57.setEnabled(false);
        button58.setEnabled(false);
        button59.setEnabled(false);
        button60.setEnabled(false);
        button61.setEnabled(false);
        button62.setEnabled(false);
        button63.setEnabled(false);
        button64.setEnabled(false);
        button65.setEnabled(false);
        button66.setEnabled(false);
        button67.setEnabled(false);
        button68.setEnabled(false);
        button69.setEnabled(false);
        button70.setEnabled(false);
        button71.setEnabled(false);
        button72.setEnabled(false);
        button73.setEnabled(false);
        button74.setEnabled(false);
        button75.setEnabled(false);
        button76.setEnabled(false);
        button77.setEnabled(false);
        button78.setEnabled(false);
        button79.setEnabled(false);
        button80.setEnabled(false);
        button81.setEnabled(false);
        button82.setEnabled(false);
        button83.setEnabled(false);
        button84.setEnabled(false);
        button85.setEnabled(false);
        button86.setEnabled(false);
        button87.setEnabled(false);
        button88.setEnabled(false);
        button89.setEnabled(false);
        button90.setEnabled(false);
        button91.setEnabled(false);
        button92.setEnabled(false);
        button93.setEnabled(false);
        button94.setEnabled(false);
        button95.setEnabled(false);
        button96.setEnabled(false);
        button97.setEnabled(false);
        button98.setEnabled(false);
        button99.setEnabled(false);
        button100.setEnabled(false);
        button101.setEnabled(false);
        button102.setEnabled(false);
        button103.setEnabled(false);
        button104.setEnabled(false);
        button105.setEnabled(false);
        button106.setEnabled(false);
        button107.setEnabled(false);
        button108.setEnabled(false);
        button109.setEnabled(false);
        button110.setEnabled(false);
        button111.setEnabled(false);
        button112.setEnabled(false);
        button113.setEnabled(false);
        button114.setEnabled(false);
        button115.setEnabled(false);
        button116.setEnabled(false);
        button117.setEnabled(false);
        button118.setEnabled(false);
        button119.setEnabled(false);
        button120.setEnabled(false);
        button121.setEnabled(false);
        button122.setEnabled(false);
        button123.setEnabled(false);
        button124.setEnabled(false);
        button125.setEnabled(false);
        button126.setEnabled(false);
        button127.setEnabled(false);
        button128.setEnabled(false);
        button129.setEnabled(false);
        button130.setEnabled(false);
        button131.setEnabled(false);
        button132.setEnabled(false);
        button133.setEnabled(false);
        button134.setEnabled(false);
        button135.setEnabled(false);
        button136.setEnabled(false);
        button137.setEnabled(false);
        button138.setEnabled(false);
        button139.setEnabled(false);
        button140.setEnabled(false);
        button141.setEnabled(false);
        button142.setEnabled(false);
        button143.setEnabled(false);
        button144.setEnabled(false);
        button145.setEnabled(false);
        button146.setEnabled(false);
        button147.setEnabled(false);
        button148.setEnabled(false);
        button149.setEnabled(false);
        button150.setEnabled(false);
        button151.setEnabled(false);
        button152.setEnabled(false);
        button153.setEnabled(false);
        button154.setEnabled(false);
        button155.setEnabled(false);
        button156.setEnabled(false);
        button157.setEnabled(false);
        button158.setEnabled(false);
        button159.setEnabled(false);
        button160.setEnabled(false);
        button161.setEnabled(false);
        button162.setEnabled(false);
        button163.setEnabled(false);
        button164.setEnabled(false);
        button165.setEnabled(false);
        button166.setEnabled(false);
        button167.setEnabled(false);
        button168.setEnabled(false);
        button169.setEnabled(false);
        button170.setEnabled(false);
        button171.setEnabled(false);
        button172.setEnabled(false);
        button173.setEnabled(false);
        button174.setEnabled(false);
        button175.setEnabled(false);
        button176.setEnabled(false);
        button177.setEnabled(false);
        button178.setEnabled(false);
        button179.setEnabled(false);
        button180.setEnabled(false);
        button181.setEnabled(false);
        button182.setEnabled(false);
        button183.setEnabled(false);
        button184.setEnabled(false);
        button185.setEnabled(false);
        button186.setEnabled(false);
        button187.setEnabled(false);
        button188.setEnabled(false);
        button189.setEnabled(false);
        button190.setEnabled(false);
        button191.setEnabled(false);
        button192.setEnabled(false);
        button193.setEnabled(false);
        button194.setEnabled(false);
        button195.setEnabled(false);
        button196.setEnabled(false);
        button197.setEnabled(false);
        button198.setEnabled(false);
        button199.setEnabled(false);
        button200.setEnabled(false);
        button201.setEnabled(false);
        button202.setEnabled(false);
        button203.setEnabled(false);
        button204.setEnabled(false);
        button205.setEnabled(false);
        button206.setEnabled(false);
        button207.setEnabled(false);
        button208.setEnabled(false);
        button209.setEnabled(false);
        button210.setEnabled(false);
        button211.setEnabled(false);
        button212.setEnabled(false);
        button213.setEnabled(false);
        button214.setEnabled(false);
        button215.setEnabled(false);
        button216.setEnabled(false);
        button217.setEnabled(false);
        button218.setEnabled(false);
        button219.setEnabled(false);
        button220.setEnabled(false);
        button221.setEnabled(false);
        button222.setEnabled(false);
        button223.setEnabled(false);
        button224.setEnabled(false);
        button225.setEnabled(false);
    }
    
    public void setEnabled() {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
        button17.setEnabled(true);
        button18.setEnabled(true);
        button19.setEnabled(true);
        button20.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button24.setEnabled(true);
        button25.setEnabled(true);
        button26.setEnabled(true);
        button27.setEnabled(true);
        button28.setEnabled(true);
        button29.setEnabled(true);
        button30.setEnabled(true);
        button31.setEnabled(true);
        button32.setEnabled(true);
        button33.setEnabled(true);
        button34.setEnabled(true);
        button35.setEnabled(true);
        button36.setEnabled(true);
        button37.setEnabled(true);
        button38.setEnabled(true);
        button39.setEnabled(true);
        button40.setEnabled(true);
        button41.setEnabled(true);
        button42.setEnabled(true);
        button43.setEnabled(true);
        button44.setEnabled(true);
        button45.setEnabled(true);
        button46.setEnabled(true);
        button47.setEnabled(true);
        button48.setEnabled(true);
        button49.setEnabled(true);
        button50.setEnabled(true);
        button51.setEnabled(true);
        button52.setEnabled(true);
        button53.setEnabled(true);
        button54.setEnabled(true);
        button55.setEnabled(true);
        button56.setEnabled(true);
        button57.setEnabled(true);
        button58.setEnabled(true);
        button59.setEnabled(true);
        button60.setEnabled(true);
        button61.setEnabled(true);
        button62.setEnabled(true);
        button63.setEnabled(true);
        button64.setEnabled(true);
        button65.setEnabled(true);
        button66.setEnabled(true);
        button67.setEnabled(true);
        button68.setEnabled(true);
        button69.setEnabled(true);
        button70.setEnabled(true);
        button71.setEnabled(true);
        button72.setEnabled(true);
        button73.setEnabled(true);
        button74.setEnabled(true);
        button75.setEnabled(true);
        button76.setEnabled(true);
        button77.setEnabled(true);
        button78.setEnabled(true);
        button79.setEnabled(true);
        button80.setEnabled(true);
        button81.setEnabled(true);
        button82.setEnabled(true);
        button83.setEnabled(true);
        button84.setEnabled(true);
        button85.setEnabled(true);
        button86.setEnabled(true);
        button87.setEnabled(true);
        button88.setEnabled(true);
        button89.setEnabled(true);
        button90.setEnabled(true);
        button91.setEnabled(true);
        button92.setEnabled(true);
        button93.setEnabled(true);
        button94.setEnabled(true);
        button95.setEnabled(true);
        button96.setEnabled(true);
        button97.setEnabled(true);
        button98.setEnabled(true);
        button99.setEnabled(true);
        button100.setEnabled(true);
        button101.setEnabled(true);
        button102.setEnabled(true);
        button103.setEnabled(true);
        button104.setEnabled(true);
        button105.setEnabled(true);
        button106.setEnabled(true);
        button107.setEnabled(true);
        button108.setEnabled(true);
        button109.setEnabled(true);
        button110.setEnabled(true);
        button111.setEnabled(true);
        button112.setEnabled(true);
        button113.setEnabled(true);
        button114.setEnabled(true);
        button115.setEnabled(true);
        button116.setEnabled(true);
        button117.setEnabled(true);
        button118.setEnabled(true);
        button119.setEnabled(true);
        button120.setEnabled(true);
        button121.setEnabled(true);
        button122.setEnabled(true);
        button123.setEnabled(true);
        button124.setEnabled(true);
        button125.setEnabled(true);
        button126.setEnabled(true);
        button127.setEnabled(true);
        button128.setEnabled(true);
        button129.setEnabled(true);
        button130.setEnabled(true);
        button131.setEnabled(true);
        button132.setEnabled(true);
        button133.setEnabled(true);
        button134.setEnabled(true);
        button135.setEnabled(true);
        button136.setEnabled(true);
        button137.setEnabled(true);
        button138.setEnabled(true);
        button139.setEnabled(true);
        button140.setEnabled(true);
        button141.setEnabled(true);
        button142.setEnabled(true);
        button143.setEnabled(true);
        button144.setEnabled(true);
        button145.setEnabled(true);
        button146.setEnabled(true);
        button147.setEnabled(true);
        button148.setEnabled(true);
        button149.setEnabled(true);
        button150.setEnabled(true);
        button151.setEnabled(true);
        button152.setEnabled(true);
        button153.setEnabled(true);
        button154.setEnabled(true);
        button155.setEnabled(true);
        button156.setEnabled(true);
        button157.setEnabled(true);
        button158.setEnabled(true);
        button159.setEnabled(true);
        button160.setEnabled(true);
        button161.setEnabled(true);
        button162.setEnabled(true);
        button163.setEnabled(true);
        button164.setEnabled(true);
        button165.setEnabled(true);
        button166.setEnabled(true);
        button167.setEnabled(true);
        button168.setEnabled(true);
        button169.setEnabled(true);
        button170.setEnabled(true);
        button171.setEnabled(true);
        button172.setEnabled(true);
        button173.setEnabled(true);
        button174.setEnabled(true);
        button175.setEnabled(true);
        button176.setEnabled(true);
        button177.setEnabled(true);
        button178.setEnabled(true);
        button179.setEnabled(true);
        button180.setEnabled(true);
        button181.setEnabled(true);
        button182.setEnabled(true);
        button183.setEnabled(true);
        button184.setEnabled(true);
        button185.setEnabled(true);
        button186.setEnabled(true);
        button187.setEnabled(true);
        button188.setEnabled(true);
        button189.setEnabled(true);
        button190.setEnabled(true);
        button191.setEnabled(true);
        button192.setEnabled(true);
        button193.setEnabled(true);
        button194.setEnabled(true);
        button195.setEnabled(true);
        button196.setEnabled(true);
        button197.setEnabled(true);
        button198.setEnabled(true);
        button199.setEnabled(true);
        button200.setEnabled(true);
        button201.setEnabled(true);
        button202.setEnabled(true);
        button203.setEnabled(true);
        button204.setEnabled(true);
        button205.setEnabled(true);
        button206.setEnabled(true);
        button207.setEnabled(true);
        button208.setEnabled(true);
        button209.setEnabled(true);
        button210.setEnabled(true);
        button211.setEnabled(true);
        button212.setEnabled(true);
        button213.setEnabled(true);
        button214.setEnabled(true);
        button215.setEnabled(true);
        button216.setEnabled(true);
        button217.setEnabled(true);
        button218.setEnabled(true);
        button219.setEnabled(true);
        button220.setEnabled(true);
        button221.setEnabled(true);
        button222.setEnabled(true);
        button223.setEnabled(true);
        button224.setEnabled(true);
        button225.setEnabled(true);
    }
    
    public void rightClick() {
        /*
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });
        */
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button1.setForeground(Color.RED);
                        button1.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button1.setForeground(Color.BLACK);
                        button1.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button2.setForeground(Color.RED);
                        button2.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button2.setForeground(Color.BLACK);
                        button2.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button3.setForeground(Color.RED);
                        button3.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button3.setForeground(Color.BLACK);
                        button3.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button4.setForeground(Color.RED);
                        button4.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button4.setForeground(Color.BLACK);
                        button4.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button5.setForeground(Color.RED);
                        button5.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button5.setForeground(Color.BLACK);
                        button5.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button6.setForeground(Color.RED);
                        button6.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button6.setForeground(Color.BLACK);
                        button6.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button7.setForeground(Color.RED);
                        button7.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button7.setForeground(Color.BLACK);
                        button7.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button8.setForeground(Color.RED);
                        button8.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button8.setForeground(Color.BLACK);
                        button8.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button9.setForeground(Color.RED);
                        button9.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button9.setForeground(Color.BLACK);
                        button9.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button10.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button10.setForeground(Color.RED);
                        button10.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button10.setForeground(Color.BLACK);
                        button10.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button11.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button11.setForeground(Color.RED);
                        button11.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button11.setForeground(Color.BLACK);
                        button11.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button12.setForeground(Color.RED);
                        button12.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button12.setForeground(Color.BLACK);
                        button12.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button13.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button13.setForeground(Color.RED);
                        button13.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button13.setForeground(Color.BLACK);
                        button13.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button14.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button14.setForeground(Color.RED);
                        button14.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button14.setForeground(Color.BLACK);
                        button14.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button15.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button15.setForeground(Color.RED);
                        button15.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button15.setForeground(Color.BLACK);
                        button15.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button16.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button16.setForeground(Color.RED);
                        button16.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button16.setForeground(Color.BLACK);
                        button16.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button17.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button17.setForeground(Color.RED);
                        button17.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button17.setForeground(Color.BLACK);
                        button17.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button18.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button18.setForeground(Color.RED);
                        button18.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button18.setForeground(Color.BLACK);
                        button18.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button19.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button19.setForeground(Color.RED);
                        button19.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button19.setForeground(Color.BLACK);
                        button19.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button20.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button20.setForeground(Color.RED);
                        button20.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button20.setForeground(Color.BLACK);
                        button20.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button21.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button21.setForeground(Color.RED);
                        button21.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button21.setForeground(Color.BLACK);
                        button21.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button22.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button22.setForeground(Color.RED);
                        button22.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button22.setForeground(Color.BLACK);
                        button22.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button23.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button23.setForeground(Color.RED);
                        button23.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button23.setForeground(Color.BLACK);
                        button23.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button24.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button24.setForeground(Color.RED);
                        button24.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button24.setForeground(Color.BLACK);
                        button24.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button25.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button25.setForeground(Color.RED);
                        button25.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button25.setForeground(Color.BLACK);
                        button25.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button26.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button26.setForeground(Color.RED);
                        button26.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button26.setForeground(Color.BLACK);
                        button26.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button27.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button27.setForeground(Color.RED);
                        button27.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button27.setForeground(Color.BLACK);
                        button27.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button28.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button28.setForeground(Color.RED);
                        button28.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button28.setForeground(Color.BLACK);
                        button28.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button29.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button29.setForeground(Color.RED);
                        button29.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button29.setForeground(Color.BLACK);
                        button29.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button30.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button30.setForeground(Color.RED);
                        button30.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button30.setForeground(Color.BLACK);
                        button30.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button31.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button31.setForeground(Color.RED);
                        button31.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button31.setForeground(Color.BLACK);
                        button31.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button32.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button32.setForeground(Color.RED);
                        button32.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button32.setForeground(Color.BLACK);
                        button32.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button33.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button33.setForeground(Color.RED);
                        button33.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button33.setForeground(Color.BLACK);
                        button33.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button34.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button34.setForeground(Color.RED);
                        button34.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button34.setForeground(Color.BLACK);
                        button34.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button35.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button35.setForeground(Color.RED);
                        button35.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button35.setForeground(Color.BLACK);
                        button35.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button36.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button36.setForeground(Color.RED);
                        button36.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button36.setForeground(Color.BLACK);
                        button36.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button37.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button37.setForeground(Color.RED);
                        button37.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button37.setForeground(Color.BLACK);
                        button37.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button38.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button38.setForeground(Color.RED);
                        button38.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button38.setForeground(Color.BLACK);
                        button38.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button39.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button39.setForeground(Color.RED);
                        button39.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button39.setForeground(Color.BLACK);
                        button39.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button40.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button40.setForeground(Color.RED);
                        button40.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button40.setForeground(Color.BLACK);
                        button40.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button41.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button41.setForeground(Color.RED);
                        button41.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button41.setForeground(Color.BLACK);
                        button41.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button42.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button42.setForeground(Color.RED);
                        button42.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button42.setForeground(Color.BLACK);
                        button42.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button43.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button43.setForeground(Color.RED);
                        button43.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button43.setForeground(Color.BLACK);
                        button43.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button44.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button44.setForeground(Color.RED);
                        button44.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button44.setForeground(Color.BLACK);
                        button44.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button45.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button45.setForeground(Color.RED);
                        button45.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button45.setForeground(Color.BLACK);
                        button45.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button46.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button46.setForeground(Color.RED);
                        button46.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button46.setForeground(Color.BLACK);
                        button46.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button47.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button47.setForeground(Color.RED);
                        button47.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button47.setForeground(Color.BLACK);
                        button47.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button48.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button48.setForeground(Color.RED);
                        button48.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button48.setForeground(Color.BLACK);
                        button48.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button49.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button49.setForeground(Color.RED);
                        button49.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button49.setForeground(Color.BLACK);
                        button49.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button50.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button50.setForeground(Color.RED);
                        button50.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button50.setForeground(Color.BLACK);
                        button50.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button51.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button51.setForeground(Color.RED);
                        button51.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button51.setForeground(Color.BLACK);
                        button51.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button52.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button52.setForeground(Color.RED);
                        button52.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button52.setForeground(Color.BLACK);
                        button52.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button53.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button53.setForeground(Color.RED);
                        button53.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button53.setForeground(Color.BLACK);
                        button53.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button54.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button54.setForeground(Color.RED);
                        button54.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button54.setForeground(Color.BLACK);
                        button54.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button55.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button55.setForeground(Color.RED);
                        button55.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button55.setForeground(Color.BLACK);
                        button55.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button56.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button56.setForeground(Color.RED);
                        button56.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button56.setForeground(Color.BLACK);
                        button56.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button57.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button57.setForeground(Color.RED);
                        button57.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button57.setForeground(Color.BLACK);
                        button57.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button58.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button58.setForeground(Color.RED);
                        button58.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button58.setForeground(Color.BLACK);
                        button58.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button59.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button59.setForeground(Color.RED);
                        button59.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button59.setForeground(Color.BLACK);
                        button59.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button60.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button60.setForeground(Color.RED);
                        button60.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button60.setForeground(Color.BLACK);
                        button60.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button61.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button61.setForeground(Color.RED);
                        button61.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button61.setForeground(Color.BLACK);
                        button61.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button62.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button62.setForeground(Color.RED);
                        button62.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button62.setForeground(Color.BLACK);
                        button62.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button63.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button63.setForeground(Color.RED);
                        button63.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button63.setForeground(Color.BLACK);
                        button63.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button64.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button64.setForeground(Color.RED);
                        button64.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button64.setForeground(Color.BLACK);
                        button64.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button65.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button65.setForeground(Color.RED);
                        button65.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button65.setForeground(Color.BLACK);
                        button65.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button66.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button66.setForeground(Color.RED);
                        button66.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button66.setForeground(Color.BLACK);
                        button66.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button67.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button67.setForeground(Color.RED);
                        button67.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button67.setForeground(Color.BLACK);
                        button67.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button68.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button68.setForeground(Color.RED);
                        button68.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button68.setForeground(Color.BLACK);
                        button68.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button69.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button69.setForeground(Color.RED);
                        button69.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button69.setForeground(Color.BLACK);
                        button69.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button70.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button70.setForeground(Color.RED);
                        button70.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button70.setForeground(Color.BLACK);
                        button70.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button71.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button71.setForeground(Color.RED);
                        button71.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button71.setForeground(Color.BLACK);
                        button71.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button72.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button72.setForeground(Color.RED);
                        button72.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button72.setForeground(Color.BLACK);
                        button72.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button73.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button73.setForeground(Color.RED);
                        button73.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button73.setForeground(Color.BLACK);
                        button73.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button74.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button74.setForeground(Color.RED);
                        button74.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button74.setForeground(Color.BLACK);
                        button74.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button75.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button75.setForeground(Color.RED);
                        button75.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button75.setForeground(Color.BLACK);
                        button75.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button76.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button76.setForeground(Color.RED);
                        button76.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button76.setForeground(Color.BLACK);
                        button76.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button77.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button77.setForeground(Color.RED);
                        button77.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button77.setForeground(Color.BLACK);
                        button77.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button78.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button78.setForeground(Color.RED);
                        button78.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button78.setForeground(Color.BLACK);
                        button78.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button79.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button79.setForeground(Color.RED);
                        button79.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button79.setForeground(Color.BLACK);
                        button79.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button80.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button80.setForeground(Color.RED);
                        button80.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button80.setForeground(Color.BLACK);
                        button80.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button81.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button81.setForeground(Color.RED);
                        button81.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button81.setForeground(Color.BLACK);
                        button81.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button82.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button82.setForeground(Color.RED);
                        button82.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button82.setForeground(Color.BLACK);
                        button82.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button83.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button83.setForeground(Color.RED);
                        button83.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button83.setForeground(Color.BLACK);
                        button83.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button84.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button84.setForeground(Color.RED);
                        button84.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button84.setForeground(Color.BLACK);
                        button84.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button85.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button85.setForeground(Color.RED);
                        button85.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button85.setForeground(Color.BLACK);
                        button85.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button86.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button86.setForeground(Color.RED);
                        button86.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button86.setForeground(Color.BLACK);
                        button86.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button87.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button87.setForeground(Color.RED);
                        button87.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button87.setForeground(Color.BLACK);
                        button87.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button88.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button88.setForeground(Color.RED);
                        button88.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button88.setForeground(Color.BLACK);
                        button88.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button89.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button89.setForeground(Color.RED);
                        button89.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button89.setForeground(Color.BLACK);
                        button89.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button90.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button90.setForeground(Color.RED);
                        button90.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button90.setForeground(Color.BLACK);
                        button90.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button91.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button91.setForeground(Color.RED);
                        button91.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button91.setForeground(Color.BLACK);
                        button91.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button92.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button92.setForeground(Color.RED);
                        button92.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button92.setForeground(Color.BLACK);
                        button92.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button93.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button93.setForeground(Color.RED);
                        button93.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button93.setForeground(Color.BLACK);
                        button93.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button94.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button94.setForeground(Color.RED);
                        button94.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button94.setForeground(Color.BLACK);
                        button94.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button95.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button95.setForeground(Color.RED);
                        button95.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button95.setForeground(Color.BLACK);
                        button95.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button96.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button96.setForeground(Color.RED);
                        button96.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button96.setForeground(Color.BLACK);
                        button96.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button97.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button97.setForeground(Color.RED);
                        button97.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button97.setForeground(Color.BLACK);
                        button97.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button98.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button98.setForeground(Color.RED);
                        button98.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button98.setForeground(Color.BLACK);
                        button98.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button99.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button99.setForeground(Color.RED);
                        button99.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button99.setForeground(Color.BLACK);
                        button99.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button100.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button100.setForeground(Color.RED);
                        button100.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button100.setForeground(Color.BLACK);
                        button100.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button101.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button101.setForeground(Color.RED);
                        button101.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button101.setForeground(Color.BLACK);
                        button101.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button102.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button102.setForeground(Color.RED);
                        button102.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button102.setForeground(Color.BLACK);
                        button102.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button103.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button103.setForeground(Color.RED);
                        button103.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button103.setForeground(Color.BLACK);
                        button103.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button104.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button104.setForeground(Color.RED);
                        button104.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button104.setForeground(Color.BLACK);
                        button104.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button105.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button105.setForeground(Color.RED);
                        button105.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button105.setForeground(Color.BLACK);
                        button105.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button106.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button106.setForeground(Color.RED);
                        button106.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button106.setForeground(Color.BLACK);
                        button106.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button107.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button107.setForeground(Color.RED);
                        button107.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button107.setForeground(Color.BLACK);
                        button107.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button108.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button108.setForeground(Color.RED);
                        button108.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button108.setForeground(Color.BLACK);
                        button108.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button109.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button109.setForeground(Color.RED);
                        button109.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button109.setForeground(Color.BLACK);
                        button109.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button110.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button110.setForeground(Color.RED);
                        button110.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button110.setForeground(Color.BLACK);
                        button110.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button111.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button111.setForeground(Color.RED);
                        button111.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button111.setForeground(Color.BLACK);
                        button111.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button112.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button112.setForeground(Color.RED);
                        button112.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button112.setForeground(Color.BLACK);
                        button112.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button113.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button113.setForeground(Color.RED);
                        button113.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button113.setForeground(Color.BLACK);
                        button113.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button114.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button114.setForeground(Color.RED);
                        button114.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button114.setForeground(Color.BLACK);
                        button114.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button115.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button115.setForeground(Color.RED);
                        button115.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button115.setForeground(Color.BLACK);
                        button115.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button116.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button116.setForeground(Color.RED);
                        button116.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button116.setForeground(Color.BLACK);
                        button116.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button117.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button117.setForeground(Color.RED);
                        button117.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button117.setForeground(Color.BLACK);
                        button117.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button118.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button118.setForeground(Color.RED);
                        button118.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button118.setForeground(Color.BLACK);
                        button118.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button119.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button119.setForeground(Color.RED);
                        button119.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button119.setForeground(Color.BLACK);
                        button119.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button120.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button120.setForeground(Color.RED);
                        button120.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button120.setForeground(Color.BLACK);
                        button120.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button121.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button121.setForeground(Color.RED);
                        button121.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button121.setForeground(Color.BLACK);
                        button121.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button122.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button122.setForeground(Color.RED);
                        button122.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button122.setForeground(Color.BLACK);
                        button122.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button123.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button123.setForeground(Color.RED);
                        button123.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button123.setForeground(Color.BLACK);
                        button123.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button124.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button124.setForeground(Color.RED);
                        button124.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button124.setForeground(Color.BLACK);
                        button124.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button125.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button125.setForeground(Color.RED);
                        button125.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button125.setForeground(Color.BLACK);
                        button125.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button126.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button126.setForeground(Color.RED);
                        button126.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button126.setForeground(Color.BLACK);
                        button126.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button127.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button127.setForeground(Color.RED);
                        button127.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button127.setForeground(Color.BLACK);
                        button127.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button128.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button128.setForeground(Color.RED);
                        button128.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button128.setForeground(Color.BLACK);
                        button128.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button129.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button129.setForeground(Color.RED);
                        button129.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button129.setForeground(Color.BLACK);
                        button129.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button130.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button130.setForeground(Color.RED);
                        button130.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button130.setForeground(Color.BLACK);
                        button130.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button131.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button131.setForeground(Color.RED);
                        button131.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button131.setForeground(Color.BLACK);
                        button131.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button132.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button132.setForeground(Color.RED);
                        button132.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button132.setForeground(Color.BLACK);
                        button132.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button133.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button133.setForeground(Color.RED);
                        button133.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button133.setForeground(Color.BLACK);
                        button133.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button134.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button134.setForeground(Color.RED);
                        button134.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button134.setForeground(Color.BLACK);
                        button134.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button135.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button135.setForeground(Color.RED);
                        button135.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button135.setForeground(Color.BLACK);
                        button135.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button136.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button136.setForeground(Color.RED);
                        button136.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button136.setForeground(Color.BLACK);
                        button136.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button137.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button137.setForeground(Color.RED);
                        button137.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button137.setForeground(Color.BLACK);
                        button137.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button138.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button138.setForeground(Color.RED);
                        button138.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button138.setForeground(Color.BLACK);
                        button138.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button139.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button139.setForeground(Color.RED);
                        button139.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button139.setForeground(Color.BLACK);
                        button139.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button140.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button140.setForeground(Color.RED);
                        button140.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button140.setForeground(Color.BLACK);
                        button140.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button141.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button141.setForeground(Color.RED);
                        button141.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button141.setForeground(Color.BLACK);
                        button141.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button142.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button142.setForeground(Color.RED);
                        button142.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button142.setForeground(Color.BLACK);
                        button142.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button143.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button143.setForeground(Color.RED);
                        button143.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button143.setForeground(Color.BLACK);
                        button143.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button144.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button144.setForeground(Color.RED);
                        button144.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button144.setForeground(Color.BLACK);
                        button144.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button145.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button145.setForeground(Color.RED);
                        button145.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button145.setForeground(Color.BLACK);
                        button145.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button146.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button146.setForeground(Color.RED);
                        button146.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button146.setForeground(Color.BLACK);
                        button146.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button147.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button147.setForeground(Color.RED);
                        button147.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button147.setForeground(Color.BLACK);
                        button147.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button148.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button148.setForeground(Color.RED);
                        button148.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button148.setForeground(Color.BLACK);
                        button148.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button149.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button149.setForeground(Color.RED);
                        button149.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button149.setForeground(Color.BLACK);
                        button149.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button150.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button150.setForeground(Color.RED);
                        button150.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button150.setForeground(Color.BLACK);
                        button150.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button151.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button151.setForeground(Color.RED);
                        button151.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button151.setForeground(Color.BLACK);
                        button151.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button152.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button152.setForeground(Color.RED);
                        button152.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button152.setForeground(Color.BLACK);
                        button152.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button153.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button153.setForeground(Color.RED);
                        button153.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button153.setForeground(Color.BLACK);
                        button153.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button154.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button154.setForeground(Color.RED);
                        button154.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button154.setForeground(Color.BLACK);
                        button154.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button155.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button155.setForeground(Color.RED);
                        button155.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button155.setForeground(Color.BLACK);
                        button155.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button156.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button156.setForeground(Color.RED);
                        button156.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button156.setForeground(Color.BLACK);
                        button156.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button157.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button157.setForeground(Color.RED);
                        button157.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button157.setForeground(Color.BLACK);
                        button157.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button158.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button158.setForeground(Color.RED);
                        button158.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button158.setForeground(Color.BLACK);
                        button158.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button159.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button159.setForeground(Color.RED);
                        button159.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button159.setForeground(Color.BLACK);
                        button159.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button160.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button160.setForeground(Color.RED);
                        button160.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button160.setForeground(Color.BLACK);
                        button160.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button161.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button161.setForeground(Color.RED);
                        button161.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button161.setForeground(Color.BLACK);
                        button161.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button162.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button162.setForeground(Color.RED);
                        button162.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button162.setForeground(Color.BLACK);
                        button162.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button163.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button163.setForeground(Color.RED);
                        button163.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button163.setForeground(Color.BLACK);
                        button163.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button164.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button164.setForeground(Color.RED);
                        button164.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button164.setForeground(Color.BLACK);
                        button164.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button165.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button165.setForeground(Color.RED);
                        button165.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button165.setForeground(Color.BLACK);
                        button165.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button166.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button166.setForeground(Color.RED);
                        button166.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button166.setForeground(Color.BLACK);
                        button166.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button167.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button167.setForeground(Color.RED);
                        button167.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button167.setForeground(Color.BLACK);
                        button167.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button168.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button168.setForeground(Color.RED);
                        button168.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button168.setForeground(Color.BLACK);
                        button168.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button169.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button169.setForeground(Color.RED);
                        button169.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button169.setForeground(Color.BLACK);
                        button169.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button170.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button170.setForeground(Color.RED);
                        button170.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button170.setForeground(Color.BLACK);
                        button170.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button171.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button171.setForeground(Color.RED);
                        button171.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button171.setForeground(Color.BLACK);
                        button171.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button172.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button172.setForeground(Color.RED);
                        button172.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button172.setForeground(Color.BLACK);
                        button172.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button173.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button173.setForeground(Color.RED);
                        button173.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button173.setForeground(Color.BLACK);
                        button173.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button174.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button174.setForeground(Color.RED);
                        button174.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button174.setForeground(Color.BLACK);
                        button174.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button175.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button175.setForeground(Color.RED);
                        button175.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button175.setForeground(Color.BLACK);
                        button175.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button176.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button176.setForeground(Color.RED);
                        button176.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button176.setForeground(Color.BLACK);
                        button176.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button177.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button177.setForeground(Color.RED);
                        button177.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button177.setForeground(Color.BLACK);
                        button177.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button178.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button178.setForeground(Color.RED);
                        button178.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button178.setForeground(Color.BLACK);
                        button178.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button179.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button179.setForeground(Color.RED);
                        button179.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button179.setForeground(Color.BLACK);
                        button179.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button180.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button180.setForeground(Color.RED);
                        button180.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button180.setForeground(Color.BLACK);
                        button180.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button181.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button181.setForeground(Color.RED);
                        button181.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button181.setForeground(Color.BLACK);
                        button181.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button182.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button182.setForeground(Color.RED);
                        button182.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button182.setForeground(Color.BLACK);
                        button182.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button183.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button183.setForeground(Color.RED);
                        button183.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button183.setForeground(Color.BLACK);
                        button183.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button184.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button184.setForeground(Color.RED);
                        button184.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button184.setForeground(Color.BLACK);
                        button184.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button185.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button185.setForeground(Color.RED);
                        button185.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button185.setForeground(Color.BLACK);
                        button185.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button186.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button186.setForeground(Color.RED);
                        button186.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button186.setForeground(Color.BLACK);
                        button186.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button187.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button187.setForeground(Color.RED);
                        button187.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button187.setForeground(Color.BLACK);
                        button187.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button188.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button188.setForeground(Color.RED);
                        button188.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button188.setForeground(Color.BLACK);
                        button188.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button189.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button189.setForeground(Color.RED);
                        button189.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button189.setForeground(Color.BLACK);
                        button189.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button190.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button190.setForeground(Color.RED);
                        button190.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button190.setForeground(Color.BLACK);
                        button190.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button191.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button191.setForeground(Color.RED);
                        button191.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button191.setForeground(Color.BLACK);
                        button191.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button192.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button192.setForeground(Color.RED);
                        button192.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button192.setForeground(Color.BLACK);
                        button192.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button193.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button193.setForeground(Color.RED);
                        button193.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button193.setForeground(Color.BLACK);
                        button193.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button194.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button194.setForeground(Color.RED);
                        button194.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button194.setForeground(Color.BLACK);
                        button194.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button195.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button195.setForeground(Color.RED);
                        button195.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button195.setForeground(Color.BLACK);
                        button195.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button196.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button196.setForeground(Color.RED);
                        button196.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button196.setForeground(Color.BLACK);
                        button196.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button197.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button197.setForeground(Color.RED);
                        button197.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button197.setForeground(Color.BLACK);
                        button197.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button198.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button198.setForeground(Color.RED);
                        button198.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button198.setForeground(Color.BLACK);
                        button198.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button199.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button199.setForeground(Color.RED);
                        button199.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button199.setForeground(Color.BLACK);
                        button199.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button200.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button200.setForeground(Color.RED);
                        button200.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button200.setForeground(Color.BLACK);
                        button200.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button201.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button201.setForeground(Color.RED);
                        button201.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button201.setForeground(Color.BLACK);
                        button201.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button202.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button202.setForeground(Color.RED);
                        button202.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button202.setForeground(Color.BLACK);
                        button202.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button203.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button203.setForeground(Color.RED);
                        button203.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button203.setForeground(Color.BLACK);
                        button203.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button204.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button204.setForeground(Color.RED);
                        button204.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button204.setForeground(Color.BLACK);
                        button204.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button205.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button205.setForeground(Color.RED);
                        button205.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button205.setForeground(Color.BLACK);
                        button205.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button206.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button206.setForeground(Color.RED);
                        button206.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button206.setForeground(Color.BLACK);
                        button206.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button207.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button207.setForeground(Color.RED);
                        button207.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button207.setForeground(Color.BLACK);
                        button207.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button208.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button208.setForeground(Color.RED);
                        button208.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button208.setForeground(Color.BLACK);
                        button208.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button209.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button209.setForeground(Color.RED);
                        button209.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button209.setForeground(Color.BLACK);
                        button209.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button210.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button210.setForeground(Color.RED);
                        button210.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button210.setForeground(Color.BLACK);
                        button210.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button211.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button211.setForeground(Color.RED);
                        button211.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button211.setForeground(Color.BLACK);
                        button211.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button212.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button212.setForeground(Color.RED);
                        button212.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button212.setForeground(Color.BLACK);
                        button212.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button213.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button213.setForeground(Color.RED);
                        button213.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button213.setForeground(Color.BLACK);
                        button213.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button214.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button214.setForeground(Color.RED);
                        button214.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button214.setForeground(Color.BLACK);
                        button214.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button215.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button215.setForeground(Color.RED);
                        button215.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button215.setForeground(Color.BLACK);
                        button215.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button216.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button216.setForeground(Color.RED);
                        button216.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button216.setForeground(Color.BLACK);
                        button216.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button217.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button217.setForeground(Color.RED);
                        button217.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button217.setForeground(Color.BLACK);
                        button217.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button218.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button218.setForeground(Color.RED);
                        button218.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button218.setForeground(Color.BLACK);
                        button218.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button219.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button219.setForeground(Color.RED);
                        button219.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button219.setForeground(Color.BLACK);
                        button219.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button220.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button220.setForeground(Color.RED);
                        button220.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button220.setForeground(Color.BLACK);
                        button220.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button221.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button221.setForeground(Color.RED);
                        button221.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button221.setForeground(Color.BLACK);
                        button221.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button222.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button222.setForeground(Color.RED);
                        button222.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button222.setForeground(Color.BLACK);
                        button222.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button223.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button223.setForeground(Color.RED);
                        button223.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button223.setForeground(Color.BLACK);
                        button223.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button224.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button224.setForeground(Color.RED);
                        button224.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button224.setForeground(Color.BLACK);
                        button224.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        });
        button225.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    if (color == false) {
                        button225.setForeground(Color.RED);
                        button225.setBackground(Color.RED);
                        color = true;
                        return;
                    }
                    if (color == true) {
                        button225.setForeground(Color.BLACK);
                        button225.setBackground(Color.BLACK);
                        color = false;
                        return;
                    }
                }
            }
        }); 
    }
    
    // right click
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        difficultyButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        button17 = new java.awt.Button();
        button18 = new java.awt.Button();
        button19 = new java.awt.Button();
        button20 = new java.awt.Button();
        button21 = new java.awt.Button();
        button22 = new java.awt.Button();
        button23 = new java.awt.Button();
        button24 = new java.awt.Button();
        button25 = new java.awt.Button();
        button26 = new java.awt.Button();
        button27 = new java.awt.Button();
        button28 = new java.awt.Button();
        button29 = new java.awt.Button();
        button30 = new java.awt.Button();
        button31 = new java.awt.Button();
        button32 = new java.awt.Button();
        button33 = new java.awt.Button();
        button34 = new java.awt.Button();
        button35 = new java.awt.Button();
        button36 = new java.awt.Button();
        button37 = new java.awt.Button();
        button38 = new java.awt.Button();
        button39 = new java.awt.Button();
        button40 = new java.awt.Button();
        button41 = new java.awt.Button();
        button42 = new java.awt.Button();
        button43 = new java.awt.Button();
        button44 = new java.awt.Button();
        button45 = new java.awt.Button();
        button46 = new java.awt.Button();
        button47 = new java.awt.Button();
        button48 = new java.awt.Button();
        button49 = new java.awt.Button();
        button50 = new java.awt.Button();
        button51 = new java.awt.Button();
        button52 = new java.awt.Button();
        button53 = new java.awt.Button();
        button54 = new java.awt.Button();
        button55 = new java.awt.Button();
        button56 = new java.awt.Button();
        button57 = new java.awt.Button();
        button58 = new java.awt.Button();
        button59 = new java.awt.Button();
        button60 = new java.awt.Button();
        button61 = new java.awt.Button();
        button62 = new java.awt.Button();
        button63 = new java.awt.Button();
        button64 = new java.awt.Button();
        button65 = new java.awt.Button();
        button66 = new java.awt.Button();
        button67 = new java.awt.Button();
        button68 = new java.awt.Button();
        button69 = new java.awt.Button();
        button70 = new java.awt.Button();
        button71 = new java.awt.Button();
        button72 = new java.awt.Button();
        button73 = new java.awt.Button();
        button74 = new java.awt.Button();
        button75 = new java.awt.Button();
        button76 = new java.awt.Button();
        button77 = new java.awt.Button();
        button78 = new java.awt.Button();
        button79 = new java.awt.Button();
        button80 = new java.awt.Button();
        button81 = new java.awt.Button();
        button82 = new java.awt.Button();
        button83 = new java.awt.Button();
        button84 = new java.awt.Button();
        button85 = new java.awt.Button();
        button86 = new java.awt.Button();
        button87 = new java.awt.Button();
        button88 = new java.awt.Button();
        button89 = new java.awt.Button();
        button90 = new java.awt.Button();
        button91 = new java.awt.Button();
        button92 = new java.awt.Button();
        button93 = new java.awt.Button();
        button94 = new java.awt.Button();
        button95 = new java.awt.Button();
        button96 = new java.awt.Button();
        button97 = new java.awt.Button();
        button98 = new java.awt.Button();
        button99 = new java.awt.Button();
        button100 = new java.awt.Button();
        button101 = new java.awt.Button();
        button102 = new java.awt.Button();
        button103 = new java.awt.Button();
        button104 = new java.awt.Button();
        button105 = new java.awt.Button();
        button106 = new java.awt.Button();
        button107 = new java.awt.Button();
        button108 = new java.awt.Button();
        button109 = new java.awt.Button();
        button110 = new java.awt.Button();
        button111 = new java.awt.Button();
        button112 = new java.awt.Button();
        button113 = new java.awt.Button();
        button114 = new java.awt.Button();
        button115 = new java.awt.Button();
        button116 = new java.awt.Button();
        button117 = new java.awt.Button();
        button118 = new java.awt.Button();
        button119 = new java.awt.Button();
        button120 = new java.awt.Button();
        button121 = new java.awt.Button();
        button122 = new java.awt.Button();
        button123 = new java.awt.Button();
        button124 = new java.awt.Button();
        button125 = new java.awt.Button();
        button126 = new java.awt.Button();
        button127 = new java.awt.Button();
        button128 = new java.awt.Button();
        button129 = new java.awt.Button();
        button130 = new java.awt.Button();
        button131 = new java.awt.Button();
        button132 = new java.awt.Button();
        button133 = new java.awt.Button();
        button134 = new java.awt.Button();
        button135 = new java.awt.Button();
        button136 = new java.awt.Button();
        button137 = new java.awt.Button();
        button138 = new java.awt.Button();
        button139 = new java.awt.Button();
        button140 = new java.awt.Button();
        button141 = new java.awt.Button();
        button142 = new java.awt.Button();
        button143 = new java.awt.Button();
        button144 = new java.awt.Button();
        button145 = new java.awt.Button();
        button146 = new java.awt.Button();
        button147 = new java.awt.Button();
        button148 = new java.awt.Button();
        button149 = new java.awt.Button();
        button150 = new java.awt.Button();
        button151 = new java.awt.Button();
        button152 = new java.awt.Button();
        button153 = new java.awt.Button();
        button154 = new java.awt.Button();
        button155 = new java.awt.Button();
        button156 = new java.awt.Button();
        button157 = new java.awt.Button();
        button158 = new java.awt.Button();
        button159 = new java.awt.Button();
        button160 = new java.awt.Button();
        button161 = new java.awt.Button();
        button162 = new java.awt.Button();
        button163 = new java.awt.Button();
        button164 = new java.awt.Button();
        button165 = new java.awt.Button();
        button166 = new java.awt.Button();
        button167 = new java.awt.Button();
        button168 = new java.awt.Button();
        button169 = new java.awt.Button();
        button170 = new java.awt.Button();
        button171 = new java.awt.Button();
        button172 = new java.awt.Button();
        button173 = new java.awt.Button();
        button174 = new java.awt.Button();
        button175 = new java.awt.Button();
        button176 = new java.awt.Button();
        button177 = new java.awt.Button();
        button178 = new java.awt.Button();
        button179 = new java.awt.Button();
        button180 = new java.awt.Button();
        button181 = new java.awt.Button();
        button182 = new java.awt.Button();
        button183 = new java.awt.Button();
        button184 = new java.awt.Button();
        button185 = new java.awt.Button();
        button186 = new java.awt.Button();
        button187 = new java.awt.Button();
        button188 = new java.awt.Button();
        button189 = new java.awt.Button();
        button190 = new java.awt.Button();
        button191 = new java.awt.Button();
        button192 = new java.awt.Button();
        button193 = new java.awt.Button();
        button194 = new java.awt.Button();
        button195 = new java.awt.Button();
        button196 = new java.awt.Button();
        button197 = new java.awt.Button();
        button198 = new java.awt.Button();
        button199 = new java.awt.Button();
        button200 = new java.awt.Button();
        button201 = new java.awt.Button();
        button202 = new java.awt.Button();
        button203 = new java.awt.Button();
        button204 = new java.awt.Button();
        button205 = new java.awt.Button();
        button206 = new java.awt.Button();
        button207 = new java.awt.Button();
        button208 = new java.awt.Button();
        button209 = new java.awt.Button();
        button210 = new java.awt.Button();
        button211 = new java.awt.Button();
        button212 = new java.awt.Button();
        button213 = new java.awt.Button();
        button214 = new java.awt.Button();
        button215 = new java.awt.Button();
        button216 = new java.awt.Button();
        button217 = new java.awt.Button();
        button218 = new java.awt.Button();
        button219 = new java.awt.Button();
        button220 = new java.awt.Button();
        button221 = new java.awt.Button();
        button222 = new java.awt.Button();
        button223 = new java.awt.Button();
        button224 = new java.awt.Button();
        button225 = new java.awt.Button();
        jDifficultyPanel = new javax.swing.JPanel();
        jNormalRadioButton = new javax.swing.JRadioButton();
        jHardRadioButton = new javax.swing.JRadioButton();
        jImpossibleRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Grid"));
        jPanel1.setLayout(null);

        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(30, 30, 30, 24);

        button2.setBackground(new java.awt.Color(204, 204, 204));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(60, 30, 30, 24);

        button3.setBackground(new java.awt.Color(204, 204, 204));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3);
        button3.setBounds(90, 30, 30, 24);

        button4.setBackground(new java.awt.Color(0, 0, 0));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4);
        button4.setBounds(120, 30, 30, 24);

        button5.setBackground(new java.awt.Color(0, 0, 0));
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5);
        button5.setBounds(150, 30, 30, 24);

        button6.setBackground(new java.awt.Color(0, 0, 0));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel1.add(button6);
        button6.setBounds(180, 30, 30, 24);

        button7.setBackground(new java.awt.Color(0, 0, 0));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel1.add(button7);
        button7.setBounds(210, 30, 30, 24);

        button8.setBackground(new java.awt.Color(0, 0, 0));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel1.add(button8);
        button8.setBounds(240, 30, 30, 24);

        button9.setBackground(new java.awt.Color(0, 0, 0));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel1.add(button9);
        button9.setBounds(270, 30, 30, 24);

        button10.setBackground(new java.awt.Color(0, 0, 0));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        jPanel1.add(button10);
        button10.setBounds(300, 30, 30, 24);

        button11.setBackground(new java.awt.Color(0, 0, 0));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        jPanel1.add(button11);
        button11.setBounds(330, 30, 30, 24);

        button12.setBackground(new java.awt.Color(0, 0, 0));
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        jPanel1.add(button12);
        button12.setBounds(360, 30, 30, 24);

        button13.setBackground(new java.awt.Color(0, 0, 0));
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });
        jPanel1.add(button13);
        button13.setBounds(390, 30, 30, 24);

        button14.setBackground(new java.awt.Color(0, 0, 0));
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });
        jPanel1.add(button14);
        button14.setBounds(420, 30, 30, 24);

        button15.setBackground(new java.awt.Color(0, 0, 0));
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });
        jPanel1.add(button15);
        button15.setBounds(450, 30, 30, 24);

        button16.setBackground(new java.awt.Color(204, 204, 204));
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });
        jPanel1.add(button16);
        button16.setBounds(30, 50, 30, 24);

        button17.setBackground(new java.awt.Color(204, 204, 204));
        button17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });
        jPanel1.add(button17);
        button17.setBounds(60, 50, 30, 24);

        button18.setBackground(new java.awt.Color(204, 204, 204));
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });
        jPanel1.add(button18);
        button18.setBounds(90, 50, 30, 24);

        button19.setBackground(new java.awt.Color(0, 0, 0));
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });
        jPanel1.add(button19);
        button19.setBounds(120, 50, 30, 24);

        button20.setBackground(new java.awt.Color(0, 0, 0));
        button20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });
        jPanel1.add(button20);
        button20.setBounds(150, 50, 30, 24);

        button21.setBackground(new java.awt.Color(0, 0, 0));
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });
        jPanel1.add(button21);
        button21.setBounds(180, 50, 30, 24);

        button22.setBackground(new java.awt.Color(0, 0, 0));
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });
        jPanel1.add(button22);
        button22.setBounds(210, 50, 30, 24);

        button23.setBackground(new java.awt.Color(0, 0, 0));
        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });
        jPanel1.add(button23);
        button23.setBounds(240, 50, 30, 24);

        button24.setBackground(new java.awt.Color(0, 0, 0));
        button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button24ActionPerformed(evt);
            }
        });
        jPanel1.add(button24);
        button24.setBounds(270, 50, 30, 24);

        button25.setBackground(new java.awt.Color(0, 0, 0));
        button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button25ActionPerformed(evt);
            }
        });
        jPanel1.add(button25);
        button25.setBounds(300, 50, 30, 24);

        button26.setBackground(new java.awt.Color(0, 0, 0));
        button26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button26ActionPerformed(evt);
            }
        });
        jPanel1.add(button26);
        button26.setBounds(330, 50, 30, 24);

        button27.setBackground(new java.awt.Color(0, 0, 0));
        button27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button27ActionPerformed(evt);
            }
        });
        jPanel1.add(button27);
        button27.setBounds(360, 50, 30, 24);

        button28.setBackground(new java.awt.Color(0, 0, 0));
        button28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button28ActionPerformed(evt);
            }
        });
        jPanel1.add(button28);
        button28.setBounds(390, 50, 30, 24);

        button29.setBackground(new java.awt.Color(0, 0, 0));
        button29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button29ActionPerformed(evt);
            }
        });
        jPanel1.add(button29);
        button29.setBounds(420, 50, 30, 24);

        button30.setBackground(new java.awt.Color(0, 0, 0));
        button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button30ActionPerformed(evt);
            }
        });
        jPanel1.add(button30);
        button30.setBounds(450, 50, 30, 24);

        button31.setBackground(new java.awt.Color(204, 204, 204));
        button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button31ActionPerformed(evt);
            }
        });
        jPanel1.add(button31);
        button31.setBounds(30, 70, 30, 24);

        button32.setBackground(new java.awt.Color(204, 204, 204));
        button32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button32ActionPerformed(evt);
            }
        });
        jPanel1.add(button32);
        button32.setBounds(60, 70, 30, 24);

        button33.setBackground(new java.awt.Color(204, 204, 204));
        button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button33ActionPerformed(evt);
            }
        });
        jPanel1.add(button33);
        button33.setBounds(90, 70, 30, 24);

        button34.setBackground(new java.awt.Color(0, 0, 0));
        button34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button34ActionPerformed(evt);
            }
        });
        jPanel1.add(button34);
        button34.setBounds(120, 70, 30, 24);

        button35.setBackground(new java.awt.Color(0, 0, 0));
        button35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button35ActionPerformed(evt);
            }
        });
        jPanel1.add(button35);
        button35.setBounds(150, 70, 30, 24);

        button36.setBackground(new java.awt.Color(0, 0, 0));
        button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button36ActionPerformed(evt);
            }
        });
        jPanel1.add(button36);
        button36.setBounds(180, 70, 30, 24);

        button37.setBackground(new java.awt.Color(0, 0, 0));
        button37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button37ActionPerformed(evt);
            }
        });
        jPanel1.add(button37);
        button37.setBounds(210, 70, 30, 24);

        button38.setBackground(new java.awt.Color(0, 0, 0));
        button38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button38ActionPerformed(evt);
            }
        });
        jPanel1.add(button38);
        button38.setBounds(240, 70, 30, 24);

        button39.setBackground(new java.awt.Color(0, 0, 0));
        button39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button39ActionPerformed(evt);
            }
        });
        jPanel1.add(button39);
        button39.setBounds(270, 70, 30, 24);

        button40.setBackground(new java.awt.Color(0, 0, 0));
        button40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button40ActionPerformed(evt);
            }
        });
        jPanel1.add(button40);
        button40.setBounds(300, 70, 30, 24);

        button41.setBackground(new java.awt.Color(0, 0, 0));
        button41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button41ActionPerformed(evt);
            }
        });
        jPanel1.add(button41);
        button41.setBounds(330, 70, 30, 24);

        button42.setBackground(new java.awt.Color(0, 0, 0));
        button42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button42ActionPerformed(evt);
            }
        });
        jPanel1.add(button42);
        button42.setBounds(360, 70, 30, 24);

        button43.setBackground(new java.awt.Color(0, 0, 0));
        button43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button43ActionPerformed(evt);
            }
        });
        jPanel1.add(button43);
        button43.setBounds(390, 70, 30, 24);

        button44.setBackground(new java.awt.Color(0, 0, 0));
        button44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button44ActionPerformed(evt);
            }
        });
        jPanel1.add(button44);
        button44.setBounds(420, 70, 30, 24);

        button45.setBackground(new java.awt.Color(0, 0, 0));
        button45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button45ActionPerformed(evt);
            }
        });
        jPanel1.add(button45);
        button45.setBounds(450, 70, 30, 24);

        button46.setBackground(new java.awt.Color(0, 0, 0));
        button46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button46ActionPerformed(evt);
            }
        });
        jPanel1.add(button46);
        button46.setBounds(30, 90, 30, 24);

        button47.setBackground(new java.awt.Color(0, 0, 0));
        button47.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button47ActionPerformed(evt);
            }
        });
        jPanel1.add(button47);
        button47.setBounds(60, 90, 30, 24);

        button48.setBackground(new java.awt.Color(0, 0, 0));
        button48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button48ActionPerformed(evt);
            }
        });
        jPanel1.add(button48);
        button48.setBounds(90, 90, 30, 24);

        button49.setBackground(new java.awt.Color(0, 0, 0));
        button49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button49ActionPerformed(evt);
            }
        });
        jPanel1.add(button49);
        button49.setBounds(120, 90, 30, 24);

        button50.setBackground(new java.awt.Color(0, 0, 0));
        button50.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button50ActionPerformed(evt);
            }
        });
        jPanel1.add(button50);
        button50.setBounds(150, 90, 30, 24);

        button51.setBackground(new java.awt.Color(0, 0, 0));
        button51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button51ActionPerformed(evt);
            }
        });
        jPanel1.add(button51);
        button51.setBounds(180, 90, 30, 24);

        button52.setBackground(new java.awt.Color(0, 0, 0));
        button52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button52ActionPerformed(evt);
            }
        });
        jPanel1.add(button52);
        button52.setBounds(210, 90, 30, 24);

        button53.setBackground(new java.awt.Color(0, 0, 0));
        button53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button53ActionPerformed(evt);
            }
        });
        jPanel1.add(button53);
        button53.setBounds(240, 90, 30, 24);

        button54.setBackground(new java.awt.Color(0, 0, 0));
        button54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button54ActionPerformed(evt);
            }
        });
        jPanel1.add(button54);
        button54.setBounds(270, 90, 30, 24);

        button55.setBackground(new java.awt.Color(0, 0, 0));
        button55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button55ActionPerformed(evt);
            }
        });
        jPanel1.add(button55);
        button55.setBounds(300, 90, 30, 24);

        button56.setBackground(new java.awt.Color(0, 0, 0));
        button56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button56ActionPerformed(evt);
            }
        });
        jPanel1.add(button56);
        button56.setBounds(330, 90, 30, 24);

        button57.setBackground(new java.awt.Color(0, 0, 0));
        button57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button57ActionPerformed(evt);
            }
        });
        jPanel1.add(button57);
        button57.setBounds(360, 90, 30, 24);

        button58.setBackground(new java.awt.Color(0, 0, 0));
        button58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button58ActionPerformed(evt);
            }
        });
        jPanel1.add(button58);
        button58.setBounds(390, 90, 30, 24);

        button59.setBackground(new java.awt.Color(0, 0, 0));
        button59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button59ActionPerformed(evt);
            }
        });
        jPanel1.add(button59);
        button59.setBounds(420, 90, 30, 24);

        button60.setBackground(new java.awt.Color(0, 0, 0));
        button60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button60ActionPerformed(evt);
            }
        });
        jPanel1.add(button60);
        button60.setBounds(450, 90, 30, 24);

        button61.setBackground(new java.awt.Color(0, 0, 0));
        button61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button61ActionPerformed(evt);
            }
        });
        jPanel1.add(button61);
        button61.setBounds(30, 110, 30, 24);

        button62.setBackground(new java.awt.Color(0, 0, 0));
        button62.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button62ActionPerformed(evt);
            }
        });
        jPanel1.add(button62);
        button62.setBounds(60, 110, 30, 24);

        button63.setBackground(new java.awt.Color(0, 0, 0));
        button63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button63ActionPerformed(evt);
            }
        });
        jPanel1.add(button63);
        button63.setBounds(90, 110, 30, 24);

        button64.setBackground(new java.awt.Color(0, 0, 0));
        button64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button64ActionPerformed(evt);
            }
        });
        jPanel1.add(button64);
        button64.setBounds(120, 110, 30, 24);

        button65.setBackground(new java.awt.Color(0, 0, 0));
        button65.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button65ActionPerformed(evt);
            }
        });
        jPanel1.add(button65);
        button65.setBounds(150, 110, 30, 24);

        button66.setBackground(new java.awt.Color(0, 0, 0));
        button66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button66ActionPerformed(evt);
            }
        });
        jPanel1.add(button66);
        button66.setBounds(180, 110, 30, 24);

        button67.setBackground(new java.awt.Color(0, 0, 0));
        button67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button67ActionPerformed(evt);
            }
        });
        jPanel1.add(button67);
        button67.setBounds(210, 110, 30, 24);

        button68.setBackground(new java.awt.Color(0, 0, 0));
        button68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button68ActionPerformed(evt);
            }
        });
        jPanel1.add(button68);
        button68.setBounds(240, 110, 30, 24);

        button69.setBackground(new java.awt.Color(0, 0, 0));
        button69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button69ActionPerformed(evt);
            }
        });
        jPanel1.add(button69);
        button69.setBounds(270, 110, 30, 24);

        button70.setBackground(new java.awt.Color(0, 0, 0));
        button70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button70ActionPerformed(evt);
            }
        });
        jPanel1.add(button70);
        button70.setBounds(300, 110, 30, 24);

        button71.setBackground(new java.awt.Color(0, 0, 0));
        button71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button71ActionPerformed(evt);
            }
        });
        jPanel1.add(button71);
        button71.setBounds(330, 110, 30, 24);

        button72.setBackground(new java.awt.Color(0, 0, 0));
        button72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button72ActionPerformed(evt);
            }
        });
        jPanel1.add(button72);
        button72.setBounds(360, 110, 30, 24);

        button73.setBackground(new java.awt.Color(0, 0, 0));
        button73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button73ActionPerformed(evt);
            }
        });
        jPanel1.add(button73);
        button73.setBounds(390, 110, 30, 24);

        button74.setBackground(new java.awt.Color(0, 0, 0));
        button74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button74ActionPerformed(evt);
            }
        });
        jPanel1.add(button74);
        button74.setBounds(420, 110, 30, 24);

        button75.setBackground(new java.awt.Color(0, 0, 0));
        button75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button75ActionPerformed(evt);
            }
        });
        jPanel1.add(button75);
        button75.setBounds(450, 110, 30, 24);

        button76.setBackground(new java.awt.Color(0, 0, 0));
        button76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button76ActionPerformed(evt);
            }
        });
        jPanel1.add(button76);
        button76.setBounds(30, 130, 30, 24);

        button77.setBackground(new java.awt.Color(0, 0, 0));
        button77.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button77ActionPerformed(evt);
            }
        });
        jPanel1.add(button77);
        button77.setBounds(60, 130, 30, 24);

        button78.setBackground(new java.awt.Color(0, 0, 0));
        button78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button78ActionPerformed(evt);
            }
        });
        jPanel1.add(button78);
        button78.setBounds(90, 130, 30, 24);

        button79.setBackground(new java.awt.Color(0, 0, 0));
        button79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button79ActionPerformed(evt);
            }
        });
        jPanel1.add(button79);
        button79.setBounds(120, 130, 30, 24);

        button80.setBackground(new java.awt.Color(0, 0, 0));
        button80.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button80ActionPerformed(evt);
            }
        });
        jPanel1.add(button80);
        button80.setBounds(150, 130, 30, 24);

        button81.setBackground(new java.awt.Color(0, 0, 0));
        button81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button81ActionPerformed(evt);
            }
        });
        jPanel1.add(button81);
        button81.setBounds(180, 130, 30, 24);

        button82.setBackground(new java.awt.Color(0, 0, 0));
        button82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button82ActionPerformed(evt);
            }
        });
        jPanel1.add(button82);
        button82.setBounds(210, 130, 30, 24);

        button83.setBackground(new java.awt.Color(0, 0, 0));
        button83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button83ActionPerformed(evt);
            }
        });
        jPanel1.add(button83);
        button83.setBounds(240, 130, 30, 24);

        button84.setBackground(new java.awt.Color(0, 0, 0));
        button84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button84ActionPerformed(evt);
            }
        });
        jPanel1.add(button84);
        button84.setBounds(270, 130, 30, 24);

        button85.setBackground(new java.awt.Color(0, 0, 0));
        button85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button85ActionPerformed(evt);
            }
        });
        jPanel1.add(button85);
        button85.setBounds(300, 130, 30, 24);

        button86.setBackground(new java.awt.Color(0, 0, 0));
        button86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button86ActionPerformed(evt);
            }
        });
        jPanel1.add(button86);
        button86.setBounds(330, 130, 30, 24);

        button87.setBackground(new java.awt.Color(0, 0, 0));
        button87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button87ActionPerformed(evt);
            }
        });
        jPanel1.add(button87);
        button87.setBounds(360, 130, 30, 24);

        button88.setBackground(new java.awt.Color(0, 0, 0));
        button88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button88ActionPerformed(evt);
            }
        });
        jPanel1.add(button88);
        button88.setBounds(390, 130, 30, 24);

        button89.setBackground(new java.awt.Color(0, 0, 0));
        button89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button89ActionPerformed(evt);
            }
        });
        jPanel1.add(button89);
        button89.setBounds(420, 130, 30, 24);

        button90.setBackground(new java.awt.Color(0, 0, 0));
        button90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button90ActionPerformed(evt);
            }
        });
        jPanel1.add(button90);
        button90.setBounds(450, 130, 30, 24);

        button91.setBackground(new java.awt.Color(0, 0, 0));
        button91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button91ActionPerformed(evt);
            }
        });
        jPanel1.add(button91);
        button91.setBounds(30, 150, 30, 24);

        button92.setBackground(new java.awt.Color(0, 0, 0));
        button92.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button92ActionPerformed(evt);
            }
        });
        jPanel1.add(button92);
        button92.setBounds(60, 150, 30, 24);

        button93.setBackground(new java.awt.Color(0, 0, 0));
        button93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button93ActionPerformed(evt);
            }
        });
        jPanel1.add(button93);
        button93.setBounds(90, 150, 30, 24);

        button94.setBackground(new java.awt.Color(0, 0, 0));
        button94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button94ActionPerformed(evt);
            }
        });
        jPanel1.add(button94);
        button94.setBounds(120, 150, 30, 24);

        button95.setBackground(new java.awt.Color(0, 0, 0));
        button95.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button95ActionPerformed(evt);
            }
        });
        jPanel1.add(button95);
        button95.setBounds(150, 150, 30, 24);

        button96.setBackground(new java.awt.Color(0, 0, 0));
        button96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button96ActionPerformed(evt);
            }
        });
        jPanel1.add(button96);
        button96.setBounds(180, 150, 30, 24);

        button97.setBackground(new java.awt.Color(0, 0, 0));
        button97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button97ActionPerformed(evt);
            }
        });
        jPanel1.add(button97);
        button97.setBounds(210, 150, 30, 24);

        button98.setBackground(new java.awt.Color(0, 0, 0));
        button98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button98ActionPerformed(evt);
            }
        });
        jPanel1.add(button98);
        button98.setBounds(240, 150, 30, 24);

        button99.setBackground(new java.awt.Color(0, 0, 0));
        button99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button99ActionPerformed(evt);
            }
        });
        jPanel1.add(button99);
        button99.setBounds(270, 150, 30, 24);

        button100.setBackground(new java.awt.Color(0, 0, 0));
        button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button100ActionPerformed(evt);
            }
        });
        jPanel1.add(button100);
        button100.setBounds(300, 150, 30, 24);

        button101.setBackground(new java.awt.Color(0, 0, 0));
        button101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button101ActionPerformed(evt);
            }
        });
        jPanel1.add(button101);
        button101.setBounds(330, 150, 30, 24);

        button102.setBackground(new java.awt.Color(0, 0, 0));
        button102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button102ActionPerformed(evt);
            }
        });
        jPanel1.add(button102);
        button102.setBounds(360, 150, 30, 24);

        button103.setBackground(new java.awt.Color(0, 0, 0));
        button103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button103ActionPerformed(evt);
            }
        });
        jPanel1.add(button103);
        button103.setBounds(390, 150, 30, 24);

        button104.setBackground(new java.awt.Color(0, 0, 0));
        button104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button104ActionPerformed(evt);
            }
        });
        jPanel1.add(button104);
        button104.setBounds(420, 150, 30, 24);

        button105.setBackground(new java.awt.Color(0, 0, 0));
        button105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button105ActionPerformed(evt);
            }
        });
        jPanel1.add(button105);
        button105.setBounds(450, 150, 30, 24);

        button106.setBackground(new java.awt.Color(0, 0, 0));
        button106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button106ActionPerformed(evt);
            }
        });
        jPanel1.add(button106);
        button106.setBounds(30, 170, 30, 24);

        button107.setBackground(new java.awt.Color(0, 0, 0));
        button107.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button107ActionPerformed(evt);
            }
        });
        jPanel1.add(button107);
        button107.setBounds(60, 170, 30, 24);

        button108.setBackground(new java.awt.Color(0, 0, 0));
        button108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button108ActionPerformed(evt);
            }
        });
        jPanel1.add(button108);
        button108.setBounds(90, 170, 30, 24);

        button109.setBackground(new java.awt.Color(0, 0, 0));
        button109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button109ActionPerformed(evt);
            }
        });
        jPanel1.add(button109);
        button109.setBounds(120, 170, 30, 24);

        button110.setBackground(new java.awt.Color(0, 0, 0));
        button110.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button110ActionPerformed(evt);
            }
        });
        jPanel1.add(button110);
        button110.setBounds(150, 170, 30, 24);

        button111.setBackground(new java.awt.Color(0, 0, 0));
        button111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button111ActionPerformed(evt);
            }
        });
        jPanel1.add(button111);
        button111.setBounds(180, 170, 30, 24);

        button112.setBackground(new java.awt.Color(0, 0, 0));
        button112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button112ActionPerformed(evt);
            }
        });
        jPanel1.add(button112);
        button112.setBounds(210, 170, 30, 24);

        button113.setBackground(new java.awt.Color(0, 0, 0));
        button113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button113ActionPerformed(evt);
            }
        });
        jPanel1.add(button113);
        button113.setBounds(240, 170, 30, 24);

        button114.setBackground(new java.awt.Color(0, 0, 0));
        button114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button114ActionPerformed(evt);
            }
        });
        jPanel1.add(button114);
        button114.setBounds(270, 170, 30, 24);

        button115.setBackground(new java.awt.Color(0, 0, 0));
        button115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button115ActionPerformed(evt);
            }
        });
        jPanel1.add(button115);
        button115.setBounds(300, 170, 30, 24);

        button116.setBackground(new java.awt.Color(0, 0, 0));
        button116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button116ActionPerformed(evt);
            }
        });
        jPanel1.add(button116);
        button116.setBounds(330, 170, 30, 24);

        button117.setBackground(new java.awt.Color(0, 0, 0));
        button117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button117ActionPerformed(evt);
            }
        });
        jPanel1.add(button117);
        button117.setBounds(360, 170, 30, 24);

        button118.setBackground(new java.awt.Color(0, 0, 0));
        button118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button118ActionPerformed(evt);
            }
        });
        jPanel1.add(button118);
        button118.setBounds(390, 170, 30, 24);

        button119.setBackground(new java.awt.Color(0, 0, 0));
        button119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button119ActionPerformed(evt);
            }
        });
        jPanel1.add(button119);
        button119.setBounds(420, 170, 30, 24);

        button120.setBackground(new java.awt.Color(0, 0, 0));
        button120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button120ActionPerformed(evt);
            }
        });
        jPanel1.add(button120);
        button120.setBounds(450, 170, 30, 24);

        button121.setBackground(new java.awt.Color(0, 0, 0));
        button121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button121ActionPerformed(evt);
            }
        });
        jPanel1.add(button121);
        button121.setBounds(30, 190, 30, 24);

        button122.setBackground(new java.awt.Color(0, 0, 0));
        button122.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button122ActionPerformed(evt);
            }
        });
        jPanel1.add(button122);
        button122.setBounds(60, 190, 30, 24);

        button123.setBackground(new java.awt.Color(0, 0, 0));
        button123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button123ActionPerformed(evt);
            }
        });
        jPanel1.add(button123);
        button123.setBounds(90, 190, 30, 24);

        button124.setBackground(new java.awt.Color(0, 0, 0));
        button124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button124ActionPerformed(evt);
            }
        });
        jPanel1.add(button124);
        button124.setBounds(120, 190, 30, 24);

        button125.setBackground(new java.awt.Color(0, 0, 0));
        button125.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button125ActionPerformed(evt);
            }
        });
        jPanel1.add(button125);
        button125.setBounds(150, 190, 30, 24);

        button126.setBackground(new java.awt.Color(0, 0, 0));
        button126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button126ActionPerformed(evt);
            }
        });
        jPanel1.add(button126);
        button126.setBounds(180, 190, 30, 24);

        button127.setBackground(new java.awt.Color(0, 0, 0));
        button127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button127ActionPerformed(evt);
            }
        });
        jPanel1.add(button127);
        button127.setBounds(210, 190, 30, 24);

        button128.setBackground(new java.awt.Color(0, 0, 0));
        button128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button128ActionPerformed(evt);
            }
        });
        jPanel1.add(button128);
        button128.setBounds(240, 190, 30, 24);

        button129.setBackground(new java.awt.Color(0, 0, 0));
        button129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button129ActionPerformed(evt);
            }
        });
        jPanel1.add(button129);
        button129.setBounds(270, 190, 30, 24);

        button130.setBackground(new java.awt.Color(0, 0, 0));
        button130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button130ActionPerformed(evt);
            }
        });
        jPanel1.add(button130);
        button130.setBounds(300, 190, 30, 24);

        button131.setBackground(new java.awt.Color(0, 0, 0));
        button131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button131ActionPerformed(evt);
            }
        });
        jPanel1.add(button131);
        button131.setBounds(330, 190, 30, 24);

        button132.setBackground(new java.awt.Color(0, 0, 0));
        button132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button132ActionPerformed(evt);
            }
        });
        jPanel1.add(button132);
        button132.setBounds(360, 190, 30, 24);

        button133.setBackground(new java.awt.Color(0, 0, 0));
        button133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button133ActionPerformed(evt);
            }
        });
        jPanel1.add(button133);
        button133.setBounds(390, 190, 30, 24);

        button134.setBackground(new java.awt.Color(0, 0, 0));
        button134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button134ActionPerformed(evt);
            }
        });
        jPanel1.add(button134);
        button134.setBounds(420, 190, 30, 24);

        button135.setBackground(new java.awt.Color(0, 0, 0));
        button135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button135ActionPerformed(evt);
            }
        });
        jPanel1.add(button135);
        button135.setBounds(450, 190, 30, 24);

        button136.setBackground(new java.awt.Color(0, 0, 0));
        button136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button136ActionPerformed(evt);
            }
        });
        jPanel1.add(button136);
        button136.setBounds(30, 210, 30, 24);

        button137.setBackground(new java.awt.Color(0, 0, 0));
        button137.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button137ActionPerformed(evt);
            }
        });
        jPanel1.add(button137);
        button137.setBounds(60, 210, 30, 24);

        button138.setBackground(new java.awt.Color(0, 0, 0));
        button138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button138ActionPerformed(evt);
            }
        });
        jPanel1.add(button138);
        button138.setBounds(90, 210, 30, 24);

        button139.setBackground(new java.awt.Color(0, 0, 0));
        button139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button139ActionPerformed(evt);
            }
        });
        jPanel1.add(button139);
        button139.setBounds(120, 210, 30, 24);

        button140.setBackground(new java.awt.Color(0, 0, 0));
        button140.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button140ActionPerformed(evt);
            }
        });
        jPanel1.add(button140);
        button140.setBounds(150, 210, 30, 24);

        button141.setBackground(new java.awt.Color(0, 0, 0));
        button141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button141ActionPerformed(evt);
            }
        });
        jPanel1.add(button141);
        button141.setBounds(180, 210, 30, 24);

        button142.setBackground(new java.awt.Color(0, 0, 0));
        button142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button142ActionPerformed(evt);
            }
        });
        jPanel1.add(button142);
        button142.setBounds(210, 210, 30, 24);

        button143.setBackground(new java.awt.Color(0, 0, 0));
        button143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button143ActionPerformed(evt);
            }
        });
        jPanel1.add(button143);
        button143.setBounds(240, 210, 30, 24);

        button144.setBackground(new java.awt.Color(0, 0, 0));
        button144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button144ActionPerformed(evt);
            }
        });
        jPanel1.add(button144);
        button144.setBounds(270, 210, 30, 24);

        button145.setBackground(new java.awt.Color(0, 0, 0));
        button145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button145ActionPerformed(evt);
            }
        });
        jPanel1.add(button145);
        button145.setBounds(300, 210, 30, 24);

        button146.setBackground(new java.awt.Color(0, 0, 0));
        button146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button146ActionPerformed(evt);
            }
        });
        jPanel1.add(button146);
        button146.setBounds(330, 210, 30, 24);

        button147.setBackground(new java.awt.Color(0, 0, 0));
        button147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button147ActionPerformed(evt);
            }
        });
        jPanel1.add(button147);
        button147.setBounds(360, 210, 30, 24);

        button148.setBackground(new java.awt.Color(0, 0, 0));
        button148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button148ActionPerformed(evt);
            }
        });
        jPanel1.add(button148);
        button148.setBounds(390, 210, 30, 24);

        button149.setBackground(new java.awt.Color(0, 0, 0));
        button149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button149ActionPerformed(evt);
            }
        });
        jPanel1.add(button149);
        button149.setBounds(420, 210, 30, 24);

        button150.setBackground(new java.awt.Color(0, 0, 0));
        button150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button150ActionPerformed(evt);
            }
        });
        jPanel1.add(button150);
        button150.setBounds(450, 210, 30, 24);

        button151.setBackground(new java.awt.Color(0, 0, 0));
        button151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button151ActionPerformed(evt);
            }
        });
        jPanel1.add(button151);
        button151.setBounds(30, 230, 30, 24);

        button152.setBackground(new java.awt.Color(0, 0, 0));
        button152.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button152ActionPerformed(evt);
            }
        });
        jPanel1.add(button152);
        button152.setBounds(60, 230, 30, 24);

        button153.setBackground(new java.awt.Color(0, 0, 0));
        button153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button153ActionPerformed(evt);
            }
        });
        jPanel1.add(button153);
        button153.setBounds(90, 230, 30, 24);

        button154.setBackground(new java.awt.Color(0, 0, 0));
        button154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button154ActionPerformed(evt);
            }
        });
        jPanel1.add(button154);
        button154.setBounds(120, 230, 30, 24);

        button155.setBackground(new java.awt.Color(0, 0, 0));
        button155.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button155ActionPerformed(evt);
            }
        });
        jPanel1.add(button155);
        button155.setBounds(150, 230, 30, 24);

        button156.setBackground(new java.awt.Color(0, 0, 0));
        button156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button156ActionPerformed(evt);
            }
        });
        jPanel1.add(button156);
        button156.setBounds(180, 230, 30, 24);

        button157.setBackground(new java.awt.Color(0, 0, 0));
        button157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button157ActionPerformed(evt);
            }
        });
        jPanel1.add(button157);
        button157.setBounds(210, 230, 30, 24);

        button158.setBackground(new java.awt.Color(0, 0, 0));
        button158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button158ActionPerformed(evt);
            }
        });
        jPanel1.add(button158);
        button158.setBounds(240, 230, 30, 24);

        button159.setBackground(new java.awt.Color(0, 0, 0));
        button159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button159ActionPerformed(evt);
            }
        });
        jPanel1.add(button159);
        button159.setBounds(270, 230, 30, 24);

        button160.setBackground(new java.awt.Color(0, 0, 0));
        button160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button160ActionPerformed(evt);
            }
        });
        jPanel1.add(button160);
        button160.setBounds(300, 230, 30, 24);

        button161.setBackground(new java.awt.Color(0, 0, 0));
        button161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button161ActionPerformed(evt);
            }
        });
        jPanel1.add(button161);
        button161.setBounds(330, 230, 30, 24);

        button162.setBackground(new java.awt.Color(0, 0, 0));
        button162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button162ActionPerformed(evt);
            }
        });
        jPanel1.add(button162);
        button162.setBounds(360, 230, 30, 24);

        button163.setBackground(new java.awt.Color(0, 0, 0));
        button163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button163ActionPerformed(evt);
            }
        });
        jPanel1.add(button163);
        button163.setBounds(390, 230, 30, 24);

        button164.setBackground(new java.awt.Color(0, 0, 0));
        button164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button164ActionPerformed(evt);
            }
        });
        jPanel1.add(button164);
        button164.setBounds(420, 230, 30, 24);

        button165.setBackground(new java.awt.Color(0, 0, 0));
        button165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button165ActionPerformed(evt);
            }
        });
        jPanel1.add(button165);
        button165.setBounds(450, 230, 30, 24);

        button166.setBackground(new java.awt.Color(0, 0, 0));
        button166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button166ActionPerformed(evt);
            }
        });
        jPanel1.add(button166);
        button166.setBounds(30, 250, 30, 24);

        button167.setBackground(new java.awt.Color(0, 0, 0));
        button167.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button167ActionPerformed(evt);
            }
        });
        jPanel1.add(button167);
        button167.setBounds(60, 250, 30, 24);

        button168.setBackground(new java.awt.Color(0, 0, 0));
        button168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button168ActionPerformed(evt);
            }
        });
        jPanel1.add(button168);
        button168.setBounds(90, 250, 30, 24);

        button169.setBackground(new java.awt.Color(0, 0, 0));
        button169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button169ActionPerformed(evt);
            }
        });
        jPanel1.add(button169);
        button169.setBounds(120, 250, 30, 24);

        button170.setBackground(new java.awt.Color(0, 0, 0));
        button170.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button170ActionPerformed(evt);
            }
        });
        jPanel1.add(button170);
        button170.setBounds(150, 250, 30, 24);

        button171.setBackground(new java.awt.Color(0, 0, 0));
        button171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button171ActionPerformed(evt);
            }
        });
        jPanel1.add(button171);
        button171.setBounds(180, 250, 30, 24);

        button172.setBackground(new java.awt.Color(0, 0, 0));
        button172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button172ActionPerformed(evt);
            }
        });
        jPanel1.add(button172);
        button172.setBounds(210, 250, 30, 24);

        button173.setBackground(new java.awt.Color(0, 0, 0));
        button173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button173ActionPerformed(evt);
            }
        });
        jPanel1.add(button173);
        button173.setBounds(240, 250, 30, 24);

        button174.setBackground(new java.awt.Color(0, 0, 0));
        button174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button174ActionPerformed(evt);
            }
        });
        jPanel1.add(button174);
        button174.setBounds(270, 250, 30, 24);

        button175.setBackground(new java.awt.Color(0, 0, 0));
        button175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button175ActionPerformed(evt);
            }
        });
        jPanel1.add(button175);
        button175.setBounds(300, 250, 30, 24);

        button176.setBackground(new java.awt.Color(0, 0, 0));
        button176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button176ActionPerformed(evt);
            }
        });
        jPanel1.add(button176);
        button176.setBounds(330, 250, 30, 24);

        button177.setBackground(new java.awt.Color(0, 0, 0));
        button177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button177ActionPerformed(evt);
            }
        });
        jPanel1.add(button177);
        button177.setBounds(360, 250, 30, 24);

        button178.setBackground(new java.awt.Color(0, 0, 0));
        button178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button178ActionPerformed(evt);
            }
        });
        jPanel1.add(button178);
        button178.setBounds(390, 250, 30, 24);

        button179.setBackground(new java.awt.Color(0, 0, 0));
        button179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button179ActionPerformed(evt);
            }
        });
        jPanel1.add(button179);
        button179.setBounds(420, 250, 30, 24);

        button180.setBackground(new java.awt.Color(0, 0, 0));
        button180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button180ActionPerformed(evt);
            }
        });
        jPanel1.add(button180);
        button180.setBounds(450, 250, 30, 24);

        button181.setBackground(new java.awt.Color(0, 0, 0));
        button181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button181ActionPerformed(evt);
            }
        });
        jPanel1.add(button181);
        button181.setBounds(30, 270, 30, 24);

        button182.setBackground(new java.awt.Color(0, 0, 0));
        button182.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button182ActionPerformed(evt);
            }
        });
        jPanel1.add(button182);
        button182.setBounds(60, 270, 30, 24);

        button183.setBackground(new java.awt.Color(0, 0, 0));
        button183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button183ActionPerformed(evt);
            }
        });
        jPanel1.add(button183);
        button183.setBounds(90, 270, 30, 24);

        button184.setBackground(new java.awt.Color(0, 0, 0));
        button184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button184ActionPerformed(evt);
            }
        });
        jPanel1.add(button184);
        button184.setBounds(120, 270, 30, 24);

        button185.setBackground(new java.awt.Color(0, 0, 0));
        button185.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button185ActionPerformed(evt);
            }
        });
        jPanel1.add(button185);
        button185.setBounds(150, 270, 30, 24);

        button186.setBackground(new java.awt.Color(0, 0, 0));
        button186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button186ActionPerformed(evt);
            }
        });
        jPanel1.add(button186);
        button186.setBounds(180, 270, 30, 24);

        button187.setBackground(new java.awt.Color(0, 0, 0));
        button187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button187ActionPerformed(evt);
            }
        });
        jPanel1.add(button187);
        button187.setBounds(210, 270, 30, 24);

        button188.setBackground(new java.awt.Color(0, 0, 0));
        button188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button188ActionPerformed(evt);
            }
        });
        jPanel1.add(button188);
        button188.setBounds(240, 270, 30, 24);

        button189.setBackground(new java.awt.Color(0, 0, 0));
        button189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button189ActionPerformed(evt);
            }
        });
        jPanel1.add(button189);
        button189.setBounds(270, 270, 30, 24);

        button190.setBackground(new java.awt.Color(0, 0, 0));
        button190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button190ActionPerformed(evt);
            }
        });
        jPanel1.add(button190);
        button190.setBounds(300, 270, 30, 24);

        button191.setBackground(new java.awt.Color(0, 0, 0));
        button191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button191ActionPerformed(evt);
            }
        });
        jPanel1.add(button191);
        button191.setBounds(330, 270, 30, 24);

        button192.setBackground(new java.awt.Color(0, 0, 0));
        button192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button192ActionPerformed(evt);
            }
        });
        jPanel1.add(button192);
        button192.setBounds(360, 270, 30, 24);

        button193.setBackground(new java.awt.Color(0, 0, 0));
        button193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button193ActionPerformed(evt);
            }
        });
        jPanel1.add(button193);
        button193.setBounds(390, 270, 30, 24);

        button194.setBackground(new java.awt.Color(0, 0, 0));
        button194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button194ActionPerformed(evt);
            }
        });
        jPanel1.add(button194);
        button194.setBounds(420, 270, 30, 24);

        button195.setBackground(new java.awt.Color(0, 0, 0));
        button195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button195ActionPerformed(evt);
            }
        });
        jPanel1.add(button195);
        button195.setBounds(450, 270, 30, 24);

        button196.setBackground(new java.awt.Color(0, 0, 0));
        button196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button196ActionPerformed(evt);
            }
        });
        jPanel1.add(button196);
        button196.setBounds(30, 290, 30, 24);

        button197.setBackground(new java.awt.Color(0, 0, 0));
        button197.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button197ActionPerformed(evt);
            }
        });
        jPanel1.add(button197);
        button197.setBounds(60, 290, 30, 24);

        button198.setBackground(new java.awt.Color(0, 0, 0));
        button198.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button198ActionPerformed(evt);
            }
        });
        jPanel1.add(button198);
        button198.setBounds(90, 290, 30, 24);

        button199.setBackground(new java.awt.Color(0, 0, 0));
        button199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button199ActionPerformed(evt);
            }
        });
        jPanel1.add(button199);
        button199.setBounds(120, 290, 30, 24);

        button200.setBackground(new java.awt.Color(0, 0, 0));
        button200.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button200ActionPerformed(evt);
            }
        });
        jPanel1.add(button200);
        button200.setBounds(150, 290, 30, 24);

        button201.setBackground(new java.awt.Color(0, 0, 0));
        button201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button201ActionPerformed(evt);
            }
        });
        jPanel1.add(button201);
        button201.setBounds(180, 290, 30, 24);

        button202.setBackground(new java.awt.Color(0, 0, 0));
        button202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button202ActionPerformed(evt);
            }
        });
        jPanel1.add(button202);
        button202.setBounds(210, 290, 30, 24);

        button203.setBackground(new java.awt.Color(0, 0, 0));
        button203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button203ActionPerformed(evt);
            }
        });
        jPanel1.add(button203);
        button203.setBounds(240, 290, 30, 24);

        button204.setBackground(new java.awt.Color(0, 0, 0));
        button204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button204ActionPerformed(evt);
            }
        });
        jPanel1.add(button204);
        button204.setBounds(270, 290, 30, 24);

        button205.setBackground(new java.awt.Color(0, 0, 0));
        button205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button205ActionPerformed(evt);
            }
        });
        jPanel1.add(button205);
        button205.setBounds(300, 290, 30, 24);

        button206.setBackground(new java.awt.Color(0, 0, 0));
        button206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button206ActionPerformed(evt);
            }
        });
        jPanel1.add(button206);
        button206.setBounds(330, 290, 30, 24);

        button207.setBackground(new java.awt.Color(0, 0, 0));
        button207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button207ActionPerformed(evt);
            }
        });
        jPanel1.add(button207);
        button207.setBounds(360, 290, 30, 24);

        button208.setBackground(new java.awt.Color(0, 0, 0));
        button208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button208ActionPerformed(evt);
            }
        });
        jPanel1.add(button208);
        button208.setBounds(390, 290, 30, 24);

        button209.setBackground(new java.awt.Color(0, 0, 0));
        button209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button209ActionPerformed(evt);
            }
        });
        jPanel1.add(button209);
        button209.setBounds(420, 290, 30, 24);

        button210.setBackground(new java.awt.Color(0, 0, 0));
        button210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button210ActionPerformed(evt);
            }
        });
        jPanel1.add(button210);
        button210.setBounds(450, 290, 30, 24);

        button211.setBackground(new java.awt.Color(0, 0, 0));
        button211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button211ActionPerformed(evt);
            }
        });
        jPanel1.add(button211);
        button211.setBounds(30, 310, 30, 24);

        button212.setBackground(new java.awt.Color(0, 0, 0));
        button212.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button212ActionPerformed(evt);
            }
        });
        jPanel1.add(button212);
        button212.setBounds(60, 310, 30, 24);

        button213.setBackground(new java.awt.Color(0, 0, 0));
        button213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button213ActionPerformed(evt);
            }
        });
        jPanel1.add(button213);
        button213.setBounds(90, 310, 30, 24);

        button214.setBackground(new java.awt.Color(0, 0, 0));
        button214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button214ActionPerformed(evt);
            }
        });
        jPanel1.add(button214);
        button214.setBounds(120, 310, 30, 24);

        button215.setBackground(new java.awt.Color(0, 0, 0));
        button215.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button215ActionPerformed(evt);
            }
        });
        jPanel1.add(button215);
        button215.setBounds(150, 310, 30, 24);

        button216.setBackground(new java.awt.Color(0, 0, 0));
        button216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button216ActionPerformed(evt);
            }
        });
        jPanel1.add(button216);
        button216.setBounds(180, 310, 30, 24);

        button217.setBackground(new java.awt.Color(0, 0, 0));
        button217.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button217ActionPerformed(evt);
            }
        });
        jPanel1.add(button217);
        button217.setBounds(210, 310, 30, 24);

        button218.setBackground(new java.awt.Color(0, 0, 0));
        button218.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button218ActionPerformed(evt);
            }
        });
        jPanel1.add(button218);
        button218.setBounds(240, 310, 30, 24);

        button219.setBackground(new java.awt.Color(0, 0, 0));
        button219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button219ActionPerformed(evt);
            }
        });
        jPanel1.add(button219);
        button219.setBounds(270, 310, 30, 24);

        button220.setBackground(new java.awt.Color(0, 0, 0));
        button220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button220ActionPerformed(evt);
            }
        });
        jPanel1.add(button220);
        button220.setBounds(300, 310, 30, 24);

        button221.setBackground(new java.awt.Color(0, 0, 0));
        button221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button221ActionPerformed(evt);
            }
        });
        jPanel1.add(button221);
        button221.setBounds(330, 310, 30, 24);

        button222.setBackground(new java.awt.Color(0, 0, 0));
        button222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button222ActionPerformed(evt);
            }
        });
        jPanel1.add(button222);
        button222.setBounds(360, 310, 30, 24);

        button223.setBackground(new java.awt.Color(0, 0, 0));
        button223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button223ActionPerformed(evt);
            }
        });
        jPanel1.add(button223);
        button223.setBounds(390, 310, 30, 24);

        button224.setBackground(new java.awt.Color(0, 0, 0));
        button224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button224ActionPerformed(evt);
            }
        });
        jPanel1.add(button224);
        button224.setBounds(420, 310, 30, 24);

        button225.setBackground(new java.awt.Color(0, 0, 0));
        button225.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button225ActionPerformed(evt);
            }
        });
        jPanel1.add(button225);
        button225.setBounds(450, 310, 30, 24);

        jDifficultyPanel.setBackground(new java.awt.Color(255, 255, 255));
        jDifficultyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Difficulty:"));

        jNormalRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        difficultyButtonGroup.add(jNormalRadioButton);
        jNormalRadioButton.setText("Normal");
        jNormalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNormalRadioButtonActionPerformed(evt);
            }
        });

        jHardRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        difficultyButtonGroup.add(jHardRadioButton);
        jHardRadioButton.setText("Hard");
        jHardRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHardRadioButtonActionPerformed(evt);
            }
        });

        jImpossibleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        difficultyButtonGroup.add(jImpossibleRadioButton);
        jImpossibleRadioButton.setText("Impossible");
        jImpossibleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImpossibleRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDifficultyPanelLayout = new javax.swing.GroupLayout(jDifficultyPanel);
        jDifficultyPanel.setLayout(jDifficultyPanelLayout);
        jDifficultyPanelLayout.setHorizontalGroup(
            jDifficultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDifficultyPanelLayout.createSequentialGroup()
                .addComponent(jNormalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jHardRadioButton)
                .addGap(117, 117, 117)
                .addComponent(jImpossibleRadioButton)
                .addContainerGap())
        );
        jDifficultyPanelLayout.setVerticalGroup(
            jDifficultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDifficultyPanelLayout.createSequentialGroup()
                .addGroup(jDifficultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNormalRadioButton)
                    .addComponent(jHardRadioButton)
                    .addComponent(jImpossibleRadioButton))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(jDifficultyPanel);
        jDifficultyPanel.setBounds(30, 350, 450, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        if(button1.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button1.setBackground(Color.LIGHT_GRAY);                  
        button1.setEnabled(false);
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        if(button2.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button2.setBackground(Color.LIGHT_GRAY);                  
        button2.setEnabled(false);
        
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(button3.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button3.setBackground(Color.LIGHT_GRAY);                  
        button3.setEnabled(false);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        if(button4.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button4.setBackground(Color.LIGHT_GRAY);                  
        button4.setEnabled(false);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        if(button5.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button5.setBackground(Color.LIGHT_GRAY);                  
        button5.setEnabled(false);
    }//GEN-LAST:event_button5ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        if(button7.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button7.setBackground(Color.LIGHT_GRAY);                  
        button7.setEnabled(false);
    }//GEN-LAST:event_button7ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        if(button6.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button6.setBackground(Color.LIGHT_GRAY);                  
        button6.setEnabled(false);
    }//GEN-LAST:event_button6ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        if(button8.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button8.setBackground(Color.LIGHT_GRAY);                  
        button8.setEnabled(false);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        if(button9.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button9.setBackground(Color.LIGHT_GRAY);                  
        button9.setEnabled(false);
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        if(button10.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button10.setBackground(Color.LIGHT_GRAY);                  
        button10.setEnabled(false);
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
        if(button11.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button11.setBackground(Color.LIGHT_GRAY);                  
        button11.setEnabled(false);
    }//GEN-LAST:event_button11ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
        if(button13.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button13.setBackground(Color.LIGHT_GRAY);                  
        button13.setEnabled(false);
    }//GEN-LAST:event_button13ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        // TODO add your handling code here:
        if(button14.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button14.setBackground(Color.LIGHT_GRAY);                  
        button14.setEnabled(false);
    }//GEN-LAST:event_button14ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
        if(button15.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button15.setBackground(Color.LIGHT_GRAY);                  
        button15.setEnabled(false);
    }//GEN-LAST:event_button15ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
        if(button12.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button12.setBackground(Color.LIGHT_GRAY);                  
        button12.setEnabled(false);
    }//GEN-LAST:event_button12ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        // TODO add your handling code here:
        if(button16.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button16.setBackground(Color.LIGHT_GRAY);                  
        button16.setEnabled(false);
    }//GEN-LAST:event_button16ActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        // TODO add your handling code here:
        if(button17.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button17.setBackground(Color.LIGHT_GRAY);                  
        button17.setEnabled(false);
    }//GEN-LAST:event_button17ActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        // TODO add your handling code here:
        if(button18.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button18.setBackground(Color.LIGHT_GRAY);                  
        button18.setEnabled(false);
    }//GEN-LAST:event_button18ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
        // TODO add your handling code here:
        if(button19.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button19.setBackground(Color.LIGHT_GRAY);                  
        button19.setEnabled(false);
    }//GEN-LAST:event_button19ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        // TODO add your handling code here:
        if(button20.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button20.setBackground(Color.LIGHT_GRAY);                  
        button20.setEnabled(false);
    }//GEN-LAST:event_button20ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        // TODO add your handling code here:
        if(button21.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button21.setBackground(Color.LIGHT_GRAY);                  
        button21.setEnabled(false);
    }//GEN-LAST:event_button21ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        // TODO add your handling code here:
        if(button22.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button22.setBackground(Color.LIGHT_GRAY);                  
        button22.setEnabled(false);
    }//GEN-LAST:event_button22ActionPerformed

    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        // TODO add your handling code here:
        if(button23.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button23.setBackground(Color.LIGHT_GRAY);                  
        button23.setEnabled(false);
    }//GEN-LAST:event_button23ActionPerformed

    private void button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button24ActionPerformed
        // TODO add your handling code here:
        if(button24.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button24.setBackground(Color.LIGHT_GRAY);                  
        button24.setEnabled(false);
    }//GEN-LAST:event_button24ActionPerformed

    private void button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button25ActionPerformed
        // TODO add your handling code here:
        if(button25.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button25.setBackground(Color.LIGHT_GRAY);                  
        button25.setEnabled(false);
    }//GEN-LAST:event_button25ActionPerformed

    private void button26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button26ActionPerformed
        // TODO add your handling code here:
        if(button26.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button26.setBackground(Color.LIGHT_GRAY);                  
        button26.setEnabled(false);
    }//GEN-LAST:event_button26ActionPerformed

    private void button27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button27ActionPerformed
        // TODO add your handling code here:
        if(button27.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button27.setBackground(Color.LIGHT_GRAY);                  
        button27.setEnabled(false);
    }//GEN-LAST:event_button27ActionPerformed

    private void button28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button28ActionPerformed
        // TODO add your handling code here:
        if(button28.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button28.setBackground(Color.LIGHT_GRAY);                  
        button28.setEnabled(false);
    }//GEN-LAST:event_button28ActionPerformed

    private void button29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button29ActionPerformed
        // TODO add your handling code here:
        if(button29.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button29.setBackground(Color.LIGHT_GRAY);                  
        button29.setEnabled(false);
    }//GEN-LAST:event_button29ActionPerformed

    private void button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button30ActionPerformed
        // TODO add your handling code here:
        if(button30.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button30.setBackground(Color.LIGHT_GRAY);                  
        button30.setEnabled(false);
    }//GEN-LAST:event_button30ActionPerformed

    private void button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button31ActionPerformed
        // TODO add your handling code here:
        if(button31.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button31.setBackground(Color.LIGHT_GRAY);                  
        button31.setEnabled(false);
    }//GEN-LAST:event_button31ActionPerformed

    private void button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button32ActionPerformed
        // TODO add your handling code here:
        if(button32.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button32.setBackground(Color.LIGHT_GRAY);                  
        button32.setEnabled(false);
    }//GEN-LAST:event_button32ActionPerformed

    private void button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button33ActionPerformed
        // TODO add your handling code here:
        if(button33.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button33.setBackground(Color.LIGHT_GRAY);                  
        button33.setEnabled(false);
    }//GEN-LAST:event_button33ActionPerformed

    private void button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button34ActionPerformed
        // TODO add your handling code here:
        if(button34.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button34.setBackground(Color.LIGHT_GRAY);                  
        button34.setEnabled(false);
    }//GEN-LAST:event_button34ActionPerformed

    private void button35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button35ActionPerformed
        // TODO add your handling code here:
        if(button35.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button35.setBackground(Color.LIGHT_GRAY);                  
        button35.setEnabled(false);
    }//GEN-LAST:event_button35ActionPerformed

    private void button36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button36ActionPerformed
        // TODO add your handling code here:
        if(button36.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button36.setBackground(Color.LIGHT_GRAY);                  
        button36.setEnabled(false);
    }//GEN-LAST:event_button36ActionPerformed

    private void button37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button37ActionPerformed
        // TODO add your handling code here:
        if(button37.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button37.setBackground(Color.LIGHT_GRAY);                  
        button37.setEnabled(false);
    }//GEN-LAST:event_button37ActionPerformed

    private void button38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button38ActionPerformed
        // TODO add your handling code here:
        if(button38.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button38.setBackground(Color.LIGHT_GRAY);                  
        button38.setEnabled(false);
    }//GEN-LAST:event_button38ActionPerformed

    private void button39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button39ActionPerformed
        // TODO add your handling code here:
        if(button39.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button39.setBackground(Color.LIGHT_GRAY);                  
        button39.setEnabled(false);
    }//GEN-LAST:event_button39ActionPerformed

    private void button40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button40ActionPerformed
        // TODO add your handling code here:
        if(button40.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button40.setBackground(Color.LIGHT_GRAY);                  
        button40.setEnabled(false);
    }//GEN-LAST:event_button40ActionPerformed

    private void button41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button41ActionPerformed
        // TODO add your handling code here:
        if(button41.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button41.setBackground(Color.LIGHT_GRAY);                  
        button41.setEnabled(false);
    }//GEN-LAST:event_button41ActionPerformed

    private void button42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button42ActionPerformed
        // TODO add your handling code here:
        if(button42.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button42.setBackground(Color.LIGHT_GRAY);                  
        button42.setEnabled(false);
    }//GEN-LAST:event_button42ActionPerformed

    private void button43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button43ActionPerformed
        // TODO add your handling code here:
        if(button43.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button43.setBackground(Color.LIGHT_GRAY);                  
        button43.setEnabled(false);
    }//GEN-LAST:event_button43ActionPerformed

    private void button44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button44ActionPerformed
        // TODO add your handling code here:
        if(button44.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button44.setBackground(Color.LIGHT_GRAY);                  
        button44.setEnabled(false);
    }//GEN-LAST:event_button44ActionPerformed

    private void button45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button45ActionPerformed
        // TODO add your handling code here:
        if(button45.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button45.setBackground(Color.LIGHT_GRAY);                  
        button45.setEnabled(false);
    }//GEN-LAST:event_button45ActionPerformed

    private void button46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button46ActionPerformed
        // TODO add your handling code here:
        if(button46.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button46.setBackground(Color.LIGHT_GRAY);                  
        button46.setEnabled(false);
    }//GEN-LAST:event_button46ActionPerformed

    private void button47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button47ActionPerformed
        // TODO add your handling code here:
        if(button47.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button47.setBackground(Color.LIGHT_GRAY);                  
        button47.setEnabled(false);
    }//GEN-LAST:event_button47ActionPerformed

    private void button48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button48ActionPerformed
        // TODO add your handling code here:
        if(button48.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button48.setBackground(Color.LIGHT_GRAY);                  
        button48.setEnabled(false);
    }//GEN-LAST:event_button48ActionPerformed

    private void button49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button49ActionPerformed
        // TODO add your handling code here:
        if(button49.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button49.setBackground(Color.LIGHT_GRAY);                  
        button49.setEnabled(false);
    }//GEN-LAST:event_button49ActionPerformed

    private void button50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button50ActionPerformed
        // TODO add your handling code here:
        if(button50.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button50.setBackground(Color.LIGHT_GRAY);                  
        button50.setEnabled(false);
    }//GEN-LAST:event_button50ActionPerformed

    private void button51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button51ActionPerformed
        // TODO add your handling code here:
        if(button51.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button51.setBackground(Color.LIGHT_GRAY);                  
        button51.setEnabled(false);
    }//GEN-LAST:event_button51ActionPerformed

    private void button52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button52ActionPerformed
        // TODO add your handling code here:
        if(button52.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button52.setBackground(Color.LIGHT_GRAY);                  
        button52.setEnabled(false);
    }//GEN-LAST:event_button52ActionPerformed

    private void button53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button53ActionPerformed
        // TODO add your handling code here:
        if(button53.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button53.setBackground(Color.LIGHT_GRAY);                  
        button53.setEnabled(false);
    }//GEN-LAST:event_button53ActionPerformed

    private void button54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button54ActionPerformed
        // TODO add your handling code here:
        if(button54.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button54.setBackground(Color.LIGHT_GRAY);                  
        button54.setEnabled(false);
    }//GEN-LAST:event_button54ActionPerformed

    private void button55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button55ActionPerformed
        // TODO add your handling code here:
        if(button55.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button55.setBackground(Color.LIGHT_GRAY);                  
        button55.setEnabled(false);
    }//GEN-LAST:event_button55ActionPerformed

    private void button56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button56ActionPerformed
        // TODO add your handling code here:
        if(button56.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button56.setBackground(Color.LIGHT_GRAY);                  
        button56.setEnabled(false);
    }//GEN-LAST:event_button56ActionPerformed

    private void button57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button57ActionPerformed
        // TODO add your handling code here:
        if(button57.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button57.setBackground(Color.LIGHT_GRAY);                  
        button57.setEnabled(false);
    }//GEN-LAST:event_button57ActionPerformed

    private void button58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button58ActionPerformed
        // TODO add your handling code here:
        if(button58.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button58.setBackground(Color.LIGHT_GRAY);                  
        button58.setEnabled(false);
    }//GEN-LAST:event_button58ActionPerformed

    private void button59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button59ActionPerformed
        // TODO add your handling code here:
        if(button59.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button59.setBackground(Color.LIGHT_GRAY);                  
        button59.setEnabled(false);
    }//GEN-LAST:event_button59ActionPerformed

    private void button60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button60ActionPerformed
        // TODO add your handling code here:
        if(button60.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button60.setBackground(Color.LIGHT_GRAY);                  
        button60.setEnabled(false);
    }//GEN-LAST:event_button60ActionPerformed

    private void button61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button61ActionPerformed
        // TODO add your handling code here:
        if(button61.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button61.setBackground(Color.LIGHT_GRAY);                  
        button61.setEnabled(false);
    }//GEN-LAST:event_button61ActionPerformed

    private void button62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button62ActionPerformed
        // TODO add your handling code here:
        if(button62.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button62.setBackground(Color.LIGHT_GRAY);                  
        button62.setEnabled(false);
    }//GEN-LAST:event_button62ActionPerformed

    private void button63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button63ActionPerformed
        // TODO add your handling code here:
        if(button63.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button63.setBackground(Color.LIGHT_GRAY);                  
        button63.setEnabled(false);
    }//GEN-LAST:event_button63ActionPerformed

    private void button64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button64ActionPerformed
        // TODO add your handling code here:
        if(button64.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button64.setBackground(Color.LIGHT_GRAY);                  
        button64.setEnabled(false);
    }//GEN-LAST:event_button64ActionPerformed

    private void button65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button65ActionPerformed
        // TODO add your handling code here:
        if(button65.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button65.setBackground(Color.LIGHT_GRAY);                  
        button65.setEnabled(false);
    }//GEN-LAST:event_button65ActionPerformed

    private void button66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button66ActionPerformed
        // TODO add your handling code here:
        if(button66.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button66.setBackground(Color.LIGHT_GRAY);                  
        button66.setEnabled(false);
    }//GEN-LAST:event_button66ActionPerformed

    private void button67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button67ActionPerformed
        // TODO add your handling code here:
        if(button67.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button67.setBackground(Color.LIGHT_GRAY);                  
        button67.setEnabled(false);
    }//GEN-LAST:event_button67ActionPerformed

    private void button68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button68ActionPerformed
        // TODO add your handling code here:
        if(button68.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button68.setBackground(Color.LIGHT_GRAY);                  
        button68.setEnabled(false);
    }//GEN-LAST:event_button68ActionPerformed

    private void button69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button69ActionPerformed
        // TODO add your handling code here
        if(button69.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button69.setBackground(Color.LIGHT_GRAY);                  
        button69.setEnabled(false);        
    }//GEN-LAST:event_button69ActionPerformed

    private void button70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button70ActionPerformed
        // TODO add your handling code here:
        if(button70.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button70.setBackground(Color.LIGHT_GRAY);                  
        button70.setEnabled(false);
    }//GEN-LAST:event_button70ActionPerformed

    private void button71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button71ActionPerformed
        // TODO add your handling code here:
        if(button71.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button71.setBackground(Color.LIGHT_GRAY);                  
        button71.setEnabled(false);
    }//GEN-LAST:event_button71ActionPerformed

    private void button72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button72ActionPerformed
        // TODO add your handling code here:
        if(button72.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button72.setBackground(Color.LIGHT_GRAY);                  
        button72.setEnabled(false);
    }//GEN-LAST:event_button72ActionPerformed

    private void button73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button73ActionPerformed
        // TODO add your handling code here:
        if(button73.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button73.setBackground(Color.LIGHT_GRAY);                  
        button73.setEnabled(false);
    }//GEN-LAST:event_button73ActionPerformed

    private void button74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button74ActionPerformed
        // TODO add your handling code here:
        if(button74.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button74.setBackground(Color.LIGHT_GRAY);                  
        button74.setEnabled(false);
    }//GEN-LAST:event_button74ActionPerformed

    private void button75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button75ActionPerformed
        // TODO add your handling code here:
        if(button75.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button75.setBackground(Color.LIGHT_GRAY);                  
        button75.setEnabled(false);
    }//GEN-LAST:event_button75ActionPerformed

    private void button76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button76ActionPerformed
        // TODO add your handling code here:
        if(button76.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button76.setBackground(Color.LIGHT_GRAY);                  
        button76.setEnabled(false);
    }//GEN-LAST:event_button76ActionPerformed

    private void button77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button77ActionPerformed
        // TODO add your handling code here:
        if(button77.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button77.setBackground(Color.LIGHT_GRAY);                  
        button77.setEnabled(false);
    }//GEN-LAST:event_button77ActionPerformed

    private void button78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button78ActionPerformed
        // TODO add your handling code here:
        if(button78.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button78.setBackground(Color.LIGHT_GRAY);                  
        button78.setEnabled(false);
    }//GEN-LAST:event_button78ActionPerformed

    private void button79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button79ActionPerformed
        // TODO add your handling code here:
        if(button79.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button79.setBackground(Color.LIGHT_GRAY);                  
        button79.setEnabled(false);
    }//GEN-LAST:event_button79ActionPerformed

    private void button80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button80ActionPerformed
        // TODO add your handling code here:
        if(button80.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button80.setBackground(Color.LIGHT_GRAY);                  
        button80.setEnabled(false);
    }//GEN-LAST:event_button80ActionPerformed

    private void button81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button81ActionPerformed
        // TODO add your handling code here:
        if(button81.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button81.setBackground(Color.LIGHT_GRAY);                  
        button81.setEnabled(false);
    }//GEN-LAST:event_button81ActionPerformed

    private void button82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button82ActionPerformed
        // TODO add your handling code here:
        if(button82.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button82.setBackground(Color.LIGHT_GRAY);                  
        button82.setEnabled(false);
    }//GEN-LAST:event_button82ActionPerformed

    private void button83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button83ActionPerformed
        // TODO add your handling code here:
        if(button83.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button83.setBackground(Color.LIGHT_GRAY);                  
        button83.setEnabled(false);
    }//GEN-LAST:event_button83ActionPerformed

    private void button84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button84ActionPerformed
        // TODO add your handling code here:
        if(button84.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button84.setBackground(Color.LIGHT_GRAY);                  
        button84.setEnabled(false);
    }//GEN-LAST:event_button84ActionPerformed

    private void button85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button85ActionPerformed
        // TODO add your handling code here:
        if(button85.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button85.setBackground(Color.LIGHT_GRAY);                  
        button85.setEnabled(false);
    }//GEN-LAST:event_button85ActionPerformed

    private void button86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button86ActionPerformed
        // TODO add your handling code here:
        if(button86.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button86.setBackground(Color.LIGHT_GRAY);                  
        button86.setEnabled(false);
    }//GEN-LAST:event_button86ActionPerformed

    private void button87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button87ActionPerformed
        // TODO add your handling code here:
        if(button87.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button87.setBackground(Color.LIGHT_GRAY);                  
        button87.setEnabled(false);
    }//GEN-LAST:event_button87ActionPerformed

    private void button88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button88ActionPerformed
        // TODO add your handling code here:        
        if(button88.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button88.setBackground(Color.LIGHT_GRAY);                  
        button88.setEnabled(false);
    }//GEN-LAST:event_button88ActionPerformed

    private void button89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button89ActionPerformed
        // TODO add your handling code here:
        if(button89.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button89.setBackground(Color.LIGHT_GRAY);                  
        button89.setEnabled(false);
    }//GEN-LAST:event_button89ActionPerformed

    private void button90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button90ActionPerformed
        // TODO add your handling code here:
        if(button90.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button90.setBackground(Color.LIGHT_GRAY);                  
        button90.setEnabled(false);
    }//GEN-LAST:event_button90ActionPerformed

    private void button91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button91ActionPerformed
        // TODO add your handling code here:
        if(button91.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button91.setBackground(Color.LIGHT_GRAY);                  
        button91.setEnabled(false);
    }//GEN-LAST:event_button91ActionPerformed

    private void button92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button92ActionPerformed
        // TODO add your handling code here:
        if(button92.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button92.setBackground(Color.LIGHT_GRAY);                  
        button92.setEnabled(false);
    }//GEN-LAST:event_button92ActionPerformed

    private void button93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button93ActionPerformed
        // TODO add your handling code here:
        if(button93.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button93.setBackground(Color.LIGHT_GRAY);                  
        button93.setEnabled(false);
    }//GEN-LAST:event_button93ActionPerformed

    private void button94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button94ActionPerformed
        // TODO add your handling code here:
        if(button94.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button94.setBackground(Color.LIGHT_GRAY);                  
        button94.setEnabled(false);
    }//GEN-LAST:event_button94ActionPerformed

    private void button95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button95ActionPerformed
        // TODO add your handling code here:
        if(button95.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button95.setBackground(Color.LIGHT_GRAY);                  
        button95.setEnabled(false);
    }//GEN-LAST:event_button95ActionPerformed

    private void button96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button96ActionPerformed
        // TODO add your handling code here:
        if(button96.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button96.setBackground(Color.LIGHT_GRAY);                  
        button96.setEnabled(false);
    }//GEN-LAST:event_button96ActionPerformed

    private void button97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button97ActionPerformed
        // TODO add your handling code here:
        if(button97.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button97.setBackground(Color.LIGHT_GRAY);                  
        button97.setEnabled(false);
    }//GEN-LAST:event_button97ActionPerformed

    private void button98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button98ActionPerformed
        // TODO add your handling code here:
        if(button98.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button98.setBackground(Color.LIGHT_GRAY);                  
        button98.setEnabled(false);
    }//GEN-LAST:event_button98ActionPerformed

    private void button99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button99ActionPerformed
        // TODO add your handling code here:
        if(button99.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button99.setBackground(Color.LIGHT_GRAY);                  
        button99.setEnabled(false);
    }//GEN-LAST:event_button99ActionPerformed

    private void button100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button100ActionPerformed
        // TODO add your handling code here:
        if(button100.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button100.setBackground(Color.LIGHT_GRAY);                  
        button100.setEnabled(false);
    }//GEN-LAST:event_button100ActionPerformed

    private void button101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button101ActionPerformed
        // TODO add your handling code here:
        if(button101.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button101.setBackground(Color.LIGHT_GRAY);                  
        button101.setEnabled(false);
    }//GEN-LAST:event_button101ActionPerformed

    private void button102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button102ActionPerformed
        // TODO add your handling code here:
        if(button102.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button102.setBackground(Color.LIGHT_GRAY);                  
        button102.setEnabled(false);
    }//GEN-LAST:event_button102ActionPerformed

    private void button103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button103ActionPerformed
        // TODO add your handling code here:
        if(button103.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button103.setBackground(Color.LIGHT_GRAY);                  
        button103.setEnabled(false);
    }//GEN-LAST:event_button103ActionPerformed

    private void button104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button104ActionPerformed
        // TODO add your handling code here:
        if(button104.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button104.setBackground(Color.LIGHT_GRAY);                  
        button104.setEnabled(false);
    }//GEN-LAST:event_button104ActionPerformed

    private void button105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button105ActionPerformed
        // TODO add your handling code here:
        if(button105.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button105.setBackground(Color.LIGHT_GRAY);                  
        button105.setEnabled(false);
    }//GEN-LAST:event_button105ActionPerformed

    private void button106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button106ActionPerformed
        // TODO add your handling code here:
        if(button106.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button106.setBackground(Color.LIGHT_GRAY);                  
        button106.setEnabled(false);
    }//GEN-LAST:event_button106ActionPerformed

    private void button107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button107ActionPerformed
        // TODO add your handling code here:
        if(button107.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button107.setBackground(Color.LIGHT_GRAY);                  
        button107.setEnabled(false);
    }//GEN-LAST:event_button107ActionPerformed

    private void button108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button108ActionPerformed
        // TODO add your handling code here:
        if(button108.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button108.setBackground(Color.LIGHT_GRAY);                  
        button108.setEnabled(false);
    }//GEN-LAST:event_button108ActionPerformed

    private void button109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button109ActionPerformed
        // TODO add your handling code here:
        if(button109.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button109.setBackground(Color.LIGHT_GRAY);                  
        button109.setEnabled(false);
    }//GEN-LAST:event_button109ActionPerformed

    private void button110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button110ActionPerformed
        // TODO add your handling code here:
        if(button110.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button110.setBackground(Color.LIGHT_GRAY);                  
        button110.setEnabled(false);
    }//GEN-LAST:event_button110ActionPerformed

    private void button111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button111ActionPerformed
        // TODO add your handling code here:
        if(button111.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button111.setBackground(Color.LIGHT_GRAY);                  
        button111.setEnabled(false);
    }//GEN-LAST:event_button111ActionPerformed

    private void button112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button112ActionPerformed
        // TODO add your handling code here:
        if(button112.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button112.setBackground(Color.LIGHT_GRAY);                  
        button112.setEnabled(false);
    }//GEN-LAST:event_button112ActionPerformed

    private void button113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button113ActionPerformed
        // TODO add your handling code here:
        if(button113.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button113.setBackground(Color.LIGHT_GRAY);                  
        button113.setEnabled(false);
    }//GEN-LAST:event_button113ActionPerformed

    private void button114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button114ActionPerformed
        // TODO add your handling code here:
        if(button114.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button114.setBackground(Color.LIGHT_GRAY);                  
        button114.setEnabled(false);
    }//GEN-LAST:event_button114ActionPerformed

    private void button115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button115ActionPerformed
        // TODO add your handling code here:
        if(button115.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button115.setBackground(Color.LIGHT_GRAY);                  
        button115.setEnabled(false);
    }//GEN-LAST:event_button115ActionPerformed

    private void button116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button116ActionPerformed
        // TODO add your handling code here:
        if(button116.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button116.setBackground(Color.LIGHT_GRAY);                  
        button116.setEnabled(false);
    }//GEN-LAST:event_button116ActionPerformed

    private void button117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button117ActionPerformed
        // TODO add your handling code here:
        if(button117.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button117.setBackground(Color.LIGHT_GRAY);                  
        button117.setEnabled(false);
    }//GEN-LAST:event_button117ActionPerformed

    private void button118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button118ActionPerformed
        // TODO add your handling code here:
        if(button118.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button118.setBackground(Color.LIGHT_GRAY);                  
        button118.setEnabled(false);
    }//GEN-LAST:event_button118ActionPerformed

    private void button119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button119ActionPerformed
        // TODO add your handling code here:
        if(button119.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button119.setBackground(Color.LIGHT_GRAY);                  
        button119.setEnabled(false);
    }//GEN-LAST:event_button119ActionPerformed

    private void button120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button120ActionPerformed
        // TODO add your handling code here:
        if(button120.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button120.setBackground(Color.LIGHT_GRAY);                  
        button120.setEnabled(false);
    }//GEN-LAST:event_button120ActionPerformed

    private void button121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button121ActionPerformed
        // TODO add your handling code here:
        if(button121.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button121.setBackground(Color.LIGHT_GRAY);                  
        button121.setEnabled(false);
    }//GEN-LAST:event_button121ActionPerformed

    private void button122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button122ActionPerformed
        // TODO add your handling code here:
        if(button122.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button122.setBackground(Color.LIGHT_GRAY);                  
        button122.setEnabled(false);
    }//GEN-LAST:event_button122ActionPerformed

    private void button123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button123ActionPerformed
        // TODO add your handling code here:
        if(button123.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button123.setBackground(Color.LIGHT_GRAY);                  
        button123.setEnabled(false);
    }//GEN-LAST:event_button123ActionPerformed

    private void button124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button124ActionPerformed
        // TODO add your handling code here:
        if(button124.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button124.setBackground(Color.LIGHT_GRAY);                  
        button124.setEnabled(false);
    }//GEN-LAST:event_button124ActionPerformed

    private void button125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button125ActionPerformed
        // TODO add your handling code here:
        if(button125.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button125.setBackground(Color.LIGHT_GRAY);                  
        button125.setEnabled(false);
    }//GEN-LAST:event_button125ActionPerformed

    private void button126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button126ActionPerformed
        // TODO add your handling code here:
        if(button126.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button126.setBackground(Color.LIGHT_GRAY);                  
        button126.setEnabled(false);
    }//GEN-LAST:event_button126ActionPerformed

    private void button127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button127ActionPerformed
        // TODO add your handling code here:
        if(button127.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button127.setBackground(Color.LIGHT_GRAY);                  
        button127.setEnabled(false);
    }//GEN-LAST:event_button127ActionPerformed

    private void button128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button128ActionPerformed
        // TODO add your handling code here:
        if(button128.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button128.setBackground(Color.LIGHT_GRAY);                  
        button128.setEnabled(false);
    }//GEN-LAST:event_button128ActionPerformed

    private void button129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button129ActionPerformed
        // TODO add your handling code here:
        if(button129.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button129.setBackground(Color.LIGHT_GRAY);                  
        button129.setEnabled(false);
    }//GEN-LAST:event_button129ActionPerformed

    private void button130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button130ActionPerformed
        // TODO add your handling code here:
        if(button130.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button130.setBackground(Color.LIGHT_GRAY);                  
        button130.setEnabled(false);
    }//GEN-LAST:event_button130ActionPerformed

    private void button131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button131ActionPerformed
        // TODO add your handling code here:
        if(button131.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button131.setBackground(Color.LIGHT_GRAY);                  
        button131.setEnabled(false);
    }//GEN-LAST:event_button131ActionPerformed

    private void button132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button132ActionPerformed
        // TODO add your handling code here:
        if(button132.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button132.setBackground(Color.LIGHT_GRAY);                  
        button132.setEnabled(false);
    }//GEN-LAST:event_button132ActionPerformed

    private void button133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button133ActionPerformed
        // TODO add your handling code here:
        if(button133.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button133.setBackground(Color.LIGHT_GRAY);                  
        button133.setEnabled(false);
    }//GEN-LAST:event_button133ActionPerformed

    private void button134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button134ActionPerformed
        // TODO add your handling code here:
        if(button134.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button134.setBackground(Color.LIGHT_GRAY);                  
        button134.setEnabled(false);
    }//GEN-LAST:event_button134ActionPerformed

    private void button135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button135ActionPerformed
        // TODO add your handling code here:
        if(button135.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button135.setBackground(Color.LIGHT_GRAY);                  
        button135.setEnabled(false);
    }//GEN-LAST:event_button135ActionPerformed

    private void button136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button136ActionPerformed
        // TODO add your handling code here:
        if(button136.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button136.setBackground(Color.LIGHT_GRAY);                  
        button136.setEnabled(false);
    }//GEN-LAST:event_button136ActionPerformed

    private void button137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button137ActionPerformed
        // TODO add your handling code here:
        if(button137.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button137.setBackground(Color.LIGHT_GRAY);                  
        button137.setEnabled(false);
    }//GEN-LAST:event_button137ActionPerformed

    private void button138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button138ActionPerformed
        // TODO add your handling code here:
        if(button138.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button138.setBackground(Color.LIGHT_GRAY);                  
        button138.setEnabled(false);
    }//GEN-LAST:event_button138ActionPerformed

    private void button139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button139ActionPerformed
        // TODO add your handling code here:
        if(button139.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button139.setBackground(Color.LIGHT_GRAY);                  
        button139.setEnabled(false);
    }//GEN-LAST:event_button139ActionPerformed

    private void button140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button140ActionPerformed
        // TODO add your handling code here:
        if(button140.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button140.setBackground(Color.LIGHT_GRAY);                  
        button140.setEnabled(false);
    }//GEN-LAST:event_button140ActionPerformed

    private void button141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button141ActionPerformed
        // TODO add your handling code here:
        if(button141.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button141.setBackground(Color.LIGHT_GRAY);                  
        button141.setEnabled(false);
    }//GEN-LAST:event_button141ActionPerformed

    private void button142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button142ActionPerformed
        // TODO add your handling code here:
        if(button142.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button142.setBackground(Color.LIGHT_GRAY);                  
        button142.setEnabled(false);
    }//GEN-LAST:event_button142ActionPerformed

    private void button143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button143ActionPerformed
        // TODO add your handling code here:
        if(button143.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button143.setBackground(Color.LIGHT_GRAY);                  
        button143.setEnabled(false);
    }//GEN-LAST:event_button143ActionPerformed

    private void button144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button144ActionPerformed
        // TODO add your handling code here:
        if(button144.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button144.setBackground(Color.LIGHT_GRAY);                  
        button144.setEnabled(false);
    }//GEN-LAST:event_button144ActionPerformed

    private void button145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button145ActionPerformed
        // TODO add your handling code here:
        if(button145.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button145.setBackground(Color.LIGHT_GRAY);                  
        button145.setEnabled(false);
    }//GEN-LAST:event_button145ActionPerformed

    private void button146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button146ActionPerformed
        // TODO add your handling code here:
        if(button146.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button146.setBackground(Color.LIGHT_GRAY);                  
        button146.setEnabled(false);
    }//GEN-LAST:event_button146ActionPerformed

    private void button147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button147ActionPerformed
        // TODO add your handling code here:
        if(button147.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button147.setBackground(Color.LIGHT_GRAY);                  
        button147.setEnabled(false);
    }//GEN-LAST:event_button147ActionPerformed

    private void button148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button148ActionPerformed
        // TODO add your handling code here:
        if(button148.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button148.setBackground(Color.LIGHT_GRAY);                  
        button148.setEnabled(false);
    }//GEN-LAST:event_button148ActionPerformed

    private void button149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button149ActionPerformed
        // TODO add your handling code here:
        if(button149.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button149.setBackground(Color.LIGHT_GRAY);                  
        button149.setEnabled(false);
    }//GEN-LAST:event_button149ActionPerformed

    private void button150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button150ActionPerformed
        // TODO add your handling code here:
        if(button150.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button150.setBackground(Color.LIGHT_GRAY);                  
        button150.setEnabled(false);
    }//GEN-LAST:event_button150ActionPerformed

    private void button151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button151ActionPerformed
        // TODO add your handling code here:
        if(button151.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button151.setBackground(Color.LIGHT_GRAY);                  
        button151.setEnabled(false);
    }//GEN-LAST:event_button151ActionPerformed

    private void button152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button152ActionPerformed
        // TODO add your handling code here:
        if(button152.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button152.setBackground(Color.LIGHT_GRAY);                  
        button152.setEnabled(false);
    }//GEN-LAST:event_button152ActionPerformed

    private void button153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button153ActionPerformed
        // TODO add your handling code here:
        if(button153.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button153.setBackground(Color.LIGHT_GRAY);                  
        button153.setEnabled(false);
    }//GEN-LAST:event_button153ActionPerformed

    private void button154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button154ActionPerformed
        // TODO add your handling code here:
        if(button154.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button154.setBackground(Color.LIGHT_GRAY);                  
        button154.setEnabled(false);
    }//GEN-LAST:event_button154ActionPerformed

    private void button155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button155ActionPerformed
        // TODO add your handling code here:
        if(button155.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button155.setBackground(Color.LIGHT_GRAY);                  
        button155.setEnabled(false);
    }//GEN-LAST:event_button155ActionPerformed

    private void button156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button156ActionPerformed
        // TODO add your handling code here:
        if(button156.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button156.setBackground(Color.LIGHT_GRAY);                  
        button156.setEnabled(false);
    }//GEN-LAST:event_button156ActionPerformed

    private void button157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button157ActionPerformed
        // TODO add your handling code here:
        if(button157.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button157.setBackground(Color.LIGHT_GRAY);                  
        button157.setEnabled(false);
    }//GEN-LAST:event_button157ActionPerformed

    private void button158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button158ActionPerformed
        // TODO add your handling code here:
        if(button158.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button158.setBackground(Color.LIGHT_GRAY);                  
        button158.setEnabled(false);
    }//GEN-LAST:event_button158ActionPerformed

    private void button159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button159ActionPerformed
        // TODO add your handling code here:
        if(button159.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button159.setBackground(Color.LIGHT_GRAY);                  
        button159.setEnabled(false);
    }//GEN-LAST:event_button159ActionPerformed

    private void button160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button160ActionPerformed
        // TODO add your handling code here:
        if(button160.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button160.setBackground(Color.LIGHT_GRAY);                  
        button160.setEnabled(false);
    }//GEN-LAST:event_button160ActionPerformed

    private void button161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button161ActionPerformed
        // TODO add your handling code here:
        if(button161.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button161.setBackground(Color.LIGHT_GRAY);                  
        button161.setEnabled(false);
    }//GEN-LAST:event_button161ActionPerformed

    private void button162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button162ActionPerformed
        // TODO add your handling code here:
        if(button162.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button162.setBackground(Color.LIGHT_GRAY);                  
        button162.setEnabled(false);
    }//GEN-LAST:event_button162ActionPerformed

    private void button163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button163ActionPerformed
        // TODO add your handling code here:
        if(button163.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button163.setBackground(Color.LIGHT_GRAY);                  
        button163.setEnabled(false);
    }//GEN-LAST:event_button163ActionPerformed

    private void button164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button164ActionPerformed
        // TODO add your handling code here:
        if(button164.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button164.setBackground(Color.LIGHT_GRAY);                  
        button164.setEnabled(false);
    }//GEN-LAST:event_button164ActionPerformed

    private void button165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button165ActionPerformed
        // TODO add your handling code here:
        if(button165.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button165.setBackground(Color.LIGHT_GRAY);                  
        button165.setEnabled(false);
    }//GEN-LAST:event_button165ActionPerformed

    private void button166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button166ActionPerformed
        // TODO add your handling code here:
        if(button166.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button166.setBackground(Color.LIGHT_GRAY);                  
        button166.setEnabled(false);
    }//GEN-LAST:event_button166ActionPerformed

    private void button167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button167ActionPerformed
        // TODO add your handling code here:
        if(button167.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button167.setBackground(Color.LIGHT_GRAY);                  
        button167.setEnabled(false);
    }//GEN-LAST:event_button167ActionPerformed

    private void button168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button168ActionPerformed
        // TODO add your handling code here:
        if(button168.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button168.setBackground(Color.LIGHT_GRAY);                  
        button168.setEnabled(false);
    }//GEN-LAST:event_button168ActionPerformed

    private void button169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button169ActionPerformed
        // TODO add your handling code here:
        if(button169.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button169.setBackground(Color.LIGHT_GRAY);                  
        button169.setEnabled(false);
    }//GEN-LAST:event_button169ActionPerformed

    private void button170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button170ActionPerformed
        // TODO add your handling code here:
        if(button170.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button170.setBackground(Color.LIGHT_GRAY);                  
        button170.setEnabled(false);
    }//GEN-LAST:event_button170ActionPerformed

    private void button171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button171ActionPerformed
        // TODO add your handling code here:
        if(button171.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button171.setBackground(Color.LIGHT_GRAY);                  
        button171.setEnabled(false);
    }//GEN-LAST:event_button171ActionPerformed

    private void button172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button172ActionPerformed
        // TODO add your handling code here:
        if(button172.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button172.setBackground(Color.LIGHT_GRAY);                  
        button172.setEnabled(false);
    }//GEN-LAST:event_button172ActionPerformed

    private void button173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button173ActionPerformed
        // TODO add your handling code here:
        if(button173.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button173.setBackground(Color.LIGHT_GRAY);                  
        button173.setEnabled(false);
    }//GEN-LAST:event_button173ActionPerformed

    private void button174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button174ActionPerformed
        // TODO add your handling code here:
        if(button174.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button174.setBackground(Color.LIGHT_GRAY);                  
        button174.setEnabled(false);
    }//GEN-LAST:event_button174ActionPerformed

    private void button175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button175ActionPerformed
        // TODO add your handling code here:
        if(button175.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button175.setBackground(Color.LIGHT_GRAY);                  
        button175.setEnabled(false);
    }//GEN-LAST:event_button175ActionPerformed

    private void button176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button176ActionPerformed
        // TODO add your handling code here:
        if(button176.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button176.setBackground(Color.LIGHT_GRAY);                  
        button176.setEnabled(false);
    }//GEN-LAST:event_button176ActionPerformed

    private void button177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button177ActionPerformed
        // TODO add your handling code here:
        if(button177.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button177.setBackground(Color.LIGHT_GRAY);                  
        button177.setEnabled(false);
    }//GEN-LAST:event_button177ActionPerformed

    private void button178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button178ActionPerformed
        // TODO add your handling code here:
        if(button178.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button178.setBackground(Color.LIGHT_GRAY);                  
        button178.setEnabled(false);
    }//GEN-LAST:event_button178ActionPerformed

    private void button179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button179ActionPerformed
        // TODO add your handling code here:
        if(button179.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button179.setBackground(Color.LIGHT_GRAY);                  
        button179.setEnabled(false);
    }//GEN-LAST:event_button179ActionPerformed

    private void button180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button180ActionPerformed
        // TODO add your handling code here:
        if(button180.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button180.setBackground(Color.LIGHT_GRAY);                  
        button180.setEnabled(false);
    }//GEN-LAST:event_button180ActionPerformed

    private void button181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button181ActionPerformed
        // TODO add your handling code here:
        if(button181.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button181.setBackground(Color.LIGHT_GRAY);                  
        button181.setEnabled(false);
    }//GEN-LAST:event_button181ActionPerformed

    private void button182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button182ActionPerformed
        // TODO add your handling code here:
        if(button182.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button182.setBackground(Color.LIGHT_GRAY);                  
        button182.setEnabled(false);
    }//GEN-LAST:event_button182ActionPerformed

    private void button183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button183ActionPerformed
        // TODO add your handling code here:
        if(button183.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button183.setBackground(Color.LIGHT_GRAY);                  
        button183.setEnabled(false);
    }//GEN-LAST:event_button183ActionPerformed

    private void button184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button184ActionPerformed
        // TODO add your handling code here:
        if(button184.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button184.setBackground(Color.LIGHT_GRAY);                  
        button184.setEnabled(false);
    }//GEN-LAST:event_button184ActionPerformed

    private void button185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button185ActionPerformed
        // TODO add your handling code here:
        if(button185.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button185.setBackground(Color.LIGHT_GRAY);                  
        button185.setEnabled(false);
    }//GEN-LAST:event_button185ActionPerformed

    private void button186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button186ActionPerformed
        // TODO add your handling code here:
        if(button186.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button186.setBackground(Color.LIGHT_GRAY);                  
        button186.setEnabled(false);
    }//GEN-LAST:event_button186ActionPerformed

    private void button187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button187ActionPerformed
        // TODO add your handling code here:
        if(button187.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button187.setBackground(Color.LIGHT_GRAY);                  
        button187.setEnabled(false);
    }//GEN-LAST:event_button187ActionPerformed

    private void button188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button188ActionPerformed
        // TODO add your handling code here:
        if(button188.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button188.setBackground(Color.LIGHT_GRAY);                  
        button188.setEnabled(false);
    }//GEN-LAST:event_button188ActionPerformed

    private void button189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button189ActionPerformed
        // TODO add your handling code here:
        if(button189.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button189.setBackground(Color.LIGHT_GRAY);                  
        button189.setEnabled(false);
    }//GEN-LAST:event_button189ActionPerformed

    private void button190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button190ActionPerformed
        // TODO add your handling code here:
        if(button190.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button190.setBackground(Color.LIGHT_GRAY);                  
        button190.setEnabled(false);
    }//GEN-LAST:event_button190ActionPerformed

    private void button191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button191ActionPerformed
        // TODO add your handling code here:
        if(button191.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button191.setBackground(Color.LIGHT_GRAY);                  
        button191.setEnabled(false);
    }//GEN-LAST:event_button191ActionPerformed

    private void button192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button192ActionPerformed
        // TODO add your handling code here:
        if(button192.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button192.setBackground(Color.LIGHT_GRAY);                  
        button192.setEnabled(false);
    }//GEN-LAST:event_button192ActionPerformed

    private void button193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button193ActionPerformed
        // TODO add your handling code here:
        if(button193.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button193.setBackground(Color.LIGHT_GRAY);                  
        button193.setEnabled(false);
    }//GEN-LAST:event_button193ActionPerformed

    private void button194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button194ActionPerformed
        // TODO add your handling code here:
        if(button194.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button194.setBackground(Color.LIGHT_GRAY);                  
        button194.setEnabled(false);
    }//GEN-LAST:event_button194ActionPerformed

    private void button195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button195ActionPerformed
        // TODO add your handling code here:
        if(button195.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button195.setBackground(Color.LIGHT_GRAY);                  
        button195.setEnabled(false);
    }//GEN-LAST:event_button195ActionPerformed

    private void button196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button196ActionPerformed
        // TODO add your handling code here:
        if(button196.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button196.setBackground(Color.LIGHT_GRAY);                  
        button196.setEnabled(false);
    }//GEN-LAST:event_button196ActionPerformed

    private void button197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button197ActionPerformed
        // TODO add your handling code here:
        if(button197.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button197.setBackground(Color.LIGHT_GRAY);                  
        button197.setEnabled(false);
    }//GEN-LAST:event_button197ActionPerformed

    private void button198ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button198ActionPerformed
        // TODO add your handling code here:
        if(button198.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button198.setBackground(Color.LIGHT_GRAY);                  
        button198.setEnabled(false);
    }//GEN-LAST:event_button198ActionPerformed

    private void button199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button199ActionPerformed
        // TODO add your handling code here:
        if(button199.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button199.setBackground(Color.LIGHT_GRAY);                  
        button199.setEnabled(false);
    }//GEN-LAST:event_button199ActionPerformed

    private void button200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button200ActionPerformed
        // TODO add your handling code here:
        if(button200.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button200.setBackground(Color.LIGHT_GRAY);                  
        button200.setEnabled(false);
    }//GEN-LAST:event_button200ActionPerformed

    private void button201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button201ActionPerformed
        // TODO add your handling code here:
        if(button201.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button201.setBackground(Color.LIGHT_GRAY);                  
        button201.setEnabled(false);
    }//GEN-LAST:event_button201ActionPerformed

    private void button202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button202ActionPerformed
        // TODO add your handling code here:
        if(button202.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button202.setBackground(Color.LIGHT_GRAY);                  
        button202.setEnabled(false);
    }//GEN-LAST:event_button202ActionPerformed

    private void button203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button203ActionPerformed
        // TODO add your handling code here:
        if(button203.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button203.setBackground(Color.LIGHT_GRAY);                  
        button203.setEnabled(false);
    }//GEN-LAST:event_button203ActionPerformed

    private void button204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button204ActionPerformed
        // TODO add your handling code here:
        if(button204.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button204.setBackground(Color.LIGHT_GRAY);                  
        button204.setEnabled(false);
    }//GEN-LAST:event_button204ActionPerformed

    private void button205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button205ActionPerformed
        // TODO add your handling code here:
        if(button205.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button205.setBackground(Color.LIGHT_GRAY);                  
        button205.setEnabled(false);
    }//GEN-LAST:event_button205ActionPerformed

    private void button206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button206ActionPerformed
        // TODO add your handling code here:
        if(button206.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button206.setBackground(Color.LIGHT_GRAY);                  
        button206.setEnabled(false);
    }//GEN-LAST:event_button206ActionPerformed

    private void button207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button207ActionPerformed
        // TODO add your handling code here:
        if(button207.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button207.setBackground(Color.LIGHT_GRAY);                  
        button207.setEnabled(false);
    }//GEN-LAST:event_button207ActionPerformed

    private void button208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button208ActionPerformed
        // TODO add your handling code here:
        if(button208.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button208.setBackground(Color.LIGHT_GRAY);                  
        button208.setEnabled(false);
    }//GEN-LAST:event_button208ActionPerformed

    private void button209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button209ActionPerformed
        // TODO add your handling code here:
        if(button209.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button209.setBackground(Color.LIGHT_GRAY);                  
        button209.setEnabled(false);
    }//GEN-LAST:event_button209ActionPerformed

    private void button210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button210ActionPerformed
        // TODO add your handling code here:
        if(button210.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button210.setBackground(Color.LIGHT_GRAY);                  
        button210.setEnabled(false);
    }//GEN-LAST:event_button210ActionPerformed

    private void button211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button211ActionPerformed
        // TODO add your handling code here:
        if(button211.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button211.setBackground(Color.LIGHT_GRAY);                  
        button211.setEnabled(false);
    }//GEN-LAST:event_button211ActionPerformed

    private void button212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button212ActionPerformed
        // TODO add your handling code here:
        if(button212.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button212.setBackground(Color.LIGHT_GRAY);                  
        button212.setEnabled(false);
    }//GEN-LAST:event_button212ActionPerformed

    private void button213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button213ActionPerformed
        // TODO add your handling code here:
        if(button213.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button213.setBackground(Color.LIGHT_GRAY);                  
        button213.setEnabled(false);
    }//GEN-LAST:event_button213ActionPerformed

    private void button214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button214ActionPerformed
        // TODO add your handling code here:
        if(button214.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button214.setBackground(Color.LIGHT_GRAY);                  
        button214.setEnabled(false);
    }//GEN-LAST:event_button214ActionPerformed

    private void button215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button215ActionPerformed
        // TODO add your handling code here:
        if(button215.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button215.setBackground(Color.LIGHT_GRAY);                  
        button215.setEnabled(false);
    }//GEN-LAST:event_button215ActionPerformed

    private void button216ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button216ActionPerformed
        // TODO add your handling code here:
        if(button216.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button216.setBackground(Color.LIGHT_GRAY);                  
        button216.setEnabled(false);
    }//GEN-LAST:event_button216ActionPerformed

    private void button217ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button217ActionPerformed
        // TODO add your handling code here:
        if(button217.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button217.setBackground(Color.LIGHT_GRAY);                  
        button217.setEnabled(false);
    }//GEN-LAST:event_button217ActionPerformed

    private void button218ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button218ActionPerformed
        // TODO add your handling code here:
        if(button218.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button218.setBackground(Color.LIGHT_GRAY);                  
        button218.setEnabled(false);
    }//GEN-LAST:event_button218ActionPerformed

    private void button219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button219ActionPerformed
        // TODO add your handling code here:
        if(button219.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button219.setBackground(Color.LIGHT_GRAY);                  
        button219.setEnabled(false);
    }//GEN-LAST:event_button219ActionPerformed

    private void button220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button220ActionPerformed
        // TODO add your handling code here:
        if(button220.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button220.setBackground(Color.LIGHT_GRAY);                  
        button220.setEnabled(false);
    }//GEN-LAST:event_button220ActionPerformed

    private void button221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button221ActionPerformed
        // TODO add your handling code here:
        if(button221.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button221.setBackground(Color.LIGHT_GRAY);                  
        button221.setEnabled(false);
    }//GEN-LAST:event_button221ActionPerformed

    private void button222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button222ActionPerformed
        // TODO add your handling code here:
        if(button222.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button222.setBackground(Color.LIGHT_GRAY);                  
        button222.setEnabled(false);
    }//GEN-LAST:event_button222ActionPerformed

    private void button223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button223ActionPerformed
        // TODO add your handling code here:
        if(button223.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button223.setBackground(Color.LIGHT_GRAY);                  
        button223.setEnabled(false);
    }//GEN-LAST:event_button223ActionPerformed

    private void button224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button224ActionPerformed
        // TODO add your handling code here:
        if(button224.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button224.setBackground(Color.LIGHT_GRAY);                  
        button224.setEnabled(false);
    }//GEN-LAST:event_button224ActionPerformed

    private void button225ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button225ActionPerformed
        // TODO add your handling code here:
        if(button225.getLabel().equals("*")){
          JOptionPane.showMessageDialog(null, "Game Over!!!!!!");
          jPanel1.setVisible(false);
          
        } 
        button225.setBackground(Color.LIGHT_GRAY);                  
        button225.setEnabled(false);
    }//GEN-LAST:event_button225ActionPerformed

    private void jNormalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNormalRadioButtonActionPerformed
        // TODO add your handling code here:
        if (jNormalRadioButton.isSelected()) {
            maxRandom = 7;
            jNormalRadioButton.setEnabled(false);
            jHardRadioButton.setEnabled(false);
            jImpossibleRadioButton.setEnabled(false);
            setEnabled();
            setMines();
            setNumbers();
            setValues();
            rightClick();
        }
    }//GEN-LAST:event_jNormalRadioButtonActionPerformed

    private void jHardRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHardRadioButtonActionPerformed
        // TODO add your handling code here:
        if (jHardRadioButton.isSelected()) {
            maxRandom = 5;
            jNormalRadioButton.setEnabled(false);
            jHardRadioButton.setEnabled(false);
            jImpossibleRadioButton.setEnabled(false);
            setEnabled();
            setMines();
            setNumbers();
            setValues();
            rightClick();
        }
    }//GEN-LAST:event_jHardRadioButtonActionPerformed

    private void jImpossibleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImpossibleRadioButtonActionPerformed
        // TODO add your handling code here:
        if (jImpossibleRadioButton.isSelected()) {
            maxRandom = 3;
            jNormalRadioButton.setEnabled(false);
            jHardRadioButton.setEnabled(false);
            jImpossibleRadioButton.setEnabled(false);
            setEnabled();
            setMines();
            setNumbers();
            setValues();
            rightClick();
        }
    }//GEN-LAST:event_jImpossibleRadioButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mineSweeperJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mineSweeperJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mineSweeperJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mineSweeperJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mineSweeperJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button100;
    private java.awt.Button button101;
    private java.awt.Button button102;
    private java.awt.Button button103;
    private java.awt.Button button104;
    private java.awt.Button button105;
    private java.awt.Button button106;
    private java.awt.Button button107;
    private java.awt.Button button108;
    private java.awt.Button button109;
    private java.awt.Button button11;
    private java.awt.Button button110;
    private java.awt.Button button111;
    private java.awt.Button button112;
    private java.awt.Button button113;
    private java.awt.Button button114;
    private java.awt.Button button115;
    private java.awt.Button button116;
    private java.awt.Button button117;
    private java.awt.Button button118;
    private java.awt.Button button119;
    private java.awt.Button button12;
    private java.awt.Button button120;
    private java.awt.Button button121;
    private java.awt.Button button122;
    private java.awt.Button button123;
    private java.awt.Button button124;
    private java.awt.Button button125;
    private java.awt.Button button126;
    private java.awt.Button button127;
    private java.awt.Button button128;
    private java.awt.Button button129;
    private java.awt.Button button13;
    private java.awt.Button button130;
    private java.awt.Button button131;
    private java.awt.Button button132;
    private java.awt.Button button133;
    private java.awt.Button button134;
    private java.awt.Button button135;
    private java.awt.Button button136;
    private java.awt.Button button137;
    private java.awt.Button button138;
    private java.awt.Button button139;
    private java.awt.Button button14;
    private java.awt.Button button140;
    private java.awt.Button button141;
    private java.awt.Button button142;
    private java.awt.Button button143;
    private java.awt.Button button144;
    private java.awt.Button button145;
    private java.awt.Button button146;
    private java.awt.Button button147;
    private java.awt.Button button148;
    private java.awt.Button button149;
    private java.awt.Button button15;
    private java.awt.Button button150;
    private java.awt.Button button151;
    private java.awt.Button button152;
    private java.awt.Button button153;
    private java.awt.Button button154;
    private java.awt.Button button155;
    private java.awt.Button button156;
    private java.awt.Button button157;
    private java.awt.Button button158;
    private java.awt.Button button159;
    private java.awt.Button button16;
    private java.awt.Button button160;
    private java.awt.Button button161;
    private java.awt.Button button162;
    private java.awt.Button button163;
    private java.awt.Button button164;
    private java.awt.Button button165;
    private java.awt.Button button166;
    private java.awt.Button button167;
    private java.awt.Button button168;
    private java.awt.Button button169;
    private java.awt.Button button17;
    private java.awt.Button button170;
    private java.awt.Button button171;
    private java.awt.Button button172;
    private java.awt.Button button173;
    private java.awt.Button button174;
    private java.awt.Button button175;
    private java.awt.Button button176;
    private java.awt.Button button177;
    private java.awt.Button button178;
    private java.awt.Button button179;
    private java.awt.Button button18;
    private java.awt.Button button180;
    private java.awt.Button button181;
    private java.awt.Button button182;
    private java.awt.Button button183;
    private java.awt.Button button184;
    private java.awt.Button button185;
    private java.awt.Button button186;
    private java.awt.Button button187;
    private java.awt.Button button188;
    private java.awt.Button button189;
    private java.awt.Button button19;
    private java.awt.Button button190;
    private java.awt.Button button191;
    private java.awt.Button button192;
    private java.awt.Button button193;
    private java.awt.Button button194;
    private java.awt.Button button195;
    private java.awt.Button button196;
    private java.awt.Button button197;
    private java.awt.Button button198;
    private java.awt.Button button199;
    private java.awt.Button button2;
    private java.awt.Button button20;
    private java.awt.Button button200;
    private java.awt.Button button201;
    private java.awt.Button button202;
    private java.awt.Button button203;
    private java.awt.Button button204;
    private java.awt.Button button205;
    private java.awt.Button button206;
    private java.awt.Button button207;
    private java.awt.Button button208;
    private java.awt.Button button209;
    private java.awt.Button button21;
    private java.awt.Button button210;
    private java.awt.Button button211;
    private java.awt.Button button212;
    private java.awt.Button button213;
    private java.awt.Button button214;
    private java.awt.Button button215;
    private java.awt.Button button216;
    private java.awt.Button button217;
    private java.awt.Button button218;
    private java.awt.Button button219;
    private java.awt.Button button22;
    private java.awt.Button button220;
    private java.awt.Button button221;
    private java.awt.Button button222;
    private java.awt.Button button223;
    private java.awt.Button button224;
    private java.awt.Button button225;
    private java.awt.Button button23;
    private java.awt.Button button24;
    private java.awt.Button button25;
    private java.awt.Button button26;
    private java.awt.Button button27;
    private java.awt.Button button28;
    private java.awt.Button button29;
    private java.awt.Button button3;
    private java.awt.Button button30;
    private java.awt.Button button31;
    private java.awt.Button button32;
    private java.awt.Button button33;
    private java.awt.Button button34;
    private java.awt.Button button35;
    private java.awt.Button button36;
    private java.awt.Button button37;
    private java.awt.Button button38;
    private java.awt.Button button39;
    private java.awt.Button button4;
    private java.awt.Button button40;
    private java.awt.Button button41;
    private java.awt.Button button42;
    private java.awt.Button button43;
    private java.awt.Button button44;
    private java.awt.Button button45;
    private java.awt.Button button46;
    private java.awt.Button button47;
    private java.awt.Button button48;
    private java.awt.Button button49;
    private java.awt.Button button5;
    private java.awt.Button button50;
    private java.awt.Button button51;
    private java.awt.Button button52;
    private java.awt.Button button53;
    private java.awt.Button button54;
    private java.awt.Button button55;
    private java.awt.Button button56;
    private java.awt.Button button57;
    private java.awt.Button button58;
    private java.awt.Button button59;
    private java.awt.Button button6;
    private java.awt.Button button60;
    private java.awt.Button button61;
    private java.awt.Button button62;
    private java.awt.Button button63;
    private java.awt.Button button64;
    private java.awt.Button button65;
    private java.awt.Button button66;
    private java.awt.Button button67;
    private java.awt.Button button68;
    private java.awt.Button button69;
    private java.awt.Button button7;
    private java.awt.Button button70;
    private java.awt.Button button71;
    private java.awt.Button button72;
    private java.awt.Button button73;
    private java.awt.Button button74;
    private java.awt.Button button75;
    private java.awt.Button button76;
    private java.awt.Button button77;
    private java.awt.Button button78;
    private java.awt.Button button79;
    private java.awt.Button button8;
    private java.awt.Button button80;
    private java.awt.Button button81;
    private java.awt.Button button82;
    private java.awt.Button button83;
    private java.awt.Button button84;
    private java.awt.Button button85;
    private java.awt.Button button86;
    private java.awt.Button button87;
    private java.awt.Button button88;
    private java.awt.Button button89;
    private java.awt.Button button9;
    private java.awt.Button button90;
    private java.awt.Button button91;
    private java.awt.Button button92;
    private java.awt.Button button93;
    private java.awt.Button button94;
    private java.awt.Button button95;
    private java.awt.Button button96;
    private java.awt.Button button97;
    private java.awt.Button button98;
    private java.awt.Button button99;
    private javax.swing.ButtonGroup difficultyButtonGroup;
    private javax.swing.JPanel jDifficultyPanel;
    private javax.swing.JRadioButton jHardRadioButton;
    private javax.swing.JRadioButton jImpossibleRadioButton;
    private javax.swing.JRadioButton jNormalRadioButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
