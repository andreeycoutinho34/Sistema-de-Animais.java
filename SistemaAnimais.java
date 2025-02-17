class Animal {

    public void emitirSom(){
        System.out.println("Som generico de animal...");
    }
}

class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class SistemaAnimais {
    public static void main(String[] args){
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.emitirSom();
        meuGato.emitirSom();
    }
}
