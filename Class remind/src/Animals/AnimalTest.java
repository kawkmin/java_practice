package Animals;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}


class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}


public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human(); //업캐스팅
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        /*Human human=new Human();
        human.readBooks(); 가능 */


        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {

        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human) { // 인스턴스 타입 물어보기 instanceof hAnimal 이라면
                Human human = (Human) animal; //다운캐스팅으로 Human타입이 아니라 Animal타입으로 지정된 hAnimal을 Human타입으로 재정의
                human.readBooks();          //Animal 클래스엔 없어서 못쓴 readBooks가 Human 타입으로 바꾸면서 사용 가능
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("error");
            }

        }
    }


    public void moveAnimal(Animal animal) {
        animal.move();
    }


}