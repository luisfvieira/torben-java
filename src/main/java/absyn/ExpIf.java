package absyn;

import env.Env;
import io.vavr.collection.Tree;
import parse.Loc;
import types.BOOL;
import types.Type;

public class ExpIf extends Exp {
    public final Exp ifExp;
    public final Exp thenExp;
    public final Exp elseExp;

    public ExpIf(Loc loc, Exp ifExp, Exp thenExp, Exp elseExp) {
        super(loc);
        this.ifExp = ifExp;
        this.thenExp = thenExp;
        this.elseExp = elseExp;
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpIf: "), ifExp.toTree());
    }

    @Override
    protected Type semantic_(Env env) {
        return BOOL.T;
    }
}
