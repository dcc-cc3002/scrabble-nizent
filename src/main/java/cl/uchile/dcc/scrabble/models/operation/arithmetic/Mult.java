package cl.uchile.dcc.scrabble.models.operation.arithmetic;

import cl.uchile.dcc.scrabble.models.operation.OperableEntity;
import cl.uchile.dcc.scrabble.models.operation.Operation;
import cl.uchile.dcc.scrabble.models.operation.constant.Constant;

public class Mult implements Operation {
    private OperableEntity leftEntity;
    private OperableEntity rightEntity;

    public Mult(OperableEntity leftOperation, OperableEntity rightOperation){
        this.leftEntity = leftOperation;
        this.rightEntity = rightOperation;
    }

    @Override
    public Constant evaluate() {
        return this.leftEntity.evaluate().mult(
                this.rightEntity.evaluate()
        );
    }
}
