package absyn;

import env.Env;
import io.vavr.collection.Tree;
import parse.Loc;
import types.INT;
import types.Type;

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

    @Override
    protected Type semantic_(Env env) {
        return INT.T;
    }
}
