package absyn;

import env.Env;
import io.vavr.collection.Tree;
import parse.Loc;
import types.BOOL;
import types.Type;

public class ExpWhile extends Exp {
    public final Exp whileExp;
    public final Exp doExp;

    public ExpWhile(Loc loc, Exp whileExp, Exp doExp) {
        super(loc);
        this.whileExp = whileExp;
        this.doExp = doExp;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpWhile: "), whileExp.toTree());
    }

    @Override
    protected Type semantic_(Env env) {
        return BOOL.T;
    }
}
