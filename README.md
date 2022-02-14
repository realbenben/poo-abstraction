# p.o.o-abstraction


## le concept

- c'est l'un des concepts de la POO.

- on ne peut pas creer d'objet directement depuis la classe abstraite.

- La classe abstraite peut avoir des méthodes abstraites et des méthodes non abstraites. (communes et utilisables dans les classes filles)

- Une classe abstraite peut inclure des variables.

- c'est une classe avec au moin une methode abstraite: on l initie vide et on vient la parametrer dans les classes filles (aucun corps de methode)

- sert a initier les methodes des classes filles de la class abstract.

- se sont les classes filles qui decrivent la methode propre a elle-même.

- Nous pouvons accéder à la classe abstraite uniquement via héritage En utilisant le mot-clé "extends".

- dans les classes filles on utilise le mot clef @override afin de réecrir sur la methode vide de la classe abstract

- c 'est a partir de la classe fille que l'on creer des objets

## Syntaxe de la classe abstraite



 abstract class class_name {

       abstract return_type methodname(); //abstract method
       
       return_type methodname() { //non-abstract method
       
       }
}




## Exemple de classe abstraite



abstract class Fruits
{
  abstract void taste();
}
class Apple extends Fruits {
  @Override
  void taste() {
    System.out.println("Sweet taste");
    
  }
  
}
public class AbstractDemo {
  public static void main(String[] args) {
    Apple a = new Apple();
    a.taste();
  }
}



## schema explicatif 



![abstract](https://user-images.githubusercontent.com/66671034/153874264-27ddcfb4-18cf-4267-9e42-cd191fa7d5b8.png)
