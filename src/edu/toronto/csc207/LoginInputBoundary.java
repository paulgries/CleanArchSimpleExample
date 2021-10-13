package edu.toronto.csc207;

//The interface that the logInUseCase implements
//Note how it specifies what the input (arguments) and output (return type) are.
public interface LoginInputBoundary {
    LoginUseCase.LoginResult logIn(String username, String password);
}
