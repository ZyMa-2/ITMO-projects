# Information to this lab

Lab about SOLID, classes, interfaces, abstract classes, enums  

## Questions

- Конструкторы и поля в enum (добавить в Color)  
  + done
- Поправить интерфейс State  
  + renamed to `Stateable`, removed getter and setter
- SOLID принципы в коде  
  + Единственная обязанность - в данном проекте каждый объект может делать действия только с самим собой, тем самым 
  несёт ответственность только за себя и не взаимодействует с другими классами
  + Open/Close - Essence закрыт для расширения, но открыт для модификаций
  + Liskov - Классы наследники Essence могут выполнять те же действия что и их классы родители
  + Interface segregation - Интерфейсы описывают чёткое и единственное поведение
  + Dependency invertion - Все классы и их детали зависят от абстракций
- Подумать, как можно сделать так, чтобы в main типы ссылок поменять на более абстрактные родительские типы данных  
  + Например в классе `Berry` в методе crush_into мы используем класс Essence чтобы взаимодействовать с любым объектом
  + Liskov? idk honestly
  + Вроде done

## Useful information
- [habr SOLID principles explanation](https://habr.com/ru/post/688530/)
- [SOLID в картинках](https://temofeev.ru/info/articles/printsipy-solid-v-kartinkakh/)
- interface used for defining object behaviour
- abstract classes supposted to have abstract methods :p
- To create project structure just write down your thoughts and start doing someting (time managment mistake)
- idk what else i think i quite well understood this theme
