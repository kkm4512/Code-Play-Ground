package protectedClassOut;

import protectedClassOut.protectedInClass.ProtectedInClass;

public class ProtectedOutClass {
    protected long protectedOutClassId;
    ProtectedInClass pIn = new ProtectedInClass();
    ProtectedOut1Class pOut1 = new ProtectedOut1Class();

    protected void protectedOutClassMethod() {
        System.out.println("protectedOutClassMethod");
    }

    protected void protectedOutClassMethod2() {
    }
}
