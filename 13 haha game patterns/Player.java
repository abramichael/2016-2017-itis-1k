/**
 * Created by ma on 21.02.2017.
 */
public class Player extends GameCharacter {
    private ArmoryThatCanAttack currentArmory;
    @Override

    public void attack(GameCharacter enemy) {
        currentArmory.attack(enemy);
    }
    public void setCurrentArmory(ArmoryThatCanAttack a) {currentArmory = a;}
}
