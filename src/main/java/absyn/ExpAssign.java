package absyn;

import env.Env;
import io.vavr.collection.Tree;
import parse.Loc;
import types.INT;
import types.Type;

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

    @Override
    protected Type semantic_(Env env) {
        return INT.T;
    }
}
