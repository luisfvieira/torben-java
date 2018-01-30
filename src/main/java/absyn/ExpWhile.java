package absyn;

import io.vavr.collection.Tree;
import parse.Loc;

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
}
