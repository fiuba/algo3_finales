package edu.fiuba.algo3.algomail;

import java.util.Objects;

public class Password implements Credencial {

    private String password;

    public Password(String password) {

        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password1 = (Password) o;
        return password.equals(password1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }
}
