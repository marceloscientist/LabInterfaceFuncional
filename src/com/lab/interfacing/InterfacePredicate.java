package com.lab.interfacing;

import java.util.function.DoublePredicate;

public interface InterfacePredicate {
    double[] executa(double[] valores, DoublePredicate criterio);
}
