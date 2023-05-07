package classesandobjects;


public class ClassesAndObjects {
    public static void main(String[] args) {
        Simonovskiy person1 = new Simonovskiy();                                //3) создал объект персон1 в класе Симоновский в методе main
        person1.name = "Даша";                                                 //данные объекта
        person1.weight = (float) 60;
        person1.speak();
        person1.life();
        Simonovskiy person2 = new Simonovskiy();                                // 4) 2й объект класса Симоновский
        person2.name = "Алик";
        person2.weight = 80;
        person2.speak();
        person2.life1();
        System.out.println("Наш общий вес = " + (person1.weight + person2.weight) + "кг!!!" );
    }    
}
        class Simonovskiy{                                                              // 1)создал класс Симоновский вне метода main
        String name;                                                            // 2)создал поля класса Симоновский name, weight
        float weight;
        void speak(){                                                           // 5) создал метод speak в классе Симоновский
            System.out.println("Привет, я " + name + ", " + "вешу" + " " + weight + " " + "кг!"); // создал формулу метода спик
        }
        void life(){
            System.out.println("Я кривляюсь постоянно :((");
        }
        void life1(){
            System.out.println("Я постоянно учусь на 5!");
        }
}
     
