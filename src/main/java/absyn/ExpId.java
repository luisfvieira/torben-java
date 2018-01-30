package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

public class ExpId extends Exp {
    public final String name;

    public ExpId(Loc loc,String name) {
        super(loc);
        this.name = name;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpId: " + name));
    }
}
