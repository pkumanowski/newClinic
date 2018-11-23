package com.obi.classes;

import java.util.Date;

public interface Visit<V, T>
{
     V getVisitor();
     T getHost();
     Date getVisitDate();
}
