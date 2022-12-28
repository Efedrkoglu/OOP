/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameproject;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Efe
 */
public abstract class SaveFileManager{
    private static File slot1 = new File("saves/slot1.txt");
    private static File slot2 = new File("saves/slot2.txt");
    private static File slot3 = new File("saves/slot3.txt");
    
    public static void SaveGame(int slot, Game game) {
        File file;
        
        switch(slot) {
            case 1: 
                file = slot1;
                break;
                
            case 2:
                file = slot2;
                break;
                
            case 3: 
                file = slot3;
                break;
            
            default:
                file = slot1;
                break;
        }

        String line = game.getPlayer().toString() + game.getEnemy().toString() + game.toString();
        System.out.println(line);
        try{
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(file,false));
            bWriter.write(line);
            bWriter.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
    

    public static Game LoadGame(int slot) {
        File file;
        String line;
        String[] lines = new String[22];
        
        switch(slot) {
            case 1:
                file = slot1;
                break;
                
            case 2:
                file = slot2;
                break;
            
            case 3: 
                file = slot3;
                break;
                
            default:
                file = slot1;
                break;
        }
        
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(file));
            line = bReader.readLine();
            bReader.close();
            
            lines = line.split(",");
        }
        catch(IOException e) {
            System.out.println(e);
        }
        
        return new Game(initPlayer(lines),initEnemy(lines),Integer.parseInt(lines[17]),Integer.parseInt(lines[18]),Integer.parseInt(lines[19]),Integer.parseInt(lines[20]),Integer.parseInt(lines[21]));
    }
    
    public static Player initPlayer(String[] lines) {
        return new Player(lines[0],Integer.parseInt(lines[1]),Integer.parseInt(lines[2]),Integer.parseInt(lines[3]),Integer.parseInt(lines[4]),Integer.parseInt(lines[5]),Integer.parseInt(lines[6]),Boolean.parseBoolean(lines[7]),Boolean.parseBoolean(lines[8]),Boolean.parseBoolean(lines[9]));
    }
    
    public static Enemy initEnemy(String[] lines) {
        if(lines[10].equals("Örümcek")) {
            return new Spider(lines[10],Integer.parseInt(lines[11]),Integer.parseInt(lines[12]),Integer.parseInt(lines[13]),Integer.parseInt(lines[14]),Integer.parseInt(lines[15]));
        }
        else if(lines[10].equals("İskelet")){
            return new Skeleton(lines[10],Integer.parseInt(lines[11]),Integer.parseInt(lines[12]),Integer.parseInt(lines[13]),Integer.parseInt(lines[14]),Integer.parseInt(lines[15]));
        }
        else if(lines[10].equals("Hayalet")){
            return new Ghost(lines[10],Integer.parseInt(lines[11]),Integer.parseInt(lines[12]),Integer.parseInt(lines[13]),Integer.parseInt(lines[14]),Integer.parseInt(lines[15]));
        }
        else {
            return new Boss(lines[10],Integer.parseInt(lines[11]),Integer.parseInt(lines[12]),Integer.parseInt(lines[13]),Integer.parseInt(lines[14]),Integer.parseInt(lines[15]));
        }
    }
}
