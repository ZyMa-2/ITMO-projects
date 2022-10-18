# Information to this lab

Lab about Unix system in general.  
It's file structure, file types, access rights.  
Also about some commands to navigate in that environment.

## List of commands

mkdir, echo, cat, touch, ls, pwd, cd, more, cp, rm, rmdir, mv, chmod, 
cp, ln, cat, wc, ls, head, tail, echo, sort, grep, rm, rmdir.

Too lazy to describe these, but here is some manuals 💂‍♂️:  
- man command
- [itmo stuff](https://se.ifmo.ru/documents/10180/38002/%D0%9C%D0%B5%D1%82%D0%BE%D0%B4%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B5+%D1%83%D0%BA%D0%B0%D0%B7%D0%B0%D0%BD%D0%B8%D1%8F+%D0%BA+%D0%B2%D1%8B%D0%BF%D0%BE%D0%BB%D0%BD%D0%B5%D0%BD%D0%B8%D1%8E+%D0%BB%D0%B0%D0%B1%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D1%85+%D1%80%D0%B0%D0%B1%D0%BE%D1%82+%D0%B8+%D1%80%D1%83%D0%B1%D0%B5%D0%B6%D0%BD%D0%BE%D0%B3%D0%BE+%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8F+%D0%91%D0%AD%D0%92%D0%9C+2019+bcomp-ng.pdf/d5a1be02-ad3f-4c43-8032-a2a04d6db12e) - page 16
- [Служебные символы](https://vds-admin.ru/shell-scripting/sluzhebnye-simvoly)

## Questions

- Конструкция `<< arg`  
  + [manual 3](https://vds-admin.ru/shell-scripting/sluzhebnye-simvoly#dochere_)
  
  + > Можно при помощи символа `<<` использовать текущий стандартный ввод с терминала для подачи на стандартный ввод
    > команды текста до появления заданного стоп-текста окончания ввода. 
    > Например:
    > cat << "хватит" > /home/serge/text
  
- Заменить `chmod 700` на что-то адекватное (минимально необходимые права)  
  + done
  
- Как работает \` ...  \`  
  + [manual 3](https://vds-admin.ru/shell-scripting/sluzhebnye-simvoly#revkav_)
  + [random link](https://it.wikireading.ru/42634)
  
- Экранирование, разница между ' и ", какие символы имеют специальное значение в shell  
  + "" - нестрогое экранирование
  
  + > Вообще, желательно использовать двойные кавычки (" ") при обращении к переменным. Это предотвратит интерпретацию специальных символов, которые могут содержаться в   > именах переменных, за исключением $, ` (обратная кавычка) и \ (escape -- обратный слэш). То, что символ $ попал в разряд исключений, позволяет выполнять             > обращение к переменным внутри строк, ограниченных двойными кавычками ("$variable"), т.е. выполнять подстановку значений переменных.
  
  + '' - строгое экранирование  
  + \ - экранирование символа
  
- 4.1 и 4.4 упростить (без \` ... \` )  
  + done with `xargs`
  
- 4.2 сделать перенаправление 2 потока в 1
  + [manual 3](https://vds-admin.ru/shell-scripting/sluzhebnye-simvoly#perenapr_)
  + `2>&1` - 2 поток в 1 перенаправляется
  + done
- Минимальные права на директорию/файл для просмотра аттрибутов файлов  
  + [random link](https://help.ubuntu.ru/wiki/%D1%81%D1%82%D0%B0%D0%BD%D0%B4%D0%B0%D1%80%D1%82%D0%BD%D1%8B%D0%B5_%D0%BF%D1%80%D0%B0%D0%B2%D0%B0_unix)
  + | Mask    | Права на файл                | Права на каталог                                                                  |
    | :-----: | :--------------------------: | :--------------:                                                                  |
    | - - -   | отсутствие прав              | отсутствие прав                                                                   |
    | - - x   | права на выполнение          | доступ к файлам и их атрибутам <sup><a href="#_1">1)</a></sup>                    |
    | - w -   | права на запись              | отсутствие прав                                                                   |
    |  w x    | права на запись и выполнение | все, кроме доступа к именам файлов <sup><a href="#_2">2)</a></sup>                |
    | r - -   | права на чтение              | только чтение имен файлов                                                         |
    | r - x   | права на чтение и выполнение | чтение имен файлов и доступ файлам и их атрибутам <sup><a href='#_3'>3)</a></sup> |
    | r w -   | права на чтение и запись     | только чтение имен файлов                                                         |
    | r w x   | полные права                 | все права                                                                         |
    
    <br>
    <br>
---

[1)](#_1) - Нет возможности получить список имен файлов и создать/удалить/переименовать файл в каталоге. 
  
[2)](#_2) - Можно читать/изменять/запускать(если разрешено правами на сам файл), а также создавать/удалять/переименовывать файл, но только если вы знаете его имя. Узнать имена файлов в каталоге - нет никакой возможности
  
[3)](#_3) - Нет возможности создавать/удалять/переименовывать файлы в каталоге.

## Extra info

+ Globstar only works for 1 session \: thinking \:
+ `wc -l **/*e` in 4.1 works
+ When changing chmod it is better to do `chmod u+something file` instead of `chmod 500 file`
