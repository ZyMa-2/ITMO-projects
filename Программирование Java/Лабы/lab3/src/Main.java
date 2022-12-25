public class Main {
    public static void main(String[] args) {

        Berry plum = new Berry("Слива", Color.BLUE);
        InanimateObject manuscript = new InanimateObject("Рукопись");
        InanimateObject table = new InanimateObject("Письменный стол");
        Bush bushes = new Bush("Кустарники");
        InanimateObject ceiling = new InanimateObject("Потолок");
        AnimateObject character = new AnimateObject("Муми-папа");
        Berry yellow_berries = new Berry("Ягоды", Color.YELLOW);

        plum.crush_into(manuscript);
        plum.make_action("оставила большое пятно на", manuscript);
        character.make_action("обернулся с решимостью");
        character.wants_to_do("намять как сделедует им холку");
        character.stare_at(bushes);
        bushes.filledWith(yellow_berries);
        character.make_action("подскочил на месте");

        Berry[] plums = new Berry[5];
        for (int i = 0; i < 5; i++) {
            plums[i] = new Berry("Слива", Color.BLUE);
            plums[i].crush_into(table);
        }

        ceiling.setState("заткан сплетением веток");
        ceiling.announce_state();
        bushes.grow();
        bushes.make_action("тянут свои зелёные руки к окну");


    }
}
