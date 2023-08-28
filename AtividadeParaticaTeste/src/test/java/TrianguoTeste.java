import org.example.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrianguloTest {

    @Test
    void calculaArea() {
        Triangulo triangulo1 = new Triangulo(6,3);
        Assertions.assertEquals(9, triangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
    }
    @Test
    void calculaArea1() {
        Triangulo triangulo1 = new Triangulo(10,5);
        Assertions.assertEquals(25, triangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
    }
    @Test
    void calculaArea2() {
        Triangulo triangulo1 = new Triangulo(0,3);
        Assertions.assertEquals(0, triangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
    }
    @Test
    void calculaArea3() {
        Triangulo triangulo1 = new Triangulo(5,0);
        Assertions.assertEquals(0, triangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
    }
    @Test
    void calculaArea4() {
        Triangulo triangulo1 = new Triangulo(7,7);
        Assertions.assertEquals(24.5, triangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
    }
}

