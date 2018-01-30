package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

public class ExpString extends Exp {
    public final String value;

    public ExpId(Loc loc, String value) {
        super(loc);
        this.value = value;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpString: \"" + value + "\""));
    }

}
