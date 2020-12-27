package exercisesChapter8;

public interface Nose {
    public int iMethod();
}
abstract class Picasso implements Nose{
    @Override
    public int iMethod() {
        return 7;
    }
}
class Clowns extends Picasso{}

class Acts extends Picasso{
    @Override
    public int iMethod() {
        return 5;
    }
}


