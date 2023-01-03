import exceptions.AlreadyBlossomedException;
import modules.*;
import objects.*;

public class Main {
    public static void main(String[] args) {
        InanimateObject house = new InanimateObject("Дом");
        Person wizard = new Person("Волшебник");
        Person characterFemale = new Person("Муми-мама");
        Person characterMale = new Person("Муми-папа");

        Plant labiales = new Plant("Губоцветные");
        Flower flowers = new Flower("Цветы");
        Flower.Fruit fruits = new Flower.Fruit("Плоды");
        InanimateObject leaves = new InanimateObject("Огромные пучки листьев");
        InanimateObject stems = new InanimateObject("Вьющиеся стебли");
        Plant plants = new Plant("Растения");
        Flower bigFlower = new Flower("Гиганский цветок");
        InanimateObject room = new InanimateObject("Комната");
        Flower whiteFlowers = new Flower("Цветки", Color.WHITE);


        house.changeState("погружен в послеобеденный сон");
        house.announceState();
        labiales.grow();

        labiales.makeAction("мягко извиваются");
        labiales.makeAction("поднялись из шляпы", wizard);

        labiales.makeAction("стали ощупью взбираться по",
                new InanimateObject[]{
                        new InanimateObject("портьеры"),
                        new InanimateObject("шнурки от вьюшек")
                });
        labiales.makeAction("пролезают во все",
                new InanimateObject[]{
                        new InanimateObject("щели"),
                        new InanimateObject("форточки"),
                        new InanimateObject("замочные скважины"),
                });
        try {
            flowers.blossom();
        } catch (AlreadyBlossomedException e) {
            System.out.println(e.getMessage());
        }
        fruits.ripen();

        leaves.makeAction("заполонили", new InanimateObject("крыльцо"));
        stems.makeAction("оплели", new InanimateObject("ножки стола"));
        stems.makeAction("свешивались с", new InanimateObject("потолок"));

        plants.makeAction("заполняли", house);
        try {
            bigFlower.blossom();
        } catch (AlreadyBlossomedException e) {
            System.out.println(e.getMessage());
        }
        fruits.makeAction("падают на", new InanimateObject("ковёр"));

        characterFemale.think("все это дождь");
        characterFemale.makeAction("повернулась на другой бок");
        characterFemale.makeAction("спит");

        characterMale.makeAction("сидел в соседней комнате");
        characterMale.makeAction("строчит мемуары");

        characterMale.remember("С той поры как он построил причал для \"Приключения\", " +
                "не произошло ничего интересного, что стоило бы поведать потомству");
        characterMale.makeAction("описывает своё детство");

        characterMale.makeAction("расчувствовался");
        characterMale.makeAction("чуть не пустил слезу");

        characterMale.remember("Он с рождения был необыкновенным, " +
                "одаренным ребенком, которого никто не понимал");

        characterMale.remember("Подросши, он оставался непонятым");
        characterMale.remember("во всех отношениях было так тяжело, так тяжело");

        characterMale.makeAction("строчил и строчил");
        characterMale.visualize("все будут раскаиваться, когда он прочтет мемуары вслух");

        characterMale.changeMood("в веселом расположении духа");
        characterMale.announceMood();

        StoryGenerator lab3 = new StoryGenerator() {
            static final Berry plum;
            static final InanimateObject manuscript;
            static final InanimateObject table;
            static final Bush bushes;
            static final InanimateObject ceiling;
            static final Person character;
            static final Berry yellow_berries;
            static final Berry[] plums;

            static {
                plum = new Berry("Слива", Color.BLUE);
                manuscript = new InanimateObject("Рукопись");
                table = new InanimateObject("Письменный стол");
                bushes = new Bush("Кустарники");
                ceiling = new InanimateObject("Потолок");
                character = new Person("Муми-папа");
                yellow_berries = new Berry("Ягоды", Color.YELLOW);
                plums = new Berry[5];
            }

            public void generateOutput() {
                plum.crushInto(manuscript);
                plum.makeAction("оставила большое пятно на", manuscript);
                character.makeAction("обернулся с решимостью");
                character.wantsToDo("намять как сделедует им холку");
                character.stareAt(bushes);
                bushes.filledWith(yellow_berries);
                character.makeAction("подскочил на месте");

                for (int i = 0; i < 5; i++) {
                    plums[i] = new Berry("Слива", Color.BLUE);
                    plums[i].crushInto(table);
                }

                ceiling.changeState("заткан сплетением веток");
                ceiling.announceState();
                bushes.grow();
                bushes.makeAction("тянут свои зелёные руки к окну");
            }
        };
        lab3.generateOutput();

        characterFemale.makeAction("села в кровати");
        characterFemale.stareAt(room);
        room.changeState("полна %s".formatted(whiteFlowers));
        room.announceState();

        whiteFlowers.changeState("свисают с потолка");
        whiteFlowers.announceState();

        characterFemale.makeAction("раздвинула тонкую занавесь из %s".formatted(flowers));
        characterFemale.makeAction("встала с кровати");
    }
}
