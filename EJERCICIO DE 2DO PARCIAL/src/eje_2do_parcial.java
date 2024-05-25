class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Mamifero extends Animal {
    public void amamantar() {
        System.out.println("El mamífero amamanta a sus crías");
    }
}

class Ave extends Animal {
    public void volar() {
        System.out.println("El ave vuela en el cielo");
    }
}

class Pez extends Animal {
    public void nadar() {
        System.out.println("El pez nada en el agua");
    }
}

class Perro extends Mamifero {
    public void ladrar() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Mamifero {
    public void maullar() {
        System.out.println("El gato maulla");
    }
}

class Aguila extends Ave {
    public void cazar() {
        System.out.println("El águila caza en el cielo");
    }
}

class PezDorado extends Pez {
    public void brincarFueraDelAgua() {
        System.out.println("El pez dorado brinca fuera del agua");
    }
}

public class eje_2do_parcial {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.hacerSonido();
        perro.amamantar();
        perro.ladrar();

        PezDorado pezDorado = new PezDorado();
        pezDorado.hacerSonido();
        pezDorado.nadar();
        pezDorado.brincarFueraDelAgua();
    }
}