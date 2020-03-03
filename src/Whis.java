import java.awt.Dimension;

import javax.swing.JFrame;

public class Whis {
	
	//some rules: https://docs.google.com/document/d/1cKNVRTGJQXgCbnonNO15KXamzqFZnuiTU9MxhltwU88/edit
	
	//this is the absolutely worst place to put this. however, i am putting it here and you can't do anything about it
	//for the FEHStatListener, the stats are as so: <td>45</td><td>33</td><td>30</td><td>28</td><td>22</td><td>158</td>
	//this means: hp 45, atk 33, spd 30, def 28, res 22, total bst 158
	//these are alm (alm_hero_of_prophecy)'s lvl 40 stats :)
	//this is copy-paste alm's entire row in the table: <tr class="hero-filter-element" data-move-type="Infantry" data-weapon-type="Red Sword" data-weapon-props="Sword;Red;Close;Physical;Melee"><td><a href="/Alm:_Hero_of_Prophecy" title="Alm: Hero of Prophecy"><img alt="Alm Hero of Prophecy Face FC.webp" src="https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/a/a0/Alm_Hero_of_Prophecy_Face_FC.webp/30px-Alm_Hero_of_Prophecy_Face_FC.webp.png?version=64e098a56c4c8d046c0a6b4565f2bfb7" decoding="async" width="30" height="30" srcset="https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/a/a0/Alm_Hero_of_Prophecy_Face_FC.webp/45px-Alm_Hero_of_Prophecy_Face_FC.webp.png?version=64e098a56c4c8d046c0a6b4565f2bfb7 1.5x, https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/a/a0/Alm_Hero_of_Prophecy_Face_FC.webp/60px-Alm_Hero_of_Prophecy_Face_FC.webp.png?version=64e098a56c4c8d046c0a6b4565f2bfb7 2x" /></a></td><td><a href="/Alm:_Hero_of_Prophecy" title="Alm: Hero of Prophecy">Alm: Hero of Prophecy</a></td><td data-sort-value="1"><img alt="Infantry" src="https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/4/45/Icon_Move_Infantry.png/25px-Icon_Move_Infantry.png?version=3a7464042200dcd26ee4dcaada61659d" decoding="async" width="25" height="26" srcset="https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/4/45/Icon_Move_Infantry.png/38px-Icon_Move_Infantry.png?version=3a7464042200dcd26ee4dcaada61659d 1.5x, https://gamepedia.cursecdn.com/feheroes_gamepedia_en/4/45/Icon_Move_Infantry.png?version=3a7464042200dcd26ee4dcaada61659d 2x" /></td><td data-sort-value="1"><img alt="Red Sword" src="https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/4/47/Icon_Class_Red_Sword.png/25px-Icon_Class_Red_Sword.png?version=a6fe1875b6233adac072f2bfeaf2d39e" decoding="async" width="25" height="25" srcset="https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/4/47/Icon_Class_Red_Sword.png/38px-Icon_Class_Red_Sword.png?version=a6fe1875b6233adac072f2bfeaf2d39e 1.5x, https://gamepedia.cursecdn.com/feheroes_gamepedia_en/thumb/4/47/Icon_Class_Red_Sword.png/50px-Icon_Class_Red_Sword.png?version=a6fe1875b6233adac072f2bfeaf2d39e 2x" /></td><td>45</td><td>33</td><td>30</td><td>28</td><td>22</td><td>158</td></tr>
	//to look up a hero, look for "<a href="/Alm:_Hero_of_Prophecy"" and such
	//btw, the 10th "<a href=" is Abel's
	//the string "Alm:_Hero_of_Prophecy appears twice; I assume that is the case for all heroes
	//to find that stats thing: look for the THIRD instance of "Alm: Hero of Prophecy", then look for the first instance of "</td><td>"
	//save to int variables hp, atk, spd, def, res, and bst
	//i don't think anyone has natural single digit stats at level 40 so you don't have to worry about that, bst will always be 3 digtis
	//format, starting from </td><td>: 9 characters, then 2-digit HP, then 9 characters, then 2-digit atk, then so on :)
	
	
	JFrame frame;
	GamePanel gamePanel;
	static final int width = 500;
	static final int height = 500;
	
	Whis(){
		frame = new JFrame();
		gamePanel = new GamePanel();
	}
	
	void setup() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePanel);
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.addKeyListener(gamePanel);
        frame.setVisible(true);
        gamePanel.startGame();
	}
	
	public static void main(String[] args) {
		Whis whisCards = new Whis();
		whisCards.setup();
	}
	
}

