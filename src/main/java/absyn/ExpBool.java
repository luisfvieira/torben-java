package absyn;

import env.Env;
import io.vavr.collection.Tree;
import parse.Loc;
import types.Type;
import types.BOOL;


public class ExpBool extends Exp {
    public final Boolean value;

    public ExpBool(Loc loc, Boolean value) {
        super(loc);
        this.value = value;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpBool: " + value));
    }

    @Override
    protected Type semantic_(Env env) {
        return BOOL.T;
    }
}
