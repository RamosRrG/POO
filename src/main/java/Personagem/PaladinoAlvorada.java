package Personagem;

public class PaladinoAlvorada {
    private String name;
    private int forca,agilidade,inteligencia,mana,fe,destreza,vida;
    private String skill;
    private int skillDamageBase;


    public PaladinoAlvorada(String name,int forca, int agilidade, int inteligencia, int mana, int fe, int destreza, String skill, int skillDamageBase) {
        this.name = name;
        this.agilidade = agilidade;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.mana = mana;
        this.fe = fe;
        this.destreza = destreza;
        this.skill = skill;
        this.skillDamageBase = skillDamageBase;
        this.vida = 100*(destreza/10);
    }
    public void levelUp(){
        agilidade ++;
        forca ++;
        inteligencia ++;
        mana  ++;
        fe ++;
        destreza ++;
    }

    public int attack(){
        return skillDamageBase*(1*(forca/10));
    }
    public void defese(int damage){
         vida = vida - damage*(1*(damage/10));
    }





}
