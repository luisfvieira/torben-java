package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

public class ExpAssign extends Exp {
    public final String idName;
    public final Exp exp;
    public ExpAssign(Loc loc, String idName, Exp exp) {
        super(loc);
        this.idName = idName;
        this.exp = exp;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpAssign: " + idName));
    }
}
