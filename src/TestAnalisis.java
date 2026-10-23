public class TestAnalisis {
  public static void main(String[] args) {
    PreparadorBebidas preparador =
        new PreparadorBebidas(
            new Cafetera(),
            new Licuadora()
        );

    preparador.prepararDesayuno();
    preparador.apagarTodo();

    System.out.println(
        "Problema detectado: el preparador depende " +
            "directamente de Cafetera y Licuadora."
    );
  }
}
