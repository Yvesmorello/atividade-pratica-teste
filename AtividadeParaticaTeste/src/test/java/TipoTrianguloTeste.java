import org.example.TipoTriangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TipoTrianguloTest {

    @Test
    void testEquilatero() {
        TipoTriangulo tipoTriangulo = new TipoTriangulo(3, 3, 3);
        Assertions.assertEquals("Equilátero", tipoTriangulo.getTipoTriangulo());
        System.out.println("Equilátero");
    }

    @Test
    void testIsosceles() {
        TipoTriangulo tipoTriangulo = new TipoTriangulo(5, 5, 3);
        Assertions.assertEquals("Isósceles", tipoTriangulo.getTipoTriangulo());
        System.out.println("Isósceles");
    }

    @Test
    void testEscaleno() {
        TipoTriangulo tipoTriangulo = new TipoTriangulo(3, 4, 5);
        Assertions.assertEquals("Escaleno", tipoTriangulo.getTipoTriangulo());
        System.out.println("Escaleno");
    }

    @Test
    void testInvalido() {
        TipoTriangulo tipoTriangulo = new TipoTriangulo(1, 2, 3);
        Assertions.assertEquals("Inválido", tipoTriangulo.getTipoTriangulo());
        System.out.println("Inválido");
    }
}