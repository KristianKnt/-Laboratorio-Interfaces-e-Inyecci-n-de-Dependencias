public class TestAnalisis {
  public static void main(String[] args) {
    PreparadorBebidas preparador = new PreparadorBebidas();

    preparador.prepararDesayuno();
    preparador.apagarTodo();

    System.out.println(
        "Problema detectado: el preparador depende " +
            "directamente de Cafetera y Licuadora."
    );
  }
}
