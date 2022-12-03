package digidoggy.scrapdun.combat;


import digidoggy.scrapdun.Main;
import digidoggy.scrapdun.model.Npc;
import digidoggy.scrapdun.model.Player;

public class CombatMechanics {

    public static boolean hitDamage(String name, int hp, int dm, int def){

        if (Player.getHealth()==0 || Npc.getNpcHealth()==0){
           return false;
        }

        String name1 = " ";
        String name2 = " ";

        int hit = Math.round((dm/def));
        int max = hit+5;
        int min = hit-1;
        hit = Main.Random((max-min)+1);
        hit+=min;

        hp-=hit;
        if( name.equals(Player.getCharacterName())){

            Npc.setNpcHealth(hp);
            name1=name;
            name2=Npc.getNpcCharacterName();
        }else{
            Player.setHealth(hp);
            name1=(name);
            name2=Player.getCharacterName();
        }


        System.out.println(name1 + " Hit " + hit);

        if (hp>0){
            System.out.println(name2 + " health :" + hp );
        }else{
            hp=0;
            System.out.println(name2 + " died.");


            System.out.println(name1 + " Winner!");

            if (name1.equals(Player.getCharacterName())){
                Main.setWinnerName(Player.getCharacterName());
            }

            return false;
        }

        return false;
    }


}
