package Builder;

public class Director {
    public Human createHUmanByDirector(IBuilderHuman bh){
        bh.buildHead();
        bh.buildBody();
        bh.buildHand();
        bh.buildFoot();
        return bh.createHuman();
    }
}
