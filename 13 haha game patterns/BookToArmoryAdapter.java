/**
 * Created by ma on 21.02.2017.
 */
public class BookToArmoryAdapter implements ArmoryThatCanAttack {
    private Book adaptee;
    public BookToArmoryAdapter(Book b) {adaptee = b;}
    @Override
    public void attack(GameCharacter enemy) {
        adaptee.throwIt(enemy);
    }
}
