package absyn;

import io.vavr.collection.List;
import io.vavr.collection.Tree;
import parse.Loc;

public class ExpFunc extends Exp{
    public final String name;
    public final List<Exp> sequence;

    public ExpFunc(Loc loc, List<Exp> sequence) {
        super(loc);
        this.sequence = sequence;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpFunc"), sequence.map(Exp::toTree));
    }
}
