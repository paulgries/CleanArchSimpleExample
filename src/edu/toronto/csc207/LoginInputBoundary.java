package edu.toronto.csc207;

public interface LoginInputBoundary {
    public LoginUseCase.LoginResult logIn(String username, String password);
}
