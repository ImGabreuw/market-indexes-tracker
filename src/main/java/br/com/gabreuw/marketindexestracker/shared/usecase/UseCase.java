package br.com.gabreuw.marketindexestracker.shared.usecase;

import java.io.Serializable;

public interface UseCase<I extends UseCase.InputValues, O extends UseCase.OutputValues> {

    interface InputValues extends Serializable {
    }

    interface OutputValues extends Serializable {
    }

    O execute(I input);

}
