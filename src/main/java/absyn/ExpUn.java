package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

public class ExpUn extends Exp {
    public final Exp exp;
    public ExpUn(Loc loc, Exp exp) {
        super(loc);
        this.exp = exp;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpUn: "), exp.toTree());
    }

}
