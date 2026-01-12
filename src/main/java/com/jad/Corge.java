package com.jad;

public class Corge {
    private Foo foo;

    public Corge(Foo foo) {
        this.foo = foo;
        foo.setCorge(this);
    }

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(Foo foo) {
        if(this.foo != null && this.foo.getCorge() != null) this.foo.setCorge(null);
        this.foo = foo;
    }
}
