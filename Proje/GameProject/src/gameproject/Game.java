package gameproject;

import java.util.Random;

/**
 *
 * @author Efe
 */
public class Game {
    private Player player;
    private Enemy enemy;
    private Random rnd = new Random();
    private int pot;
    private int pot2;
    private int bomb;
    private int floor = 3;
    private int currentFloor;
    private int currentRoom;   
    
    public Game(String name) {
        this.player = new Player(name);
        this.pot = 0;
        this.pot2 = 0;
        this.bomb = 0;
        this.currentFloor = 1;
        this.currentRoom = 1;
        GenerateEnemy();
    }
    
    public Game(Player player, Enemy enemy, int pot, int pot2, int bomb, int currentFloor, int currentRoom) {
        this.player = player;
        this.enemy = enemy;
        this.pot = pot;
        this.pot2 = pot2;
        this.bomb = bomb;
        this.currentFloor = currentFloor;
        this.currentRoom = currentRoom;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Enemy getEnemy() {
        return this.enemy;
    }
    
    public void GenerateEnemy() {
        int type;
        int count;
        if(this.currentFloor == 1) {
            type = 1;
        }
        else if(this.currentFloor == 2){
            type = rnd.nextInt(2) + 1;
        }
        else {
            type = rnd.nextInt(3) + 1;
        }
        
        switch(type) {
            case 1:
                count = rnd.nextInt(5) + 1;
                this.enemy = new Spider(count);
                break;
                
            case 2:
                count = rnd.nextInt(5) + 1;
                this.enemy = new Skeleton(count);
                break;
                
            case 3:
                count = rnd.nextInt(5) + 1;
                this.enemy = new Ghost(count);
                break;
        }
        /*switch(type) {
            case 1-> {
                count = rnd.nextInt(5) + 1;
                this.enemy = new Spider(count);
            }
            case 2-> {
                count = rnd.nextInt(5) + 1;
                this.enemy = new Skeleton(count);
            }
            case 3-> {
                count = rnd.nextInt(5) + 1;
                this.enemy = new Ghost(count);
            }
        }*/
    }
    
    public void GenerateBoss() {
        this.enemy = new Boss();
    }
    
    public int getCurrentRoom() {
        return this.currentRoom;
    }
    
    public void setCurrentRoom() {
        this.currentRoom++;
        if(this.currentRoom > 10){
            this.currentRoom = 1;
            setCurrentFloor();
        }
    }
    
    public int getCurrentFloor() {
        return this.currentFloor;
    }
    
    public void setCurrentFloor() {
        this.currentFloor++;
    }
    
    public int getPot() {
        return this.pot;
    }
    
    public void setPot(int val) {
        if(val == 1) {
            this.pot++;
            this.player.setGold(-10);
        }
        else {
            if(this.pot != 0) {
                this.pot--;
                this.player.setHp(15);
            }
        }
    } 
    
    public int getPot2() {
        return this.pot2;
    }
    
    public void setPot2(int val) {
        if(val == 1) {
            this.pot2++;
            this.player.setGold(-20);
        }
        else {
            if(this.pot2 != 0) {
                this.pot2--;
                this.player.setHp(25);
            }
        }
    }
    
    public int getBomb() {
        return this.bomb;
    }
    
    public void setBomb(int val) {
        if(val == 1) {
            this.bomb++;
            this.player.setGold(-150);
        }
        else {
            if(this.bomb != 0) {
                this.bomb--;
            }
        }
    }

    @Override
    public String toString() {
        return + pot + "," + pot2 + "," + bomb + "," + currentFloor + "," + currentRoom + ",";
    }
    
    
    
}
