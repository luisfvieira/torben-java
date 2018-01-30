package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

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
}
