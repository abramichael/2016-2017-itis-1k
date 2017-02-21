/**
 * Created by ma on 21.02.2017.
 */
public class WolfCreator extends EvilGuyCreator {
    @Override
    public EvilGuy getNew() {
        return new Wolf();
    }
}
