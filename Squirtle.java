
public class Squirtle extends Pokemon {
    public Squirtle(String nickName, int level, int typeCreature) {
        super("Squirtle", nickName, "Water", level, typeCreature);
    }
    public void attack(Pokemon p) {
        int ap = getAP();
        int cri = 4;  // 100 / cri
        int rand = (int) (Math.random() * cri);
        if (rand == 0) {
            // get critical X 2
            ap *= 2;
        }
        p.getDamage(ap);

        rand = (int) (Math.random() * 2);
        if (rand == 0) 
            p.lossHugryPoint(20);
    
        lossHugryPoint(10);   
        lossSleepPoint(5);
        System.out.println(getNickName() + " AP : " + ap);
    }
}