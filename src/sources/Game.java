/**
 * @file Game.java
 * This file is a part of RikiTank project, an amazing tank game !
 * 1;2403;0c- Copyright (C) 2012  Riki-Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/

package sources;

import menus.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

    public static final String gameName = "RikiTank";
    public static final int mainMenu = 0;
    public static final int choice = 1;
    public static final int play = 2;
    public static final int pause = 3;
    public static final int options = 4;
    public static final int credits = 5;
    
    public Game(String gameName) {
        super(gameName);
        this.addState(new Menu(mainMenu));
        this.addState(new Choice(choice));
        this.addState(new Play(play));
        this.addState(new Pause(pause));
        this.addState(new Options(options));
        this.addState(new Credits(credits));
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(mainMenu).init(gc, this);
        this.getState(choice).init(gc, this);
        this.getState(play).init(gc, this);
        this.getState(pause).init(gc, this);
        this.getState(options).init(gc, this);
        this.getState(credits).init(gc, this);
        this.enterState(mainMenu);
    }
    
    public static void main(String[] args) {
        
        AppGameContainer window;
        
        try {
            window = new AppGameContainer(new Game(gameName));
            window.setShowFPS(false);
            window.setDisplayMode(window.getScreenWidth(), window.getScreenHeight(), true);
            window.start();
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }
    
}
