package src.view;

public interface View {
    // Obtener información
    void getNameTrainer();
    void getAttack();
    void choosePokemon();

    // Mostrar información
    void showMessage();
    void showPokemons();
    void showState();
    void showAttack();
    void showWinner();
    
    // Iniciar
    void start();

}
