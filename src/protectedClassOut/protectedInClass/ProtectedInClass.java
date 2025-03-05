package protectedClassOut.protectedInClass;

import protectedClassOut.ProtectedOutClass;

public class ProtectedInClass {
    protected long protectedInClassId;
    ProtectedOutClass pOut = new ProtectedOutClass();

    protected void protectedInClassMethod() {
        System.out.println("protectedInClassMethod");
    }

    protected void protectedInClassMethod2() {

    }

}
